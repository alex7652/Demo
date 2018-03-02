package com.example.demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class BundleReceive extends Activity {

	TextView mTv_name;
	TextView mTV_pwd;
	TextView mTv_tip;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bundle_receive);

		mTv_name = (TextView) findViewById(R.id.rec_name);
		mTV_pwd = (TextView) findViewById(R.id.rec_pwd);
		mTv_tip = (TextView) findViewById(R.id.rec_sex);

		Person p = (Person) getIntent().getSerializableExtra("person");
		mTv_name.setText("用户名:" + p.getName());
		mTV_pwd.setText("密码：" + p.getPwd());
		mTv_tip.setText("性别：" + p.getSex());

	}

}
