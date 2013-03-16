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
import de.eyyeyy.tsw_signets.common.maps.ScorchedMapMarkedActivity;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class EgyptScorchedFarmingActivity extends Activity {

	private TextView mapScorchedNmText;
	private TextView mapScorchedLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.egypt_scorched_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapScorchedNmText = (TextView) findViewById(R.id.map_scorched_nm_text);
		mapScorchedNmText.setText(Html.fromHtml(getString(R.string.map_scorched_nm_text)));

		mapScorchedLairText = (TextView) findViewById(R.id.map_scorched_lair_text);
		mapScorchedLairText.setText(Html.fromHtml(getString(R.string.map_scorched_lair_text)));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void openScorchedMapMarked(View view) {

		Intent intent = new Intent(this, ScorchedMapMarkedActivity.class);
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
