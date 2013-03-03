package com.eyyeyy.tsw_signets;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

import com.eyyeyy.tsw_signets.common.BasicInformationActivity;
import com.eyyeyy.tsw_signets.common.FarmingLocationsActivity;
import com.eyyeyy.tsw_signets.common.QuestsActivity;
import com.eyyeyy.tsw_signets.common.SignetOverviewActivity;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main_activity, menu);
		return true;
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
}
