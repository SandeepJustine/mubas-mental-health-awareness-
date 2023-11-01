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
import android.widget.ScrollView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.os.Bundle;
import java.io.InputStream;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.graphics.Typeface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.DialogFragment;


public class ToolsFragmentActivity extends  Fragment  { 
	
	
	private ScrollView vscroll1bg;
	private LinearLayout linear1;
	private LinearLayout linear2;
	private LinearLayout mood;
	private LinearLayout music;
	private LinearLayout linear5;
	private LinearLayout news;
	private TextView textview1;
	private TextView textview4;
	private TextView textview3;
	private LinearLayout quiz_games;
	private TextView textview2;
	private LinearLayout linear8;
	private LinearLayout linear9quiz;
	private LinearLayout linear10game;
	private TextView textview6;
	private TextView textview7;
	private TextView textview5;
	
	private Intent i1 = new Intent();
	@NonNull
	@Override
	public View onCreateView(@NonNull LayoutInflater _inflater, @Nullable ViewGroup _container, @Nullable Bundle _savedInstanceState) {
		View _view = _inflater.inflate(R.layout.tools_fragment, _container, false);
		initialize(_savedInstanceState, _view);
		com.google.firebase.FirebaseApp.initializeApp(getContext());
		initializeLogic();
		return _view;
	}
	
	private void initialize(Bundle _savedInstanceState, View _view) {
		
		vscroll1bg = (ScrollView) _view.findViewById(R.id.vscroll1bg);
		linear1 = (LinearLayout) _view.findViewById(R.id.linear1);
		linear2 = (LinearLayout) _view.findViewById(R.id.linear2);
		mood = (LinearLayout) _view.findViewById(R.id.mood);
		music = (LinearLayout) _view.findViewById(R.id.music);
		linear5 = (LinearLayout) _view.findViewById(R.id.linear5);
		news = (LinearLayout) _view.findViewById(R.id.news);
		textview1 = (TextView) _view.findViewById(R.id.textview1);
		textview4 = (TextView) _view.findViewById(R.id.textview4);
		textview3 = (TextView) _view.findViewById(R.id.textview3);
		quiz_games = (LinearLayout) _view.findViewById(R.id.quiz_games);
		textview2 = (TextView) _view.findViewById(R.id.textview2);
		linear8 = (LinearLayout) _view.findViewById(R.id.linear8);
		linear9quiz = (LinearLayout) _view.findViewById(R.id.linear9quiz);
		linear10game = (LinearLayout) _view.findViewById(R.id.linear10game);
		textview6 = (TextView) _view.findViewById(R.id.textview6);
		textview7 = (TextView) _view.findViewById(R.id.textview7);
		textview5 = (TextView) _view.findViewById(R.id.textview5);
		
		mood.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), MoodjouranlActivity.class);
				startActivity(i1);
			}
		});
		
		music.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setClass(getContext(), CalmActivity.class);
				startActivity(i1);
			}
		});
		
		news.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), HomeActivity.class);
				startActivity(i1);
			}
		});
		
		linear9quiz.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setClass(getContext(), IndexActivity.class);
				startActivity(i1);
			}
		});
		
		linear10game.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View _view) {
				i1.setAction(Intent.ACTION_VIEW);
				i1.setClass(getContext(), ToolActivity.class);
				startActivity(i1);
			}
		});
	}
	
	private void initializeLogic() {
		mood.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFFFF));
		mood.setElevation((float)50);
		music.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFFFF));
		music.setElevation((float)50);
		linear5.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFFFF));
		news.setElevation((float)50);
		news.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b) { this.setCornerRadius(a); this.setColor(b); return this; } }.getIns((int)20, 0xFFFFFFFF));
		textview6.setElevation((float)0);
		linear9quiz.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)2, 0xFFBDBDBD, Color.TRANSPARENT));
		linear10game.setBackground(new GradientDrawable() { public GradientDrawable getIns(int a, int b, int c, int d) { this.setCornerRadius(a); this.setStroke(b, c); this.setColor(d); return this; } }.getIns((int)20, (int)2, 0xFFBDBDBD, Color.TRANSPARENT));
		textview1.setTypeface(Typeface.createFromAsset(getContext().getAssets(),"fonts/lexiereadable_bold.ttf"), 1);
		_setBackground(linear10game, 15, 2, "#2196F3", true);
		_setBackground(linear9quiz, 15, 2, "#2196F3", true);
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
	
	
	
}