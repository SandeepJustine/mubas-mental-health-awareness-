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
import java.util.ArrayList;
import java.util.HashMap;
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
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
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;


public class DoctorActivity extends  AppCompatActivity  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private ArrayList<HashMap<String, Object>> listmap = new ArrayList<>();
	
	private ScrollView vscroll2;
	private LinearLayout bg;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear30;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear11;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private ImageView imageview1;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private ImageView imageview2;
	private TextView textview1;
	private TextView textview16;
	private ImageView imageview3;
	private TextView textview14;
	private TextView textview15;
	private TextView textview2;
	private TextView textview3;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear16;
	private LinearLayout linear15;
	private ImageView imageview4;
	private TextView textview4;
	private ImageView imageview5;
	private TextView textview5;
	private ImageView imageview7;
	private TextView textview7;
	private ImageView imageview6;
	private TextView textview6;
	private TextView textview8;
	private TextView textview9;
	private ScrollView vscroll1;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear29;
	private LinearLayout linear26;
	private LinearLayout linear24;
	private LinearLayout linear25;
	private ImageView imageview10;
	private ImageView imageview9;
	private TextView textview10;
	private TextView textview11;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private ImageView imageview11;
	private ImageView imageview12;
	private TextView textview12;
	private TextView textview13;
	
	private Intent i = new Intent();
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
	private DatabaseReference alluser = _firebase.getReference("alluser");
	private ChildEventListener _alluser_child_listener;
	private com.google.android.material.bottomsheet.BottomSheetDialog bs;
	private AlertDialog.Builder d;
	private com.google.android.material.bottomsheet.BottomSheetDialog bottomsheet;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.doctor);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.CALL_PHONE}, 1000);
		}
		else {
			initializeLogic();
		}
	}
	@Override
	public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
		super.onRequestPermissionsResult(requestCode, permissions, grantResults);
		if (requestCode == 1000) {
			initializeLogic();
		}
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		bg = (LinearLayout) findViewById(R.id.bg);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview16 = (TextView) findViewById(R.id.textview16);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		textview2 = (TextView) findViewById(R.id.textview2);
		textview3 = (TextView) findViewById(R.id.textview3);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		textview4 = (TextView) findViewById(R.id.textview4);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		textview7 = (TextView) findViewById(R.id.textview7);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview11 = (TextView) findViewById(R.id.textview11);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview13 = (TextView) findViewById(R.id.textview13);
		auth = FirebaseAuth.getInstance();
		d = new AlertDialog.Builder(this);
		
		imageview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), MenuFragmentActivity.class);
				startActivity(i);
			}
		});
		
		//OnTouch
		textview14.setOnTouchListener(new View.OnTouchListener(){
				@Override
				public boolean onTouch(View v, MotionEvent event){
						int ev = event.getAction();
						switch (ev) {
								case MotionEvent.ACTION_DOWN:
								
								 i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					i.setClass(getApplicationContext(), VoiceActivity.class);
					startActivity(i);
								
								break;
								case MotionEvent.ACTION_UP:
								
								 
								
								break;
						} return true;
				}
		});
		
		//OnTouch
		textview15.setOnTouchListener(new View.OnTouchListener(){
				@Override
				public boolean onTouch(View v, MotionEvent event){
						int ev = event.getAction();
						switch (ev) {
								case MotionEvent.ACTION_DOWN:
								
								 i.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
					i.setClass(getApplicationContext(), VideoActivity.class);
					startActivity(i);
								
								break;
								case MotionEvent.ACTION_UP:
								
								 
								
								break;
						} return true;
				}
		});
		
		textview15.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_CALL);
				i.setClass(getApplicationContext(), VoiceActivity.class);
				startActivity(i);
			}
		});
		
		imageview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("ACADEMIC STRESS AND ANXIETY ");
				d.setMessage("check out how to deal with academic stress and anxiety.");
				d.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.dialog1, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("ACADEMIC STRESS AND ANXIETY ");
				d.setMessage("check out how to deal with academic stress and anxiety.");
				d.setPositiveButton("CHECK OUT", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.dialog1, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		imageview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Relationship's ");
				d.setMessage("How to deal with stress and anxiety resulted from relationship's ");
				d.setPositiveButton("Continue", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.bottom_sheet, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("Relationship's ");
				d.setMessage("How to deal with stress and anxiety resulted from relationship's ");
				d.setPositiveButton("CHECK OUT.", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.bottom_sheet, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		imageview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("FINANCIAL STRESS.");
				d.setMessage("check out the security and privacy for using this app");
				d.setPositiveButton("Continue.", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.dialogs, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("FINANCIAL STRESS.");
				d.setMessage("check out the security and privacy for using this app");
				d.setPositiveButton("CHECK ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.dialogs, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		imageview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("GENERAL MENTAL ISSUES ");
				d.setMessage("find support on every mental problem that you face");
				d.setPositiveButton("Continue ", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.general, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				d.setTitle("GENERAL MENTAL ISSUES ");
				d.setMessage("find support on every mental problem that you face");
				d.setPositiveButton("CHECK OUT.", new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface _dialog, int _which) {
						final com.google.android.material.bottomsheet.BottomSheetDialog bs_base = new com.google.android.material.bottomsheet.BottomSheetDialog(DoctorActivity.this); bs_base.setCancelable(true); View layBase = getLayoutInflater().inflate(R.layout.general, null); bs_base.setContentView(layBase); bs_base.show();
					}
				});
				d.create().show();
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setClass(getApplicationContext(), BlogActivity.class);
				startActivity(i);
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), BlogActivity.class);
				startActivity(i);
			}
		});
		
		_alluser_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				alluser.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						listmap = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								listmap.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						
						
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
			}
			
			@Override
			public void onChildChanged(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				alluser.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						listmap = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								listmap.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						
						
					}
					@Override
					public void onCancelled(DatabaseError _databaseError) {
					}
				});
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
		alluser.addChildEventListener(_alluser_child_listener);
		
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
		//GreenTech Studios 
		hscroll1.setHorizontalScrollBarEnabled(false);
		_shape(2000, 2000, 2000, 2000, "#FFFFFF", "#5B65F5", 2, linear5);
		_CircleImage(imageview2, 1000);
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 1);
		textview14.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview15.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview2.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 1);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		_setBG(linear8, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#F4F5F8");
		_setBG(linear13, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#F4F5F8");
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_setBG(linear14, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#F4F5F8");
		textview5.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_setBG(linear15, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#F4F5F8");
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_setBG(linear16, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#F4F5F8");
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_touchListener(linear13);
		_touchListener(linear15);
		_touchListener(linear14);
		_touchListener(linear16);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 1);
		textview9.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_setBackground(linear23, 20, 0, "#FAFAFC", true);
		_setBackground(linear26, 20, 0, "#FAFAFC", true);
		_setBG(textview14, "#651FFF", "#651FFF", 20, 20, 20, 20, 0, "#651FFF");
		_setBG(textview15, "#651FFF", "#651FFF", 20, 20, 20, 20, 0, "#651FFF");
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _shape (final double _top1, final double _top2, final double _bottom2, final double _bottom1, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
		Double tlr = _top1;
		Double trr = _top2;
		Double blr = _bottom2;
		Double brr = _bottom1;
		Double sw = _side_size;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 
		
		s.setColor(Color.parseColor(_inside_color));
		s.setStroke(sw.intValue(), Color.parseColor(_side_color));
		_view.setBackground(s);
	}
	
	
	public void _setBG (final View _view, final String _color1, final String _color2, final double _lt, final double _rt, final double _rb, final double _lb, final double _shadow, final String _shadowColor) {
		int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, colors);
		gd.setCornerRadii(new float[]{(int)_lt,(int)_lt,(int)_rt,(int)_rt,(int)_rb,(int)_rb,(int)_lb,(int)_lb});
		_view.setBackground(gd);
		
		_view.setElevation((int)_shadow);
	}
	
	
	public void _CircleImage (final ImageView _view, final double _radius) {
		Bitmap bm = ((android.graphics.drawable.BitmapDrawable)_view.getDrawable()).getBitmap();
		
		_view.setImageBitmap(getRoundedCornerBitmap(bm, ((int)_radius)));
		
	}
	public static Bitmap getRoundedCornerBitmap(Bitmap bitmap, int pixels) {
		Bitmap output = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
		Canvas canvas = new Canvas(output);
		final int color = 0xff424242;
		final Paint paint = new Paint();
		final Rect rect = new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight());
		final RectF rectF = new RectF(rect);
		final float roundPx = pixels;
		paint.setAntiAlias(true);
		canvas.drawARGB(0, 0, 0, 0);
		paint.setColor(color);
		canvas.drawRoundRect(rectF, roundPx, roundPx, paint); 
		paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN)); 
		canvas.drawBitmap(bitmap, rect, rect, paint);
		return output;
	}
	
	
	public void _touchListener (final View _view) {
		_view.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View v, MotionEvent event) {switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
					_Animator(_view, "scaleX", .91d, 150);
					_Animator(_view, "scaleY", .91d, 150);
					_setBG(_view, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#BDBDBD");
					return true;
					case MotionEvent.ACTION_UP:
					_Animator(_view, "scaleX", 1, 150);
					_Animator(_view, "scaleY", 1, 150);
					_Animator(linear12, "scaleY", 1, 300);
					_Animator(linear12, "scaleX", 1, 300);
					_setBG(_view, "#FFFFFF", "#FFFFFF", 20, 20, 20, 20, 0, "#F4F5F8");
					return true;
				}
				return false;
			}
		});
	}
	
	
	public void _Animator (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.setInterpolator(new android.view.animation.AccelerateDecelerateInterpolator());
		anim.start();
	}
	
	
	public void _setBackground (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#FFFFFF")});
			android.graphics.drawable.RippleDrawable ripdrb = new android.graphics.drawable.RippleDrawable(clrb , gd, null);
			_view.setClickable(true);
			_view.setBackground(ripdrb);
		}
		else {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setBackground(gd);
			_view.setElevation((int)_shadow);
		}
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