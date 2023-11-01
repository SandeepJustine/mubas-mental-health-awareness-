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
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager.OnPageChangeListener;
import androidx.viewpager.widget.ViewPager.OnAdapterChangeListener;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener;
import java.util.Timer;
import java.util.TimerTask;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class SplashActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private LinearLayout bg1;
	private LinearLayout linear3textv;
	private LinearLayout linear3bg;
	private ViewPager viewpager1;
	private BottomNavigationView bottomnavigation1;
	
	private TimerTask t;
	private TimerTask time;
	private Intent in = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.splash);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		bg1 = (LinearLayout) findViewById(R.id.bg1);
		linear3textv = (LinearLayout) findViewById(R.id.linear3textv);
		linear3bg = (LinearLayout) findViewById(R.id.linear3bg);
		viewpager1 = (ViewPager) findViewById(R.id.viewpager1);
		bottomnavigation1 = (BottomNavigationView) findViewById(R.id.bottomnavigation1);
		
		bottomnavigation1.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
			@Override
			public boolean onNavigationItemSelected(MenuItem item) {
				final int _itemId = item.getItemId();
				viewpager1.setCurrentItem((int)_itemId);
				return true;
			}
		});
	}
	
	private void initializeLogic() {
		int[] colors = {Color.parseColor("#ff0000ff"), Color.parseColor("#00000000")};
		android.graphics.drawable.GradientDrawable ew4 = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM, colors);
		 ew4.setCornerRadii(new float[] {32, 32, 32, 32, 0, 0, 0, 0});
		bottomnavigation1.setElevation((int)20);
		bottomnavigation1.setBackground(ew4);
		bottomnavigation1.getMenu().add(0, 0, 0, "Home").setIcon(R.drawable.ic_home_black);
		bottomnavigation1.getMenu().add(0, 1, 0, "Tools").setIcon(R.drawable.ic_trending_up_black);
		bottomnavigation1.getMenu().add(0, 2, 0, "Chat").setIcon(R.drawable.icons_12);
		bottomnavigation1.getMenu().add(0, 3, 0, "Menu").setIcon(R.drawable.ic_apps_black);
		viewpager1.setAdapter(new MyFragmentAdapter(getApplicationContext(), getSupportFragmentManager(), 4));
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public class MyFragmentAdapter extends FragmentStatePagerAdapter {
		Context context;
		int tabCount;
		
		public MyFragmentAdapter(Context context, FragmentManager fm, int tabCount) {
			super(fm);
			this.context = context;
			this.tabCount = tabCount;
		}
		
		@Override
		public int getCount(){
			return tabCount;
		}
		
		@Override
		public CharSequence getPageTitle(int _position) {
			
			return null;
		}
		
		@Override
		public Fragment getItem(int _position) {
			if (_position == 0) {
				return new Hom1FragmentActivity();
			}
			if (_position == 1) {
				return new ToolsFragmentActivity();
			}
			if (_position == 2) {
				return new ChatFragmentActivity();
			}
			if (_position == 3) {
				return new MenuFragmentActivity();
			}
			return null;
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