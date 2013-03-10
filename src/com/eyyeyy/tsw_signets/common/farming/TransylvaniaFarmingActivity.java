package com.eyyeyy.tsw_signets.common.farming;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.common.maps.FangsMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.FarmMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.ForestMapMarkedActivity;

public class TransylvaniaFarmingActivity extends Activity {

	private ViewGroup linearLayoutFarmingLocations;
	private View viewHolder;

	// Besieged Farmlands
	private View farmFarmingLocationsBlank;

	private TextView mapFarmNmText;
	private TextView mapFarmNmText2;
	private TextView mapFarmNmText3;
	private TextView mapFarmNmText4;
	private TextView mapFarmLairText;

	private Button farmFarmingLocations;
	private Button farmFarmingLocationsClose;

	// Shadowy Forest
	private View forestFarmingLocationsBlank;

	private TextView mapForestNmText;
	private TextView mapForestNmText2;
	private TextView mapForestNmText3;
	private TextView mapForestNmText4;
	private TextView mapForestLairText;

	private Button forestFarmingLocations;
	private Button forestFarmingLocationsClose;

	// Carpathian Fangs
	private View fangsFarmingLocationsBlank;

	private TextView mapFangsNmText;
	private TextView mapFangsNmText2;
	private TextView mapFangsNmText3;
	private TextView mapFangsNmText4;
	private TextView mapFangsLairText;

	private Button fangsFarmingLocations;
	private Button fangsFarmingLocationsClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.transylvania_farming_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		linearLayoutFarmingLocations = (ViewGroup) findViewById(R.id.ll_trans_farming_locations);

		// Besieged Farmlands Views
		farmFarmingLocationsBlank = findViewById(R.id.farm_farming_locations_blank);

		mapFarmNmText = (TextView) findViewById(R.id.map_farm_nm_text1);
		mapFarmNmText.setText(Html.fromHtml(getString(R.string.map_farm_nm_text1)));
		mapFarmNmText2 = (TextView) findViewById(R.id.map_farm_nm_text2);
		mapFarmNmText2.setText(Html.fromHtml(getString(R.string.map_farm_nm_text2)));
		mapFarmNmText3 = (TextView) findViewById(R.id.map_farm_nm_text3);
		mapFarmNmText3.setText(Html.fromHtml(getString(R.string.map_farm_nm_text3)));
		mapFarmNmText4 = (TextView) findViewById(R.id.map_farm_nm_text4);
		mapFarmNmText4.setText(Html.fromHtml(getString(R.string.map_farm_nm_text4)));

		mapFarmLairText = (TextView) findViewById(R.id.map_farm_lair_text);
		mapFarmLairText.setText(Html.fromHtml(getString(R.string.map_farm_lair_text)));

		// Besieged Farmlands Buttons
		farmFarmingLocations = (Button) findViewById(R.id.farm_farming_locations);
		farmFarmingLocationsClose = (Button) findViewById(R.id.farm_farming_locations_close);

		// Besieged Farmlands Buttons onClickListener
		farmFarmingLocations.setOnClickListener(farmFarmingLocationsListener);
		farmFarmingLocationsClose.setOnClickListener(farmFarmingLocationsCloseListener);

		// Shadowy Forest Views
		forestFarmingLocationsBlank = findViewById(R.id.forest_farming_locations_blank);

		mapForestNmText = (TextView) findViewById(R.id.map_forest_nm_text1);
		mapForestNmText.setText(Html.fromHtml(getString(R.string.map_forest_nm_text1)));
		mapForestNmText2 = (TextView) findViewById(R.id.map_forest_nm_text2);
		mapForestNmText2.setText(Html.fromHtml(getString(R.string.map_forest_nm_text2)));
		mapForestNmText3 = (TextView) findViewById(R.id.map_forest_nm_text3);
		mapForestNmText3.setText(Html.fromHtml(getString(R.string.map_forest_nm_text3)));
		mapForestNmText4 = (TextView) findViewById(R.id.map_forest_nm_text4);
		mapForestNmText4.setText(Html.fromHtml(getString(R.string.map_forest_nm_text4)));

		mapForestLairText = (TextView) findViewById(R.id.map_forest_lair_text);
		mapForestLairText.setText(Html.fromHtml(getString(R.string.map_forest_lair_text)));

		// Shadowy Forest Buttons
		forestFarmingLocations = (Button) findViewById(R.id.forest_farming_locations);
		forestFarmingLocationsClose = (Button) findViewById(R.id.forest_farming_locations_close);

		// Shadowy Forest Buttons onClickListener
		forestFarmingLocations.setOnClickListener(forestFarmingLocationsListener);
		forestFarmingLocationsClose.setOnClickListener(forestFarmingLocationsCloseListener);

		// Carpathian Fangs Views
		fangsFarmingLocationsBlank = findViewById(R.id.fangs_farming_locations_blank);

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

		// Carpathian Fangs Buttons
		fangsFarmingLocations = (Button) findViewById(R.id.fangs_farming_locations);
		fangsFarmingLocationsClose = (Button) findViewById(R.id.fangs_farming_locations_close);

		// Carpathian Fangs Buttons onClickListener
		fangsFarmingLocations.setOnClickListener(fangsFarmingLocationsListener);
		fangsFarmingLocationsClose.setOnClickListener(fangsFarmingLocationsCloseListener);

	};

	// Besieged Farmlands Open Button onCLickListener
	OnClickListener farmFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 17; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				farmFarmingLocationsClose.setVisibility(View.GONE);
				farmFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				farmFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 18; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				farmFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Besieged Farmlands Close Button onClickListener
	OnClickListener farmFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 17; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			farmFarmingLocationsClose.setVisibility(View.GONE);
			farmFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// Shadowy Forest Open Button onCLickListener
	OnClickListener forestFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(22).getVisibility() == View.VISIBLE) {
				for (int i = 22; i <= 35; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				forestFarmingLocationsClose.setVisibility(View.GONE);
				forestFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				forestFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 22; i <= 36; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				forestFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Shadowy Forest Close Button onClickListener
	OnClickListener forestFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 22; i <= 35; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			forestFarmingLocationsClose.setVisibility(View.GONE);
			forestFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// Carpathian Fangs Open Button onCLickListener
	OnClickListener fangsFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(40).getVisibility() == View.VISIBLE) {
				for (int i = 40; i <= 53; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				fangsFarmingLocationsClose.setVisibility(View.GONE);
				fangsFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				fangsFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 40; i <= 54; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				fangsFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Carpathian Fangs Close Button onClickListener
	OnClickListener fangsFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 40; i <= 53; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			fangsFarmingLocationsClose.setVisibility(View.GONE);
			fangsFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.transylvania_farming_activity, menu);
		return true;
	}

	public void openFarmMapMarked(View view) {

		Intent intent = new Intent(this, FarmMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openForestMapMarked(View view) {

		Intent intent = new Intent(this, ForestMapMarkedActivity.class);
		startActivity(intent);
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
