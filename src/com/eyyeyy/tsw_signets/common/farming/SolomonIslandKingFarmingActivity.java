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
import com.eyyeyy.tsw_signets.common.maps.KingMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class SolomonIslandKingFarmingActivity extends Activity {

	private TextView mapKingsmouthNmText;
	private TextView mapKingsmouthNmText2;
	private TextView mapKingsmouthLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solomon_island_king_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapKingsmouthNmText = (TextView) findViewById(R.id.map_kingsmouth_nm_text);
		mapKingsmouthNmText.setText(Html.fromHtml(getString(R.string.map_kingsmouth_nm_text)));
		mapKingsmouthNmText2 = (TextView) findViewById(R.id.map_kingsmouth_nm_text2);
		mapKingsmouthNmText2.setText(Html.fromHtml(getString(R.string.map_kingsmouth_nm_text2)));

		mapKingsmouthLairText = (TextView) findViewById(R.id.map_kingsmouth_lair_text);
		mapKingsmouthLairText.setText(Html.fromHtml(getString(R.string.map_kingsmouth_lair_text)));

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
