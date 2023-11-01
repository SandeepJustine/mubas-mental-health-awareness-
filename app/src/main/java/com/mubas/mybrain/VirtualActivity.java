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
import android.widget.TextView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.speech.tts.TextToSpeech;
import android.speech.SpeechRecognizer;
import android.speech.RecognizerIntent;
import android.speech.RecognitionListener;
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.animation.Animator;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;
import androidx.core.content.ContextCompat;
import androidx.core.app.ActivityCompat;
import android.Manifest;
import android.content.pm.PackageManager;


public class VirtualActivity extends  AppCompatActivity  { 
	
	private Timer _timer = new Timer();
	
	private double returnNumber = 0;
	private double m_ = 0;
	
	private ArrayList<HashMap<String, Object>> l_ = new ArrayList<>();
	
	private LinearLayout parent;
	private LinearLayout h;
	private LinearLayout m_b;
	private LinearLayout q;
	private LinearLayout h_c;
	private TextView h_t;
	private LinearLayout cc;
	private LinearLayout d_;
	private TextView c_c;
	private LinearLayout l_m;
	private ImageView d_a;
	private TextView d_n;
	private ImageView d_fb;
	private ImageView d_i;
	private ImageView d_l1;
	private LinearLayout p;
	private LinearLayout m_c;
	private LinearLayout m_w;
	private TextView s_;
	private TextView qe;
	private LinearLayout m_b1;
	private LinearLayout e1;
	private LinearLayout m_b2;
	private LinearLayout e2;
	private LinearLayout m_b3;
	private LinearLayout o;
	private ListView l;
	private ImageView ic_arrow;
	
	private TextToSpeech tts;
	private SpeechRecognizer stt;
	private ObjectAnimator oa1 = new ObjectAnimator();
	private ObjectAnimator oa2 = new ObjectAnimator();
	private ObjectAnimator oa3 = new ObjectAnimator();
	private ObjectAnimator oa4 = new ObjectAnimator();
	private ObjectAnimator oa5 = new ObjectAnimator();
	private ObjectAnimator oa6 = new ObjectAnimator();
	private ObjectAnimator oa7 = new ObjectAnimator();
	private ObjectAnimator oa8 = new ObjectAnimator();
	private ObjectAnimator oa9 = new ObjectAnimator();
	private ObjectAnimator oa10 = new ObjectAnimator();
	private ObjectAnimator oa11 = new ObjectAnimator();
	private ObjectAnimator oa12 = new ObjectAnimator();
	private ObjectAnimator oa13 = new ObjectAnimator();
	private ObjectAnimator oa14 = new ObjectAnimator();
	private ObjectAnimator oa15 = new ObjectAnimator();
	private ObjectAnimator oa16 = new ObjectAnimator();
	private TimerTask t1;
	private TimerTask t2;
	private TimerTask t3;
	private TimerTask t4;
	private TimerTask t5;
	private TimerTask t6;
	private TimerTask t7;
	private TimerTask t8;
	private Calendar c1 = Calendar.getInstance();
	private Intent i1 = new Intent();
	private Intent i2 = new Intent();
	private Intent i3 = new Intent();
	private Intent i4 = new Intent();
	private Intent i5 = new Intent();
	private Intent i6 = new Intent();
	private Intent i7 = new Intent();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.virtual);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		if (ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_DENIED) {
			ActivityCompat.requestPermissions(this, new String[] {Manifest.permission.RECORD_AUDIO}, 1000);
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
		
		parent = (LinearLayout) findViewById(R.id.parent);
		h = (LinearLayout) findViewById(R.id.h);
		m_b = (LinearLayout) findViewById(R.id.m_b);
		q = (LinearLayout) findViewById(R.id.q);
		h_c = (LinearLayout) findViewById(R.id.h_c);
		h_t = (TextView) findViewById(R.id.h_t);
		cc = (LinearLayout) findViewById(R.id.cc);
		d_ = (LinearLayout) findViewById(R.id.d_);
		c_c = (TextView) findViewById(R.id.c_c);
		l_m = (LinearLayout) findViewById(R.id.l_m);
		d_a = (ImageView) findViewById(R.id.d_a);
		d_n = (TextView) findViewById(R.id.d_n);
		d_fb = (ImageView) findViewById(R.id.d_fb);
		d_i = (ImageView) findViewById(R.id.d_i);
		d_l1 = (ImageView) findViewById(R.id.d_l1);
		p = (LinearLayout) findViewById(R.id.p);
		m_c = (LinearLayout) findViewById(R.id.m_c);
		m_w = (LinearLayout) findViewById(R.id.m_w);
		s_ = (TextView) findViewById(R.id.s_);
		qe = (TextView) findViewById(R.id.qe);
		m_b1 = (LinearLayout) findViewById(R.id.m_b1);
		e1 = (LinearLayout) findViewById(R.id.e1);
		m_b2 = (LinearLayout) findViewById(R.id.m_b2);
		e2 = (LinearLayout) findViewById(R.id.e2);
		m_b3 = (LinearLayout) findViewById(R.id.m_b3);
		o = (LinearLayout) findViewById(R.id.o);
		l = (ListView) findViewById(R.id.l);
		ic_arrow = (ImageView) findViewById(R.id.ic_arrow);
		tts = new TextToSpeech(getApplicationContext(), null);
		stt = SpeechRecognizer.createSpeechRecognizer(this);
		
		p.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				Intent _intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
				_intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getPackageName());
				_intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
				_intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
				stt.startListening(_intent);
				s_.setTextColor(0xFF65FB89);
				m_c.setBackgroundResource(0);
				_r(e1, 100, "65FB89");
				_r(e2, 100, "65FB89");
				_b();
			}
		});
		
		m_c.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		ic_arrow.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				
			}
		});
		
		stt.setRecognitionListener(new RecognitionListener() {
			@Override
			public void onReadyForSpeech(Bundle _param1) {
			}
			@Override
			public void onBeginningOfSpeech() {
			}
			@Override
			public void onRmsChanged(float _param1) {
			}
			@Override
			public void onBufferReceived(byte[] _param1) {
			}
			@Override
			public void onEndOfSpeech() {
			}
			@Override
			public void onPartialResults(Bundle _param1) {
			}
			@Override
			public void onEvent(int _param1, Bundle _param2) {
			}
			@Override
			public void onResults(Bundle _param1) {
				final ArrayList<String> _results = _param1.getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);
				final String _result = _results.get(0);
				tts.setPitch((float)1.8d);
				tts.setSpeechRate((float)0.5d);
				_s1(_result);
				qe.setText(_result);
				m_c.setBackgroundResource(R.drawable.character_color_filled_120x120);
				_b();
			}
			
			@Override
			public void onError(int _param1) {
				final String _errorMessage;
				switch (_param1) {
					case SpeechRecognizer.ERROR_AUDIO:
					_errorMessage = "audio error";
					break;
					case SpeechRecognizer.ERROR_SPEECH_TIMEOUT:
					_errorMessage = "speech timeout";
					break;
					case SpeechRecognizer.ERROR_NO_MATCH:
					_errorMessage = "speech no match";
					break;
					case SpeechRecognizer.ERROR_RECOGNIZER_BUSY:
					_errorMessage = "recognizer busy";
					break;
					case SpeechRecognizer.ERROR_INSUFFICIENT_PERMISSIONS:
					_errorMessage = "recognizer insufficient permissions";
					break;
					default:
					_errorMessage = "recognizer other error";
					break;
				}
				
			}
		});
		
		oa1.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				t1 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								oa1.setTarget(e1);
								oa1.setPropertyName("scaleY");
								oa1.setFloatValues((float)(0), (float)(1));
								oa1.setDuration((int)(250));
								oa1.setRepeatMode(ValueAnimator.REVERSE);
								oa1.setRepeatCount((int)(0));
								oa1.setInterpolator(new AccelerateInterpolator());
								oa1.start();
							}
						});
					}
				};
				_timer.schedule(t1, (int)(2000));
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oa2.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				t1 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								oa2.setTarget(e2);
								oa2.setPropertyName("scaleY");
								oa2.setFloatValues((float)(0), (float)(1));
								oa2.setDuration((int)(250));
								oa2.setRepeatMode(ValueAnimator.REVERSE);
								oa2.setRepeatCount((int)(0));
								oa2.setInterpolator(new AccelerateInterpolator());
								oa2.start();
							}
						});
					}
				};
				_timer.schedule(t1, (int)(2000));
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oa9.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				oa10.setTarget(m_c);
				oa10.setPropertyName("translationY");
				oa10.setFloatValues((float)(-15), (float)(0));
				oa10.setDuration((int)(800));
				oa10.setRepeatMode(ValueAnimator.REVERSE);
				oa10.setRepeatCount((int)(0));
				oa10.setInterpolator(new AccelerateInterpolator());
				oa10.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oa10.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				t5 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								oa9.setTarget(m_c);
								oa9.setPropertyName("translationY");
								oa9.setFloatValues((float)(0), (float)(-15));
								oa9.setDuration((int)(800));
								oa9.setRepeatMode(ValueAnimator.REVERSE);
								oa9.setRepeatCount((int)(0));
								oa9.setInterpolator(new AccelerateInterpolator());
								oa9.start();
							}
						});
					}
				};
				_timer.schedule(t5, (int)(800));
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oa11.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				oa12.setTarget(m_c);
				oa12.setPropertyName("scaleY");
				oa12.setFloatValues((float)(1.1d), (float)(1));
				oa12.setDuration((int)(1000));
				oa12.setRepeatMode(ValueAnimator.REVERSE);
				oa12.setRepeatCount((int)(0));
				oa12.setInterpolator(new AccelerateInterpolator());
				oa12.start();
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oa12.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				t6 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								oa11.setTarget(m_c);
								oa11.setPropertyName("scaleY");
								oa11.setFloatValues((float)(1), (float)(1.1d));
								oa11.setDuration((int)(1000));
								oa11.setRepeatMode(ValueAnimator.REVERSE);
								oa11.setRepeatCount((int)(0));
								oa11.setInterpolator(new AccelerateInterpolator());
								oa11.start();
							}
						});
					}
				};
				_timer.schedule(t6, (int)(1000));
			}
			
			@Override
			public void onAnimationCancel(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationRepeat(Animator _param1) {
				
			}
		});
		
		oa13.addListener(new Animator.AnimatorListener() {
			@Override
			public void onAnimationStart(Animator _param1) {
				
			}
			
			@Override
			public void onAnimationEnd(Animator _param1) {
				t6 = new TimerTask() {
					@Override
					public void run() {
						runOnUiThread(new Runnable() {
							@Override
							public void run() {
								oa11.setTarget(m_c);
								oa11.setPropertyName("scaleY");
								oa11.setFloatValues((float)(1), (float)(1.1d));
								oa11.setDuration((int)(1000));
								oa11.setRepeatMode(ValueAnimator.REVERSE);
								oa11.setRepeatCount((int)(0));
								oa11.setInterpolator(new AccelerateInterpolator());
								oa11.start();
							}
						});
					}
				};
				_timer.schedule(t6, (int)(1000));
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
		_e();
		_m();
		_t();
		_a();
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
	public void onDestroy() {
		super.onDestroy();
		stt.cancel();
		stt.destroy();
		tts.shutdown();
		tts.stop();
		stt.stopListening();
	}
	public void _e () {
		oa1.setTarget(e1);
		oa1.setPropertyName("scaleY");
		oa1.setFloatValues((float)(1), (float)(0));
		oa1.setDuration((int)(100));
		oa1.setRepeatMode(ValueAnimator.REVERSE);
		oa1.setRepeatCount((int)(0));
		oa1.setInterpolator(new AccelerateInterpolator());
		oa1.start();
		oa2.setTarget(e2);
		oa2.setPropertyName("scaleY");
		oa2.setFloatValues((float)(1), (float)(0));
		oa2.setDuration((int)(100));
		oa2.setRepeatMode(ValueAnimator.REVERSE);
		oa2.setRepeatCount((int)(0));
		oa2.setInterpolator(new AccelerateInterpolator());
		oa2.start();
	}
	
	
	public void _b () {
		if (!oa3.isRunning()) {
			oa3.setTarget(m_w);
			oa3.setPropertyName("scaleX");
			oa3.setFloatValues((float)(3), (float)(7));
			oa3.setDuration((int)(500));
			oa3.setRepeatMode(ValueAnimator.REVERSE);
			oa3.setRepeatCount((int)(0));
			oa3.setInterpolator(new AccelerateInterpolator());
			oa3.start();
			oa4.setTarget(m_w);
			oa4.setPropertyName("scaleY");
			oa4.setFloatValues((float)(1), (float)(1.5d));
			oa4.setDuration((int)(500));
			oa4.setRepeatMode(ValueAnimator.REVERSE);
			oa4.setRepeatCount((int)(0));
			oa4.setInterpolator(new AccelerateInterpolator());
			oa4.start();
			oa5.setTarget(m_w);
			oa5.setPropertyName("alpha");
			oa5.setFloatValues((float)(0.5d), (float)(0));
			oa5.setDuration((int)(500));
			oa5.setRepeatMode(ValueAnimator.REVERSE);
			oa5.setRepeatCount((int)(0));
			oa5.setInterpolator(new AccelerateInterpolator());
			oa5.start();
		}
	}
	
	
	public void _r (final View _view, final double _value, final String _color) {
		android.graphics.drawable.GradientDrawable round_corner = new android.graphics.drawable.GradientDrawable();
		round_corner.setColor(Color.parseColor("#"+_color));
		round_corner.setCornerRadius(new Float(_value));
		_view.setBackground(round_corner);
	}
	
	
	public void _s () {
		t2 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						if (tts.isSpeaking()) {
							s_.setText("SPEAKING");
							s_.setTextColor(0xFFEEEEEE);
						}
						else {
							s_.setText("TAP TO ACTIVE ME");
							s_.setTextColor(0xFFEEEEEE);
						}
					}
				});
			}
		};
		_timer.scheduleAtFixedRate(t2, (int)(0), (int)(1000));
	}
	
	
	public void _i () {
		oa6.setTarget(m_c);
		oa6.setPropertyName("scaleX");
		oa6.setFloatValues((float)(0), (float)(1));
		oa6.setDuration((int)(500));
		oa6.setRepeatMode(ValueAnimator.REVERSE);
		oa6.setRepeatCount((int)(0));
		oa6.setInterpolator(new AccelerateInterpolator());
		oa6.start();
		oa7.setTarget(m_c);
		oa7.setPropertyName("scaleY");
		oa7.setFloatValues((float)(0), (float)(1));
		oa7.setDuration((int)(500));
		oa7.setRepeatMode(ValueAnimator.REVERSE);
		oa7.setRepeatCount((int)(0));
		oa7.setInterpolator(new AccelerateInterpolator());
		oa7.start();
		oa8.setTarget(m_c);
		oa8.setPropertyName("rotation");
		oa8.setFloatValues((float)(90), (float)(0));
		oa8.setDuration((int)(500));
		oa8.setRepeatMode(ValueAnimator.REVERSE);
		oa8.setRepeatCount((int)(0));
		oa8.setInterpolator(new AccelerateInterpolator());
		oa8.start();
	}
	
	
	public void _d () {
		oa9.setTarget(m_c);
		oa9.setPropertyName("translationY");
		oa9.setFloatValues((float)(0), (float)(-15));
		oa9.setDuration((int)(500));
		oa9.setRepeatMode(ValueAnimator.REVERSE);
		oa9.setRepeatCount((int)(0));
		oa9.setInterpolator(new AccelerateInterpolator());
		oa9.start();
		oa11.setTarget(m_c);
		oa11.setPropertyName("scaleY");
		oa11.setFloatValues((float)(1), (float)(1.1d));
		oa11.setDuration((int)(1000));
		oa11.setRepeatMode(ValueAnimator.REVERSE);
		oa11.setRepeatCount((int)(0));
		oa11.setInterpolator(new AccelerateInterpolator());
		oa11.start();
	}
	
	
	public void _m () {
		
		oa13.setPropertyName("rotation");
		oa13.setFloatValues((float)(0), (float)(360));
		oa13.setDuration((int)(20000));
		oa13.setRepeatMode(ValueAnimator.RESTART);
		oa13.setRepeatCount((int)(999));
		oa13.setInterpolator(new LinearInterpolator());
		oa13.start();
	}
	
	
	public void _g (final View _view) {
		returnNumber = 0;
		returnNumber = _view.getMeasuredHeight();
	}
	
	
	public void _d_g (final View _view, final boolean _isHeight, final double _nextValue, final double _ms) {
		if (_isHeight) {
			ValueAnimator anim = ValueAnimator.ofInt((int) _view.getMeasuredHeight(), (int) _nextValue); anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				@Override public void onAnimationUpdate(
				ValueAnimator valueAnimator) {
					int val = (int) valueAnimator.getAnimatedValue(); ViewGroup.LayoutParams layoutParams = _view.getLayoutParams(); 
					layoutParams.height = val; 
					_view.setLayoutParams(layoutParams);
				}}); 
			anim.setDuration((int) _ms);
			anim.setInterpolator(new DecelerateInterpolator());
			anim.start(); 
		}
		else {
			ValueAnimator anim = ValueAnimator.ofInt((int) _view.getMeasuredWidth(), (int) _nextValue); anim.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
				@Override public void onAnimationUpdate(
				ValueAnimator valueAnimator) {
					int val = (int) valueAnimator.getAnimatedValue(); ViewGroup.LayoutParams layoutParams = _view.getLayoutParams(); 
					layoutParams.width = val; 
					_view.setLayoutParams(layoutParams);
				}}); 
			anim.setDuration((int) _ms);
			anim.setInterpolator(new DecelerateInterpolator());
			anim.start(); 
		}
	}
	
	
	public void _n (final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _n1 (final String _color1, final String _color2) {
		if (Build.VERSION.SDK_INT > Build.VERSION_CODES.LOLLIPOP) {
			Window w = this.getWindow();	w.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);	w.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
			w.setStatusBarColor(Color.parseColor("#" + _color1.replace("#", "")));	w.setNavigationBarColor(Color.parseColor("#" + _color2.replace("#", "")));
		}
	}
	
	
	public void _t () {
		/* 
this is "t" block mean "theme" this is only used to put in "onCreate" event, i created "t" block to and put the "t" block on onCreate event for clean UI
*/
		/* 
this is "t" block mean "theme" this is only used to put in "onCreate" event, i created "t" block to and put the "t" block on onCreate event for clean UI
*/
		/* 
this is "t" block mean "theme" this is only used to put in "onCreate" event, i created "t" block to and put the "t" block on onCreate event for clean UI
*/
		_g(cc);
		_d_g(cc, true, 0, 1000);
		/* 
this is used to disable scroll effect of listview
*/l.setVerticalScrollBarEnabled(false);
		l.setHorizontalScrollBarEnabled(false);
		ic_arrow.setColorFilter(0xFF001731, PorterDuff.Mode.MULTIPLY);
		_j(100, 100, 100, 100, "00000000", "32ffffff", 5, d_);
		_j(100, 100, 100, 100, "00000000", "32ffffff", 5, l_m);
		_y(parent, q, m_b, o);
		_w(l_, "q", true, false);
		_n("ff001731", "ff001731");
		_r(e1, 100, "ffffff");
		_r(e2, 100, "ffffff");
		_r(o, 100, "80ffffff");
		_r(m_w, 100, "65FB89");
		_r(q, 100, "80001731");
		h_t.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		s_.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		d_n.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		c_c.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
		m_c.setScaleX((float)(0));
		m_c.setScaleY((float)(0));
		t3 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_b();
						_d();
						_s();
					}
				});
			}
		};
		_timer.schedule(t3, (int)(2000));
		t4 = new TimerTask() {
			@Override
			public void run() {
				runOnUiThread(new Runnable() {
					@Override
					public void run() {
						_i();
					}
				});
			}
		};
		_timer.schedule(t4, (int)(1000));
		m_ = 0;
	}
	
	
	public void _a () {
		/* 
all the questions which are present in listview are added from here
*/
		/* 
all the questions which are present in listview are added from here
*/
		/* 
all the questions which are present in listview are added from here
*/
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "leave this position 0 empty, because I'm using a \"if\" condition in listview onBindEvent  to show the app heading on position \"0\" ");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "hello?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "i am depressed?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Become angry");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Who created you?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Can you sing?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Show me weather");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Open YouTube ");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Can you roll?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "am not feeling well?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "what can I do to reduce Stress?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Do you love me?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "What is time?");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Tell me a fact");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "I love you");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "You're awesome");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Bye Bye!");
			l_.add(_item);
		}
		
		{
			HashMap<String, Object> _item = new HashMap<>();
			_item.put("q", "Created by Joseph Justine @Greentech Malawi.");
			l_.add(_item);
		}
		
		l.setAdapter(new LAdapter(l_));
		((BaseAdapter)l.getAdapter()).notifyDataSetChanged();
	}
	
	
	public void _x (final View _view, final String _propertyName, final double _value, final double _duration) {
		ObjectAnimator anim = new ObjectAnimator();
		anim.setTarget(_view);
		anim.setPropertyName(_propertyName);
		anim.setFloatValues((float)_value);
		anim.setDuration((long)_duration);
		anim.start();
	}
	
	
	public void _y (final View _swipe, final View _bottom, final View _top, final View _pin) {
		/* 
this is swipe up and down effect
*/
		/* 
this is swipe up and down effect
*/
		/* 
this is swipe up and down effect
*/
		final LinearLayout swipe = (LinearLayout)_swipe;
		        final LinearLayout bottom = (LinearLayout)_bottom;
		        final LinearLayout top = (LinearLayout)_top;
		swipe.setClickable(true);
		        swipe.setFocusable(true);
		        final int[] current = {0};
		        final boolean[] closed = {true};
		
		        
		        _pin.post(new Runnable() {
			            @Override
			            public void run() {
				                final int pin = 200;
				                final int max_size = ((ViewGroup)bottom.getParent()).getHeight();
				                final int pin_start = 0;
				
				                final int height = 0-((max_size-pin));
				      
				_x(_bottom, "translationY", pin_start, 300);
				LinearLayout.LayoutParams topParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,max_size-pin);
				                top.setLayoutParams(topParams);
				
				LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,max_size);
				                bottom.setLayoutParams(layoutParams);
				swipe.setOnTouchListener(new View.OnTouchListener() {
					                    @Override
					                    public boolean onTouch(View v, MotionEvent event) {
						                        
						
						stt.stopListening();
						ic_arrow.setRotation((float)(0));
						
						switch (event.getAction()){
							                            case MotionEvent.ACTION_DOWN:{
								                                if (closed[0]){
									                                    current[0] = (int) event.getY();
									                                }else {
									                                    current[0] = (int) (event.getY()+(max_size-pin)+pin_start);
									                                }
								                            }
							                            case MotionEvent.ACTION_MOVE:{
								                                if (event.getY()-current[0]>height & event.getY()-current[0]<0){
									                                    bottom.setTranslationY((event.getY()-current[0])+pin_start);
									                                }
								
								                                if ((event.getY()-current[0])<height){
									                                    bottom.setTranslationY(height+pin_start);
									                                }
								                                if (event.getY()-current[0]>0){
									                                    bottom.setTranslationY(pin_start);
									                                }
								                                break;
								                            }
							                            case MotionEvent.ACTION_UP:{
								                                int value_2 = (int) (event.getY()-current[0]);
								                                if (value_2>(height/2)){
									                                    ObjectAnimator animator = new ObjectAnimator();
									                                    animator.setTarget(bottom);
									                                    animator.setPropertyName("translationY");
									                                    animator.setFloatValues(pin_start);
									                                    animator.setDuration(400);
									                                    animator.setInterpolator(new android.view.animation.DecelerateInterpolator());
									                                    animator.start();
									                                    closed[0] = true;
									                                
									
									                 
									
									stt.stopListening();
									ic_arrow.setRotation((float)(0));
									
								}else {
									
									                  ObjectAnimator animator = new ObjectAnimator();
									                                    animator.setTarget(bottom);
									                                    animator.setPropertyName("translationY");
									                                    animator.setFloatValues(height+pin_start);
									                                    animator.setDuration(200);
									                                    animator.setInterpolator(new android.view.animation.DecelerateInterpolator());
									                                    animator.start();
									                                    closed[0] = false;
									
									
									                  
									
									stt.stopListening();
									ic_arrow.setRotation((float)(180));
									
									
									                  
									                                }
								                                break;
								                            }
							                        }
						
						                        return false;
						                    }
					                });
				            }
			        });
	}
	
	
	public void _s1 (final String _data) {
		/* 
all the action of Spark AI are stored in "s2" and "s2"..
*/
		if (_data.toLowerCase().contains("angry")) {
			_r(e1, 100, "f44336");
			_r(e2, 100, "f44336");
		}
		else {
			_r(e1, 100, "ffffff");
			_r(e2, 100, "ffffff");
			if (_data.toLowerCase().contains("hello")) {
				tts.setPitch((float)1.5d);
				tts.setSpeechRate((float)0.5d);
				tts.speak("Yes, I'm artificial intelligence based robot, created to help you with your mental health problems, please talk to me.", TextToSpeech.QUEUE_ADD, null);
			}
			else {
				if (_data.toLowerCase().contains("i am depressed")) {
					tts.setPitch((float)1.5d);
					tts.setSpeechRate((float)0.5d);
					tts.speak("I'm really sorry to hear that you are feeling depressed. Remember that you are not alone, and there are people who care about you it might be helpful to talk to a mental health professional or a trusted person in your life about what you're through. They can provide support and guidance tailored to your specific situation. Stay Strong.", TextToSpeech.QUEUE_ADD, null);
				}
				else {
					if (_data.toLowerCase().contains("who created you")) {
						tts.setPitch((float)1.5d);
						tts.setSpeechRate((float)0.5d);
						tts.speak("I was programmed  by Joseph Justine.", TextToSpeech.QUEUE_ADD, null);
					}
					else {
						if (_data.toLowerCase().contains("can you sing")) {
							tts.setPitch((float)1.5d);
							tts.setSpeechRate((float)0.5d);
							tts.speak("Yes i can,\nTwinkle twinkle little star,\nHow I wonder what you are,\nUp above the world so high,\nLike a diamond in the sky,\nTwinkle twinkle little star,\nHow I wonder what you are.", TextToSpeech.QUEUE_ADD, null);
						}
						else {
							if (_data.toLowerCase().contains("show me weather")) {
								tts.setPitch((float)1.5d);
													tts.setSpeechRate((float)0.5d);
													tts.speak("ok wait", TextToSpeech.QUEUE_ADD, null);
													i1.setAction(Intent.ACTION_VIEW);
													i1.setData(Uri.parse("dynact://velour/weather/ProxyActivity"));
													startActivity(i1);
							}
							else {
								if (_data.toLowerCase().contains("open youtube")) {
									tts.setPitch((float)1.5d);
														tts.setSpeechRate((float)0.5d);
														tts.speak("ok wait", TextToSpeech.QUEUE_ADD, null);
														i1.setAction(Intent.ACTION_VIEW);
														i1.setData(Uri.parse("http://www.youtube.com/melrobbins/ufQEqi4LUZ4"));
														startActivity(i1);
								}
								else {
									if (_data.toLowerCase().contains("can you roll")) {
										tts.setPitch((float)1.5d);
										tts.setSpeechRate((float)0.5d);
										tts.speak("yes i can roll", TextToSpeech.QUEUE_ADD, null);
										_rr();
									}
									else {
										if (_data.toLowerCase().contains("i am not feeling well ")) {
											tts.setPitch((float)1.5d);
											tts.setSpeechRate((float)0.5d);
											tts.speak("Well, honestly i don't know what is you are going through can you provide more details about your issue or you can talk to your mental health counselor", TextToSpeech.QUEUE_ADD, null);
										}
										else {
											if (_data.toLowerCase().contains("where you from")) {
												tts.setPitch((float)1.5d);
												tts.setSpeechRate((float)0.5d);
												tts.speak("I'm from no where, I'm just installed on your cellphone ", TextToSpeech.QUEUE_ADD, null);
											}
											else {
												if (_data.toLowerCase().contains("i am afraid of exams")) {
													tts.setPitch((float)1.5d);
													tts.setSpeechRate((float)0.5d);
													tts.speak("Yes, it is okay to feel so but you need to face your fears and go for that exams.", TextToSpeech.QUEUE_ADD, null);
												}
												else {
													if (_data.toLowerCase().contains("what is") && _data.toLowerCase().contains("time")) {
														tts.setPitch((float)1.5d);
														tts.setSpeechRate((float)0.5d);
														tts.speak("it's ".concat(new SimpleDateFormat("h mm a").format(c1.getTime())), TextToSpeech.QUEUE_ADD, null);
													}
													else {
														if (_data.toLowerCase().contains("tell me a fact")) {
															tts.setPitch((float)1.5d);
															tts.setSpeechRate((float)0.5d);
															tts.speak("ok, here is one, an elephant is smaller then whale's tounge", TextToSpeech.QUEUE_ADD, null);
														}
														else {
															if (_data.toLowerCase().contains("i love you")) {
																tts.setPitch((float)1.5d);
																tts.setSpeechRate((float)0.5d);
																tts.speak("thank you", TextToSpeech.QUEUE_ADD, null);
															}
															else {
																if (_data.toLowerCase().contains("awesome")) {
																	tts.setPitch((float)1.5d);
																	tts.setSpeechRate((float)0.5d);
																	tts.speak("you're awesome too", TextToSpeech.QUEUE_ADD, null);
																}
																else {
																	if (_data.toLowerCase().contains("bye bye")) {
																		tts.setPitch((float)1.5d);
																		tts.setSpeechRate((float)0.5d);
																		tts.speak("ok bye bye", TextToSpeech.QUEUE_ADD, null);
																		t8 = new TimerTask() {
																			@Override
																			public void run() {
																				runOnUiThread(new Runnable() {
																					@Override
																					public void run() {
																						finishAffinity();
																					}
																				});
																			}
																		};
																		_timer.schedule(t8, (int)(800));
																	}
																	else {
																		_s2(_data);
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}
	
	
	public void _s2 (final String _data) {
		tts.setPitch((float)2.0d);
		tts.setSpeechRate((float)0.5d);
		tts.speak("sorry, i didn't get that can you explain in detail.", TextToSpeech.QUEUE_ADD, null);
	}
	
	
	public void _w (final ArrayList<HashMap<String, Object>> _listMap, final String _key, final boolean _isNumber, final boolean _Ascending) {
		Collections.sort(_listMap, new Comparator<HashMap<String,Object>>(){
			public int compare(HashMap<String,Object> _compareMap1, HashMap<String,Object> _compareMap2){
				if (_isNumber) {
					int _count1 = Integer.valueOf(_compareMap1.get(_key).toString());
					int _count2 = Integer.valueOf(_compareMap2.get(_key).toString());
					if (_Ascending) {
						return _count1 < _count2 ? -1 : _count1 < _count2 ? 1 : 0;
					}
					else {
						return _count1 > _count2 ? -1 : _count1 > _count2 ? 1 : 0;
					}
				}
				else {
					if (_Ascending) {
						return (_compareMap1.get(_key).toString()).compareTo(_compareMap2.get(_key).toString());
					}
					else {
						return (_compareMap2.get(_key).toString()).compareTo(_compareMap1.get(_key).toString());
					}
				}
			}});
	}
	
	
	public void _c () {
	}
	private boolean appInstalledOrNot(String uri) { 
		android.content.pm.PackageManager pm = getPackageManager(); 
		try {
			pm.getPackageInfo(uri, android.content.pm.PackageManager.GET_ACTIVITIES); 
			return true; 
		} catch (android.content.pm.PackageManager.NameNotFoundException e) { 
		} 
		return false; 
	}
	
	
	public void _j (final double _top1, final double _top2, final double _bottom1, final double _bottom2, final String _inside_color, final String _side_color, final double _side_size, final View _view) {
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
	
	
	public void _rr () {
		oa11.setTarget(m_c);
		oa11.setPropertyName("rotation");
		oa11.setFloatValues((float)(0), (float)(350));
		oa11.setDuration((int)(2000));
		oa11.setRepeatMode(ValueAnimator.REVERSE);
		oa11.setRepeatCount((int)(0));
		oa11.setInterpolator(new LinearInterpolator());
		oa11.start();
	}
	
	
	public class LAdapter extends BaseAdapter {
		ArrayList<HashMap<String, Object>> _data;
		public LAdapter(ArrayList<HashMap<String, Object>> _arr) {
			_data = _arr;
		}
		
		@Override
		public int getCount() {
			return _data.size();
		}
		
		@Override
		public HashMap<String, Object> getItem(int _index) {
			return _data.get(_index);
		}
		
		@Override
		public long getItemId(int _index) {
			return _index;
		}
		@Override
		public View getView(final int _position, View _v, ViewGroup _container) {
			LayoutInflater _inflater = (LayoutInflater)getBaseContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View _view = _v;
			if (_view == null) {
				_view = _inflater.inflate(R.layout.l_lm, null);
			}
			
			final LinearLayout l = (LinearLayout) _view.findViewById(R.id.l);
			final TextView t = (TextView) _view.findViewById(R.id.t);
			
			t.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/greyscale_basic_regular.ttf"), 0);
			if (_position == 0) {
				t.setTextColor(0xFFFFFFFF);
				t.setText("Ask me following:");
				t.setTextSize((int)20);
			}
			else {
				t.setTextColor(0xFF65FB89);
				t.setText(_data.get((int)_position).get("q").toString());
				t.setTextSize((int)16);
				if (_data.get((int)_position).get("q").toString().contains("Joseph")) {
					
					
					
					t.setTextSize((int)12);
							t.setTextColor(0xFFF5F5F5);
							t.setTextColor(0xFFF5F5F5);
							t.setOnClickListener(new View.OnClickListener() {
									@Override
									public void onClick(View _view) {
							
							
							
							
							
							i7.setAction(Intent.ACTION_VIEW);
										i7.setData(Uri.parse("https://www.greentechmalawi.tech.mw"));
										startActivity(i7);
											
									}
							});
					}
			}
			
			return _view;
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