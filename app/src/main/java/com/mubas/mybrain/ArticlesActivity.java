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
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ArticlesActivity extends  AppCompatActivity  { 
	
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	
	private LinearLayout linear1;
	private ScrollView vscroll2;
	private TextView textview1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear5;
	private LinearLayout linear6;
	private LinearLayout linear7;
	private LinearLayout linear8;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private LinearLayout linear12;
	private LinearLayout linear13;
	private CardView cardview9;
	private TextView textview2;
	private CardView cardview8;
	private TextView textview3;
	private CardView cardview7;
	private TextView textview4;
	private CardView cardview6;
	private TextView textview5;
	private CardView cardview5;
	private TextView textview6;
	private CardView cardview4;
	private TextView textview7;
	private CardView cardview3;
	private TextView textview8;
	private CardView cardview2;
	private TextView textview9;
	private CardView cardview10;
	private TextView textview10;
	private CardView cardview1;
	private TextView textview11;
	
	private Intent i = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.articles);
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
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		textview1 = (TextView) findViewById(R.id.textview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear5 = (LinearLayout) findViewById(R.id.linear5);
		linear6 = (LinearLayout) findViewById(R.id.linear6);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		cardview9 = (CardView) findViewById(R.id.cardview9);
		textview2 = (TextView) findViewById(R.id.textview2);
		cardview8 = (CardView) findViewById(R.id.cardview8);
		textview3 = (TextView) findViewById(R.id.textview3);
		cardview7 = (CardView) findViewById(R.id.cardview7);
		textview4 = (TextView) findViewById(R.id.textview4);
		cardview6 = (CardView) findViewById(R.id.cardview6);
		textview5 = (TextView) findViewById(R.id.textview5);
		cardview5 = (CardView) findViewById(R.id.cardview5);
		textview6 = (TextView) findViewById(R.id.textview6);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		textview7 = (TextView) findViewById(R.id.textview7);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		textview8 = (TextView) findViewById(R.id.textview8);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		textview9 = (TextView) findViewById(R.id.textview9);
		cardview10 = (CardView) findViewById(R.id.cardview10);
		textview10 = (TextView) findViewById(R.id.textview10);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		textview11 = (TextView) findViewById(R.id.textview11);
		
		cardview9.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.verywellmind.com"));
				startActivity(i);
			}
		});
		
		cardview8.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.verywellmind.com"));
				startActivity(i);
			}
		});
		
		cardview7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.mayoclinic.org"));
				startActivity(i);
			}
		});
		
		cardview6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://oconnorpg.com"));
				startActivity(i);
			}
		});
		
		cardview5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.unh.edu"));
				startActivity(i);
			}
		});
		
		cardview4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.dovepress.com"));
				startActivity(i);
			}
		});
		
		cardview3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.helpguide.org"));
				startActivity(i);
			}
		});
		
		cardview2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.uopeople.edu"));
				startActivity(i);
			}
		});
		
		cardview10.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.richdad.com"));
				startActivity(i);
			}
		});
		
		cardview1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i.setAction(Intent.ACTION_VIEW);
				i.setData(Uri.parse("https://www.havingtime.com"));
				startActivity(i);
			}
		});
	}
	
	private void initializeLogic() {
		cardview1.setRadius((float)20);
		cardview2.setRadius((float)28);
		cardview3.setRadius((float)20);
		cardview4.setRadius((float)20);
		cardview5.setRadius((float)20);
		cardview6.setRadius((float)20);
		cardview8.setRadius((float)20);
		cardview9.setRadius((float)20);
		cardview7.setRadius((float)20);
		cardview10.setRadius((float)20);
		cardview9.setCardBackgroundColor(0xFF80D8FF);
		cardview8.setCardBackgroundColor(0xFF80D8FF);
		cardview7.setCardBackgroundColor(0xFF80D8FF);
		cardview6.setCardBackgroundColor(0xFF80D8FF);
		cardview5.setCardBackgroundColor(0xFF80D8FF);
		cardview4.setCardBackgroundColor(0xFF80D8FF);
		cardview3.setCardBackgroundColor(0xFF80D8FF);
		cardview2.setCardBackgroundColor(0xFF80D8FF);
		cardview10.setCardBackgroundColor(0xFF80D8FF);
		cardview1.setCardBackgroundColor(0xFF80D8FF);
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
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