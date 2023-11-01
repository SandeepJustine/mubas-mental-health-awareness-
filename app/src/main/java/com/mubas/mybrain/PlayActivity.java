package com.mubas.mybrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import android.app.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.content.res.*;
import android.graphics.*;
import android.graphics.drawable.*;
import android.media.*;
import android.net.*;
import android.text.*;
import android.text.style.*;
import android.util.*;
import android.webkit.*;
import android.animation.*;
import android.view.animation.*;
import java.util.*;
import java.util.regex.*;
import java.text.*;
import org.json.*;
import java.util.HashMap;
import java.util.ArrayList;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.CheckBox;
import android.widget.Button;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.view.View;
import android.widget.CompoundButton;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class PlayActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private String FONT = "";
	private double n = 0;
	private double q = 0;
	private HashMap<String, Object> vmap = new HashMap<>();
	private String answer = "";
	private double score = 0;
	
	private ArrayList<HashMap<String, Object>> lmap = new ArrayList<>();
	
	private ScrollView vscroll;
	private LinearLayout linear13;
	private LinearLayout linear1;
	private LinearLayout linear_score;
	private LinearLayout linear_answer;
	private LinearLayout linear_quiz;
	private LinearLayout linear2;
	private LinearLayout linear11;
	private LinearLayout linear6;
	private LinearLayout linear3;
	private LinearLayout linear14;
	private ImageView imageview1;
	private TextView textview3;
	private TextView textview4;
	private ImageView imageview3;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private ImageView imageview2;
	private TextView textview5;
	private TextView textview1;
	private TextView textview2;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private LinearLayout round2;
	private LinearLayout linear28;
	private LinearLayout round1;
	private CheckBox checkbox2;
	private CheckBox checkbox1;
	private LinearLayout round4;
	private LinearLayout linear31;
	private LinearLayout round3;
	private CheckBox checkbox4;
	private CheckBox checkbox3;
	private Button button1;
	
	private SharedPreferences sp;
	private Intent i = new Intent();
	private TimerTask t;
	private SharedPreferences dark;
	private ObjectAnimator object = new ObjectAnimator();
	private DatabaseReference quiz = _firebase.getReference("questions");
	private ChildEventListener _quiz_child_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.play);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll = (ScrollView) findViewById(R.id.vscroll);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear_score = (LinearLayout) findViewById(R.id.linear_score);
		linear_answer = (LinearLayout) findViewById(R.id.linear_answer);
		linear_quiz = (LinearLayout) findViewById(R.id.linear_quiz);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		round2 = (LinearLayout) findViewById(R.id.round2);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		round1 = (LinearLayout) findViewById(R.id.round1);
		checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
		checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
		round4 = (LinearLayout) findViewById(R.id.round4);
		linear31 = (LinearLayout) findViewById(R.id.linear31);
		round3 = (LinearLayout) findViewById(R.id.round3);
		checkbox4 = (CheckBox) findViewById(R.id.checkbox4);
		checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
		button1 = (Button) findViewById(R.id.button1);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		dark = getSharedPreferences("dark", Activity.MODE_PRIVATE);
		
		checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_selected(checkbox2, "a");
			}
		});
		
		checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_selected(checkbox1, "b");
			}
		});
		
		checkbox4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_selected(checkbox4, "d");
			}
		});
		
		checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(CompoundButton _param1, boolean _param2)  {
				final boolean _isChecked = _param2;
				_selected(checkbox3, "c");
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (answer.equals("")) {
					
				}
				else {
					if (vmap.get("ans").toString().equals("a")) {
						checkbox1.setTextColor(0xFF4CAF50);
						checkbox2.setTextColor(0xFFF44336);
						checkbox3.setTextColor(0xFFF44336);
						checkbox4.setTextColor(0xFFF44336);
					}
					if (vmap.get("ans").toString().equals("b")) {
						checkbox1.setTextColor(0xFFF44336);
						checkbox2.setTextColor(0xFF4CAF50);
						checkbox3.setTextColor(0xFFF44336);
						checkbox4.setTextColor(0xFFF44336);
					}
					if (vmap.get("ans").toString().equals("c")) {
						checkbox1.setTextColor(0xFFF44336);
						checkbox2.setTextColor(0xFFF44336);
						checkbox3.setTextColor(0xFF4CAF50);
						checkbox4.setTextColor(0xFFF44336);
					}
					if (vmap.get("ans").toString().equals("d")) {
						checkbox1.setTextColor(0xFFF44336);
						checkbox2.setTextColor(0xFFF44336);
						checkbox4.setTextColor(0xFFF44336);
						checkbox4.setTextColor(0xFF4CAF50);
					}
				}
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (answer.equals("")) {
									LayoutInflater Inflater = getLayoutInflater();
									View toastview =
									 Inflater.inflate(R.layout.toast3,null);
									
									LinearLayout linear = (LinearLayout)
									toastview.findViewById(R.id.linear1);
									
									
									Toast toast = new
									Toast(getApplicationContext());
									toast.setDuration(Toast.LENGTH_SHORT);
									toast.setView(toastview);
									toast.show();
								}
								else {
									if (vmap.get("ans").toString().equals(answer)) {
										score++;
										LayoutInflater Inflater = getLayoutInflater();
										View toastview=
										 Inflater.inflate(R.layout.toast1,null);
										
										LinearLayout linear=(LinearLayout)
										toastview.findViewById(R.id.linear1);
										
										
										Toast toast = new
										Toast(getApplicationContext());
										toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.show();
									}
									else {
										LayoutInflater Inflater = getLayoutInflater();
										View toastview=
										 Inflater.inflate(R.layout.toast2,null);
										
										LinearLayout linear=(LinearLayout)
										toastview.findViewById(R.id.linear1);
										
										
										Toast toast = new
										Toast(getApplicationContext());
										toast.setDuration(Toast.LENGTH_SHORT);
										toast.setView(toastview);
										toast.show();
									}
									textview4.setText(String.valueOf((long)(score)).concat("/".concat(String.valueOf((long)(n)))));
									if (n == 10) {
										sp.edit().putString("score", textview4.getText().toString()).commit();
										i.setClass(getApplicationContext(), IndexActivity.class);
										startActivity(i);
									}
									else {
										answer = "";
										_falseCheckboxes();
										_pickQuestion();
									}
								}
								checkbox1.setTextColor(0xFF2196F3);
								checkbox2.setTextColor(0xFF2196F3);
								checkbox3.setTextColor(0xFF2196F3);
								checkbox4.setTextColor(0xFF2196F3);
							}
						});
					}
				};
				_timer.schedule(t, (int)(500));
			}
		});
		
		_quiz_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onChildMoved(DataSnapshot _param1, String _param2) {
				
			}
			
			@Override
			public void onChildRemoved(DataSnapshot _param1) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				
			}
			
			@Override
			public void onCancelled(DatabaseError _param1) {
				final int _errorCode = _param1.getCode();
				final String _errorMessage = _param1.getMessage();
				
			}
		};
		quiz.addChildEventListener(_quiz_child_listener);
	}
	
	private void initializeLogic() {
		if (dark.getString("theme", "").equals("light")) {
			dark.edit().putString("theme", "light").commit();
			_darkmode();
		}
		else {
			_darkmode();
		}
		n = 0;
		score = 0;
		lmap = new Gson().fromJson("[\n{\n\"ques\" : \"The larynx in adults lies in front of hypopharynx opposite the...\",\n\"a\" : \"second to fifth cervical vertebrae\",\n\"b\" : \"fifth to seventh cervical vertebrae\",\n\"c\" : \"third to sixth cervical vertebrae\",\n\"d\" : \"first two cervical vertebrae\",\n\"ans\" : \"c\"\n},\n\n{\n\"ques\" : \"Which of the following is the largest cartilage of larynx?\",\n\"a\" : \"thyroid cartilage\",\n\"b\" : \"cricoid cartilage\",\n\"c\" : \"arytenoid cartilages\",\n\"d\" : \"epiglottis\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"Which one of the following muscles is not a depressor of larynx?\",\n\"a\" : \"sternohyoid\",\n\"b\" : \"stylohyoid\",\n\"c\" : \"sternothyroid\",\n\"d\" : \"omohyoid\",\n\"ans\" : \"b\"\n},\n\n{\n\"ques\" : \"Barrets esophagus result in which type of carcinoma?\",\n\"a\" : \"Adenocarcinoma\",\n\"b\" : \"Squamous\",\n\"c\" : \"Adenosquamous\",\n\"d\" : \"Basal cell carcinoma\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"ADAM TS 13 is associated with\",\n\"a\" : \"TTP\",\n\"b\" : \"Churg Strauss\",\n\"c\" : \"Wegener\",\n\"d\" : \"Membranous nephropathy\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"T1/2 of Haptaglobin-Hb complex is\",\n\"a\" : \"5 days\",\n\"b\" : \"3 days\",\n\"c\" : \"10 days\",\n\"d\" : \"10 minutes\",\n\"ans\" : \"d\"\n},\n\n{\n\"ques\" : \"E-cadherin mutation is seen in which type of carcinoma?\",\n\"a\" : \"IDC\",\n\"b\" : \"Lobular carcinoma\",\n\"c\" : \"Metaplastic carcinoma\",\n\"d\" : \"Metastatic\",\n\"ans\" : \"b\"\n},\n\n{\n\"ques\" : \"Classical pathway Macrophage activating molecule?\",\n\"a\" : \"IFN gamma\",\n\"b\" : \"IL 13\",\n\"c\" : \"IL 4\",\n\"d\" : \"IL 1\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"Massive blood transfusion will cause all except?\",\n\"a\" : \"Hypercalcemia\",\n\"b\" : \"Hyperkalemia\",\n\"c\" : \"Hypokalemia\",\n\"d\" : \"Hypothermia\",\n\"ans\" : \"a\"\n},\n\n{\n\"ques\" : \"Durcks granuloma seen in?\",\n\"a\" : \"Spleen\",\n\"b\" : \"Heart\",\n\"c\" : \"Brain\",\n\"d\" : \"Lymphnode\",\n\"ans\" : \"c\"\n}\n]", new TypeToken<ArrayList<HashMap<String, Object>>>(){}.getType());
		quiz.push().updateChildren(vmap);
		_pickQuestion();
		_ActivityFont_("mbcdinkum_medium");
		linear_score.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		linear_answer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		linear_quiz.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		round1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		round2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		round3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		round4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
		button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)0, Color.TRANSPARENT, 0xFF2196F3));
		vscroll.setHorizontalScrollBarEnabled(false);
		vscroll.setVerticalScrollBarEnabled(false);
		vscroll.setOverScrollMode(ListView.OVER_SCROLL_NEVER);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	@Override
	public void onBackPressed() {
		final AlertDialog info_dialog = new AlertDialog.Builder(PlayActivity.this).create();
		LayoutInflater inflater = getLayoutInflater();
		
		View convertView = (View) inflater.inflate(R.layout.info_dialog, null);
		info_dialog.setView(convertView);
		
		info_dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);  info_dialog.getWindow().setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(Color.TRANSPARENT));
		
		
		LinearLayout i_bg = (LinearLayout) convertView.findViewById(R.id.linear_bg);
		
		LinearLayout i_div = (LinearLayout) convertView.findViewById(R.id.linear_div);
		
		Button i_ok = (Button) convertView.findViewById(R.id.okay_button);
		
		Button i_cancel = (Button) convertView.findViewById(R.id.cancel_button);
		
		ImageView i_header = (ImageView) convertView.findViewById(R.id.img_header);
		
		TextView i_title = (TextView) convertView.findViewById(R.id.txt_title);
		
		TextView i_msg = (TextView) convertView.findViewById(R.id.txt_msg);
		
		_setBgCorners(i_bg, 8, "#FFFFFF");
		_setBgCorners(i_ok, 8, "#03A9F4");
		_setBgCorners(i_cancel, 8, "#F44336");
		i_header.setElevation(5);
		i_ok.setOnClickListener(new View.OnClickListener(){
			    public void onClick(View v){
				i.setClass(getApplicationContext(), IndexActivity.class);
				startActivity(i);
				finish();
			}});
		i_cancel.setOnClickListener(new View.OnClickListener(){
			    public void onClick(View v){
				info_dialog.dismiss();
			}});
		info_dialog.show();
		_bounce(i_header);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		_darkmode();
	}
	public void _ActivityFont_ (final String _name) {
		FONT = "fonts/".concat(_name.concat(".ttf"));
		overrideFonts(this,getWindow().getDecorView()); 
		
	} private void overrideFonts(final android.content.Context context, final View v) {
		
		try {
			Typeface typeace = Typeface.createFromAsset(getAssets(), FONT);;
			
			if ((v instanceof ViewGroup)) {
				ViewGroup vg = (ViewGroup) v;
				for (int i = 0; i < vg.getChildCount(); i++) {
					View child = vg.getChildAt(i);
					overrideFonts(context, child);
				}
			}else {
				if ((v instanceof TextView)) {
					((TextView) v).setTypeface(typeace);
				}else {
					if ((v instanceof EditText )) {
						((EditText) v).setTypeface(typeace);
					}else {
						if ((v instanceof Button)) {
							((Button) v).setTypeface(typeace);
												}
										}
								}
						}
		}catch(Exception e) {
			showMessage(e.toString());
		};
	}
	
	
	public void _pickQuestion () {
		n++;
		q = SketchwareUtil.getRandom((int)(0), (int)(lmap.size() - 1));
		vmap = lmap.get((int)q);
		lmap.remove((int)(q));
		textview1.setText(String.valueOf((long)(n)));
		textview2.setText(vmap.get("ques").toString());
		checkbox1.setText(vmap.get("a").toString());
		checkbox2.setText(vmap.get("b").toString());
		checkbox3.setText(vmap.get("c").toString());
		checkbox4.setText(vmap.get("d").toString());
	}
	
	
	public void _falseCheckboxes () {
		checkbox1.setChecked(false);
		checkbox2.setChecked(false);
		checkbox3.setChecked(false);
		checkbox4.setChecked(false);
	}
	
	
	public void _selected (final CheckBox _checkbox, final String _answer) {
		if (_checkbox.isChecked()) {
			answer = _answer;
			_falseCheckboxes();
			_checkbox.setChecked(true);
		}
		else {
			answer = "";
		}
	}
	
	
	public void _darkmode () {
		if (dark.getString("theme", "").equals("light")) {
			imageview3.setImageResource(R.drawable.ic_brightness_2_black);
			textview3.setTextColor(0xFF2196F3);
			textview4.setTextColor(0xFF2196F3);
			textview5.setTextColor(0xFF2196F3);
			textview1.setTextColor(0xFF2196F3);
			linear1.setBackgroundColor(0xFFFFFFFF);
			vscroll.setBackgroundColor(0xFFFFFFFF);
			linear_score.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			linear_answer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			linear_quiz.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			round1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			round2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			round3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			round4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF2196F3, 0xFFFFFFFF));
			button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)0, Color.TRANSPARENT, 0xFF2196F3));
		}
		else {
			if (dark.getString("theme", "").equals("dark")) {
				imageview3.setImageResource(R.drawable.default_image);
				textview3.setTextColor(0xFFFFFFFF);
				textview4.setTextColor(0xFFFFFFFF);
				textview5.setTextColor(0xFFFFFFFF);
				textview1.setTextColor(0xFFFFFFFF);
				linear1.setBackgroundColor(0xFF000000);
				vscroll.setBackgroundColor(0xFF000000);
				linear_score.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				linear_answer.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				linear_quiz.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				linear3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				linear9.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				round1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				round2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				round3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				round4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
				button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
			}
		}
	}
	
	
	public void _setBgCorners (final View _view, final double _radius, final String _color) {
		android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(); 
		gd.setColor(Color.parseColor("#" + _color.replace("#", ""))); /* color */
		gd.setCornerRadius((int)_radius); /* radius */
		gd.setStroke(0, Color.WHITE); /* stroke heigth and color */
		_view.setBackground(gd);
	}
	
	
	public void _bounce (final View _view) {
		object.setTarget(_view);
		object.setPropertyName("rotation");
		object.setFloatValues((float)(90), (float)(0));
		object.setDuration((int)(1000));
		object.setInterpolator(new BounceInterpolator());
		object.start();
	}
	
	
	@Deprecated
	public void showMessage(String _s) {
		Toast.makeText(getApplicationContext(), _s, Toast.LENGTH_SHORT).show();
	}
	
	@Deprecated
	public int getLocationX(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[0];
	}
	
	@Deprecated
	public int getLocationY(View _v) {
		int _location[] = new int[2];
		_v.getLocationInWindow(_location);
		return _location[1];
	}
	
	@Deprecated
	public int getRandom(int _min, int _max) {
		Random random = new Random();
		return random.nextInt(_max - _min + 1) + _min;
	}
	
	@Deprecated
	public ArrayList<Double> getCheckedItemPositionsToArray(ListView _list) {
		ArrayList<Double> _result = new ArrayList<Double>();
		SparseBooleanArray _arr = _list.getCheckedItemPositions();
		for (int _iIdx = 0; _iIdx < _arr.size(); _iIdx++) {
			if (_arr.valueAt(_iIdx))
			_result.add((double)_arr.keyAt(_iIdx));
		}
		return _result;
	}
	
	@Deprecated
	public float getDip(int _input){
		return TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, _input, getResources().getDisplayMetrics());
	}
	
	@Deprecated
	public int getDisplayWidthPixels(){
		return getResources().getDisplayMetrics().widthPixels;
	}
	
	@Deprecated
	public int getDisplayHeightPixels(){
		return getResources().getDisplayMetrics().heightPixels;
	}
	
}