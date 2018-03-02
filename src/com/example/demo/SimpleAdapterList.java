package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class SimpleAdapterList extends Activity {

	private String[] names = { "alex", "henry", "thierry", "jens" };
	private int[] imageIds = new int[] { R.drawable.gallery_photo_1,
			R.drawable.gallery_photo_1, R.drawable.gallery_photo_1,
			R.drawable.gallery_photo_1 };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.simplelayout);

		List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
		for (int i = 0; i < names.length; i++) {
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("pName", names[i]);
			map.put("image", imageIds[i]);
			list.add(map);
		}

		SimpleAdapter adapter = new SimpleAdapter(this, list,
				R.layout.simple_item, new String[] { "pName", "image" },
				new int[] { R.id.simple_text, R.id.img });
		ListView lists = (ListView) findViewById(R.id.simple_list);
		lists.setAdapter(adapter);
		lists.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				System.out.println(names[position] + "被点击了");
			}

		});
	}

}
