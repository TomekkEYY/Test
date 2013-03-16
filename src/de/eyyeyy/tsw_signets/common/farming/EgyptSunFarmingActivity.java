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
import de.eyyeyy.tsw_signets.common.maps.SunMapMarkedActivity;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class EgyptSunFarmingActivity extends Activity {

	private TextView mapSunNmText;
	private TextView mapSunLairText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.egypt_sun_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		mapSunNmText = (TextView) findViewById(R.id.map_sun_nm_text);
		mapSunNmText.setText(Html.fromHtml(getString(R.string.map_sun_nm_text)));

		mapSunLairText = (TextView) findViewById(R.id.map_sun_lair_text);
		mapSunLairText.setText(Html.fromHtml(getString(R.string.map_sun_lair_text)));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void openSunMapMarked(View view) {

		Intent intent = new Intent(this, SunMapMarkedActivity.class);
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
