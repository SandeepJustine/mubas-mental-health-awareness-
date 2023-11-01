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
import android.animation.ObjectAnimator;
import android.view.animation.LinearInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.BounceInterpolator;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class CRActivity extends  AppCompatActivity  { 
	
	
	private LinearLayout p;
	private LinearLayout m;
	private LinearLayout l_r;
	private TextView t;
	private ImageView ic_p;
	private ImageView b;
	
	private ObjectAnimator oa1 = new ObjectAnimator();
	private ObjectAnimator oa2 = new ObjectAnimator();
	private ObjectAnimator oa3 = new ObjectAnimator();
	private ObjectAnimator oa4 = new ObjectAnimator();
	private ObjectAnimator oa5 = new ObjectAnimator();
	@Override
	protected void onCreate(Bundle _savedInstanceState) {
		super.onCreate(_savedInstanceState);
		setContentView(R.layout.c_r);
		initialize(_savedInstanceState);
		com.google.firebase.FirebaseApp.initializeApp(this);
		initializeLogic();
	}
	
	private void initialize(Bundle _savedInstanceState) {
		
		p = (LinearLayout) findViewById(R.id.p);
		m = (LinearLayout) findViewById(R.id.m);
		l_r = (LinearLayout) findViewById(R.id.l_r);
		t = (TextView) findViewById(R.id.t);
		ic_p = (ImageView) findViewById(R.id.ic_p);
		b = (ImageView) findViewById(R.id.b);
	}
	
	private void initializeLogic() {
		_data(getIntent().getStringExtra("DATA"));
		t.setTypeface(Typeface.createFromAsset(getAssets(),"fonts/semibold.ttf"), 0);
		_addCardView(p, 5, 50, 0, 0, true, "#00000000");
		_Gradient_round(m, 60, "FB4B30", "FF971F");
		oa1.setTarget(l_r);
		oa1.setPropertyName("rotation");
		oa1.setInterpolator(new LinearInterpolator());
		oa1.setFloatValues((float)(0), (float)(360));
		oa1.setRepeatMode(ValueAnimator.RESTART);
		oa1.setDuration((int)(8000));
		oa1.setRepeatCount((int)(999));
		oa1.start();
		oa2.setTarget(b);
		oa2.setPropertyName("rotation");
		oa2.setInterpolator(new LinearInterpolator());
		oa2.setFloatValues((float)(360), (float)(0));
		oa2.setRepeatMode(ValueAnimator.RESTART);
		oa2.setDuration((int)(8000));
		oa2.setRepeatCount((int)(999));
		oa2.start();
		oa3.setTarget(ic_p);
		oa3.setPropertyName("scaleX");
		oa3.setInterpolator(new LinearInterpolator());
		oa3.setFloatValues((float)(5), (float)(6));
		oa3.setRepeatMode(ValueAnimator.REVERSE);
		oa3.setDuration((int)(1000));
		oa3.setRepeatCount((int)(999));
		oa3.start();
		oa4.setTarget(ic_p);
		oa4.setPropertyName("scaleY");
		oa4.setInterpolator(new LinearInterpolator());
		oa4.setFloatValues((float)(5), (float)(6));
		oa4.setRepeatMode(ValueAnimator.REVERSE);
		oa4.setDuration((int)(1000));
		oa4.setRepeatCount((int)(999));
		oa4.start();
		oa5.setTarget(ic_p);
		oa5.setPropertyName("rotation");
		oa5.setInterpolator(new LinearInterpolator());
		oa5.setFloatValues((float)(360), (float)(0));
		oa5.setRepeatMode(ValueAnimator.RESTART);
		oa5.setDuration((int)(10000));
		oa5.setRepeatCount((int)(999));
		oa5.start();
	}
	
	@Override
	protected void onActivityResult(int _requestCode, int _resultCode, Intent _data) {
		
		super.onActivityResult(_requestCode, _resultCode, _data);
		
		switch (_requestCode) {
			
			default:
			break;
		}
	}
	
	public void _Gradient_round (final View _view, final double _radius, final String _color1, final String _color2) {
		android.graphics.drawable.GradientDrawable s = new android.graphics.drawable.GradientDrawable(android.graphics.drawable.GradientDrawable.Orientation.TR_BL, new int[]{Color.parseColor("#"+_color1),Color.parseColor("#"+_color2)});
		s.setCornerRadius(new Float(_radius));
		_view.setBackground(s);
	}
	
	
	public void _addCardView (final View _layoutView, final double _margins, final double _cornerRadius, final double _cardElevation, final double _cardMaxElevation, final boolean _preventCornerOverlap, final String _backgroundColor) {
		androidx.cardview.widget.CardView cv = new androidx.cardview.widget.CardView(this);
		LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT);
		int m = (int)_margins;
		lp.setMargins(m,m,m,m);
		cv.setLayoutParams(lp);
		int c = Color.parseColor(_backgroundColor);
		cv.setCardBackgroundColor(c);
		cv.setRadius((float)_cornerRadius);
		cv.setCardElevation((float)_cardElevation);
		cv.setMaxCardElevation((float)_cardMaxElevation);
		cv.setPreventCornerOverlap(_preventCornerOverlap);
		if(_layoutView.getParent() instanceof LinearLayout){
			ViewGroup vg = ((ViewGroup)_layoutView.getParent());
			vg.removeView(_layoutView);
			vg.removeAllViews();
			vg.addView(cv);
			cv.addView(_layoutView);
		}else{
			
		}
	}
	
	
	public void _data (final String _data) {
		if (_data.contains("mystery")) {
				
			t.setText(_data);
			b.setImageResource(R.drawable.day7_treasure);}
		else {
				t.setText(_data);
			b.setImageResource(R.drawable.ic_coin_48x48);
		}
		if (getIntent().getBooleanExtra("dialogTheme",true)) {
			
			getWindow().getDecorView().setBackgroundResource(android.R.color.transparent);
			
			{
				
				android.graphics.drawable.GradientDrawable rahimkhan = new android.graphics.drawable.GradientDrawable();
				
				int d = (int) getApplicationContext().getResources().getDisplayMetrics().density;
				
				rahimkhan.setColor(0x00000000);
				
				rahimkhan.setCornerRadius(60);
				
				
				((ViewGroup)getWindow().getDecorView()).getChildAt(0).setBackground(rahimkhan);
				
			}
			
			
		}
	}
	
	
	public void _dt () {
	}
	// setTheme() should be set before setContentView() so a small hack to do this in sketchware
	 @Override 
	    public void setContentView( int layoutResID) {
		if(getIntent().getBooleanExtra("dialogTheme",true)){
			supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
			setTheme(R.style.Theme_AppCompat_Light_Dialog);
			setFinishOnTouchOutside(true);
			
			//change true to false if you want to make dialog non cancellable when clicked outside
			//if you want to use this without app compat  change supportRequestWindowFeature() and setTheme() to below codes.
			/*
requestWindowFeature(Window.FEATURE_NO_TITLE);
setTheme(android.R.style.Theme_Dialog);
*/
			// Calling this allows the Activity behind this one to be seen again. Once all such Activities have been redrawn
			try {
				 	java.lang.reflect.Method getActivityOptions = Activity.class.getDeclaredMethod("getActivityOptions"); getActivityOptions.setAccessible(true);
				 Object options = getActivityOptions.invoke(this); Class<?>[] classes = Activity.class.getDeclaredClasses(); Class<?> translucentConversionListenerClazz = null; 
				for (Class clazz : classes) { if (clazz.getSimpleName().contains("TranslucentConversionListener")) { translucentConversionListenerClazz = clazz; } } 
				java.lang.reflect.Method convertToTranslucent = Activity.class.getDeclaredMethod("convertToTranslucent", translucentConversionListenerClazz, ActivityOptions.class); convertToTranslucent.setAccessible(true); convertToTranslucent.invoke(this, null, options); } catch (Throwable t) {
			}
		}
		super.setContentView(layoutResID);  
	}
	{
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