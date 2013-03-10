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
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.common.maps.ScorchedMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.SunMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class EgyptFarmingActivity extends Activity {

	private ViewGroup linearLayoutFarmingLocations;
	private View viewHolder;

	// Scorched Desert
	private View scorchedFarmingLocationsBlank;

	private TextView mapScorchedNmText;
	private TextView mapScorchedLairText;

	private Button scorchedFarmingLocations;
	private Button scorchedFarmingLocationsClose;

	// City of the Sun God
	private View sunFarmingLocationsBlank;

	private TextView mapSunNmText;
	private TextView mapSunLairText;

	private Button sunFarmingLocations;
	private Button sunFarmingLocationsClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.egypt_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		linearLayoutFarmingLocations = (ViewGroup) findViewById(R.id.ll_egypt_farming_locations);

		// Scorched Desert Views
		scorchedFarmingLocationsBlank = findViewById(R.id.scorched_farming_locations_blank);

		mapScorchedNmText = (TextView) findViewById(R.id.map_scorched_nm_text);
		mapScorchedNmText.setText(Html.fromHtml(getString(R.string.map_scorched_nm_text)));

		mapScorchedLairText = (TextView) findViewById(R.id.map_scorched_lair_text);
		mapScorchedLairText.setText(Html.fromHtml(getString(R.string.map_scorched_lair_text)));

		// Scorched Desert Buttons
		scorchedFarmingLocations = (Button) findViewById(R.id.scorched_farming_locations);
		scorchedFarmingLocationsClose = (Button) findViewById(R.id.scorched_farming_locations_close);

		// Scorched Desert Buttons onClickListener
		scorchedFarmingLocations.setOnClickListener(scorchedFarmingLocationsListener);
		scorchedFarmingLocationsClose.setOnClickListener(scorchedFarmingLocationsCloseListener);

		// City of the Sun God Views
		sunFarmingLocationsBlank = findViewById(R.id.sun_farming_locations_blank);

		mapSunNmText = (TextView) findViewById(R.id.map_sun_nm_text);
		mapSunNmText.setText(Html.fromHtml(getString(R.string.map_sun_nm_text)));

		mapSunLairText = (TextView) findViewById(R.id.map_sun_lair_text);
		mapSunLairText.setText(Html.fromHtml(getString(R.string.map_sun_lair_text)));

		// City of the Sun God Buttons
		sunFarmingLocations = (Button) findViewById(R.id.sun_farming_locations);
		sunFarmingLocationsClose = (Button) findViewById(R.id.sun_farming_locations_close);

		// City of the Sun God Buttons onClickListener
		sunFarmingLocations.setOnClickListener(sunFarmingLocationsListener);
		sunFarmingLocationsClose.setOnClickListener(sunFarmingLocationsCloseListener);
	}

	// Scorched Desert Open Button onCLickListener
	OnClickListener scorchedFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 8; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				scorchedFarmingLocationsClose.setVisibility(View.GONE);
				scorchedFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				scorchedFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 9; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				scorchedFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Scorched Desert Close Button onClickListener
	OnClickListener scorchedFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 8; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			scorchedFarmingLocationsClose.setVisibility(View.GONE);
			scorchedFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// City of the Sun God Open Button onCLickListener
	OnClickListener sunFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(13).getVisibility() == View.VISIBLE) {
				for (int i = 13; i <= 17; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				sunFarmingLocationsClose.setVisibility(View.GONE);
				sunFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				sunFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 13; i <= 18; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				sunFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// City of the Sun God Close Button onClickListener
	OnClickListener sunFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 13; i <= 17; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			sunFarmingLocationsClose.setVisibility(View.GONE);
			sunFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	public void openScorchedMapMarked(View view) {

		Intent intent = new Intent(this, ScorchedMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openSunMapMarked(View view) {

		Intent intent = new Intent(this, SunMapMarkedActivity.class);
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
