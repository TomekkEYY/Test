package com.eyyeyy.tsw_signets.common.maps;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

import com.eyyeyy.tsw_signets.R;
import com.polites.android.GestureImageView;

public class ScorchedMapMarkedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.scorched_map_marked_activity);

		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		GestureImageView view = new GestureImageView(this);
		view.setImageResource(R.drawable.scorched_map_marked);
		view.setLayoutParams(params);

		ViewGroup layout = (ViewGroup) findViewById(R.id.ll_scorched_map_marked);

		layout.addView(view);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.scorched_map_marked_activity, menu);
		return true;
	}

}