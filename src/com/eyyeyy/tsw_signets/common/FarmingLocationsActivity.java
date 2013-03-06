package com.eyyeyy.tsw_signets.common;

import android.app.Activity;
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

public class FarmingLocationsActivity extends Activity {

	private ViewGroup linearLayoutFarmingLocations;
	private View viewHolder;

	// Basics
	private View basicsFarmingLocationsBlank;

	private TextView basicsFarmingLocationsText;
	private TextView zoneDetailsText;

	private Button basicsFarmingLocationsButton;
	private Button basicsFarmingLocationsButtonClose;

	// Kingsmouth
	private View kingsmouthFarmingLocationsBlank;

	private TextView mapKingsmouthNmText;
	private TextView mapKingsmouthLairText;

	private Button kingsmouthFarmingLocations;
	private Button kingsmouthFarmingLocationsClose;

	// Savage Coast
	private View savageFarmingLocationsBlank;

	private TextView mapSavageNmText;
	private TextView mapSavageLairText;

	private Button savageFarmingLocations;
	private Button savageFarmingLocationsClose;

	// Blue Mountain
	private View blueFarmingLocationsBlank;

	private TextView mapBlueNmText;
	private TextView mapBlueLairText;

	private Button blueFarmingLocations;
	private Button blueFarmingLocationsClose;

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

	// Besieged Farmlands
	private View farmFarmingLocationsBlank;

	private TextView mapFarmNmText;
	private TextView mapFarmNmText2;
	private TextView mapFarmNmText3;
	private TextView mapFarmLairText;

	private Button farmFarmingLocations;
	private Button farmFarmingLocationsClose;

	// Shadowy Forest
	private View forestFarmingLocationsBlank;

	private TextView mapForestNmText;
	private TextView mapForestNmText2;
	private TextView mapForestNmText3;
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
		setContentView(R.layout.farming_locations_activity);

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

		// Kingsmouth Views
		kingsmouthFarmingLocationsBlank = findViewById(R.id.kingsmouth_farming_locations_blank);

		mapKingsmouthNmText = (TextView) findViewById(R.id.map_kingsmouth_nm_text);
		mapKingsmouthNmText.setText(Html.fromHtml(getString(R.string.map_kingsmouth_nm_text)));

		mapKingsmouthLairText = (TextView) findViewById(R.id.map_kingsmouth_lair_text);
		mapKingsmouthLairText.setText(Html.fromHtml(getString(R.string.map_kingsmouth_lair_text)));

		// Kingsmouth Buttons
		kingsmouthFarmingLocations = (Button) findViewById(R.id.kingsmouth_farming_locations);
		kingsmouthFarmingLocationsClose = (Button) findViewById(R.id.kingsmouth_farming_locations_close);

		// Kingsmouth Buttons onClickListener
		kingsmouthFarmingLocations.setOnClickListener(kingsmouthFarmingLocationsListener);
		kingsmouthFarmingLocationsClose.setOnClickListener(kingsmouthFarmingLocationsCloseListener);

		// Savage Coast Views
		savageFarmingLocationsBlank = findViewById(R.id.savage_farming_locations_blank);

		mapSavageNmText = (TextView) findViewById(R.id.map_savage_nm_text);
		mapSavageNmText.setText(Html.fromHtml(getString(R.string.map_savage_nm_text)));

		mapSavageLairText = (TextView) findViewById(R.id.map_savage_lair_text);
		mapSavageLairText.setText(Html.fromHtml(getString(R.string.map_savage_lair_text)));

		// Savage Coast Buttons
		savageFarmingLocations = (Button) findViewById(R.id.savage_farming_locations);
		savageFarmingLocationsClose = (Button) findViewById(R.id.savage_farming_locations_close);

		// Savage Coast Buttons onClickListener
		savageFarmingLocations.setOnClickListener(savageFarmingLocationsListener);
		savageFarmingLocationsClose.setOnClickListener(savageFarmingLocationsCloseListener);

		// Blue Mountain Views
		blueFarmingLocationsBlank = findViewById(R.id.blue_farming_locations_blank);

		mapBlueNmText = (TextView) findViewById(R.id.map_blue_nm_text);
		mapBlueNmText.setText(Html.fromHtml(getString(R.string.map_blue_nm_text)));

		mapBlueLairText = (TextView) findViewById(R.id.map_blue_lair_text);
		mapBlueLairText.setText(Html.fromHtml(getString(R.string.map_blue_lair_text)));

		// Blue Mountain Buttons
		blueFarmingLocations = (Button) findViewById(R.id.blue_farming_locations);
		blueFarmingLocationsClose = (Button) findViewById(R.id.blue_farming_locations_close);

		// Blue Mountain Buttons onClickListener
		blueFarmingLocations.setOnClickListener(blueFarmingLocationsListener);
		blueFarmingLocationsClose.setOnClickListener(blueFarmingLocationsCloseListener);

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

		// Besieged Farmlands Views
		farmFarmingLocationsBlank = findViewById(R.id.farm_farming_locations_blank);

		mapFarmNmText = (TextView) findViewById(R.id.map_farm_nm_text1);
		mapFarmNmText.setText(Html.fromHtml(getString(R.string.map_farm_nm_text1)));
		mapFarmNmText2 = (TextView) findViewById(R.id.map_farm_nm_text2);
		mapFarmNmText2.setText(Html.fromHtml(getString(R.string.map_farm_nm_text2)));
		mapFarmNmText3 = (TextView) findViewById(R.id.map_farm_nm_text3);
		mapFarmNmText3.setText(Html.fromHtml(getString(R.string.map_farm_nm_text3)));

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

	// Kingsmouth Open Button onCLickListener
	OnClickListener kingsmouthFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(12).getVisibility() == View.VISIBLE) {
				for (int i = 11; i <= 15; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				kingsmouthFarmingLocationsClose.setVisibility(View.GONE);
				kingsmouthFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				kingsmouthFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 11; i <= 16; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				kingsmouthFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Kingsmouth Close Button onClickListener
	OnClickListener kingsmouthFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 11; i <= 15; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			kingsmouthFarmingLocationsClose.setVisibility(View.GONE);
			kingsmouthFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// Savage Coast Open Button onCLickListener
	OnClickListener savageFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(21).getVisibility() == View.VISIBLE) {
				for (int i = 20; i <= 24; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				savageFarmingLocationsClose.setVisibility(View.GONE);
				savageFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				savageFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 20; i <= 25; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				savageFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Savage Coast Close Button onClickListener
	OnClickListener savageFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 20; i <= 24; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			savageFarmingLocationsClose.setVisibility(View.GONE);
			savageFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// Blue Mountain Open Button onCLickListener
	OnClickListener blueFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(32).getVisibility() == View.VISIBLE) {
				for (int i = 29; i <= 33; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				blueFarmingLocationsClose.setVisibility(View.GONE);
				blueFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				blueFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 29; i <= 34; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				blueFarmingLocationsClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Blue Mountain Close Button onClickListener
	OnClickListener blueFarmingLocationsCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 29; i <= 33; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			blueFarmingLocationsClose.setVisibility(View.GONE);
			blueFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// Scorched Desert Open Button onCLickListener
	OnClickListener scorchedFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(40).getVisibility() == View.VISIBLE) {
				for (int i = 38; i <= 42; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				scorchedFarmingLocationsClose.setVisibility(View.GONE);
				scorchedFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				scorchedFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 38; i <= 43; i++) {
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

			for (int i = 38; i <= 42; i++) {
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
			if (linearLayoutFarmingLocations.getChildAt(49).getVisibility() == View.VISIBLE) {
				for (int i = 47; i <= 51; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				sunFarmingLocationsClose.setVisibility(View.GONE);
				sunFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				sunFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 47; i <= 52; i++) {
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

			for (int i = 47; i <= 51; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			sunFarmingLocationsClose.setVisibility(View.GONE);
			sunFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	// Besieged Farmlands Open Button onCLickListener
	OnClickListener farmFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(59).getVisibility() == View.VISIBLE) {
				for (int i = 56; i <= 66; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				farmFarmingLocationsClose.setVisibility(View.GONE);
				farmFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				farmFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 56; i <= 67; i++) {
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

			for (int i = 56; i <= 66; i++) {
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
			if (linearLayoutFarmingLocations.getChildAt(74).getVisibility() == View.VISIBLE) {
				for (int i = 71; i <= 81; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				forestFarmingLocationsClose.setVisibility(View.GONE);
				forestFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				forestFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 71; i <= 82; i++) {
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

			for (int i = 71; i <= 81; i++) {
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
			if (linearLayoutFarmingLocations.getChildAt(89).getVisibility() == View.VISIBLE) {
				for (int i = 86; i <= 99; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				fangsFarmingLocationsClose.setVisibility(View.GONE);
				fangsFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				fangsFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 86; i <= 100; i++) {
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

			for (int i = 86; i <= 99; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			fangsFarmingLocationsClose.setVisibility(View.GONE);
			fangsFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
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
