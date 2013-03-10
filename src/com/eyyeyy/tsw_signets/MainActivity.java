package com.eyyeyy.tsw_signets;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.eyyeyy.tsw_signets.common.BasicInformationActivity;
import com.eyyeyy.tsw_signets.common.FarmingLocationsActivity;
import com.eyyeyy.tsw_signets.common.MapsActivity;
import com.eyyeyy.tsw_signets.common.QuestsActivity;
import com.eyyeyy.tsw_signets.common.SignetOverviewActivity;
import com.eyyeyy.tsw_signets.utils.AppRater;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		AppRater.app_launched(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	private final static String APP_PNAME = "com.eyyeyy.tsw_signets";

	public void showInfoMenu(MenuItem item) {
		ShowInfo.showInfoDialog(this);
	}

	public void openRateAndCommentMenu(MenuItem item) {
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + APP_PNAME)));
	}

	public void startBasicInformation(View view) {

		Intent intent = new Intent(this, BasicInformationActivity.class);
		startActivity(intent);
	}

	public void startSignetOverview(View view) {

		Intent intent = new Intent(this, SignetOverviewActivity.class);
		startActivity(intent);
	}

	public void startQuests(View view) {

		Intent intent = new Intent(this, QuestsActivity.class);
		startActivity(intent);
	}

	public void startFarmingLocations(View view) {

		Intent intent = new Intent(this, FarmingLocationsActivity.class);
		startActivity(intent);
	}

	public void startMaps(View view) {

		Intent intent = new Intent(this, MapsActivity.class);
		startActivity(intent);
	}

	// /*
	// * When the Back key is pressed states of the view are saved
	// */
	// @Override
	// public boolean onKeyDown(int keyCode, KeyEvent event) {
	// if (keyCode == KeyEvent.KEYCODE_BACK) {
	// moveTaskToBack(true);
	// return true;
	// }
	// return super.onKeyDown(keyCode, event);
	// }
}
