package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StartServiceActivity extends Activity {

	Button mBtnStart;
	Button mBtnStop;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start_service);

		mBtnStart = (Button) findViewById(R.id.btn_start_service);
		mBtnStop = (Button) findViewById(R.id.btn_stop_service);
		final Intent intent = new Intent(this, FirstService.class);

		mBtnStart.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				startService(intent);
			}
		});

		mBtnStop.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				stopService(intent);
			}
		});

	}

}
