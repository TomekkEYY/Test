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
import com.eyyeyy.tsw_signets.common.maps.FangsMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class TransylvaniaFangsFarmingActivity extends Activity {

	private TextView mapFangsNmText;
	private TextView mapFangsNmText2;
	private TextView mapFangsNmText3;
	private TextView mapFangsNmText4;
	private TextView mapFangsLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_fangs_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapFangsNmText = (TextView) findViewById(R.id.map_fangs_nm_text1);
		mapFangsNmText.setText(Html.fromHtml(getString(R.string.map_fangs_nm_text1)));
		mapFangsNmText2 = (TextView) findViewById(R.id.map_fangs_nm_text2);
		mapFangsNmText2.setText(Html.fromHtml(getString(R.string.map_fangs_nm_text2)));
		mapFangsNmText3 = (TextView) findViewById(R.id.map_fangs_nm_text3);
		mapFangsNmText3.setText(Html.fromHtml(getString(R.string.map_fangs_nm_text3)));
		mapFangsNmText4 = (TextView) findViewById(R.id.map_fangs_nm_text4);
		mapFangsNmText4.setText(Html.fromHtml(getString(R.string.map_fangs_nm_text4)));

		mapFangsLairText = (TextView) findViewById(R.id.map_fangs_lair_text);
		mapFangsLairText.setText(Html.fromHtml(getString(R.string.map_fangs_lair_text)));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
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
