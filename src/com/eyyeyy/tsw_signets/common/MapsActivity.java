package com.eyyeyy.tsw_signets.common;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.common.maps.BlueMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.FangsMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.FarmMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.ForestMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.KingMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.SavageMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.ScorchedMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.SunMapMarkedActivity;

public class MapsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps_activity);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.maps_activity, menu);
		return true;
	}

	public void openKingMapMarked(View view) {

		Intent intent = new Intent(this, KingMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openSavageMapMarked(View view) {

		Intent intent = new Intent(this, SavageMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openBlueMapMarked(View view) {

		Intent intent = new Intent(this, BlueMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openScorchedMapMarked(View view) {

		Intent intent = new Intent(this, ScorchedMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openSunMapMarked(View view) {

		Intent intent = new Intent(this, SunMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openFarmMapMarked(View view) {

		Intent intent = new Intent(this, FarmMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openForestMapMarked(View view) {

		Intent intent = new Intent(this, ForestMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openFangsMapMarked(View view) {

		Intent intent = new Intent(this, FangsMapMarkedActivity.class);
		startActivity(intent);
	}
}
