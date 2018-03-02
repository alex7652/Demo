package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GetExtras extends Activity{
	TextView mTv;
	Button btn;
	final static int RESULT_CODE=1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.getextras);
		
		mTv = (TextView)findViewById(R.id.extraV);
		mTv = (TextView)findViewById(R.id.extraV);
		
		Intent intent = getIntent();
		Bundle bundle = intent.getExtras();
		
		String str = bundle.getString("extras");
		mTv.setText(str);
		btn = (Button)findViewById(R.id.btn_back);		
		btn.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.putExtra("back", "我是GetExtras返回值");
				setResult(RESULT_CODE, intent);
				finish();
			}
		});
		
	}

}
