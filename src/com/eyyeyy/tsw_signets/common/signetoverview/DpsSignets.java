package com.eyyeyy.tsw_signets.common.signetoverview;

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
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class DpsSignets extends Activity {

	private ViewGroup linearLayoutDpsSignets;
	private View viewHolder;

	// Head
	private View dpsSignetsHeadBlank;

	private TextView dpsSignetsHeadText;

	private Button dpsSignetsHeadButton;
	private Button dpsSignetsHeadButtonClose;

	// Head / Weapon
	private View dpsSignetsHeadWeaponBlank;

	private TextView dpsSignetsHeadWeaponText;

	private Button dpsSignetsHeadWeaponButton;
	private Button dpsSignetsHeadWeaponButtonClose;

	// Major
	private View dpsSignetsMajorBlank;

	private TextView dpsSignetsMajorText;

	private Button dpsSignetsMajorButton;
	private Button dpsSignetsMajorButtonClose;

	// Minor
	private View dpsSignetsMinorBlank;

	private TextView dpsSignetsMinorText;

	private Button dpsSignetsMinorButton;
	private Button dpsSignetsMinorButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dps_signets_activity);

	}

	protected void onStart() {
		super.onStart();
		linearLayoutDpsSignets = (ViewGroup) findViewById(R.id.ll_dps_signets);

		// Head Views
		dpsSignetsHeadBlank = findViewById(R.id.dps_signets_head_blank);

		dpsSignetsHeadText = (TextView) findViewById(R.id.dps_signets_head_text);
		dpsSignetsHeadText.setText(Html.fromHtml(getString(R.string.dps_signets_head_text)));

		// Head Buttons
		dpsSignetsHeadButton = (Button) findViewById(R.id.dps_signets_head);
		dpsSignetsHeadButtonClose = (Button) findViewById(R.id.dps_signets_head_close);

		// Head Buttons onClickListener
		dpsSignetsHeadButton.setOnClickListener(dpsSignetsHeadButtonListener);
		dpsSignetsHeadButtonClose.setOnClickListener(dpsSignetsHeadButtonCloseListener);

		// Head / Weapon Views
		dpsSignetsHeadWeaponBlank = findViewById(R.id.dps_signets_head_weapon_blank);

		dpsSignetsHeadWeaponText = (TextView) findViewById(R.id.dps_signets_head_weapon_text);
		dpsSignetsHeadWeaponText.setText(Html.fromHtml(getString(R.string.dps_signets_head_weapon_text)));

		// Head / Weapon Buttons
		dpsSignetsHeadWeaponButton = (Button) findViewById(R.id.dps_signets_head_weapon);
		dpsSignetsHeadWeaponButtonClose = (Button) findViewById(R.id.dps_signets_head_weapon_close);

		// Head / Weapon Buttons onClickListener
		dpsSignetsHeadWeaponButton.setOnClickListener(dpsSignetsHeadWeaponButtonListener);
		dpsSignetsHeadWeaponButtonClose.setOnClickListener(dpsSignetsHeadWeaponButtonCloseListener);

		// Major Views
		dpsSignetsMajorBlank = findViewById(R.id.dps_signets_major_blank);

		dpsSignetsMajorText = (TextView) findViewById(R.id.dps_signets_major_text);
		dpsSignetsMajorText.setText(Html.fromHtml(getString(R.string.dps_signets_major_text)));

		// Major Buttons
		dpsSignetsMajorButton = (Button) findViewById(R.id.dps_signets_major);
		dpsSignetsMajorButtonClose = (Button) findViewById(R.id.dps_signets_major_close);

		// Major Buttons onClickListener
		dpsSignetsMajorButton.setOnClickListener(dpsSignetsMajorButtonListener);
		dpsSignetsMajorButtonClose.setOnClickListener(dpsSignetsMajorButtonCloseListener);

		// Minor Views
		dpsSignetsMinorBlank = findViewById(R.id.dps_signets_minor_blank);

		dpsSignetsMinorText = (TextView) findViewById(R.id.dps_signets_minor_text);
		dpsSignetsMinorText.setText(Html.fromHtml(getString(R.string.dps_signets_minor_text)));

		// Minor Buttons
		dpsSignetsMinorButton = (Button) findViewById(R.id.dps_signets_minor);
		dpsSignetsMinorButtonClose = (Button) findViewById(R.id.dps_signets_minor_close);

		// Minor Buttons onClickListener
		dpsSignetsMinorButton.setOnClickListener(dpsSignetsMinorButtonListener);
		dpsSignetsMinorButtonClose.setOnClickListener(dpsSignetsMinorButtonCloseListener);
	}

	// Head Open Button onCLickListener
	OnClickListener dpsSignetsHeadButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutDpsSignets.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 5; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				dpsSignetsHeadButtonClose.setVisibility(View.GONE);
				dpsSignetsHeadBlank.setVisibility(View.VISIBLE);
			} else {
				dpsSignetsHeadBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				dpsSignetsHeadButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head Close Button onClickListener
	OnClickListener dpsSignetsHeadButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 5; i++) {
				viewHolder = linearLayoutDpsSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			dpsSignetsHeadButtonClose.setVisibility(View.GONE);
			dpsSignetsHeadBlank.setVisibility(View.VISIBLE);
		}
	};

	// Head / Weapon Open Button onCLickListener
	OnClickListener dpsSignetsHeadWeaponButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutDpsSignets.getChildAt(9).getVisibility() == View.VISIBLE) {
				for (int i = 9; i <= 10; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				dpsSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
				dpsSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
			} else {
				dpsSignetsHeadWeaponBlank.setVisibility(View.GONE);
				for (int i = 9; i <= 11; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				dpsSignetsHeadWeaponButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head / Weapon Close Button onClickListener
	OnClickListener dpsSignetsHeadWeaponButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 9; i <= 10; i++) {
				viewHolder = linearLayoutDpsSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			dpsSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
			dpsSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
		}
	};

	// Major Open Button onCLickListener
	OnClickListener dpsSignetsMajorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutDpsSignets.getChildAt(14).getVisibility() == View.VISIBLE) {
				for (int i = 14; i <= 15; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				dpsSignetsMajorButtonClose.setVisibility(View.GONE);
				dpsSignetsMajorBlank.setVisibility(View.VISIBLE);
			} else {
				dpsSignetsMajorBlank.setVisibility(View.GONE);
				for (int i = 14; i <= 16; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				dpsSignetsMajorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Major Close Button onClickListener
	OnClickListener dpsSignetsMajorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 14; i <= 15; i++) {
				viewHolder = linearLayoutDpsSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			dpsSignetsMajorButtonClose.setVisibility(View.GONE);
			dpsSignetsMajorBlank.setVisibility(View.VISIBLE);
		}
	};

	// Minor Open Button onCLickListener
	OnClickListener dpsSignetsMinorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutDpsSignets.getChildAt(19).getVisibility() == View.VISIBLE) {
				for (int i = 19; i <= 20; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				dpsSignetsMinorButtonClose.setVisibility(View.GONE);
				dpsSignetsMinorBlank.setVisibility(View.VISIBLE);
			} else {
				dpsSignetsMinorBlank.setVisibility(View.GONE);
				for (int i = 19; i <= 21; i++) {
					viewHolder = linearLayoutDpsSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				dpsSignetsMinorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Minor Close Button onClickListener
	OnClickListener dpsSignetsMinorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 19; i <= 20; i++) {
				viewHolder = linearLayoutDpsSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			dpsSignetsMinorButtonClose.setVisibility(View.GONE);
			dpsSignetsMinorBlank.setVisibility(View.VISIBLE);
		}
	};

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
