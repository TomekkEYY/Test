package com.eyyeyy.tsw_signets.common;

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
import com.eyyeyy.tsw_signets.common.farming.EgyptScorchedFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.EgyptSunFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.SolomonIslandBlueFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.SolomonIslandKingFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.SolomonIslandSavageFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.TransylvaniaFangsFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.TransylvaniaFarmFarmingActivity;
import com.eyyeyy.tsw_signets.common.farming.TransylvaniaForestFarmingActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class FarmingLocationsActivity extends Activity {

	private ViewGroup linearLayoutFarmingLocations;
	private View viewHolder;

	// Basics
	private View basicsFarmingLocationsBlank;

	private TextView basicsFarmingLocationsText;
	private TextView zoneDetailsText;

	private Button basicsFarmingLocationsButton;
	private Button basicsFarmingLocationsButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.farming_locations_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		linearLayoutFarmingLocations = (ViewGroup) findViewById(R.id.ll_farming_locations);

		// Basics Views
		basicsFarmingLocationsBlank = findViewById(R.id.basics_farming_locations_blank);

		basicsFarmingLocationsText = (TextView) findViewById(R.id.basics_farming_locations_text);
		basicsFarmingLocationsText.setText(Html.fromHtml(getString(R.string.basics_farming_locations_text)));
		zoneDetailsText = (TextView) findViewById(R.id.zone_details_text);
		zoneDetailsText.setText(Html.fromHtml(getString(R.string.zone_details_text)));

		// Basics Button
		basicsFarmingLocationsButton = (Button) findViewById(R.id.basics_farming_locations);
		basicsFarmingLocationsButtonClose = (Button) findViewById(R.id.visibility_farming_locations_close);

		// Basics Buttons onClickListener
		basicsFarmingLocationsButton.setOnClickListener(basicsFarmingLocationsButtonListener);
		basicsFarmingLocationsButtonClose.setOnClickListener(basicsFarmingLocationsButtonCloseListener);
	}

	// Basics Open Button onCLickListener
	OnClickListener basicsFarmingLocationsButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				basicsFarmingLocationsButtonClose.setVisibility(View.GONE);
				basicsFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				basicsFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 7; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				basicsFarmingLocationsButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Basics Close Button onClickListener
	OnClickListener basicsFarmingLocationsButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 6; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			basicsFarmingLocationsButtonClose.setVisibility(View.GONE);
			basicsFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void startSolomonKingFarm(View view) {

		Intent intent = new Intent(this, SolomonIslandKingFarmingActivity.class);
		startActivity(intent);
	}

	public void startSolomonSavageFarm(View view) {

		Intent intent = new Intent(this, SolomonIslandSavageFarmingActivity.class);
		startActivity(intent);
	}

	public void startSolomonBlueFarm(View view) {

		Intent intent = new Intent(this, SolomonIslandBlueFarmingActivity.class);
		startActivity(intent);
	}

	public void startEgyptScorchedFarm(View view) {

		Intent intent = new Intent(this, EgyptScorchedFarmingActivity.class);
		startActivity(intent);
	}

	public void startEgyptSunFarm(View view) {

		Intent intent = new Intent(this, EgyptSunFarmingActivity.class);
		startActivity(intent);
	}

	public void startTransFarmFarm(View view) {

		Intent intent = new Intent(this, TransylvaniaFarmFarmingActivity.class);
		startActivity(intent);
	}

	public void startTransForestFarm(View view) {

		Intent intent = new Intent(this, TransylvaniaForestFarmingActivity.class);
		startActivity(intent);
	}

	public void startTransFangsFarm(View view) {

		Intent intent = new Intent(this, TransylvaniaFangsFarmingActivity.class);
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
