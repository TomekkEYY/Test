package com.eyyeyy.tsw_signets.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.eyyeyy.tsw_signets.R;

public class FarmingLocationsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.farming_locations_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}
}
