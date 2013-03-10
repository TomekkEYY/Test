package com.eyyeyy.tsw_signets.common.maps;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

import com.eyyeyy.tsw_signets.R;
import com.polites.android.GestureImageView;

public class FarmMapMarkedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.farm_map_marked_activity);

		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		GestureImageView view = new GestureImageView(this);
		view.setImageResource(R.drawable.farm_map_marked);
		view.setLayoutParams(params);

		ViewGroup layout = (ViewGroup) findViewById(R.id.ll_farm_map_marked);

		layout.addView(view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.farm_map_marked_activity, menu);
		return true;
	}

	/*
	 * When the Back key is pressed states of the view are saved
	 */
	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if (keyCode == KeyEvent.KEYCODE_BACK) {
			moveTaskToBack(true);
			return true;
		}
		return super.onKeyDown(keyCode, event);
	}

}
