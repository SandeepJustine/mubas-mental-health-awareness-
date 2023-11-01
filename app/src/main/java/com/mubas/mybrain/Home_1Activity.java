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
import android.widget.TextView;
import android.widget.ImageView;
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
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class Home_1Activity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private double current_page = 0;
	
	private LinearLayout linear_parent;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout linear_page_box;
	private LinearLayout linear1;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private LinearLayout bg1;
	private LinearLayout bg;
	private LinearLayout top;
	private LinearLayout bottom;
	private LinearLayout linear2;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private TextView textview1;
	private TextView textview4;
	private TextView textview5;
	private ImageView imageview1;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private LinearLayout linear14;
	private LinearLayout linear15;
	private TextView textview6;
	private TextView textview7;
	private TextView textview2;
	private ImageView imageview2;
	private LinearLayout linear16;
	private LinearLayout linear17;
	private LinearLayout linear18;
	private LinearLayout linear19;
	private LinearLayout linear20;
	private LinearLayout linear21;
	private LinearLayout linear22;
	private LinearLayout linear23;
	private LinearLayout linear24;
	private TextView textview8;
	private TextView textview3;
	private TextView textview9;
	private ImageView imageview3;
	private TextView txt_skip;
	private LinearLayout linear_dots_box;
	private TextView txt_next;
	private ImageView dot1;
	private ImageView dot2;
	private ImageView dot3;
	
	private Intent i = new Intent();
	private TimerTask t;
	private ObjectAnimator a = new ObjectAnimator();
	private ObjectAnimator object = new ObjectAnimator();
	private AlertDialog.Builder d;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.home_1);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		linear_parent = (LinearLayout) findViewById(R.id.linear_parent);
		base = (LinearLayout) findViewById(R.id.base);
		trash = (LinearLayout) findViewById(R.id.trash);
		linear_page_box = (LinearLayout) findViewById(R.id.linear_page_box);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		layout1 = (LinearLayout) findViewById(R.id.layout1);
		layout2 = (LinearLayout) findViewById(R.id.layout2);
		layout3 = (LinearLayout) findViewById(R.id.layout3);
		bg1 = (LinearLayout) findViewById(R.id.bg1);
		bg = (LinearLayout) findViewById(R.id.bg);
		top = (LinearLayout) findViewById(R.id.top);
		bottom = (LinearLayout) findViewById(R.id.bottom);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		textview1 = (TextView) findViewById(R.id.textview1);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview5 = (TextView) findViewById(R.id.textview5);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		linear14 = (LinearLayout) findViewById(R.id.linear14);
		linear15 = (LinearLayout) findViewById(R.id.linear15);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview2 = (TextView) findViewById(R.id.textview2);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		linear17 = (LinearLayout) findViewById(R.id.linear17);
		linear18 = (LinearLayout) findViewById(R.id.linear18);
		linear19 = (LinearLayout) findViewById(R.id.linear19);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear21 = (LinearLayout) findViewById(R.id.linear21);
		linear22 = (LinearLayout) findViewById(R.id.linear22);
		linear23 = (LinearLayout) findViewById(R.id.linear23);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview3 = (TextView) findViewById(R.id.textview3);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		txt_skip = (TextView) findViewById(R.id.txt_skip);
		linear_dots_box = (LinearLayout) findViewById(R.id.linear_dots_box);
		txt_next = (TextView) findViewById(R.id.txt_next);
		dot1 = (ImageView) findViewById(R.id.dot1);
		dot2 = (ImageView) findViewById(R.id.dot2);
		dot3 = (ImageView) findViewById(R.id.dot3);
		d = new AlertDialog.Builder(this);
		
		linear5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
		
		linear23.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), SplashActivity.class);
				startActivity(i);
			}
		});
		
		txt_skip.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setClass(getApplicationContext(), SplashActivity.class);
				startActivity(i);
			}
		});
		
		txt_next.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
	}
	
	private void initializeLogic() {
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF8C9EFF));
		linear14.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF8C9EFF));
		linear23.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFF8C9EFF));
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview6.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview7.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview8.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		textview3.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		viewPager = new androidx.viewpager.widget.ViewPager(this);
		
		viewPager.setLayoutParams(new ViewGroup.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT));
		MyPagerAdapter adapter = new MyPagerAdapter();
		viewPager.setAdapter(adapter);
		viewPager.setCurrentItem(0);
		base.addView(viewPager);
		
		viewPager.addOnPageChangeListener(new androidx.viewpager.widget.ViewPager.OnPageChangeListener() {
			public void onPageSelected(int position) {
			}
			@Override public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
				
				current_page= Double.valueOf(position);
				_dot_set_selection(current_page);
				if (current_page == 2) {
					txt_next.setText("DONE");
				}
				else {
					txt_next.setText("NEXT");
				}
			}
			@Override public void onPageScrollStateChanged(int state) {
				
			}
		});
		
		
		tabLayout = new com.google.android.material.tabs.TabLayout(this);
		tabLayout.setTabGravity(tabLayout.GRAVITY_FILL);
	}
	
	private class MyPagerAdapter extends androidx.viewpager.widget.PagerAdapter {
		public int getCount() {
			return 3;
		}
		
		@Override public Object instantiateItem(ViewGroup collection, int position) {
			
			LayoutInflater inflater = (LayoutInflater) getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View v = inflater.inflate(R.layout.empty, null);
			
			LinearLayout container = (LinearLayout) v.findViewById(R.id.linear1);
			
			if (position == 0) {
				ViewGroup parent = (ViewGroup) layout1.getParent();
				if (parent != null) {
					parent.removeView(layout1);
				}container.addView(layout1);
				
			} else if (position == 1) {
				ViewGroup parent = (ViewGroup) layout2.getParent();
				if (parent != null) {
					parent.removeView(layout2);
				}
				container.addView(layout2);
				
			} else if (position == 2) {
				ViewGroup parent = (ViewGroup) layout3.getParent();
				if (parent != null) {
					parent.removeView(layout3);
				}
				container.addView(layout3);
			}
			collection.addView(v, 0);
			return v;
		}
		@Override public void destroyItem(ViewGroup collection, int position, Object view) {
			collection.removeView((View) view);
			trash.addView((View) view);
		}
		@Override public boolean isViewFromObject(View arg0, Object arg1) {
			return arg0 == ((View) arg1);}
		@Override public Parcelable saveState() {
			return null;
		}
	}
	androidx.viewpager.widget.ViewPager viewPager;
	com.google.android.material.tabs.TabLayout tabLayout;
	private void foo() {
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
		d.setTitle("Exit");
		d.setIcon(R.drawable.brain_6);
		d.setMessage("Are you sure you want to exit the app?");
		d.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				finish();
			}
		});
		d.setNegativeButton("No", new DialogInterface.OnClickListener() {
			@Override
			public void onClick(DialogInterface _dialog, int _which) {
				
			}
		});
		d.create().show();
	}
	public void _dot_set_selection (final double _n) {
		dot1.setImageResource(R.drawable.circle_outline);
		dot2.setImageResource(R.drawable.circle_outline);
		dot3.setImageResource(R.drawable.circle_outline);
		if (_n == 0) {
			dot1.setImageResource(R.drawable.circle_filled);
		}
		else {
			if (_n == 1) {
				dot2.setImageResource(R.drawable.circle_filled);
			}
			else {
				if (_n == 2) {
					dot3.setImageResource(R.drawable.circle_filled);
				}
				else {
					
				}
			}
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