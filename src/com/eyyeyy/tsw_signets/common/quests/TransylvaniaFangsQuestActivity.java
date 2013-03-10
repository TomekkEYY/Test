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
import com.eyyeyy.tsw_signets.common.maps.FangsMapMarkedActivity;

public class TransylvaniaFangsQuestActivity extends Activity {

	private TextView mapFangsNmText1;
	private TextView mapFangsNmText2;
	private TextView mapFangsNmText3;
	private TextView mapFangsNmText4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_fangs_quest_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		// Basics Views

		mapFangsNmText1 = (TextView) findViewById(R.id.map_fangs_quest1_text);
		mapFangsNmText1.setText(Html.fromHtml(getString(R.string.map_fangs_quest1_text)));
		mapFangsNmText2 = (TextView) findViewById(R.id.map_fangs_quest2_text);
		mapFangsNmText2.setText(Html.fromHtml(getString(R.string.map_fangs_quest2_text)));
		mapFangsNmText3 = (TextView) findViewById(R.id.map_fangs_quest3_text);
		mapFangsNmText3.setText(Html.fromHtml(getString(R.string.map_fangs_quest3_text)));
		mapFangsNmText4 = (TextView) findViewById(R.id.map_fangs_quest4_text);
		mapFangsNmText4.setText(Html.fromHtml(getString(R.string.map_fangs_quest4_text)));

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.transylvania_fangs_quest_activity, menu);
		return true;
	}

	public void openFangsMapMarked(View view) {

		Intent intent = new Intent(this, FangsMapMarkedActivity.class);
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
