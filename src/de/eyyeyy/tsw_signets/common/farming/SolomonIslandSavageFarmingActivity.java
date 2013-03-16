package de.eyyeyy.tsw_signets.common.farming;

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
import de.eyyeyy.tsw_signets.common.maps.SavageMapMarkedActivity;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class SolomonIslandSavageFarmingActivity extends Activity {

	private TextView mapSavageNmText;
	private TextView mapSavageLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solomon_island_savage_farming_activity);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	@Override
	protected void onStart() {
		super.onStart();

		mapSavageNmText = (TextView) findViewById(R.id.map_savage_nm_text);
		mapSavageNmText.setText(Html.fromHtml(getString(R.string.map_savage_nm_text)));

		mapSavageLairText = (TextView) findViewById(R.id.map_savage_lair_text);
		mapSavageLairText.setText(Html.fromHtml(getString(R.string.map_savage_lair_text)));

	}

	public void openSavageMapMarked(View view) {

		Intent intent = new Intent(this, SavageMapMarkedActivity.class);
		startActivity(intent);
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
