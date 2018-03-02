package com.example.demo;

import java.io.Serializable;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class BundleObject extends Activity {

	EditText mET_name;
	EditText mET_pwd;
	Button mBtn_register;
	RadioGroup rg;
	String tip;
	boolean isChangeflag;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.bundle_register);

		mET_name = (EditText) findViewById(R.id.name);
		mET_pwd = (EditText) findViewById(R.id.pwd);
		mBtn_register = (Button) findViewById(R.id.register);
		rg = (RadioGroup) findViewById(R.id.group);
		
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			
			
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				
				// TODO Auto-generated method stub
				isChangeflag = true;
				if (checkedId == R.id.male)
					tip = "男";
				else
					tip = "女";

			}

		});

		mBtn_register.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String names = mET_name.getText().toString();
				String pwds = mET_pwd.getText().toString();
				Bundle bundle = new Bundle();
				if(!isChangeflag)
					tip="男";
				Person person = new Person(names, pwds, tip);
				bundle.putSerializable("person", person);
				Intent intent = new Intent(BundleObject.this,
						BundleReceive.class);
				intent.putExtras(bundle);
				startActivity(intent);
			}
		});
	}

}

class Person implements Serializable{
	String name;
	String pwd;
	String sex;

	public Person(String name, String pwd, String tip) {
		this.name = name;
		this.pwd = pwd;
		sex = tip;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

}
