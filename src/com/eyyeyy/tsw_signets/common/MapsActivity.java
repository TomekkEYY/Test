package com.eyyeyy.tsw_signets.common;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
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
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class MapsActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.maps_activity);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
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

	private final static String APP_PNAME = "com.eyyeyy.tsw_signets";

	public void showInfoMenu(MenuItem item) {
		ShowInfo.showInfoDialog(this);
	}

	public void openRateAndCommentMenu(MenuItem item) {
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + APP_PNAME)));
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
