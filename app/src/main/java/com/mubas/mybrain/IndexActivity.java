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
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class IndexActivity extends  AppCompatActivity  { 
	
	
	private String FONT = "";
	
	private LinearLayout linear1;
	private LinearLayout linear3;
	private ImageView imageview1;
	private LinearLayout linear6;
	private Button button1;
	private LinearLayout linear2;
	private TextView textview4;
	private TextView textview1;
	private TextView textview2;
	
	private SharedPreferences dark;
	private Intent i = new Intent();
	private SharedPreferences sp;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.index);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		button1 = (Button) findViewById(R.id.button1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		dark = getSharedPreferences("dark", Activity.MODE_PRIVATE);
		sp = getSharedPreferences("sp", Activity.MODE_PRIVATE);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), PlayActivity.class);
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		if (dark.getString("theme", "").equals("light")) {
			dark.edit().putString("theme", "light").commit();
			_darkmode();
		}
		else {
			_darkmode();
		}
		button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)0, Color.TRANSPARENT, 0xFF2196F3));
		_ActivityFont_("lexiereadable_bold");
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
		
	}
	
	@Override
	public void onStart() {
		super.onStart();
		if (sp.getString("score", "").equals("")) {
			button1.setText("Start Playing");
			linear2.setVisibility(View.GONE);
		}
		else {
			button1.setText("New Game");
			linear2.setVisibility(View.VISIBLE);
			textview2.setText(sp.getString("score", ""));
			sp.edit().putString("score", "").commit();
		}
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
	
	
	public void _darkmode () {
		if (dark.getString("theme", "").equals("light")) {
			textview4.setTextColor(0xFF2196F3);
			textview2.setTextColor(0xFFF44336);
			textview1.setTextColor(0xFF2196F3);
			linear1.setBackgroundColor(0xFFFFFFFF);
			button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)0, Color.TRANSPARENT, 0xFF2196F3));
		}
		else {
			if (dark.getString("theme", "").equals("dark")) {
				textview4.setTextColor(0xFFFFFFFF);
				textview2.setTextColor(0xFFFFFFFF);
				textview1.setTextColor(0xFFFFFFFF);
				linear1.setBackgroundColor(0xFF000000);
				button1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)30, (int)1, 0xFF424242, 0xFF000000));
			}
		}
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