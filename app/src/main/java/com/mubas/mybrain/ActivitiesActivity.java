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
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import android.widget.Button;
import java.util.Timer;
import java.util.TimerTask;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ActivitiesActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private Toolbar _toolbar;
	private AppBarLayout _app_bar;
	private CoordinatorLayout _coordinator;
	private double current_page = 0;
	private double s = 0;
	private double m = 0;
	private double h = 0;
	private double milli = 0;
	private String FONT = "";
	
	private LinearLayout linear_parent;
	private LinearLayout base;
	private LinearLayout trash;
	private LinearLayout linear_page_box;
	private LinearLayout linear1;
	private LinearLayout layout1;
	private LinearLayout layout2;
	private LinearLayout layout3;
	private LinearLayout layout4;
	private LinearLayout layout5;
	private TextView textview1;
	private TextView esr;
	private LinearLayout linear16;
	private ScrollView vscroll3;
	private LinearLayout linear24;
	private LinearLayout linear20;
	private LinearLayout linear25;
	private LinearLayout linear26;
	private LinearLayout linear27;
	private LinearLayout linear28;
	private LinearLayout linear29;
	private LinearLayout linear30;
	private TextView opwd;
	private ImageView imageview6;
	private TextView run;
	private ImageView imageview7;
	private TextView walk;
	private ImageView imageview8;
	private TextView textview36;
	private ImageView imageview9;
	private TextView textview37;
	private ImageView imageview10;
	private TextView textview38;
	private TextView textview39;
	private TextView textview4;
	private CardView cardview1;
	private ScrollView vscroll2;
	private LinearLayout linear2;
	private ImageView imageview1;
	private LinearLayout linear3;
	private LinearLayout linear4;
	private LinearLayout linear7;
	private TextView hour;
	private TextView textview6;
	private TextView textview2;
	private TextView minute;
	private TextView textview7;
	private TextView textview5;
	private TextView second;
	private TextView textview8;
	private TextView textview9;
	private TextView millii;
	private TextView textview11;
	private Button start;
	private Button reset;
	private LinearLayout linear13;
	private TextView textview28;
	private TextView textview3;
	private CardView cardview2;
	private ScrollView vscroll1;
	private LinearLayout linear8;
	private ImageView imageview2;
	private LinearLayout linear9;
	private LinearLayout linear10;
	private LinearLayout linear11;
	private TextView hr;
	private TextView textview14;
	private TextView textview15;
	private TextView min;
	private TextView textview17;
	private TextView textview18;
	private TextView sec;
	private TextView textview20;
	private TextView textview21;
	private TextView mill;
	private TextView textview23;
	private Button button1;
	private Button button2;
	private LinearLayout linear12;
	private TextView textview27;
	private TextView textview40;
	private CardView cardview3;
	private ScrollView vscroll4;
	private LinearLayout linear32;
	private ImageView imageview12;
	private LinearLayout linear33;
	private LinearLayout linear34;
	private LinearLayout linear35;
	private TextView hrs;
	private TextView textview42;
	private TextView textview43;
	private TextView mins;
	private TextView textview45;
	private TextView textview46;
	private TextView secs;
	private TextView textview48;
	private TextView textview49;
	private TextView ml;
	private TextView textview51;
	private Button button3;
	private Button button4;
	private LinearLayout linear36;
	private TextView textview52;
	private TextView textview53;
	private CardView cardview4;
	private ScrollView vscroll5;
	private LinearLayout linear38;
	private ImageView imageview13;
	private LinearLayout linear39;
	private LinearLayout linear40;
	private LinearLayout linear41;
	private TextView hors;
	private TextView textview55;
	private TextView textview56;
	private TextView mi;
	private TextView textview58;
	private TextView textview59;
	private TextView se;
	private TextView textview61;
	private TextView textview62;
	private TextView ms;
	private TextView textview64;
	private Button button5;
	private Button button6;
	private LinearLayout linear42;
	private TextView textview65;
	private TextView txt_skip;
	private LinearLayout linear_dots_box;
	private TextView txt_next;
	private ImageView dot1;
	private ImageView dot2;
	private ImageView dot3;
	
	private TimerTask t;
	private TimerTask t1;
	private TimerTask t2;
	private TimerTask t3;
	private TimerTask t4;
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.activities);
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
		layout4 = (LinearLayout) findViewById(R.id.layout4);
		layout5 = (LinearLayout) findViewById(R.id.layout5);
		textview1 = (TextView) findViewById(R.id.textview1);
		esr = (TextView) findViewById(R.id.esr);
		linear16 = (LinearLayout) findViewById(R.id.linear16);
		vscroll3 = (ScrollView) findViewById(R.id.vscroll3);
		linear24 = (LinearLayout) findViewById(R.id.linear24);
		linear20 = (LinearLayout) findViewById(R.id.linear20);
		linear25 = (LinearLayout) findViewById(R.id.linear25);
		linear26 = (LinearLayout) findViewById(R.id.linear26);
		linear27 = (LinearLayout) findViewById(R.id.linear27);
		linear28 = (LinearLayout) findViewById(R.id.linear28);
		linear29 = (LinearLayout) findViewById(R.id.linear29);
		linear30 = (LinearLayout) findViewById(R.id.linear30);
		opwd = (TextView) findViewById(R.id.opwd);
		imageview6 = (ImageView) findViewById(R.id.imageview6);
		run = (TextView) findViewById(R.id.run);
		imageview7 = (ImageView) findViewById(R.id.imageview7);
		walk = (TextView) findViewById(R.id.walk);
		imageview8 = (ImageView) findViewById(R.id.imageview8);
		textview36 = (TextView) findViewById(R.id.textview36);
		imageview9 = (ImageView) findViewById(R.id.imageview9);
		textview37 = (TextView) findViewById(R.id.textview37);
		imageview10 = (ImageView) findViewById(R.id.imageview10);
		textview38 = (TextView) findViewById(R.id.textview38);
		textview39 = (TextView) findViewById(R.id.textview39);
		textview4 = (TextView) findViewById(R.id.textview4);
		cardview1 = (CardView) findViewById(R.id.cardview1);
		vscroll2 = (ScrollView) findViewById(R.id.vscroll2);
		linear2 = (LinearLayout) findViewById(R.id.linear2);
		imageview1 = (ImageView) findViewById(R.id.imageview1);
		linear3 = (LinearLayout) findViewById(R.id.linear3);
		linear4 = (LinearLayout) findViewById(R.id.linear4);
		linear7 = (LinearLayout) findViewById(R.id.linear7);
		hour = (TextView) findViewById(R.id.hour);
		textview6 = (TextView) findViewById(R.id.textview6);
		textview2 = (TextView) findViewById(R.id.textview2);
		minute = (TextView) findViewById(R.id.minute);
		textview7 = (TextView) findViewById(R.id.textview7);
		textview5 = (TextView) findViewById(R.id.textview5);
		second = (TextView) findViewById(R.id.second);
		textview8 = (TextView) findViewById(R.id.textview8);
		textview9 = (TextView) findViewById(R.id.textview9);
		millii = (TextView) findViewById(R.id.millii);
		textview11 = (TextView) findViewById(R.id.textview11);
		start = (Button) findViewById(R.id.start);
		reset = (Button) findViewById(R.id.reset);
		linear13 = (LinearLayout) findViewById(R.id.linear13);
		textview28 = (TextView) findViewById(R.id.textview28);
		textview3 = (TextView) findViewById(R.id.textview3);
		cardview2 = (CardView) findViewById(R.id.cardview2);
		vscroll1 = (ScrollView) findViewById(R.id.vscroll1);
		linear8 = (LinearLayout) findViewById(R.id.linear8);
		imageview2 = (ImageView) findViewById(R.id.imageview2);
		linear9 = (LinearLayout) findViewById(R.id.linear9);
		linear10 = (LinearLayout) findViewById(R.id.linear10);
		linear11 = (LinearLayout) findViewById(R.id.linear11);
		hr = (TextView) findViewById(R.id.hr);
		textview14 = (TextView) findViewById(R.id.textview14);
		textview15 = (TextView) findViewById(R.id.textview15);
		min = (TextView) findViewById(R.id.min);
		textview17 = (TextView) findViewById(R.id.textview17);
		textview18 = (TextView) findViewById(R.id.textview18);
		sec = (TextView) findViewById(R.id.sec);
		textview20 = (TextView) findViewById(R.id.textview20);
		textview21 = (TextView) findViewById(R.id.textview21);
		mill = (TextView) findViewById(R.id.mill);
		textview23 = (TextView) findViewById(R.id.textview23);
		button1 = (Button) findViewById(R.id.button1);
		button2 = (Button) findViewById(R.id.button2);
		linear12 = (LinearLayout) findViewById(R.id.linear12);
		textview27 = (TextView) findViewById(R.id.textview27);
		textview40 = (TextView) findViewById(R.id.textview40);
		cardview3 = (CardView) findViewById(R.id.cardview3);
		vscroll4 = (ScrollView) findViewById(R.id.vscroll4);
		linear32 = (LinearLayout) findViewById(R.id.linear32);
		imageview12 = (ImageView) findViewById(R.id.imageview12);
		linear33 = (LinearLayout) findViewById(R.id.linear33);
		linear34 = (LinearLayout) findViewById(R.id.linear34);
		linear35 = (LinearLayout) findViewById(R.id.linear35);
		hrs = (TextView) findViewById(R.id.hrs);
		textview42 = (TextView) findViewById(R.id.textview42);
		textview43 = (TextView) findViewById(R.id.textview43);
		mins = (TextView) findViewById(R.id.mins);
		textview45 = (TextView) findViewById(R.id.textview45);
		textview46 = (TextView) findViewById(R.id.textview46);
		secs = (TextView) findViewById(R.id.secs);
		textview48 = (TextView) findViewById(R.id.textview48);
		textview49 = (TextView) findViewById(R.id.textview49);
		ml = (TextView) findViewById(R.id.ml);
		textview51 = (TextView) findViewById(R.id.textview51);
		button3 = (Button) findViewById(R.id.button3);
		button4 = (Button) findViewById(R.id.button4);
		linear36 = (LinearLayout) findViewById(R.id.linear36);
		textview52 = (TextView) findViewById(R.id.textview52);
		textview53 = (TextView) findViewById(R.id.textview53);
		cardview4 = (CardView) findViewById(R.id.cardview4);
		vscroll5 = (ScrollView) findViewById(R.id.vscroll5);
		linear38 = (LinearLayout) findViewById(R.id.linear38);
		imageview13 = (ImageView) findViewById(R.id.imageview13);
		linear39 = (LinearLayout) findViewById(R.id.linear39);
		linear40 = (LinearLayout) findViewById(R.id.linear40);
		linear41 = (LinearLayout) findViewById(R.id.linear41);
		hors = (TextView) findViewById(R.id.hors);
		textview55 = (TextView) findViewById(R.id.textview55);
		textview56 = (TextView) findViewById(R.id.textview56);
		mi = (TextView) findViewById(R.id.mi);
		textview58 = (TextView) findViewById(R.id.textview58);
		textview59 = (TextView) findViewById(R.id.textview59);
		se = (TextView) findViewById(R.id.se);
		textview61 = (TextView) findViewById(R.id.textview61);
		textview62 = (TextView) findViewById(R.id.textview62);
		ms = (TextView) findViewById(R.id.ms);
		textview64 = (TextView) findViewById(R.id.textview64);
		button5 = (Button) findViewById(R.id.button5);
		button6 = (Button) findViewById(R.id.button6);
		linear42 = (LinearLayout) findViewById(R.id.linear42);
		textview65 = (TextView) findViewById(R.id.textview65);
		txt_skip = (TextView) findViewById(R.id.txt_skip);
		linear_dots_box = (LinearLayout) findViewById(R.id.linear_dots_box);
		txt_next = (TextView) findViewById(R.id.txt_next);
		dot1 = (ImageView) findViewById(R.id.dot1);
		dot2 = (ImageView) findViewById(R.id.dot2);
		dot3 = (ImageView) findViewById(R.id.dot3);
		
		linear25.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
		
		linear26.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
		
		linear27.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
		
		linear28.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
		
		linear29.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				if (txt_next.getText().toString().equals("NEXT")) {
					viewPager.setCurrentItem((int)current_page+1);
				}
			}
		});
		
		start.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (99 < Double.parseDouble(millii.getText().toString())) {
									millii.setText("00");
									milli = 0;
								}
								else {
									milli = milli + 1;
									millii.setText(String.valueOf((long)(milli)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t, (int)(1), (int)(1));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (!(Double.parseDouble(second.getText().toString()) == 60)) {
									s = s + 1;
									second.setText(String.valueOf((long)(s)));
								}
								if (Double.parseDouble(second.getText().toString()) == 60) {
									second.setText("00");
									s = 00;
									m = m + 1;
									minute.setText(String.valueOf((long)(m)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t, (int)(1000), (int)(1000));
				t = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (Double.parseDouble(minute.getText().toString()) == 60) {
									h = h + 1;
									hour.setText(String.valueOf((long)(h)));
									m = 00;
									minute.setText("00");
								}
								else {
									
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t, (int)(1), (int)(1));
			}
		});
		
		reset.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t.cancel();
				millii.setText("00");
				second.setText("00");
				minute.setText("00");
				hour.setText("00");
				m = 00;
				s = 00;
				h = 00;
				milli = 00;
			}
		});
		
		button1.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t1 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (99 < Double.parseDouble(mill.getText().toString())) {
									mill.setText("00");
									milli = 0;
								}
								else {
									milli = milli + 1;
									mill.setText(String.valueOf((long)(milli)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t1, (int)(1), (int)(1));
				t1 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (!(Double.parseDouble(sec.getText().toString()) == 60)) {
									s = s + 1;
									sec.setText(String.valueOf((long)(s)));
								}
								if (Double.parseDouble(sec.getText().toString()) == 60) {
									sec.setText("00");
									s = 00;
									m = m + 1;
									min.setText(String.valueOf((long)(m)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t1, (int)(1000), (int)(1000));
				t1 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (Double.parseDouble(min.getText().toString()) == 60) {
									h = h + 1;
									hr.setText(String.valueOf((long)(h)));
									m = 00;
									min.setText("00");
								}
								else {
									
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t1, (int)(1), (int)(1));
			}
		});
		
		button2.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t1.cancel();
				min.setText("00");
				sec.setText("00");
				min.setText("00");
				hr.setText("00");
				m = 00;
				s = 00;
				h = 00;
				milli = 00;
			}
		});
		
		button3.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t2 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (99 < Double.parseDouble(ml.getText().toString())) {
									ml.setText("00");
									milli = 0;
								}
								else {
									milli = milli + 1;
									ml.setText(String.valueOf((long)(milli)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t2, (int)(1), (int)(1));
				t2 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (!(Double.parseDouble(secs.getText().toString()) == 60)) {
									s = s + 1;
									secs.setText(String.valueOf((long)(s)));
								}
								if (Double.parseDouble(secs.getText().toString()) == 60) {
									secs.setText("00");
									s = 00;
									m = m + 1;
									mins.setText(String.valueOf((long)(m)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t2, (int)(1000), (int)(1000));
				t2 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (Double.parseDouble(mins.getText().toString()) == 60) {
									h = h + 1;
									hrs.setText(String.valueOf((long)(h)));
									m = 00;
									mins.setText("00");
								}
								else {
									
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t2, (int)(1), (int)(1));
			}
		});
		
		button4.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t2.cancel();
				ml.setText("00");
				secs.setText("00");
				mins.setText("00");
				hrs.setText("00");
				m = 00;
				s = 00;
				h = 00;
				milli = 00;
			}
		});
		
		button5.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t3 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (99 < Double.parseDouble(ms.getText().toString())) {
									ms.setText("00");
									milli = 0;
								}
								else {
									milli = milli + 1;
									ms.setText(String.valueOf((long)(milli)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t3, (int)(1), (int)(1));
				t3 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (!(Double.parseDouble(se.getText().toString()) == 60)) {
									s = s + 1;
									se.setText(String.valueOf((long)(s)));
								}
								if (Double.parseDouble(se.getText().toString()) == 60) {
									se.setText("00");
									s = 00;
									m = m + 1;
									mi.setText(String.valueOf((long)(m)));
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t3, (int)(1000), (int)(1000));
				t3 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								if (Double.parseDouble(mi.getText().toString()) == 60) {
									h = h + 1;
									hors.setText(String.valueOf((long)(h)));
									m = 00;
									mi.setText("00");
								}
								else {
									
								}
							}
						});
					}
				};
				_timer.scheduleAtFixedRate(t3, (int)(1), (int)(1));
			}
		});
		
		button6.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				t.cancel();
				millii.setText("00");
				second.setText("00");
				minute.setText("00");
				hour.setText("00");
				m = 00;
				s = 00;
				h = 00;
				milli = 00;
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
		setTitle("Physical Exercise ");
		textview1.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 1);
		esr.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/lexiereadable_bold.ttf"), 0);
		opwd.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		run.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		walk.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		textview36.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		textview37.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		textview1.setTextColor(0xFF000000);
		linear20.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
		linear25.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
		linear26.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
		linear27.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
		linear28.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
		linear29.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
		linear30.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)10, (int)2, 0xFF757575, 0xFF8C9EFF));
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
				if (current_page == 4) {
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
			return 5;
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
			else if (position == 3) {
				ViewGroup parent = (ViewGroup) layout4.getParent();
				if (parent != null) {
					parent.removeView(layout4);
				}
				container.addView(layout4);
			}
			else if (position == 4) {
				ViewGroup parent = (ViewGroup) layout5.getParent();
				if (parent != null) {
					parent.removeView(layout5);
				}
				container.addView(layout5);
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
	public void onStart() {
		super.onStart();
		s = Double.parseDouble(second.getText().toString());
		m = Double.parseDouble(minute.getText().toString());
		h = Double.parseDouble(hour.getText().toString());
		milli = Double.parseDouble(millii.getText().toString());
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
					if (_n == 3) {
						dot3.setImageResource(R.drawable.circle_filled);
					}
					else {
						if (_n == 4) {
							dot3.setImageResource(R.drawable.circle_filled);
						}
						else {
							
						}
					}
				}
			}
		}
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