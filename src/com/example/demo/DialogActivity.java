package com.example.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;

public class DialogActivity extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		new AlertDialog.Builder(DialogActivity.this)
		.setTitle("Fragment")
		.setIcon(android.R.drawable.ic_dialog_info)
		.setPositiveButton("确定", new OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog,
					int which) {
				// TODO Auto-generated method stub
				System.out.println("finish dialog activity");
				finish();
			}
		}).setCancelable(false).create().show();

		
	}
}
