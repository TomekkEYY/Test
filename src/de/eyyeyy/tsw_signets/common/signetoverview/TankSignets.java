package de.eyyeyy.tsw_signets.common.signetoverview;

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
import de.eyyeyy.tsw_signets.MainActivity;
import de.eyyeyy.tsw_signets.R;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class TankSignets extends Activity {

	private ViewGroup linearLayoutTankSignets;
	private View viewHolder;

	// Head
	private View tankSignetsHeadBlank;

	private TextView tankSignetsHeadText;

	private Button tankSignetsHeadButton;
	private Button tankSignetsHeadButtonClose;

	// Head / Weapon
	private View tankSignetsHeadWeaponBlank;

	private TextView tankSignetsHeadWeaponText;

	private Button tankSignetsHeadWeaponButton;
	private Button tankSignetsHeadWeaponButtonClose;

	// Major
	private View tankSignetsMajorBlank;

	private TextView tankSignetsMajorText;

	private Button tankSignetsMajorButton;
	private Button tankSignetsMajorButtonClose;

	// Minor
	private View tankSignetsMinorBlank;

	private TextView tankSignetsMinorText;

	private Button tankSignetsMinorButton;
	private Button tankSignetsMinorButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tank_signets_activity);
	}

	protected void onStart() {
		super.onStart();
		linearLayoutTankSignets = (ViewGroup) findViewById(R.id.ll_tank_signets);

		// Head Views
		tankSignetsHeadBlank = findViewById(R.id.tank_signets_head_blank);

		tankSignetsHeadText = (TextView) findViewById(R.id.tank_signets_head_text);
		tankSignetsHeadText.setText(Html.fromHtml(getString(R.string.tank_signets_head_text)));

		// Head Buttons
		tankSignetsHeadButton = (Button) findViewById(R.id.tank_signets_head);
		tankSignetsHeadButtonClose = (Button) findViewById(R.id.tank_signets_head_close);

		// Head Buttons onClickListener
		tankSignetsHeadButton.setOnClickListener(tankSignetsHeadButtonListener);
		tankSignetsHeadButtonClose.setOnClickListener(tankSignetsHeadButtonCloseListener);

		// Head / Weapon Views
		tankSignetsHeadWeaponBlank = findViewById(R.id.tank_signets_head_weapon_blank);

		tankSignetsHeadWeaponText = (TextView) findViewById(R.id.tank_signets_head_weapon_text);
		tankSignetsHeadWeaponText.setText(Html.fromHtml(getString(R.string.tank_signets_head_weapon_text)));

		// Head / Weapon Buttons
		tankSignetsHeadWeaponButton = (Button) findViewById(R.id.tank_signets_head_weapon);
		tankSignetsHeadWeaponButtonClose = (Button) findViewById(R.id.tank_signets_head_weapon_close);

		// Head / Weapon Buttons onClickListener
		tankSignetsHeadWeaponButton.setOnClickListener(tankSignetsHeadWeaponButtonListener);
		tankSignetsHeadWeaponButtonClose.setOnClickListener(tankSignetsHeadWeaponButtonCloseListener);

		// Major Views
		tankSignetsMajorBlank = findViewById(R.id.tank_signets_major_blank);

		tankSignetsMajorText = (TextView) findViewById(R.id.tank_signets_major_text);
		tankSignetsMajorText.setText(Html.fromHtml(getString(R.string.tank_signets_major_text)));

		// Major Buttons
		tankSignetsMajorButton = (Button) findViewById(R.id.tank_signets_major);
		tankSignetsMajorButtonClose = (Button) findViewById(R.id.tank_signets_major_close);

		// Major Buttons onClickListener
		tankSignetsMajorButton.setOnClickListener(tankSignetsMajorButtonListener);
		tankSignetsMajorButtonClose.setOnClickListener(tankSignetsMajorButtonCloseListener);

		// Minor Views
		tankSignetsMinorBlank = findViewById(R.id.tank_signets_minor_blank);

		tankSignetsMinorText = (TextView) findViewById(R.id.tank_signets_minor_text);
		tankSignetsMinorText.setText(Html.fromHtml(getString(R.string.tank_signets_minor_text)));

		// Minor Buttons
		tankSignetsMinorButton = (Button) findViewById(R.id.tank_signets_minor);
		tankSignetsMinorButtonClose = (Button) findViewById(R.id.tank_signets_minor_close);

		// Minor Buttons onClickListener
		tankSignetsMinorButton.setOnClickListener(tankSignetsMinorButtonListener);
		tankSignetsMinorButtonClose.setOnClickListener(tankSignetsMinorButtonCloseListener);
	}

	// Head Open Button onCLickListener
	OnClickListener tankSignetsHeadButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutTankSignets.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 5; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				tankSignetsHeadButtonClose.setVisibility(View.GONE);
				tankSignetsHeadBlank.setVisibility(View.VISIBLE);
			} else {
				tankSignetsHeadBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				tankSignetsHeadButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head Close Button onClickListener
	OnClickListener tankSignetsHeadButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 5; i++) {
				viewHolder = linearLayoutTankSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			tankSignetsHeadButtonClose.setVisibility(View.GONE);
			tankSignetsHeadBlank.setVisibility(View.VISIBLE);
		}
	};

	// Head / Weapon Open Button onCLickListener
	OnClickListener tankSignetsHeadWeaponButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutTankSignets.getChildAt(9).getVisibility() == View.VISIBLE) {
				for (int i = 9; i <= 10; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				tankSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
				tankSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
			} else {
				tankSignetsHeadWeaponBlank.setVisibility(View.GONE);
				for (int i = 9; i <= 11; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				tankSignetsHeadWeaponButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head / Weapon Close Button onClickListener
	OnClickListener tankSignetsHeadWeaponButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 9; i <= 10; i++) {
				viewHolder = linearLayoutTankSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			tankSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
			tankSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
		}
	};

	// Major Open Button onCLickListener
	OnClickListener tankSignetsMajorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutTankSignets.getChildAt(14).getVisibility() == View.VISIBLE) {
				for (int i = 14; i <= 15; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				tankSignetsMajorButtonClose.setVisibility(View.GONE);
				tankSignetsMajorBlank.setVisibility(View.VISIBLE);
			} else {
				tankSignetsMajorBlank.setVisibility(View.GONE);
				for (int i = 14; i <= 16; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				tankSignetsMajorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Major Close Button onClickListener
	OnClickListener tankSignetsMajorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 14; i <= 15; i++) {
				viewHolder = linearLayoutTankSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			tankSignetsMajorButtonClose.setVisibility(View.GONE);
			tankSignetsMajorBlank.setVisibility(View.VISIBLE);
		}
	};

	// Minor Open Button onCLickListener
	OnClickListener tankSignetsMinorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutTankSignets.getChildAt(19).getVisibility() == View.VISIBLE) {
				for (int i = 19; i <= 20; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				tankSignetsMinorButtonClose.setVisibility(View.GONE);
				tankSignetsMinorBlank.setVisibility(View.VISIBLE);
			} else {
				tankSignetsMinorBlank.setVisibility(View.GONE);
				for (int i = 19; i <= 21; i++) {
					viewHolder = linearLayoutTankSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				tankSignetsMinorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Minor Close Button onClickListener
	OnClickListener tankSignetsMinorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 19; i <= 20; i++) {
				viewHolder = linearLayoutTankSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			tankSignetsMinorButtonClose.setVisibility(View.GONE);
			tankSignetsMinorBlank.setVisibility(View.VISIBLE);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
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
