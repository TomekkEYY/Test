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
import com.eyyeyy.tsw_signets.common.maps.FarmMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class TransylvaniaFarmFarmingActivity extends Activity {
	private TextView mapFarmNmText;
	private TextView mapFarmNmText2;
	private TextView mapFarmNmText3;
	private TextView mapFarmNmText4;
	private TextView mapFarmLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_farm_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapFarmNmText = (TextView) findViewById(R.id.map_farm_nm_text1);
		mapFarmNmText.setText(Html.fromHtml(getString(R.string.map_farm_nm_text1)));
		mapFarmNmText2 = (TextView) findViewById(R.id.map_farm_nm_text2);
		mapFarmNmText2.setText(Html.fromHtml(getString(R.string.map_farm_nm_text2)));
		mapFarmNmText3 = (TextView) findViewById(R.id.map_farm_nm_text3);
		mapFarmNmText3.setText(Html.fromHtml(getString(R.string.map_farm_nm_text3)));
		mapFarmNmText4 = (TextView) findViewById(R.id.map_farm_nm_text4);
		mapFarmNmText4.setText(Html.fromHtml(getString(R.string.map_farm_nm_text4)));

		mapFarmLairText = (TextView) findViewById(R.id.map_farm_lair_text);
		mapFarmLairText.setText(Html.fromHtml(getString(R.string.map_farm_lair_text)));

	}

	public void openFarmMapMarked(View view) {

		Intent intent = new Intent(this, FarmMapMarkedActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
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
