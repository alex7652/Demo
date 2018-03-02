package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public class Inflater extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		/**
		 * 第一种方式
		 * */
		setContentView(R.layout.linearlayout);
		
		LinearLayout layout = (LinearLayout) findViewById(R.id.linear);
		LayoutInflater inflater = LayoutInflater.from(this);
		View v = inflater.inflate(R.layout.auto_complete, null);
		layout.addView(v);
		
		/**
		 * 第二种方式
//		 * */
//		LayoutInflater inflater = LayoutInflater.from(this);
//		View view = inflater.inflate(R.layout.linearlayout,null);
//		//view = inflater.inflate(R.layout.auto_complete, (ViewGroup) view, true);
//		setContentView(view);
	}

}
