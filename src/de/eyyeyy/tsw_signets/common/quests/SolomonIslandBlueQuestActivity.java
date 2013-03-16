package de.eyyeyy.tsw_signets.common.quests;

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
import de.eyyeyy.tsw_signets.MainActivity;
import de.eyyeyy.tsw_signets.R;
import de.eyyeyy.tsw_signets.common.maps.BlueMapMarkedActivity;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class SolomonIslandBlueQuestActivity extends Activity {

	private TextView mapBlueNmText;
	private TextView mapBlueNmText2;
	private TextView mapBlueNmText3;
	private TextView mapBlueNmText4;
	private TextView mapBlueNmText5;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solomon_island_blue_quest_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapBlueNmText = (TextView) findViewById(R.id.map_blue_quest1_text);
		mapBlueNmText.setText(Html.fromHtml(getString(R.string.map_blue_quest1_text)));
		mapBlueNmText2 = (TextView) findViewById(R.id.map_blue_quest2_text);
		mapBlueNmText2.setText(Html.fromHtml(getString(R.string.map_blue_quest2_text)));
		mapBlueNmText3 = (TextView) findViewById(R.id.map_blue_quest3_text);
		mapBlueNmText3.setText(Html.fromHtml(getString(R.string.map_blue_quest3_text)));
		mapBlueNmText4 = (TextView) findViewById(R.id.map_blue_quest4_text);
		mapBlueNmText4.setText(Html.fromHtml(getString(R.string.map_blue_quest4_text)));
		mapBlueNmText5 = (TextView) findViewById(R.id.map_blue_quest5_text);
		mapBlueNmText5.setText(Html.fromHtml(getString(R.string.map_blue_quest5_text)));

	}

	public void openBlueMapMarked(View view) {

		Intent intent = new Intent(this, BlueMapMarkedActivity.class);
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void showInfoMenu(MenuItem item) {
		ShowInfo.showInfoDialog(this);
	}

	public void openRateAndCommentMenu(MenuItem item) {
		startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + MainActivity.APP_PNAME)));
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
