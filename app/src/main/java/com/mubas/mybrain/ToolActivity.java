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
import android.widget.ScrollView;
import android.widget.TextView;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import java.util.Timer;
import java.util.TimerTask;
import android.media.SoundPool;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.view.View;
import android.animation.Animator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ToolActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private boolean darkmode = false;
	private String share = "";
	private double round = 0;
	private double sp1 = 0;
	private double sp2 = 0;
	private double sp3 = 0;
	private double sp4 = 0;
	private double l_s_duration = 0;
	private double MysteryPakage = 0;
	
	private LinearLayout l_p;
	private ImageView p;
	private LinearLayout l_u;
	private ScrollView vs_1;
	private LinearLayout l_cr;
	private ImageView ic_ua;
	private TextView t_un;
	private LinearLayout l_c;
	private ImageView ic_c;
	private TextView t_c;
	private LinearLayout linear1;
	private LinearLayout l_d;
	private TextView t_c_d;
	private LinearLayout l_l;
	private LinearLayout l_d_h;
	private TextView t_n_r;
	private LinearLayout d_r_p;
	private TextView tp1;
	private LinearLayout l_d_c;
	private LinearLayout b1;
	private LinearLayout l_r_t;
	private ImageView ic_d;
	private TextView t_d;
	private TextView t_hh;
	private TextView t_mm;
	private TextView t_ss;
	private LinearLayout d_r1;
	private LinearLayout d_r2;
	private LinearLayout d1;
	private LinearLayout d2;
	private LinearLayout d3;
	private LinearLayout d4;
	private TextView t_d1;
	private ImageView c_1;
	private TextView c1;
	private TextView t_d2;
	private ImageView c_2;
	private TextView c2;
	private TextView t_d3;
	private ImageView c_3;
	private TextView c3;
	private TextView t_d4;
	private ImageView c_4;
	private TextView c4;
	private LinearLayout d5;
	private LinearLayout d6;
	private LinearLayout d7;
	private TextView t_d5;
	private ImageView c_5;
	private TextView c5;
	private TextView t_d6;
	private ImageView c_6;
	private TextView c6;
	private LinearLayout d7_c;
	private ImageView c_7;
	private TextView t_d7;
	private TextView t_m;
	private TextView c7;
	private LinearLayout l_s_h;
	private LinearLayout b2;
	private ImageView ic_s;
	private LinearLayout l_w;
	private ImageView ic_st;
	private TextView b_s;
	private TextView tp2;
	private ImageView ic_l_s;
	private TextView t_l_s;
	private ImageView ic_i;
	private LinearLayout w_b;
	private TextView t_t;
	
	private ObjectAnimator oa1 = new ObjectAnimator();
	private ObjectAnimator oa2 = new ObjectAnimator();
	private ObjectAnimator oa3 = new ObjectAnimator();
	private ObjectAnimator oa4 = new ObjectAnimator();
	private ObjectAnimator oa5 = new ObjectAnimator();
	private ObjectAnimator oa6 = new ObjectAnimator();
	private ObjectAnimator oa7 = new ObjectAnimator();
	private ObjectAnimator oa13 = new ObjectAnimator();
	private SharedPreferences DATA;
	private Intent i1 = new Intent();
	private Intent i2 = new Intent();
	private TimerTask t1;
	private TimerTask t2;
	private TimerTask t4;
	private TimerTask t3;
	private TimerTask t6;
	private TimerTask t7;
	private TimerTask next_time_gap;
	private ObjectAnimator l_s = new ObjectAnimator();
	private ObjectAnimator o1 = new ObjectAnimator();
	private ObjectAnimator o2 = new ObjectAnimator();
	private ObjectAnimator o3 = new ObjectAnimator();
	private ObjectAnimator o4 = new ObjectAnimator();
	private ObjectAnimator o5 = new ObjectAnimator();
	private ObjectAnimator o6 = new ObjectAnimator();
	private ObjectAnimator o7 = new ObjectAnimator();
	private SoundPool sp;
	private Calendar calender = Calendar.getInstance();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.tool);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		l_p = (LinearLayout) findViewById(R.id.l_p);
		p = (ImageView) findViewById(R.id.p);
		l_u = (LinearLayout) findViewById(R.id.l_u);
		vs_1 = (ScrollView) findViewById(R.id.vs_1);
		l_cr = (LinearLayout) findViewById(R.id.l_cr);
		ic_ua = (ImageView) findViewById(R.id.ic_ua);
		t_un = (TextView) findViewById(R.id.t_un);
		l_c = (LinearLayout) findViewById(R.id.l_c);
		ic_c = (ImageView) findViewById(R.id.ic_c);
		t_c = (TextView) findViewById(R.id.t_c);
		linear1 = (LinearLayout) findViewById(R.id.linear1);
		l_d = (LinearLayout) findViewById(R.id.l_d);
		t_c_d = (TextView) findViewById(R.id.t_c_d);
		l_l = (LinearLayout) findViewById(R.id.l_l);
		l_d_h = (LinearLayout) findViewById(R.id.l_d_h);
		t_n_r = (TextView) findViewById(R.id.t_n_r);
		d_r_p = (LinearLayout) findViewById(R.id.d_r_p);
		tp1 = (TextView) findViewById(R.id.tp1);
		l_d_c = (LinearLayout) findViewById(R.id.l_d_c);
		b1 = (LinearLayout) findViewById(R.id.b1);
		l_r_t = (LinearLayout) findViewById(R.id.l_r_t);
		ic_d = (ImageView) findViewById(R.id.ic_d);
		t_d = (TextView) findViewById(R.id.t_d);
		t_hh = (TextView) findViewById(R.id.t_hh);
		t_mm = (TextView) findViewById(R.id.t_mm);
		t_ss = (TextView) findViewById(R.id.t_ss);
		d_r1 = (LinearLayout) findViewById(R.id.d_r1);
		d_r2 = (LinearLayout) findViewById(R.id.d_r2);
		d1 = (LinearLayout) findViewById(R.id.d1);
		d2 = (LinearLayout) findViewById(R.id.d2);
		d3 = (LinearLayout) findViewById(R.id.d3);
		d4 = (LinearLayout) findViewById(R.id.d4);
		t_d1 = (TextView) findViewById(R.id.t_d1);
		c_1 = (ImageView) findViewById(R.id.c_1);
		c1 = (TextView) findViewById(R.id.c1);
		t_d2 = (TextView) findViewById(R.id.t_d2);
		c_2 = (ImageView) findViewById(R.id.c_2);
		c2 = (TextView) findViewById(R.id.c2);
		t_d3 = (TextView) findViewById(R.id.t_d3);
		c_3 = (ImageView) findViewById(R.id.c_3);
		c3 = (TextView) findViewById(R.id.c3);
		t_d4 = (TextView) findViewById(R.id.t_d4);
		c_4 = (ImageView) findViewById(R.id.c_4);
		c4 = (TextView) findViewById(R.id.c4);
		d5 = (LinearLayout) findViewById(R.id.d5);
		d6 = (LinearLayout) findViewById(R.id.d6);
		d7 = (LinearLayout) findViewById(R.id.d7);
		t_d5 = (TextView) findViewById(R.id.t_d5);
		c_5 = (ImageView) findViewById(R.id.c_5);
		c5 = (TextView) findViewById(R.id.c5);
		t_d6 = (TextView) findViewById(R.id.t_d6);
		c_6 = (ImageView) findViewById(R.id.c_6);
		c6 = (TextView) findViewById(R.id.c6);
		d7_c = (LinearLayout) findViewById(R.id.d7_c);
		c_7 = (ImageView) findViewById(R.id.c_7);
		t_d7 = (TextView) findViewById(R.id.t_d7);
		t_m = (TextView) findViewById(R.id.t_m);
		c7 = (TextView) findViewById(R.id.c7);
		l_s_h = (LinearLayout) findViewById(R.id.l_s_h);
		b2 = (LinearLayout) findViewById(R.id.b2);
		ic_s = (ImageView) findViewById(R.id.ic_s);
		l_w = (LinearLayout) findViewById(R.id.l_w);
		ic_st = (ImageView) findViewById(R.id.ic_st);
		b_s = (TextView) findViewById(R.id.b_s);
		tp2 = (TextView) findViewById(R.id.tp2);
		ic_l_s = (ImageView) findViewById(R.id.ic_l_s);
		t_l_s = (TextView) findViewById(R.id.t_l_s);
		ic_i = (ImageView) findViewById(R.id.ic_i);
		w_b = (LinearLayout) findViewById(R.id.w_b);
		t_t = (TextView) findViewById(R.id.t_t);
		DATA = getSharedPreferences("DATA", Activity.MODE_PRIVATE);
		
		d1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (DATA.getString("DAY", "").equals("1")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have already claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								if (DATA.getString("FIRSTTIME", "").equals("FIRSTTIME")) {
										DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("5"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
										_ctt("Congratulations you got 5 coins successfully from daily reward.");
								}
								else {
										DATA.edit().putString("FIRSTTIME", "FIRSTTIME").commit();
										DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("50"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
										_ctt("Congratulations you got 50 coins successfully from daily reward.");
								}
								oa1.cancel();
								oa7.cancel();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("TIME", "12:00 AM").commit();
								DATA.edit().putString("CLAIMEDTIME", new SimpleDateFormat("hh:MMa").format(calender.getTime())).commit();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "2").commit();
								_Gradient_round(d1, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_1.setScaleX((float)(1));
								t_d2.setTextColor(0xFFFFFFFF);
								c2.setTextColor(0xFFFFFFFF);
								_rt();
						}
				}
			}
		});
		
		d2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (DATA.getString("DAY", "").equals("2")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								oa2.cancel();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "3").commit();
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("10"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("TIME", "12:00 AM").commit();
								DATA.edit().putString("CLAIMEDTIME", new SimpleDateFormat("hh:mma").format(calender.getTime())).commit();
								_ctt("Congratulations you got 10 coins successfully from daily reward.");
								_Gradient_round(d2, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_2.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_2.setScaleX((float)(1));
								t_d3.setTextColor(0xFFFFFFFF);
								c3.setTextColor(0xFFFFFFFF);
								_rt();
						}
				}
			}
		});
		
		d3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (DATA.getString("DAY", "").equals("3")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								oa3.cancel();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "4").commit();
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("15"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("TIME", "12:00 AM").commit();
								DATA.edit().putString("CLAIMEDTIME", new SimpleDateFormat("hh:mma").format(calender.getTime())).commit();
								_ctt("Congratulations you got 15 coins successfully from daily reward.");
								_Gradient_round(d3, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_3.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_3.setScaleX((float)(1));
								t_d4.setTextColor(0xFFFFFFFF);
								c4.setTextColor(0xFFFFFFFF);
								_rt();
						}
				}
			}
		});
		
		d4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (DATA.getString("DAY", "").equals("4")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								oa4.cancel();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "5").commit();
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("20"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("TIME", "12:00 AM").commit();
								DATA.edit().putString("CLAIMEDTIME", new SimpleDateFormat("hh:mma").format(calender.getTime())).commit();
								_ctt("Congratulations you got 20 coins successfully from daily reward.");
								_Gradient_round(d4, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_4.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_4.setScaleX((float)(1));
								t_d5.setTextColor(0xFFFFFFFF);
								c5.setTextColor(0xFFFFFFFF);
								_rt();
						}
				}
			}
		});
		
		d5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				if (DATA.getString("DAY", "").equals("5")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								oa5.cancel();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "6").commit();
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("25"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("Time", "12:00 AM").commit();
								DATA.edit().putString("CLAIMEDTIME", new SimpleDateFormat("hh:mma").format(calender.getTime())).commit();
								_ctt("Congratulations you got 25 coins successfully from daily reward.");
								_Gradient_round(d5, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_5.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_5.setScaleX((float)(1));
								t_d6.setTextColor(0xFFFFFFFF);
								c6.setTextColor(0xFFFFFFFF);
								_rt();
						}
				}
			}
		});
		
		d6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
				if (DATA.getString("DAY", "").equals("6")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								oa6.cancel();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "7").commit();
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("30"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("TIME", "12:00 AM").commit();
								DATA.edit().putString("CALMEDTIME", new SimpleDateFormat("hh:mma").format(calender.getTime())).commit();
								_ctt("Congratulations you got 30 coins successfully from daily reward.");
								_Gradient_round(d6, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_6.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_6.setScaleX((float)(1));
								t_d7.setTextColor(0xFFFFFFFF);
								t_m.setTextColor(0xFFFFFFFF);
								c7.setTextColor(0xFFFFFFFF);
								_rt();
						}
				}
			}
		});
		
		d7.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (DATA.getString("DAY", "").equals("7")) {
						if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
								SketchwareUtil.showMessage(getApplicationContext(), "Sorry you have claimed the reward on ".concat(DATA.getString("CLAIMEDTIME", "")));
								sp4 = sp.play((int)(sp3), 1.0f, 1.0f, 1, (int)(0), 1.0f);
						}
						else {
								sp2 = sp.play((int)(sp1), 1.0f, 1.0f, 1, (int)(0), 1.0f);
								oa7.cancel();
								DATA.edit().putString("EVERYDAY", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("DAY", "1").commit();
								MysteryPakage = SketchwareUtil.getRandom((int)(10), (int)(60));
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + MysteryPakage)).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								DATA.edit().putString("REMAININGTIME", new SimpleDateFormat("yyyyMMdd").format(calender.getTime())).commit();
								DATA.edit().putString("TIME", "12:00 AM").commit();
								DATA.edit().putString("CLAIMEDTIME", new SimpleDateFormat("hh:mma").format(calender.getTime())).commit();
								_ctt("Congratulations you got ".concat(String.valueOf((long)(MysteryPakage)).concat(" coins successfully from daily reward mystery pakage.")));
								_Gradient_round(d7, round, "355869", "607D8B");
								t_n_r.setVisibility(View.GONE);
								l_r_t.setVisibility(View.VISIBLE);
								t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
								c_7.setScaleX((float)(1));
								c_1.setImageResource(R.drawable.ic_coin_48x48);
								c_7.setImageResource(R.drawable.default_image);
								_rt();
						}
				}
			}
		});
		
		b_s.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (!l_s.isRunning()) {
						if (Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) > 9) {
								_l_s_algorithm(SketchwareUtil.getRandom((int)(1), (int)(8)));
						}
						else {
								SketchwareUtil.showMessage(getApplicationContext(), "You don't have enough coins for spin.");
						}
				}
			}
		});
		
		l_s.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
				DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) - Double.parseDouble("20"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
				t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				if (l_w.getRotation() == 405) {
						_ctt("Congratulations you got 20 coins successfully from daily reward.");
						DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("20"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
						l_w.setRotation((float)(0));
				}
				else {
						if (l_w.getRotation() == 450) {
								_ctt("Congratulations you got 30 coins successfully from daily reward.");
								DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("30"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
								next_time_gap = new TimerTask() {
										@Override
										public void run() {
												runOnUiThread(new Runnable() {
														@Override
														public void run() {
																l_w.setRotation((float)(0));
														}
												});
										}
								};
								_timer.schedule(next_time_gap, (int)(500));
						}
						else {
								if (l_w.getRotation() == 495) {
										_ctt("Congratulations you got 50 coins successfully from daily reward.");
										DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("50"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
										next_time_gap = new TimerTask() {
												@Override
												public void run() {
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		l_w.setRotation((float)(0));
																}
														});
												}
										};
										_timer.schedule(next_time_gap, (int)(500));
								}
								else {
										if (l_w.getRotation() == 540) {
												SketchwareUtil.showMessage(getApplicationContext(), "Better luck next time ");
												next_time_gap = new TimerTask() {
														@Override
														public void run() {
																runOnUiThread(new Runnable() {
																		@Override
																		public void run() {
																				l_w.setRotation((float)(0));
																		}
																});
														}
												};
												_timer.schedule(next_time_gap, (int)(1000));
										}
										else {
												if (l_w.getRotation() == 585) {
														_ctt("Congratulations you got 40 coins successfully from daily reward.");
														DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("40"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
														next_time_gap = new TimerTask() {
																@Override
																public void run() {
																		runOnUiThread(new Runnable() {
																				@Override
																				public void run() {
																						l_w.setRotation((float)(0));
																				}
																		});
																}
														};
														_timer.schedule(next_time_gap, (int)(500));
												}
												else {
														if (l_w.getRotation() == 630) {
																_ctt("Congratulations you got 30 coins successfully from daily reward.");
																DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("30"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
																next_time_gap = new TimerTask() {
																		@Override
																		public void run() {
																				runOnUiThread(new Runnable() {
																						@Override
																						public void run() {
																								l_w.setRotation((float)(0));
																						}
																				});
																		}
																};
																_timer.schedule(next_time_gap, (int)(500));
														}
														else {
																if (l_w.getRotation() == 675) {
																		_ctt("Congratulations you got 20 coins successfully from daily reward.");
																		DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("20"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
																		next_time_gap = new TimerTask() {
																				@Override
																				public void run() {
																						runOnUiThread(new Runnable() {
																								@Override
																								public void run() {
																										l_w.setRotation((float)(0));
																								}
																						});
																				}
																		};
																		_timer.schedule(next_time_gap, (int)(500));
																}
																else {
																		if (l_w.getRotation() == 720) {
																				_ctt("Congratulations you got 10 coins successfully from daily reward.");
																				DATA.edit().putString("COIN", String.valueOf((long)(Double.parseDouble(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9")) + Double.parseDouble("10"))).replace("0", "#").replace("1", "$").replace("2", "_").replace("3", "&").replace("4", "-").replace("5", "+").replace("6", "(").replace("7", ")").replace("8", "*").replace("9", "\"")).commit();
																				next_time_gap = new TimerTask() {
																						@Override
																						public void run() {
																								runOnUiThread(new Runnable() {
																										@Override
																										public void run() {
																												l_w.setRotation((float)(0));
																										}
																								});
																						}
																				};
																				_timer.schedule(next_time_gap, (int)(500));
																		}
																}
														}
												}
										}
								}
						}
				}
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
	}
	
	private void initializeLogic() {
		_d();
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
	public void onResume() {
		super.onResume();
		_d();
	}
	public void _Gradient_round (final View _view, final double _radius, final String _color1, final String _color2) {
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TR_BL, new int[]{Color.parseColor("#"+_color1),Color.parseColor("#"+_color2)});
		s.setCornerRadius(new Float(_radius));
		_view.setBackground(s);
	}
	
	
	public void _rt () {
		t6 = new TimerTask() {
				@Override
				public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
										calender = Calendar.getInstance();
										if (new SimpleDateFormat("a").format(calender.getTime()).equals("AM")) {
												t_hh.setText(new DecimalFormat("00").format(Double.parseDouble(new SimpleDateFormat("hh").format(calender.getTime())) - 23));
										}
										if (new SimpleDateFormat("a").format(calender.getTime()).equals("PM")) {
												if (new SimpleDateFormat("hh").format(calender.getTime()).equals("12")) {
														t_hh.setText(new DecimalFormat("00").format(Double.parseDouble(new SimpleDateFormat("hh").format(calender.getTime())) - 23));
												}
												else {
														t_hh.setText(new DecimalFormat("00").format(Double.parseDouble(new SimpleDateFormat("hh").format(calender.getTime())) - 11));
												}
										}
										t_mm.setText(" : ".concat(new DecimalFormat("00").format(Double.parseDouble(new SimpleDateFormat("mm").format(calender.getTime())) - 59).replace("-", "").concat(" : ")));
										t_ss.setText(new DecimalFormat("00").format(Double.parseDouble(new SimpleDateFormat("ss").format(calender.getTime())) - 59).replace("-", ""));
								}
						});
				}
		};
		_timer.scheduleAtFixedRate(t6, (int)(0), (int)(1000));
	}
	
	
	public void _ctt (final String _t) {
		
		i1.setAction(Intent.ACTION_VIEW);
		i1.putExtra("DATA", _t);
		i1.setClass(getApplicationContext(), CRActivity.class);
		startActivity(i1);
	}
	
	
	public void _ddl () {
		round = 15;
		if (DATA.getString("DAY", "").equals("1")) {
				_Gradient_round(d1, round, "FF532D", "fC8700");
				_Gradient_round(d2, round, "FFD9DADE", "FFF5F6FA");
				_Gradient_round(d3, round, "FFD9DADE", "FFF5F6FA");
				_Gradient_round(d4, round, "FFD9DADE", "FFF5F6FA");
				_Gradient_round(d5, round, "FFD9DADE", "FFF5F6FA");
				_Gradient_round(d6, round, "FFD9DADE", "FFF5F6FA");
				_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
				c_2.setImageResource(R.drawable.ic_coin_48x48);
				c_3.setImageResource(R.drawable.ic_coin_48x48);
				c_4.setImageResource(R.drawable.ic_coin_48x48);
				c_5.setImageResource(R.drawable.ic_coin_48x48);
				c_6.setImageResource(R.drawable.ic_coin_48x48);
				c_7.setImageResource(R.drawable.day7_treasure);
				t_d2.setTextColor(0xFF636466);
				c2.setTextColor(0xFF636466);
				t_d3.setTextColor(0xFF636466);
				c3.setTextColor(0xFF636466);
				t_d4.setTextColor(0xFF636466);
				c4.setTextColor(0xFF636466);
				t_d5.setTextColor(0xFF636466);
				c5.setTextColor(0xFF636466);
				t_d6.setTextColor(0xFF636466);
				c6.setTextColor(0xFF636466);
				t_d7.setTextColor(0xFF636466);
				t_m.setTextColor(0xFF636466);
				c7.setTextColor(0xFF636466);
				oa1.setTarget(c_1);
				oa1.setPropertyName("scaleX");
				oa1.setFloatValues((float)(-1), (float)(1));
				oa1.setDuration((int)(2000));
				oa1.setRepeatMode(ValueAnimator.REVERSE);
				oa1.setRepeatCount((int)(99999));
				oa1.setInterpolator(new LinearInterpolator());
				oa1.start();
		}
		else {
				if (DATA.getString("DAY", "").equals("2")) {
						_Gradient_round(d1, round, "355869", "607D8B");
						_Gradient_round(d2, round, "FF532D", "fC8700");
						_Gradient_round(d3, round, "FFD9DADE", "FFF5F6FA");
						_Gradient_round(d4, round, "FFD9DADE", "FFF5F6FA");
						_Gradient_round(d5, round, "FFD9DADE", "FFF5F6FA");
						_Gradient_round(d6, round, "FFD9DADE", "FFF5F6FA");
						_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
						c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
						c_3.setImageResource(R.drawable.ic_coin_48x48);
						c_4.setImageResource(R.drawable.ic_coin_48x48);
						c_5.setImageResource(R.drawable.ic_coin_48x48);
						c_6.setImageResource(R.drawable.ic_coin_48x48);
						c_7.setImageResource(R.drawable.day7_treasure);
						t_d3.setTextColor(0xFF636466);
						c3.setTextColor(0xFF636466);
						t_d4.setTextColor(0xFF636466);
						c4.setTextColor(0xFF636466);
						t_d5.setTextColor(0xFF636466);
						c5.setTextColor(0xFF636466);
						t_d6.setTextColor(0xFF636466);
						c6.setTextColor(0xFF636466);
						t_d7.setTextColor(0xFF636466);
						t_m.setTextColor(0xFF636466);
						c7.setTextColor(0xFF636466);
						oa2.setTarget(c_2);
						oa2.setPropertyName("scaleX");
						oa2.setFloatValues((float)(-1), (float)(1));
						oa2.setDuration((int)(2000));
						oa2.setRepeatMode(ValueAnimator.REVERSE);
						oa2.setRepeatCount((int)(99999));
						oa2.setInterpolator(new LinearInterpolator());
						oa2.start();
				}
				else {
						if (DATA.getString("DAY", "").equals("3")) {
								_Gradient_round(d1, round, "355869", "607D8B");
								_Gradient_round(d2, round, "355869", "607D8B");
								_Gradient_round(d3, round, "FF532D", "fC8700");
								_Gradient_round(d4, round, "FFD9DADE", "FFF5F6FA");
								_Gradient_round(d5, round, "FFD9DADE", "FFF5F6FA");
								_Gradient_round(d6, round, "FFD9DADE", "FFF5F6FA");
								_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
								c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_2.setImageResource(R.drawable.ic_coin_48x48_dark);
								c_4.setImageResource(R.drawable.ic_coin_48x48);
								c_5.setImageResource(R.drawable.ic_coin_48x48);
								c_6.setImageResource(R.drawable.ic_coin_48x48);
								c_7.setImageResource(R.drawable.day7_treasure);
								t_d4.setTextColor(0xFF636466);
								c4.setTextColor(0xFF636466);
								t_d5.setTextColor(0xFF636466);
								c5.setTextColor(0xFF636466);
								t_d6.setTextColor(0xFF636466);
								c6.setTextColor(0xFF636466);
								t_d7.setTextColor(0xFF636466);
								t_m.setTextColor(0xFF636466);
								c7.setTextColor(0xFF636466);
								oa3.setTarget(c_3);
								oa3.setPropertyName("scaleX");
								oa3.setFloatValues((float)(-1), (float)(1));
								oa3.setDuration((int)(2000));
								oa3.setRepeatMode(ValueAnimator.REVERSE);
								oa3.setRepeatCount((int)(99999));
								oa3.setInterpolator(new LinearInterpolator());
								oa3.start();
						}
						else {
								if (DATA.getString("DAY", "").equals("4")) {
										_Gradient_round(d1, round, "355869", "607D8B");
										_Gradient_round(d2, round, "355869", "607D8B");
										_Gradient_round(d3, round, "355869", "607D8B");
										_Gradient_round(d4, round, "FF532D", "fC8700");
										_Gradient_round(d5, round, "FFD9DADE", "FFF5F6FA");
										_Gradient_round(d6, round, "FFD9DADE", "FFF5F6FA");
										_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
										c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
										c_2.setImageResource(R.drawable.ic_coin_48x48_dark);
										c_3.setImageResource(R.drawable.ic_coin_48x48_dark);
										c_5.setImageResource(R.drawable.ic_coin_48x48);
										c_6.setImageResource(R.drawable.ic_coin_48x48);
										c_7.setImageResource(R.drawable.day7_treasure);
										t_d5.setTextColor(0xFF636466);
										c5.setTextColor(0xFF636466);
										t_d6.setTextColor(0xFF636466);
										c6.setTextColor(0xFF636466);
										t_d7.setTextColor(0xFF636466);
										t_m.setTextColor(0xFF636466);
										c7.setTextColor(0xFF636466);
										oa4.setTarget(c_4);
										oa4.setPropertyName("scaleX");
										oa4.setFloatValues((float)(-1), (float)(1));
										oa4.setDuration((int)(2000));
										oa4.setRepeatMode(ValueAnimator.REVERSE);
										oa4.setRepeatCount((int)(99999));
										oa4.setInterpolator(new LinearInterpolator());
										oa4.start();
								}
								else {
										if (DATA.getString("DAY", "").equals("5")) {
												_Gradient_round(d1, round, "355869", "607D8B");
												_Gradient_round(d2, round, "355869", "607D8B");
												_Gradient_round(d3, round, "355869", "607D8B");
												_Gradient_round(d4, round, "355869", "607D8B");
												_Gradient_round(d5, round, "FF532D", "fC8700");
												_Gradient_round(d6, round, "FFD9DADE", "FFF5F6FA");
												_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
												c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
												c_2.setImageResource(R.drawable.ic_coin_48x48_dark);
												c_3.setImageResource(R.drawable.ic_coin_48x48_dark);
												c_4.setImageResource(R.drawable.ic_coin_48x48_dark);
												c_6.setImageResource(R.drawable.ic_coin_48x48);
												c_7.setImageResource(R.drawable.day7_treasure);
												t_d6.setTextColor(0xFF636466);
												c6.setTextColor(0xFF636466);
												t_d7.setTextColor(0xFF636466);
												t_m.setTextColor(0xFF636466);
												c7.setTextColor(0xFF636466);
												oa5.setTarget(c_5);
												oa5.setPropertyName("scaleX");
												oa5.setFloatValues((float)(-1), (float)(1));
												oa5.setDuration((int)(2000));
												oa5.setRepeatMode(ValueAnimator.REVERSE);
												oa5.setRepeatCount((int)(99999));
												oa5.setInterpolator(new LinearInterpolator());
												oa5.start();
										}
										else {
												if (DATA.getString("DAY", "").equals("6")) {
														_Gradient_round(d1, round, "355869", "607D8B");
														_Gradient_round(d2, round, "355869", "607D8B");
														_Gradient_round(d3, round, "355869", "607D8B");
														_Gradient_round(d4, round, "355869", "607D8B");
														_Gradient_round(d5, round, "355869", "607D8B");
														_Gradient_round(d6, round, "FF532D", "fC8700");
														_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
														c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
														c_2.setImageResource(R.drawable.ic_coin_48x48_dark);
														c_3.setImageResource(R.drawable.ic_coin_48x48_dark);
														c_4.setImageResource(R.drawable.ic_coin_48x48_dark);
														c_5.setImageResource(R.drawable.ic_coin_48x48_dark);
														c_7.setImageResource(R.drawable.day7_treasure);
														t_d7.setTextColor(0xFF636466);
														t_m.setTextColor(0xFF636466);
														c7.setTextColor(0xFF636466);
														oa6.setTarget(c_6);
														oa6.setPropertyName("scaleX");
														oa6.setFloatValues((float)(-1), (float)(1));
														oa6.setDuration((int)(2000));
														oa6.setRepeatMode(ValueAnimator.REVERSE);
														oa6.setRepeatCount((int)(99999));
														oa6.setInterpolator(new LinearInterpolator());
														oa6.start();
												}
												else {
														if (DATA.getString("DAY", "").equals("7")) {
																_Gradient_round(d1, round, "355869", "607D8B");
																_Gradient_round(d2, round, "355869", "607D8B");
																_Gradient_round(d3, round, "355869", "607D8B");
																_Gradient_round(d4, round, "355869", "607D8B");
																_Gradient_round(d5, round, "355869", "607D8B");
																_Gradient_round(d6, round, "355869", "607D8B");
																_Gradient_round(d7, round, "FF532D", "fC8700");
																c_1.setImageResource(R.drawable.ic_coin_48x48_dark);
																c_2.setImageResource(R.drawable.ic_coin_48x48_dark);
																c_3.setImageResource(R.drawable.ic_coin_48x48_dark);
																c_4.setImageResource(R.drawable.ic_coin_48x48_dark);
																c_5.setImageResource(R.drawable.ic_coin_48x48_dark);
																c_6.setImageResource(R.drawable.ic_coin_48x48_dark);
																c7.setTextColor(0xFFFFFFFF);
																oa7.setTarget(c_7);
																oa7.setPropertyName("scaleX");
																oa7.setFloatValues((float)(-1), (float)(1));
																oa7.setDuration((int)(2000));
																oa7.setRepeatMode(ValueAnimator.REVERSE);
																oa7.setRepeatCount((int)(99999));
																oa7.setInterpolator(new LinearInterpolator());
																oa7.start();
														}
														else {
																DATA.edit().putString("DAY", "1").commit();
																_Gradient_round(d1, round, "FF532D", "fC8700");
																_Gradient_round(d2, round, "FFD9DADE", "FFF5F6FA");
																_Gradient_round(d3, round, "FFD9DADE", "FFF5F6FA");
																_Gradient_round(d4, round, "FFD9DADE", "FFF5F6FA");
																_Gradient_round(d5, round, "FFD9DADE", "FFF5F6FA");
																_Gradient_round(d6, round, "FFD9DADE", "FFF5F6FA");
																_Gradient_round(d7, round, "FFD9DADE", "FFF5F6FA");
																c_2.setImageResource(R.drawable.ic_coin_48x48);
																c_3.setImageResource(R.drawable.ic_coin_48x48);
																c_4.setImageResource(R.drawable.ic_coin_48x48);
																c_5.setImageResource(R.drawable.ic_coin_48x48);
																c_6.setImageResource(R.drawable.ic_coin_48x48);
																c_7.setImageResource(R.drawable.day7_treasure);
																t_d2.setTextColor(0xFF636466);
																c2.setTextColor(0xFF636466);
																t_d3.setTextColor(0xFF636466);
																c3.setTextColor(0xFF636466);
																t_d4.setTextColor(0xFF636466);
																c4.setTextColor(0xFF636466);
																t_d5.setTextColor(0xFF636466);
																c5.setTextColor(0xFF636466);
																t_d6.setTextColor(0xFF636466);
																c6.setTextColor(0xFF636466);
																t_d7.setTextColor(0xFF636466);
																t_m.setTextColor(0xFF636466);
																c7.setTextColor(0xFF636466);
																oa7.setTarget(c_1);
																oa7.setPropertyName("scaleX");
																oa7.setFloatValues((float)(-1), (float)(1));
																oa7.setDuration((int)(2000));
																oa7.setRepeatMode(ValueAnimator.REVERSE);
																oa7.setRepeatCount((int)(99999));
																oa7.setInterpolator(new LinearInterpolator());
																oa7.start();
														}
												}
										}
								}
						}
				}
		}
	}
	
	
	public void _nsc (final String _c1, final String _c2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
				Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
				w.setStatusBarColor(Color.parseColor("#" + _c1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _c2.replace("#", "")));
		}
	}
	
	
	public void _d () {
		l_s_duration = 3000;
		_alp();
		sp = new SoundPool((int)(1), AudioManager.STREAM_MUSIC, 0);
		sp1 = sp.load(getApplicationContext(), R.raw.claimed, 1);
		sp3 = sp.load(getApplicationContext(), R.raw.wrong, 1);
		_r_s(100, 100, 100, 100, "00607d8b", "607d8b", 3, l_r_t);
		_r_s(50, 50, 50, 50, "00607d8b", "607d8b", 3, l_d);
		_r_s(50, 50, 50, 50, "00607d8b", "607d8b", 3, l_l);
		_r_s(20, 20, 20, 20, "00607d8b", "607d8b", 3, l_c);
		_sb(ic_ua, 100, 0, "#001731", true);
		_sb(t_n_r, 100, 0, "#001731", true);
		_nsc("ff001731", "ff001731");
		_Gradient_round(b_s, 100, "FF532D", "fC8700");
		t_n_r.setVisibility(View.GONE);
		t_un.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_c.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_d.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_l_s.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_hh.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_mm.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_ss.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_n_r.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		t_t.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		b_s.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_s_e(vs_1, false);
		if (DATA.getString("EVERYDAY", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
				t_hh.setText(DATA.getString("TIME", ""));
		}
		else {
				_ddl();
		}
		if (!DATA.getString("COIN", "").equals("")) {
				t_c.setText(DATA.getString("COIN", "").replace("#", "0").replace("$", "1").replace("_", "2").replace("&", "3").replace("-", "4").replace("+", "5").replace("(", "6").replace(")", "7").replace("*", "8").replace("\"", "9"));
		}
		else {
				/*
# means zero
*/
				DATA.edit().putString("COIN", "#").commit();
				t_c.setText("0");
		}
		if (DATA.getString("REMAININGTIME", "").equals("")) {
				t_n_r.setVisibility(View.VISIBLE);
				l_r_t.setVisibility(View.GONE);
				t_n_r.setText("Claim now to get your first time\nreward of 50 COINS.");
				t_d1.setText("First Reward");
				c1.setText("50 COINS");
		}
		else {
				_ddl();
				c1.setText("5 COINS");
				if (DATA.getString("REMAININGTIME", "").equals(new SimpleDateFormat("yyyyMMdd").format(calender.getTime()))) {
						_rt();
				}
				else {
						l_r_t.setVisibility(View.GONE);
						t_n_r.setVisibility(View.VISIBLE);
						t_n_r.setText("YOUR REWARD IS READY!");
				}
		}
		oa13.setTarget(ic_c);
		oa13.setPropertyName("scaleX");
		oa13.setFloatValues((float)(-1), (float)(1));
		oa13.setDuration((int)(2000));
		oa13.setRepeatMode(ValueAnimator.REVERSE);
		oa13.setRepeatCount((int)(99999));
		oa13.setInterpolator(new LinearInterpolator());
		oa13.start();
		_ddl();
		c2.setText("10 COINS");
		c3.setText("15 COINS");
		c4.setText("20 COINS");
		c5.setText("25 COINS");
		c6.setText("30 COINS");
		c7.setText("10~100");
		t_d1.setText("Day 1");
		t_d2.setText("Day 2");
		t_d3.setText("Day 3");
		t_d4.setText("Day 4");
		t_d5.setText("Day 5");
		t_d6.setText("Day 6");
		t_d7.setText("Day 7");
		t_un.setText("user");
		t_d.setText("Daily Reward");
		t_l_s.setText("Lucky Spinner");
		tp1.setText("Come back everyday to get more reward.");
		tp2.setText("One spin cost 20 coins.");
		t_c_d.setText("Clear All Data");
		t_m.setText("Mystery\nPakage");
		t_t.setText("© GreenTech Malawi");
	}
	
	
	public void _alp () {
		d1.setAlpha((float)(0));
		d2.setAlpha((float)(0));
		d3.setAlpha((float)(0));
		d4.setAlpha((float)(0));
		d5.setAlpha((float)(0));
		d6.setAlpha((float)(0));
		d7.setAlpha((float)(0));
		o1.setTarget(d1);
		o1.setPropertyName("alpha");
		o1.setFloatValues((float)(0), (float)(1));
		o1.setDuration((int)(500));
		o1.setInterpolator(new DecelerateInterpolator());
		o1.start();
		t7 = new TimerTask() {
				@Override
				public void run() {
						runOnUiThread(new Runnable() {
								@Override
								public void run() {
										o2.setTarget(d2);
										o2.setPropertyName("alpha");
										o2.setFloatValues((float)(0), (float)(1));
										o2.setDuration((int)(500));
										o2.setInterpolator(new DecelerateInterpolator());
										o2.start();
										t7 = new TimerTask() {
												@Override
												public void run() {
														runOnUiThread(new Runnable() {
																@Override
																public void run() {
																		o3.setTarget(d3);
																		o3.setPropertyName("alpha");
																		o3.setFloatValues((float)(0), (float)(1));
																		o3.setDuration((int)(500));
																		o3.setInterpolator(new DecelerateInterpolator());
																		o3.start();
																		t7 = new TimerTask() {
																				@Override
																				public void run() {
																						runOnUiThread(new Runnable() {
																								@Override
																								public void run() {
																										o4.setTarget(d4);
																										o4.setPropertyName("alpha");
																										o4.setFloatValues((float)(0), (float)(1));
																										o4.setDuration((int)(500));
																										o4.setInterpolator(new DecelerateInterpolator());
																										o4.start();
																										t7 = new TimerTask() {
																												@Override
																												public void run() {
																														runOnUiThread(new Runnable() {
																																@Override
																																public void run() {
																																		o5.setTarget(d5);
																																		o5.setPropertyName("alpha");
																																		o5.setFloatValues((float)(0), (float)(1));
																																		o5.setDuration((int)(500));
																																		o5.setInterpolator(new DecelerateInterpolator());
																																		o5.start();
																																		t7 = new TimerTask() {
																																				@Override
																																				public void run() {
																																						runOnUiThread(new Runnable() {
																																								@Override
																																								public void run() {
																																										o6.setTarget(d6);
																																										o6.setPropertyName("alpha");
																																										o6.setFloatValues((float)(0), (float)(1));
																																										o6.setDuration((int)(500));
																																										o6.setInterpolator(new DecelerateInterpolator());
																																										o6.start();
																																										t7 = new TimerTask() {
																																												@Override
																																												public void run() {
																																														runOnUiThread(new Runnable() {
																																																@Override
																																																public void run() {
																																																		o7.setTarget(d7);
																																																		o7.setPropertyName("alpha");
																																																		o7.setFloatValues((float)(0), (float)(1));
																																																		o7.setDuration((int)(500));
																																																		o7.setInterpolator(new DecelerateInterpolator());
																																																		o7.start();
																																																}
																																														});
																																												}
																																										};
																																										_timer.schedule(t7, (int)(100));
																																								}
																																						});
																																				}
																																		};
																																		_timer.schedule(t7, (int)(100));
																																}
																														});
																												}
																										};
																										_timer.schedule(t7, (int)(100));
																								}
																						});
																				}
																		};
																		_timer.schedule(t7, (int)(100));
																}
														});
												}
										};
										_timer.schedule(t7, (int)(100));
								}
						});
				}
		};
		_timer.schedule(t7, (int)(100));
	}
	
	
	public void _r_s (final double _top1, final double _top2, final double _bottom1, final double _bottom2, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
		Double tlr = _top1;
		Double trr = _top2;
		Double brr = _bottom1;
		Double blr = _bottom2;
		Double sw = _side_size;
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable();
		s.setShape(android.graphics.drawable.GradientDrawable.RECTANGLE);
		s.setCornerRadii(new float[] {tlr.floatValue(),tlr.floatValue(), trr.floatValue(),trr.floatValue(), blr.floatValue(),blr.floatValue(), brr.floatValue(),brr.floatValue()}); 
		
		s.setColor(Color.parseColor("#"+_inside_color));
		s.setStroke(sw.intValue(), Color.parseColor("#"+_side_color));
		_view.setBackground(s);
	}
	
	
	public void _sb (final View _view, final double _radius, final double _shadow, final String _color, final boolean _ripple) {
		if (_ripple) {
				android.graphics.drawable.GradientDrawable gd = new android.graphics.drawable.GradientDrawable();
				gd.setColor(Color.parseColor(_color));
				gd.setCornerRadius((int)_radius);
				_view.setElevation((int)_shadow);
				android.content.res.ColorStateList clrb = new android.content.res.ColorStateList(new int[][]{new int[]{}}, new int[]{Color.parseColor("#ffff7433")});
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
	
	
	public void _s_e (final View _scroll, final boolean _select) {
		_scroll.setVerticalScrollBarEnabled(_select);
		_scroll.setHorizontalScrollBarEnabled(_select);
	}
	
	
	public void _p_r () {
		
	}
	
	
	public void _l_s_algorithm (final double _n) {
		if (_n == 1) {
				l_s.setTarget(l_w);
				l_s.setPropertyName("rotation");
				l_s.setFloatValues((float)(0), (float)(405));
				l_s.setDuration((int)(l_s_duration));
				l_s.setInterpolator(new DecelerateInterpolator());
				l_s.start();
		}
		else {
				if (_n == 2) {
						l_s.setTarget(l_w);
						l_s.setPropertyName("rotation");
						l_s.setFloatValues((float)(0), (float)(450));
						l_s.setDuration((int)(l_s_duration));
						l_s.setInterpolator(new DecelerateInterpolator());
						l_s.start();
				}
				else {
						if (_n == 3) {
								l_s.setPropertyName("rotation");
								l_s.setFloatValues((float)(0), (float)(495));
								l_s.setDuration((int)(l_s_duration));
								l_s.setInterpolator(new DecelerateInterpolator());
								l_s.start();
						}
						else {
								if (_n == 4) {
										l_s.setTarget(l_w);
										l_s.setPropertyName("rotation");
										l_s.setFloatValues((float)(0), (float)(540));
										l_s.setDuration((int)(l_s_duration));
										l_s.setInterpolator(new DecelerateInterpolator());
										l_s.start();
								}
								else {
										if (_n == 5) {
												l_s.setTarget(l_w);
												l_s.setPropertyName("rotation");
												l_s.setFloatValues((float)(0), (float)(585));
												l_s.setDuration((int)(l_s_duration));
												l_s.setInterpolator(new DecelerateInterpolator());
												l_s.start();
										}
										else {
												if (_n == 6) {
														l_s.setTarget(l_w);
														l_s.setPropertyName("rotation");
														l_s.setFloatValues((float)(0), (float)(630));
														l_s.setDuration((int)(l_s_duration));
														l_s.setInterpolator(new DecelerateInterpolator());
														l_s.start();
												}
												else {
														if (_n == 7) {
																l_s.setTarget(l_w);
																l_s.setPropertyName("rotation");
																l_s.setFloatValues((float)(0), (float)(675));
																l_s.setDuration((int)(l_s_duration));
																l_s.setInterpolator(new DecelerateInterpolator());
																l_s.start();
														}
														else {
																if (_n == 8) {
																		l_s.setTarget(l_w);
																		l_s.setPropertyName("rotation");
																		l_s.setFloatValues((float)(0), (float)(720));
																		l_s.setDuration((int)(l_s_duration));
																		l_s.setInterpolator(new DecelerateInterpolator());
																		l_s.start();
																}
														}
												}
										}
								}
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