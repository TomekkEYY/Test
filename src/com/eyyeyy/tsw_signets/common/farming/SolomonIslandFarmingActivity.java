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
import com.eyyeyy.tsw_signets.common.maps.BlueMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.KingMapMarkedActivity;
import com.eyyeyy.tsw_signets.common.maps.SavageMapMarkedActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class SolomonIslandFarmingActivity extends Activity {

	private ViewGroup linearLayoutFarmingLocations;
	private View viewHolder;

	// Kingsmouth
	private View kingsmouthFarmingLocationsBlank;

	private TextView mapKingsmouthNmText;
	private TextView mapKingsmouthNmText2;
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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.solomon_island_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		linearLayoutFarmingLocations = (ViewGroup) findViewById(R.id.ll_solomon_farming_locations);

		// Kingsmouth Views
		kingsmouthFarmingLocationsBlank = findViewById(R.id.kingsmouth_farming_locations_blank);

		mapKingsmouthNmText = (TextView) findViewById(R.id.map_kingsmouth_nm_text);
		mapKingsmouthNmText.setText(Html.fromHtml(getString(R.string.map_kingsmouth_nm_text)));
		mapKingsmouthNmText2 = (TextView) findViewById(R.id.map_kingsmouth_nm_text2);
		mapKingsmouthNmText2.setText(Html.fromHtml(getString(R.string.map_kingsmouth_nm_text2)));

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
	}

	// Kingsmouth Open Button onCLickListener
	OnClickListener kingsmouthFarmingLocationsListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutFarmingLocations.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 11; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				kingsmouthFarmingLocationsClose.setVisibility(View.GONE);
				kingsmouthFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				kingsmouthFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 12; i++) {
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

			for (int i = 4; i <= 11; i++) {
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
			if (linearLayoutFarmingLocations.getChildAt(17).getVisibility() == View.VISIBLE) {
				for (int i = 16; i <= 20; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				savageFarmingLocationsClose.setVisibility(View.GONE);
				savageFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				savageFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 16; i <= 21; i++) {
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

			for (int i = 16; i <= 20; i++) {
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
			if (linearLayoutFarmingLocations.getChildAt(26).getVisibility() == View.VISIBLE) {
				for (int i = 25; i <= 29; i++) {
					viewHolder = linearLayoutFarmingLocations.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				blueFarmingLocationsClose.setVisibility(View.GONE);
				blueFarmingLocationsBlank.setVisibility(View.VISIBLE);
			} else {
				blueFarmingLocationsBlank.setVisibility(View.GONE);
				for (int i = 25; i <= 30; i++) {
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

			for (int i = 25; i <= 29; i++) {
				viewHolder = linearLayoutFarmingLocations.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			blueFarmingLocationsClose.setVisibility(View.GONE);
			blueFarmingLocationsBlank.setVisibility(View.VISIBLE);
		}
	};

	public void openKingMapMarked(View view) {

		Intent intent = new Intent(this, KingMapMarkedActivity.class);
		startActivity(intent);
	}

	public void openSavageMapMarked(View view) {

		Intent intent = new Intent(this, SavageMapMarkedActivity.class);
		startActivity(intent);
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
