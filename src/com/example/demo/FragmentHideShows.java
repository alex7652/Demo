package com.example.demo;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentHideShows extends Activity {
	Fragment fragment;
	Button btn;
	Button btn_dialog;
	static Intent intent;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fragment_hide_show);

		final FragmentManager fm = getFragmentManager();
		fragment = fm.findFragmentById(R.id.frag);
		btn = (Button) findViewById(R.id.btn_showhide);
		btn.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				FragmentTransaction ft = fm.beginTransaction();
				ft.setCustomAnimations(android.R.animator.fade_in,
						android.R.animator.fade_out);
				if (fragment.isHidden()) {
					ft.show(fragment);
					btn.setText("Hide");
				} else {
					ft.hide(fragment);
					btn.setText("Show");
				}
				ft.commit();

			}
		});

		intent = getIntent();
		Toast.makeText(this, intent.getComponent().getClassName(), 0).show();

	}

	public static class FirstFragment extends Fragment {

		@Override
		public void onAttach(Activity activity) {
			// TODO Auto-generated method stub
			super.onAttach(activity);
			Log.d("Frag", "*******onAttach********");
			System.out.println(getActivity());
		}

		@Override
		public void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			Log.d("Frag", "*******onCreate********");
		}

		@Override
		public void onStart() {
			// TODO Auto-generated method stub
			super.onStart();
			Log.d("Frag", "*******onStart********");
		}

		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			View v = inflater.inflate(R.layout.labeled_text_edit, container,
					false);
			TextView mTv_tex = (TextView) v.findViewById(R.id.text);
			mTv_tex.setText("hello world");
			Log.d("Frag", "*******onCreateView********");
			return v;
		}

		@Override
		public void onResume() {
			// TODO Auto-generated method stub
			super.onResume();
			Log.d("Frag", "*******onResume********");
		}

		@Override
		public void onPause() {
			// TODO Auto-generated method stub
			super.onPause();
			Log.d("Frag", "*******onPause********");
		}

		@Override
		public void onStop() {
			// TODO Auto-generated method stub
			super.onStop();
			Log.d("Frag", "*******onStop********");
		}

		@Override
		public void onDestroyView() {
			// TODO Auto-generated method stub
			super.onDestroyView();
			Log.d("Frag", "*******onDestroyView********");
		}

		@Override
		public void onDestroy() {
			// TODO Auto-generated method stub
			super.onDestroy();
			Log.d("Frag", "*******onDestroy********");
		}

		@Override
		public void onDetach() {
			// TODO Auto-generated method stub
			super.onDetach();
			Log.d("Frag", "*******onDetach********");
		}
	}

}
