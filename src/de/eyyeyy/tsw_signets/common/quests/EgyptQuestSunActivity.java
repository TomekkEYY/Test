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
import de.eyyeyy.tsw_signets.common.maps.SunMapMarkedActivity;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class EgyptQuestSunActivity extends Activity {

	// City of the Sun God

	private TextView mapSunNmText1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.egypt_quest_sun_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		// Sun Views

		mapSunNmText1 = (TextView) findViewById(R.id.map_sun_quest1_text);
		mapSunNmText1.setText(Html.fromHtml(getString(R.string.map_sun_quest1_text)));

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
