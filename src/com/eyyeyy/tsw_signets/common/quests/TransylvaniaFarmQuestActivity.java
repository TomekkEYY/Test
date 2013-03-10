package com.eyyeyy.tsw_signets.common.quests;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.common.maps.FarmMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class TransylvaniaFarmQuestActivity extends Activity {

	// Besieged Farmlands

	private TextView mapFarmNmText1;
	private TextView mapFarmNmText2;
	private TextView mapFarmNmText3;
	private TextView mapFarmNmText4;
	private TextView mapFarmNmText5;
	private TextView mapFarmNmText6;
	private TextView mapFarmNmText7;
	private TextView mapFarmNmText8;
	private TextView mapFarmNmText9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_farm_quest_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		// Basics Views

		mapFarmNmText1 = (TextView) findViewById(R.id.map_farm_quest1_text);
		mapFarmNmText1.setText(Html.fromHtml(getString(R.string.map_farm_quest1_text)));
		mapFarmNmText2 = (TextView) findViewById(R.id.map_farm_quest2_text);
		mapFarmNmText2.setText(Html.fromHtml(getString(R.string.map_farm_quest2_text)));
		mapFarmNmText3 = (TextView) findViewById(R.id.map_farm_quest3_text);
		mapFarmNmText3.setText(Html.fromHtml(getString(R.string.map_farm_quest3_text)));
		mapFarmNmText4 = (TextView) findViewById(R.id.map_farm_quest4_text);
		mapFarmNmText4.setText(Html.fromHtml(getString(R.string.map_farm_quest4_text)));
		mapFarmNmText5 = (TextView) findViewById(R.id.map_farm_quest5_text);
		mapFarmNmText5.setText(Html.fromHtml(getString(R.string.map_farm_quest5_text)));
		mapFarmNmText6 = (TextView) findViewById(R.id.map_farm_quest6_text);
		mapFarmNmText6.setText(Html.fromHtml(getString(R.string.map_farm_quest6_text)));
		mapFarmNmText7 = (TextView) findViewById(R.id.map_farm_quest7_text);
		mapFarmNmText7.setText(Html.fromHtml(getString(R.string.map_farm_quest7_text)));
		mapFarmNmText8 = (TextView) findViewById(R.id.map_farm_quest8_text);
		mapFarmNmText8.setText(Html.fromHtml(getString(R.string.map_farm_quest8_text)));
		mapFarmNmText9 = (TextView) findViewById(R.id.map_farm_quest9_text);
		mapFarmNmText9.setText(Html.fromHtml(getString(R.string.map_farm_quest9_text)));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void openFarmMapMarked(View view) {

		Intent intent = new Intent(this, FarmMapMarkedActivity.class);
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
