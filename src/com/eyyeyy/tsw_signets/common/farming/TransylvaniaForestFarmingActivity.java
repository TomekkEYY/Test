package com.eyyeyy.tsw_signets.common.farming;

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
import com.eyyeyy.tsw_signets.common.maps.ForestMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class TransylvaniaForestFarmingActivity extends Activity {

	private TextView mapForestNmText;
	private TextView mapForestNmText2;
	private TextView mapForestNmText3;
	private TextView mapForestNmText4;
	private TextView mapForestLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_forest_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapForestNmText = (TextView) findViewById(R.id.map_forest_nm_text1);
		mapForestNmText.setText(Html.fromHtml(getString(R.string.map_forest_nm_text1)));
		mapForestNmText2 = (TextView) findViewById(R.id.map_forest_nm_text2);
		mapForestNmText2.setText(Html.fromHtml(getString(R.string.map_forest_nm_text2)));
		mapForestNmText3 = (TextView) findViewById(R.id.map_forest_nm_text3);
		mapForestNmText3.setText(Html.fromHtml(getString(R.string.map_forest_nm_text3)));
		mapForestNmText4 = (TextView) findViewById(R.id.map_forest_nm_text4);
		mapForestNmText4.setText(Html.fromHtml(getString(R.string.map_forest_nm_text4)));

		mapForestLairText = (TextView) findViewById(R.id.map_forest_lair_text);
		mapForestLairText.setText(Html.fromHtml(getString(R.string.map_forest_lair_text)));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void openForestMapMarked(View view) {

		Intent intent = new Intent(this, ForestMapMarkedActivity.class);
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
