package com.example.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;

public class Spannable extends Activity {

	Button mBtn;
	TextView mTv1;
	EditText mEt;
	RadioGroup mGroup;
	String sex;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spannablestring);

		Button mBtn = (Button) findViewById(R.id.btn1);
		TextView mTv1 = (TextView) findViewById(R.id.v1);
		final EditText mEt = (EditText) findViewById(R.id.ed_name);
		RadioGroup mGroup = (RadioGroup) findViewById(R.id.rg);
		final CheckBox c1 = (CheckBox) findViewById(R.id.football);
		final CheckBox c2 = (CheckBox) findViewById(R.id.basketball);
		final CheckBox c3 = (CheckBox) findViewById(R.id.bedminton);
		final CheckBox c4 = (CheckBox) findViewById(R.id.tabletenis);
		final ArrayList<String> list = new ArrayList<String>();

		String text = "返回";

		SpannableString string = new android.text.SpannableString(text);
		string.setSpan(new ClickableSpan() {

			@Override
			public void updateDrawState(TextPaint ds) {
				// TODO Auto-generated method stub
				super.updateDrawState(ds);
				ds.setUnderlineText(false);
			}

			@Override
			public void onClick(View widget) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(widget.getContext(),
						MainActivity.class);
				startActivity(intent);

			}
		}, 0, text.length(), Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
		mTv1.setText(string);
		mTv1.setMovementMethod(LinkMovementMethod.getInstance());

		c1.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				if (c1.isChecked())
					list.add("足球");
				else
					list.remove("足球");
			}
		});

		c2.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				if (c2.isChecked())
					list.add("篮球");
				else
					list.remove("篮球");
			}
		});
		c3.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				if (c3.isChecked())
					list.add("羽毛球");
				else
					list.remove("羽毛球");
			}
		});
		c4.setOnCheckedChangeListener(new CheckBox.OnCheckedChangeListener() {

			@Override
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				// TODO Auto-generated method stub
				if (c4.isChecked())
					list.add("乒乓球");
				else
					list.remove("乒乓球");
			}
		});

		mGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if (checkedId == R.id.male)
					sex = "男";
				else
					sex = "女";
			}
		});

		mBtn.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				new AlertDialog.Builder(Spannable.this)
						.setTitle("您的信息")
						.setMessage(
								"姓名：" + mEt.getText() + "\n性别：" + sex + "\n爱好："
										+ list.toString())
						.setIcon(android.R.drawable.ic_dialog_info).create()
						.show();
			}
		});
		
	}

}
