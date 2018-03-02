package com.example.demo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

	

public class MainActivity extends Activity {
	
	private MyApplication application;
	String items[] = { "FragmenHideShow", "FragmentDialog", "LinerLayout",
			"SpannableString", "putExtra", "SimpleAdapter",
			"AutoCompleteTestView", "BudleSerializableExtra",
			"ExpandableListView", "LayoutInflater","CustomView","FrameLayout" ,"RelativeLayoutActivity","StartServiceActivity"};
	ListView listView;
	
	static final int REQUEST_CODE = 1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println(getApplicationContext());
		System.out.println(MainActivity.this);
		Log.d("TAG", "--------onCreate-------");
		listView = (ListView) findViewById(R.id.lv);
		listView.setAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, items));

		application = (MyApplication) getApplication();
		application.setName("henry");
		
		//		 Intent intent = new Intent(MainActivity.this,DialogActivity.class);
//		 startActivity(intent);
		
		 
		listView.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				// TODO Auto-generated method stub
				//setTitle("点击" + (arg2 + 1) + "行");
				Intent intent = null;
				switch (arg2) {
				case 0:
					Intent intent0 = new Intent();		
					intent0.setAction("FragmentAction");
					intent0.addCategory("heihei");
					startActivity(intent0);
					break;
				case 1:
					Intent intent1 = new Intent();
					intent1.setData(Uri.parse("alex://host:port/path"));//匹配schema
					startActivity(intent1);
					break;
				case 2:
					intent = new Intent(arg1.getContext(), LinearLayout.class);
					startActivity(intent);
					break;
				case 3:
					intent = new Intent(arg1.getContext(), Spannable.class);
					startActivity(intent);
					break;
				case 4:
					intent = new Intent(arg1.getContext(), GetExtras.class);
					intent.putExtra("extras", "我是MainActivity");
					startActivityForResult(intent, REQUEST_CODE);
					break;
				case 5:
					intent = new Intent(arg1.getContext(),
							SimpleAdapterList.class);
					startActivity(intent);
					break;
				case 6:
					intent = new Intent(arg1.getContext(), AutoComplete.class);
					startActivity(intent);
					break;
				case 7:
					intent = new Intent(arg1.getContext(), BundleObject.class);
					startActivity(intent);
					break;
				case 8:
					intent = new Intent(arg1.getContext(), ExpanList.class);
					startActivity(intent);
					break;
				case 9:
					intent = new Intent(arg1.getContext(), Inflater.class);
					startActivity(intent);
					break;
				case 10:
					intent = new Intent(arg1.getContext(), CustomViewActivity.class);
					startActivity(intent);
					break;
				case 11:
					intent = new Intent(arg1.getContext(), FrameLayoutActivity.class);
					startActivity(intent);
					break;
				case 12:
					intent = new Intent(arg1.getContext(), RelativeLayoutActivity.class);
					startActivity(intent);
					break;
				case 13:
					intent = new Intent(arg1.getContext(), StartServiceActivity.class);
					startActivity(intent);
					break;
				}

				// MainActivity.this.finish();
			}

		});

	}

	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.d("TAG", "--------onStart-------");
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		if (requestCode == GetExtras.RESULT_CODE) {
			Bundle bundle = data.getExtras();
			String str = bundle.getString("back");
			Toast.makeText(this, str, Toast.LENGTH_LONG).show();
		}

	}

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		setTitle("Demo");
		Log.d("TAG", "--------onResume---------");
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.d("TAG", "--------onPause---------");
	}

	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.d("TAG", "--------onStop---------");
	}

	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.d("TAG", "--------onDestroy---------");
	}

	@Override
	protected void onRestart() {
		// TODO Auto-generated method stub
		super.onRestart();
		Log.d("TAG", "--------onRestart-------");
	}
}


