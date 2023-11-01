package com.mubas.mybrain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.*;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
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
import android.widget.ScrollView;
import androidx.cardview.widget.CardView;
import android.widget.ImageView;
import android.widget.Button;
import android.widget.HorizontalScrollView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class DepressionActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double current_page = 0;
	
	private LinearLayout linear_parent;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout linear_page_box;
	private LinearLayout linear1;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private TextView textview1;
	private ScrollView vscroll1;
	private LinearLayout linear2;
	private CardView cardview1;
	private TextView textview4;
	private TextView textview14;
	private TextView textview13;
	private TextView textview5;
	private TextView textview12;
	private TextView textview6;
	private TextView textview7;
	private TextView textview8;
	private TextView textview11;
	private TextView textview10;
	private TextView textview9;
	private ImageView imageview1;
	private TextView textview2;
	private LinearLayout linear3;
	private Button button1;
	private HorizontalScrollView hscroll1;
	private LinearLayout linear5;
	private CardView cardview3;
	private CardView cardview2;
	private CardView cardview4;
	private CardView cardview5;
	private CardView cardview6;
	private CardView cardview7;
	private CardView cardview8;
	private CardView cardview9;
	private CardView cardview10;
	private CardView cardview11;
	private ImageView imageview2;
	private ImageView imageview4;
	private ImageView imageview3;
	private ImageView imageview5;
	private ImageView imageview6;
	private ImageView imageview7;
	private ImageView imageview8;
	private ImageView imageview9;
	private ImageView imageview10;
	private ImageView imageview11;
	private TextView textview3;
	private TextView txt_skip;
	private LinearLayout linear_dots_box;
	private TextView txt_next;
	private ImageView dot1;
	private ImageView dot2;
	private ImageView dot3;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.depression);
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
		linear_parent = (LinearLayout) findViewById(R.id.linear_parent);
		base = (LinearLayout) findViewById(R.id.base);
		trash = (LinearLayout) findViewById(R.id.trash);
		linear_page_box = (LinearLayout) findViewById(R.id.linear_page_box);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		layout1 = (LinearLayout) findViewById(R.id.layout1);
		layout2 = (LinearLayout) findViewById(R.id.layout2);
		layout3 = (LinearLayout) findViewById(R.id.layout3);
		textview1 = (TextView) findViewById(R.id.textview1);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		textview4 = (TextView) findViewById(R.id.textview4);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview13 = (TextView) findViewById(R.id.textview13);
		textview5 = (TextView) findViewById(R.id.textview5);
		textview12 = (TextView) findViewById(R.id.textview12);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview11 = (TextView) findViewById(R.id.textview11);
		textview10 = (TextView) findViewById(R.id.textview10);
		textview9 = (TextView) findViewById(R.id.textview9);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		textview2 = (TextView) findViewById(R.id.textview2);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		button1 = (Button) findViewById(R.id.button1);
		hscroll1 = (HorizontalScrollView) findViewById(R.id.hscroll1);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		cardview8 = (CardView) findViewById(R.id.cardview8);
		cardview9 = (CardView) findViewById(R.id.cardview9);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		cardview11 = (CardView) findViewById(R.id.cardview11);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		imageview4 = (ImageView) findViewById(R.id.imageview4);
		imageview3 = (ImageView) findViewById(R.id.imageview3);
		imageview5 = (ImageView) findViewById(R.id.imageview5);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		imageview11 = (ImageView) findViewById(R.id.imageview11);
		textview3 = (TextView) findViewById(R.id.textview3);
		txt_skip = (TextView) findViewById(R.id.txt_skip);
		linear_dots_box = (LinearLayout) findViewById(R.id.linear_dots_box);
		txt_next = (TextView) findViewById(R.id.txt_next);
		dot1 = (ImageView) findViewById(R.id.dot1);
		dot2 = (ImageView) findViewById(R.id.dot2);
		dot3 = (ImageView) findViewById(R.id.dot3);
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.goodgoodgood.co"));
				startActivity(i);
			}
		});
		
		textview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://therapybypro.com"));
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
		setTitle("Depression");
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
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		textview4.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 1);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
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