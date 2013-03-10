package com.eyyeyy.tsw_signets.common.quests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.common.maps.FangsMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.FarmMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.ForestMapMarkedActivity;

public class TransylvaniaQuestActivity extends Activity {

	private ViewGroup linearLayoutFarmingLocations;
	private View viewHolder;

	// Besieged Farmlands
	private View farmFarmingLocationsBlank;

	private TextView mapFarmNmText1;
	private TextView mapFarmNmText2;
	private TextView mapFarmNmText3;
	private TextView mapFarmNmText4;
	private TextView mapFarmNmText5;
	private TextView mapFarmNmText6;
	private TextView mapFarmNmText7;
	private TextView mapFarmNmText8;
	private TextView mapFarmNmText9;

	private Button farmFarmingLocations;
	private Button farmFarmingLocationsClose;

	// Shadowy Forest
	private View forestFarmingLocationsBlank;

	private TextView mapForestNmText1;
	private TextView mapForestNmText2;
	private TextView mapForestNmText3;
	private TextView mapForestNmText4;
	private TextView mapForestNmText5;
	private TextView mapForestNmText6;
	private TextView mapForestNmText7;
	private TextView mapForestNmText8;
	private TextView mapForestNmText9;

	private Button forestFarmingLocations;
	private Button forestFarmingLocationsClose;

	// Carpathian Fangs
	private View fangsFarmingLocationsBlank;

	private TextView mapFangsNmText;
	private TextView mapFangsNmText2;
	private TextView mapFangsNmText3;
	private TextView mapFangsNmText4;

	private Button fangsFarmingLocations;
	private Button fangsFarmingLocationsClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_quest_activity);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.transylvania_quest_activity, menu);
		return true;
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
