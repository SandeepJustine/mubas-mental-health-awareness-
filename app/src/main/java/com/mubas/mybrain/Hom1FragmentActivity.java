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
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.HorizontalScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.app.AlertDialog;
import android.content.DialogInterface;
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
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Hom1FragmentActivity extends  Fragment  { 
	
	private FirebaseDatabase _firebase = FirebaseDatabase.getInstance();
	
	private ArrayList<HashMap<String, Object>> map = new ArrayList<>();
	
	private LinearLayout linear1bg;
	private ScrollView vscroll1;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear14greeting;
	private LinearLayout linear7sliderbg;
	private LinearLayout linear8recomend;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private ImageView imageview1;
	private ImageView menu;
	private TextView textview2greet;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear12slidercontent;
	private LinearLayout linear13slider1;
	private LinearLayout linear14slider2;
	private LinearLayout linear15slider3;
	private LinearLayout linear16slider4;
	private LinearLayout linear12mood;
	private LinearLayout linear13moodtext;
	private ImageView imageview11;
	private TextView textview1;
	private LinearLayout linear15;
	private LinearLayout linear16;
	private ImageView imageview8;
	private TextView textview9;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private ImageView imageview9;
	private TextView textview10;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private ImageView imageview10;
	private TextView textview11;
	private LinearLayout linear12;
	private ScrollView vscroll3recomend;
	private TextView textview3;
	private LinearLayout linear14recomend;
	private LinearLayout linear18stress;
	private LinearLayout linear19anxirty;
	private LinearLayout linear20depre;
	private LinearLayout linear21calm;
	private LinearLayout linear22meetnew;
	private ImageView imageview3;
	private ScrollView vscroll2;
	private TextView textview4;
	private ImageView imageview4;
	private TextView textview5;
	private ImageView imageview5;
	private TextView textview6;
	private ImageView imageview6;
	private TextView textview7;
	private ImageView imageview7;
	private TextView textview8;
	
	private Intent i1 = new Intent();
	private AlertDialog.Builder d;
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
	private DatabaseReference users = _firebase.getReference("users");
	private ChildEventListener _users_child_listener;
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.hom1_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		com.google.firebase.FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		
		linear1bg = (LinearLayout) _view.findViewById(R.id.linear1bg);
		vscroll1 = (ScrollView) _view.findViewById(R.id.vscroll1);
		linear5 = (LinearLayout) _view.findViewById(R.id.linear5);
		linear6 = (LinearLayout) _view.findViewById(R.id.linear6);
		linear14greeting = (LinearLayout) _view.findViewById(R.id.linear14greeting);
		linear7sliderbg = (LinearLayout) _view.findViewById(R.id.linear7sliderbg);
		linear8recomend = (LinearLayout) _view.findViewById(R.id.linear8recomend);
		linear9 = (LinearLayout) _view.findViewById(R.id.linear9);
		linear10 = (LinearLayout) _view.findViewById(R.id.linear10);
		linear11 = (LinearLayout) _view.findViewById(R.id.linear11);
		imageview1 = (ImageView) _view.findViewById(R.id.imageview1);
		menu = (ImageView) _view.findViewById(R.id.menu);
		textview2greet = (TextView) _view.findViewById(R.id.textview2greet);
		hscroll1 = (HorizontalScrollView) _view.findViewById(R.id.hscroll1);
		linear12slidercontent = (LinearLayout) _view.findViewById(R.id.linear12slidercontent);
		linear13slider1 = (LinearLayout) _view.findViewById(R.id.linear13slider1);
		linear14slider2 = (LinearLayout) _view.findViewById(R.id.linear14slider2);
		linear15slider3 = (LinearLayout) _view.findViewById(R.id.linear15slider3);
		linear16slider4 = (LinearLayout) _view.findViewById(R.id.linear16slider4);
		linear12mood = (LinearLayout) _view.findViewById(R.id.linear12mood);
		linear13moodtext = (LinearLayout) _view.findViewById(R.id.linear13moodtext);
		imageview11 = (ImageView) _view.findViewById(R.id.imageview11);
		textview1 = (TextView) _view.findViewById(R.id.textview1);
		linear15 = (LinearLayout) _view.findViewById(R.id.linear15);
		linear16 = (LinearLayout) _view.findViewById(R.id.linear16);
		imageview8 = (ImageView) _view.findViewById(R.id.imageview8);
		textview9 = (TextView) _view.findViewById(R.id.textview9);
		linear17 = (LinearLayout) _view.findViewById(R.id.linear17);
		linear18 = (LinearLayout) _view.findViewById(R.id.linear18);
		imageview9 = (ImageView) _view.findViewById(R.id.imageview9);
		textview10 = (TextView) _view.findViewById(R.id.textview10);
		linear19 = (LinearLayout) _view.findViewById(R.id.linear19);
		linear20 = (LinearLayout) _view.findViewById(R.id.linear20);
		imageview10 = (ImageView) _view.findViewById(R.id.imageview10);
		textview11 = (TextView) _view.findViewById(R.id.textview11);
		linear12 = (LinearLayout) _view.findViewById(R.id.linear12);
		vscroll3recomend = (ScrollView) _view.findViewById(R.id.vscroll3recomend);
		textview3 = (TextView) _view.findViewById(R.id.textview3);
		linear14recomend = (LinearLayout) _view.findViewById(R.id.linear14recomend);
		linear18stress = (LinearLayout) _view.findViewById(R.id.linear18stress);
		linear19anxirty = (LinearLayout) _view.findViewById(R.id.linear19anxirty);
		linear20depre = (LinearLayout) _view.findViewById(R.id.linear20depre);
		linear21calm = (LinearLayout) _view.findViewById(R.id.linear21calm);
		linear22meetnew = (LinearLayout) _view.findViewById(R.id.linear22meetnew);
		imageview3 = (ImageView) _view.findViewById(R.id.imageview3);
		vscroll2 = (ScrollView) _view.findViewById(R.id.vscroll2);
		textview4 = (TextView) _view.findViewById(R.id.textview4);
		imageview4 = (ImageView) _view.findViewById(R.id.imageview4);
		textview5 = (TextView) _view.findViewById(R.id.textview5);
		imageview5 = (ImageView) _view.findViewById(R.id.imageview5);
		textview6 = (TextView) _view.findViewById(R.id.textview6);
		imageview6 = (ImageView) _view.findViewById(R.id.imageview6);
		textview7 = (TextView) _view.findViewById(R.id.textview7);
		imageview7 = (ImageView) _view.findViewById(R.id.imageview7);
		textview8 = (TextView) _view.findViewById(R.id.textview8);
		d = new AlertDialog.Builder(getContext());
		auth = FirebaseAuth.getInstance();
		
		menu.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				View inflatePop = getLayoutInflater().inflate(R.layout.menu, null);
				final PopupWindow inflate = new PopupWindow(inflatePop, ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT, true);
				
				
				final LinearLayout linear1 =(LinearLayout) inflatePop.findViewById(R.id.linear1);
				final LinearLayout linear2 =(LinearLayout) inflatePop.findViewById(R.id.linear2);
				final LinearLayout linear3 =(LinearLayout) inflatePop.findViewById(R.id.linear3);
				final LinearLayout linear4 =(LinearLayout) inflatePop.findViewById(R.id.linear4);
				final LinearLayout linear5 =(LinearLayout) inflatePop.findViewById(R.id.linear5);
				final LinearLayout linear6 =(LinearLayout) inflatePop.findViewById(R.id.linear6);
				final LinearLayout linear7 =(LinearLayout) inflatePop.findViewById(R.id.linear7);
				final LinearLayout linear8 =(LinearLayout) inflatePop.findViewById(R.id.linear8);
				
				final TextView textview1 = (TextView) inflatePop.findViewById(R.id.textview1);
				
				final TextView textview2 = (TextView) inflatePop.findViewById(R.id.textview2);
				
				final TextView textview3 = (TextView) inflatePop.findViewById(R.id.textview3);
				final TextView textview4 = (TextView) inflatePop.findViewById(R.id.textview4);
				
				final TextView textview5= (TextView) inflatePop.findViewById(R.id.textview5);
				final TextView textview6 = (TextView) inflatePop.findViewById(R.id.textview6);
				final TextView textview7 = (TextView) inflatePop.findViewById(R.id.textview7);
				
				
				linear1.setElevation((float)10);
				linear1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)50, 0xFFFFFFFF));
				
				inflate.setAnimationStyle(android.R.style.Animation_Dialog);
				inflate.showAsDropDown(menu, 0,0);
				inflate.setBackgroundDrawable(new BitmapDrawable());
			}
		});
		
		linear13slider1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), ToolActivity.class);
				startActivity(i1);
			}
		});
		
		linear14slider2.setOnLongClickListener(new View.OnLongClickListener() {
			 @Override
				public boolean onLongClick(View _view) {
				
				return true;
				}
			 });
		
		linear14slider2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
				i1.setClass(getContext(), DoctorActivity.class);
				startActivity(i1);
			}
		});
		
		linear13moodtext.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), MoodjouranlActivity.class);
				startActivity(i1);
			}
		});
		
		linear16.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), VirtualActivity.class);
				startActivity(i1);
			}
		});
		
		textview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), DoctorActivity.class);
				startActivity(i1);
			}
		});
		
		linear18.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), VirtualActivity.class);
				startActivity(i1);
			}
		});
		
		linear20.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), ArticlesActivity.class);
				startActivity(i1);
			}
		});
		
		linear18stress.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), WebviewActivity.class);
				startActivity(i1);
			}
		});
		
		linear19anxirty.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setClass(getContext(), BlogActivity.class);
				startActivity(i1);
			}
		});
		
		linear20depre.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), DepressionActivity.class);
				startActivity(i1);
			}
		});
		
		linear21calm.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), ActivitiesActivity.class);
				startActivity(i1);
			}
		});
		
		linear22meetnew.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), ChatFragmentActivity.class);
				startActivity(i1);
				SketchwareUtil.showMessage(getContext(), "clicked ");
			}
		});
		
		textview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), WebviewActivity.class);
				startActivity(i1);
			}
		});
		
		textview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setClass(getContext(), DepressionActivity.class);
				startActivity(i1);
			}
		});
		
		textview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setClass(getContext(), DepressionActivity.class);
				startActivity(i1);
			}
		});
		
		textview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), ActivitiesActivity.class);
				startActivity(i1);
			}
		});
		
		textview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), HomeActivity.class);
				startActivity(i1);
			}
		});
		
		_users_child_listener = new ChildEventListener() {
			@Override
			public void onChildAdded(DataSnapshot _param1, String _param2) {
				GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
				final String _childKey = _param1.getKey();
				final HashMap<String, Object> _childValue = _param1.getValue(_ind);
				users.addListenerForSingleValueEvent(new ValueEventListener() {
					@Override
					public void onDataChange(DataSnapshot _dataSnapshot) {
						map = new ArrayList<>();
						try {
							GenericTypeIndicator<HashMap<String, Object>> _ind = new GenericTypeIndicator<HashMap<String, Object>>() {};
							for (DataSnapshot _data : _dataSnapshot.getChildren()) {
								HashMap<String, Object> _map = _data.getValue(_ind);
								map.add(_map);
							}
						}
						catch (Exception _e) {
							_e.printStackTrace();
						}
						{
							HashMap<String, Object> _item = new HashMap<>();
							_item.put(_childKey, users.push().getKey());
							map.add(_item);
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
		users.addChildEventListener(_users_child_listener);
		
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
		users.addChildEventListener(_users_child_listener);
		textview2greet.setText(FirebaseAuth.getInstance().getCurrentUser().getEmail());
		int[] colors = {Color.parseColor("#00000000"), Color.parseColor("#ff0000cc")};
		android.graphics.drawable.GradientDrawable kj4 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colors);
		 kj4.setCornerRadii(new float[] {0, 0, 0, 0, 0, 0, 0, 0});
		linear12slidercontent.setBackground(kj4);
		textview2greet.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/lexiereadable_bold.ttf"), 1);
		linear13slider1.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)2, 0xFFE0E0E0, 0xFF82B1FF));
		linear14slider2.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)2, 0xFFE0E0E0, 0xFF82B1FF));
		linear15slider3.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)2, 0xFFE0E0E0, 0xFF82B1FF));
		linear16slider4.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)2, 0xFFE0E0E0, 0xFF82B1FF));
		_setBackground(linear13slider1, 20, 2, "#82B1FF", true);
		_setBackground(linear14slider2, 20, 2, "#82B1FF", true);
		_setBackground(linear15slider3, 20, 2, "#82B1FF", true);
		_setBackground(linear16slider4, 20, 2, "#82B1FF", true);
		linear18stress.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL,new int[] {0xFF757575,0xFFFFFFFF}));
		linear19anxirty.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL,new int[] {0xFF757575,0xFFFFFFFF}));
		linear20depre.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL,new int[] {0xFF757575,0xFFFFFFFF}));
		linear21calm.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL,new int[] {0xFF757575,0xFFFFFFFF}));
		linear22meetnew.setBackground(new GradientDrawable(GradientDrawable.Orientation.BR_TL,new int[] {0xFF757575,0xFFFFFFFF}));
		_touchListener(linear13slider1);
		_touchListener(linear14slider2);
		_touchListener(linear15slider3);
		_touchListener(linear16slider4);
		_touchListener(linear18stress);
		_touchListener(linear20depre);
		_touchListener(linear21calm);
		_touchListener(linear22meetnew);
		_touchListener(linear19anxirty);
	}
	
	@Override
	public void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _setBackground (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
			android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
			gd.setColor(Color.parseColor(_color));
			gd.setCornerRadius((int)_radius);
			_view.setElevation((int)_shadow);
			
			android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#212121")});
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
	
	
	public void _touchListener (final View _view) {
		_view.setOnTouchListener(new View.OnTouchListener() {
			@Override public boolean onTouch(View v, MotionEvent event) {switch (event.getAction()) {
					case MotionEvent.ACTION_DOWN:
					_Animator(_view, "scaleX", .91d, 150);
					_Animator(_view, "scaleY", .91d, 150);
					_setBG(_view, "#448AFF", "#448AFF", 20, 20, 20, 20, 0, "#BDBDBD");
					return true;
					case MotionEvent.ACTION_UP:
					_Animator(_view, "scaleX", 1, 150);
					_Animator(_view, "scaleY", 1, 150);
					_Animator(linear12, "scaleY", 1, 300);
					_Animator(linear12, "scaleX", 1, 300);
					_setBG(_view, "#448AFF", "#448AFF", 20, 20, 20, 20, 0, "#F4F5F8");
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
	
	
	public void _setBG (final View _view, final String _color1, final String _color2, final double _lt, final double _rt, final double _rb, final double _lb, final double _shadow, final String _shadowColor) {
		int[] colors = { Color.parseColor(_color1), Color.parseColor(_color2) }; android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT, colors);
		gd.setCornerRadii(new float[]{(int)_lt,(int)_lt,(int)_rt,(int)_rt,(int)_rb,(int)_rb,(int)_lb,(int)_lb});
		_view.setBackground(gd);
		
		_view.setElevation((int)_shadow);
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
	
	
	
}