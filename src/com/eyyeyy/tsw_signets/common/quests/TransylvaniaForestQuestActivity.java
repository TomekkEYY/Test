package com.eyyeyy.tsw_signets.common.quests;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.common.maps.ForestMapMarkedActivity;

public class TransylvaniaForestQuestActivity extends Activity {

	private TextView mapForestNmText1;
	private TextView mapForestNmText2;
	private TextView mapForestNmText3;
	private TextView mapForestNmText4;
	private TextView mapForestNmText5;
	private TextView mapForestNmText6;
	private TextView mapForestNmText7;
	private TextView mapForestNmText8;
	private TextView mapForestNmText9;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_forest_quest_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		// Basics Views

		mapForestNmText1 = (TextView) findViewById(R.id.map_forest_quest1_text);
		mapForestNmText1.setText(Html.fromHtml(getString(R.string.map_forest_quest1_text)));
		mapForestNmText2 = (TextView) findViewById(R.id.map_forest_quest2_text);
		mapForestNmText2.setText(Html.fromHtml(getString(R.string.map_forest_quest2_text)));
		mapForestNmText3 = (TextView) findViewById(R.id.map_forest_quest3_text);
		mapForestNmText3.setText(Html.fromHtml(getString(R.string.map_forest_quest3_text)));
		mapForestNmText4 = (TextView) findViewById(R.id.map_forest_quest4_text);
		mapForestNmText4.setText(Html.fromHtml(getString(R.string.map_forest_quest4_text)));
		mapForestNmText5 = (TextView) findViewById(R.id.map_forest_quest5_text);
		mapForestNmText5.setText(Html.fromHtml(getString(R.string.map_forest_quest5_text)));
		mapForestNmText6 = (TextView) findViewById(R.id.map_forest_quest6_text);
		mapForestNmText6.setText(Html.fromHtml(getString(R.string.map_forest_quest6_text)));
		mapForestNmText7 = (TextView) findViewById(R.id.map_forest_quest7_text);
		mapForestNmText7.setText(Html.fromHtml(getString(R.string.map_forest_quest7_text)));
		mapForestNmText8 = (TextView) findViewById(R.id.map_forest_quest8_text);
		mapForestNmText8.setText(Html.fromHtml(getString(R.string.map_forest_quest8_text)));
		mapForestNmText9 = (TextView) findViewById(R.id.map_forest_quest9_text);
		mapForestNmText9.setText(Html.fromHtml(getString(R.string.map_forest_quest9_text)));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.transylvania_forest_quest_activity, menu);
		return true;
	}

	public void openForestMapMarked(View view) {

		Intent intent = new Intent(this, ForestMapMarkedActivity.class);
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
