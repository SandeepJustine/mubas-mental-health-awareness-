package com.mubas.mybrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
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
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.app.Activity;
import android.content.SharedPreferences;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.FirebaseAuth;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.GenericTypeIndicator;
import com.google.firebase.database.ChildEventListener;
import android.view.View;
import com.google.gson.Gson;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class MoodjouranlActivity extends  AppCompatActivity  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private FloatingActionButton _fab;
	private HashMap<String, Object> map = new HashMap<>();
	private String label = "";
	private String value = "";
	private String jsondata = "";
	
	private ArrayList<HashMap<String, Object>> maplist = new ArrayList<>();
	
	private ScrollView vscroll1;
	private LinearLayout linear1bg;
	private LinearLayout linear2;
	private LinearLayout mood1;
	private LinearLayout mood2;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private TextView textview1;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private CardView cardview1;
	private TextView textview2;
	private ImageView imageview1;
	private CardView cardview2;
	private TextView textview3;
	private ImageView imageview2;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private CardView cardview3;
	private TextView textview4;
	private ImageView imageview3;
	private CardView cardview4;
	private TextView textview5;
	private ImageView imageview4;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private CardView cardview5;
	private TextView textview6;
	private ImageView imageview5;
	private CardView cardview7;
	private TextView textview7;
	private ImageView imageview6;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private CardView cardview8;
	private TextView textview8;
	private ImageView imageview7;
	private CardView cardview9;
	private TextView textview9;
	private ImageView imageview8;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private CardView cardview10;
	private TextView textview10;
	private ImageView imageview10;
	private CardView cardview11;
	private TextView textview11;
	private ImageView imageview11;
	
	private Intent i = new Intent();
	private SharedPreferences Data;
	private com.google.android.material.bottomsheet.BottomSheetDialog bs;
	private Calendar cal = Calendar.getInstance();
	private FirebaseAuth auth;
	private OnCompleteListener<Void> auth_updateEmailListener;
	private OnCompleteListener<Void> auth_updatePasswordListener;
	private OnCompleteListener<Void> auth_emailVerificationSentListener;
	private OnCompleteListener<Void> auth_deleteUserListener;
	private OnCompleteListener<Void> auth_updateProfileListener;
	private OnCompleteListener<AuthResult> auth_phoneAuthListener;
	private OnCompleteListener<AuthResult> auth_googleSignInListener;
	private OnCompleteListener<AuthResult> _auth_create_user_listener;
	private OnCompleteListener<AuthResult> _auth_sign_in_listener;
	private OnCompleteListener<Void> _auth_reset_password_listener;
	private DatabaseReference mood = _firebase.getReference("journal");
	private ChildEventListener _mood_child_listener;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.moodjouranl);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		_app_bar = (AppBarLayout) findViewById(R.id._app_bar);
		_coordinator = (CoordinatorLayout) findViewById(R.id._coordinator);
		_toolbar = (Toolbar) findViewById(R.id._toolbar);
		setSupportActionBar(_toolbar);
		getSupportActionBar().setDisplayHomeAsUpEnabled(true);
		getSupportActionBar().setHomeButtonEnabled(true);
		_toolbar.setNavigationOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _v) {
				onBackPressed();
			}
		});
		_fab = (FloatingActionButton) findViewById(R.id._fab);
		
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear1bg = (LinearLayout) findViewById(R.id.linear1bg);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		mood1 = (LinearLayout) findViewById(R.id.mood1);
		mood2 = (LinearLayout) findViewById(R.id.mood2);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		cardview8 = (CardView) findViewById(R.id.cardview8);
		textview8 = (TextView) findViewById(R.id.textview8);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		cardview9 = (CardView) findViewById(R.id.cardview9);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		textview10 = (TextView) findViewById(R.id.textview10);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		textview11 = (TextView) findViewById(R.id.textview11);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		Data = getSharedPreferences("data", Activity.MODE_PRIVATE);
		auth = FirebaseAuth.getInstance();
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview2.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview3.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview4.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview5.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview6.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview7.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview8.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview9.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview10.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		cardview11.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				SketchwareUtil.showMessage(getApplicationContext(), "Saving....");
				map = new HashMap<>();
				map.put("mood", textview11.getText().toString());
				map.put("date", new SimpleDateFormat("HH:MM").format(cal.getTime()));
				map.put("uid", FirebaseAuth.getInstance().getCurrentUser().getUid());
				maplist.add(map);
				jsondata = new Gson().toJson(maplist);
				Data.edit().putString("a", jsondata).commit();
				mood.push().updateChildren(map);
			}
		});
		
		_fab.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MoodActivity.class);
				Data.edit().putString("a", new Gson().toJson(maplist)).commit();
				i.putExtra("a", new Gson().toJson(maplist));
				startActivity(i);
			}
		});
		
		_mood_child_listener = new ChildEventListener() {
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
		mood.addChildEventListener(_mood_child_listener);
		
		auth_updateEmailListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_updatePasswordListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_emailVerificationSentListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_deleteUserListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_phoneAuthListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		auth_updateProfileListener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		auth_googleSignInListener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> task){
				final boolean _success = task.isSuccessful();
				final String _errorMessage = task.getException() != null ? task.getException().getMessage() : "";
				
			}
		};
		
		_auth_create_user_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_sign_in_listener = new OnCompleteListener<AuthResult>() {
			@Override
			public void onComplete(Task<AuthResult> _param1) {
				final boolean _success = _param1.isSuccessful();
				final String _errorMessage = _param1.getException() != null ? _param1.getException().getMessage() : "";
				
			}
		};
		
		_auth_reset_password_listener = new OnCompleteListener<Void>() {
			@Override
			public void onComplete(Task<Void> _param1) {
				final boolean _success = _param1.isSuccessful();
				
			}
		};
	}
	
	private void initializeLogic() {
		setTitle("Mood Journal.");
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 1);
		_fab.setImageResource(R.drawable.ic_navigate_next_white);
		cardview1.setRadius((float)10);
		cardview2.setRadius((float)10);
		cardview3.setRadius((float)10);
		cardview4.setRadius((float)10);
		cardview5.setRadius((float)10);
		cardview7.setRadius((float)10);
		cardview8.setRadius((float)10);
		cardview9.setRadius((float)10);
		cardview10.setRadius((float)10);
		cardview11.setRadius((float)10);
		_touch(cardview1, true);
		_touch(cardview2, true);
		_touch(cardview3, true);
		_touch(cardview4, true);
		_touch(cardview5, true);
		_touch(cardview7, true);
		_touch(cardview8, true);
		_touch(cardview9, true);
		_touch(cardview10, true);
		_touch(cardview11, true);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _touch (final View _view, final boolean _t) {
		_view.setOnTouchListener(new View.OnTouchListener() {
			@Override
			public boolean onTouch(View v, MotionEvent event) {
				switch (event.getAction()){
					case MotionEvent.ACTION_DOWN:{
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(_view);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues(0.9f);
						scaleX.setDuration(100);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(_view);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues(0.9f);
						scaleY.setDuration(100);
						scaleY.start();
						break;
					}
					case MotionEvent.ACTION_UP:{
						
						ObjectAnimator scaleX = new ObjectAnimator();
						scaleX.setTarget(_view);
						scaleX.setPropertyName("scaleX");
						scaleX.setFloatValues((float)1);
						scaleX.setDuration(100);
						scaleX.start();
						
						ObjectAnimator scaleY = new ObjectAnimator();
						scaleY.setTarget(_view);
						scaleY.setPropertyName("scaleY");
						scaleY.setFloatValues((float)1);
						scaleY.setDuration(100);
						scaleY.start();
						
						break;
					}
				}
				return false;
			}
		});
	}
	
	
	public void _rippleeffect (final String _color, final View _view) {
		android.content.res.ColorStateList clr = new android.content.res.ColorStateList(new int[][]{new int[]{}},new int[]{Color.parseColor(_color)});
		android.graphics.drawable.RippleDrawable ripdr = new android.graphics.drawable.RippleDrawable(clr, null, null); _view.setBackground(ripdr);
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