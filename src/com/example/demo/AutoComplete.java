package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class AutoComplete extends Activity{
	private MyApplication application;
	String[] teams ={"Aresnal","Barselona","Real Mardli","Juventus","Manchester City","Mancherste United"};
	AutoCompleteTextView textView ;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.auto_complete);
		
		textView = (AutoCompleteTextView)findViewById(R.id.auto);
		textView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line, teams));
		//getApplicationContext().
		application = (MyApplication) getApplicationContext();
		Toast.makeText(AutoComplete.this, application.getName(), 0).show();
	}

}
