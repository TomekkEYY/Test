package com.eyyeyy.tsw_signets.common.signetoverview;

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

public class HealerSignets extends Activity {

	private ViewGroup linearLayoutHealerSignets;
	private View viewHolder;

	// Head
	private View healerSignetsHeadBlank;

	private TextView healerSignetsHeadText;

	private Button healerSignetsHeadButton;
	private Button healerSignetsHeadButtonClose;

	// Head / Weapon
	private View healerSignetsHeadWeaponBlank;

	private TextView healerSignetsHeadWeaponText;

	private Button healerSignetsHeadWeaponButton;
	private Button healerSignetsHeadWeaponButtonClose;

	// Major
	private View healerSignetsMajorBlank;

	private TextView healerSignetsMajorText;

	private Button healerSignetsMajorButton;
	private Button healerSignetsMajorButtonClose;

	// Minor
	private View healerSignetsMinorBlank;

	private TextView healerSignetsMinorText;

	private Button healerSignetsMinorButton;
	private Button healerSignetsMinorButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.healer_signets_activity);
	}

	protected void onStart() {
		super.onStart();
		linearLayoutHealerSignets = (ViewGroup) findViewById(R.id.ll_healer_signets);

		// Head Views
		healerSignetsHeadBlank = (TextView) findViewById(R.id.healer_signets_head_blank);

		healerSignetsHeadText = (TextView) findViewById(R.id.healer_signets_head_text);
		healerSignetsHeadText.setText(Html.fromHtml(getString(R.string.healer_signets_head_text)));

		// Head Buttons
		healerSignetsHeadButton = (Button) findViewById(R.id.healer_signets_head);
		healerSignetsHeadButtonClose = (Button) findViewById(R.id.healer_signets_head_close);

		// Head Buttons onClickListener
		healerSignetsHeadButton.setOnClickListener(healerSignetsHeadButtonListener);
		healerSignetsHeadButtonClose.setOnClickListener(healerSignetsHeadButtonCloseListener);

		// Head / Weapon Views
		healerSignetsHeadWeaponBlank = findViewById(R.id.healer_signets_head_weapon_blank);

		healerSignetsHeadWeaponText = (TextView) findViewById(R.id.healer_signets_head_weapon_text);
		healerSignetsHeadWeaponText.setText(Html.fromHtml(getString(R.string.healer_signets_head_weapon_text)));

		// Head / Weapon Buttons
		healerSignetsHeadWeaponButton = (Button) findViewById(R.id.healer_signets_head_weapon);
		healerSignetsHeadWeaponButtonClose = (Button) findViewById(R.id.healer_signets_head_weapon_close);

		// Head / Weapon Buttons onClickListener
		healerSignetsHeadWeaponButton.setOnClickListener(healerSignetsHeadWeaponButtonListener);
		healerSignetsHeadWeaponButtonClose.setOnClickListener(healerSignetsHeadWeaponButtonCloseListener);

		// Major Views
		healerSignetsMajorBlank = findViewById(R.id.healer_signets_major_blank);

		healerSignetsMajorText = (TextView) findViewById(R.id.healer_signets_major_text);
		healerSignetsMajorText.setText(Html.fromHtml(getString(R.string.healer_signets_major_text)));

		// Major Buttons
		healerSignetsMajorButton = (Button) findViewById(R.id.healer_signets_major);
		healerSignetsMajorButtonClose = (Button) findViewById(R.id.healer_signets_major_close);

		// Major Buttons onClickListener
		healerSignetsMajorButton.setOnClickListener(healerSignetsMajorButtonListener);
		healerSignetsMajorButtonClose.setOnClickListener(healerSignetsMajorButtonCloseListener);

		// Minor Views
		healerSignetsMinorBlank = findViewById(R.id.healer_signets_minor_blank);

		healerSignetsMinorText = (TextView) findViewById(R.id.healer_signets_minor_text);
		healerSignetsMinorText.setText(Html.fromHtml(getString(R.string.healer_signets_minor_text)));

		// Minor Buttons
		healerSignetsMinorButton = (Button) findViewById(R.id.healer_signets_minor);
		healerSignetsMinorButtonClose = (Button) findViewById(R.id.healer_signets_minor_close);

		// Minor Buttons onClickListener
		healerSignetsMinorButton.setOnClickListener(healerSignetsMinorButtonListener);
		healerSignetsMinorButtonClose.setOnClickListener(healerSignetsMinorButtonCloseListener);
	}

	// Head Open Button onCLickListener
	OnClickListener healerSignetsHeadButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutHealerSignets.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 5; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				healerSignetsHeadButtonClose.setVisibility(View.GONE);
				healerSignetsHeadBlank.setVisibility(View.VISIBLE);
			} else {
				healerSignetsHeadBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				healerSignetsHeadButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head Close Button onClickListener
	OnClickListener healerSignetsHeadButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 5; i++) {
				viewHolder = linearLayoutHealerSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			healerSignetsHeadButtonClose.setVisibility(View.GONE);
			healerSignetsHeadBlank.setVisibility(View.VISIBLE);
		}
	};

	// Head / Weapon Open Button onCLickListener
	OnClickListener healerSignetsHeadWeaponButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutHealerSignets.getChildAt(9).getVisibility() == View.VISIBLE) {
				for (int i = 9; i <= 10; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				healerSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
				healerSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
			} else {
				healerSignetsHeadWeaponBlank.setVisibility(View.GONE);
				for (int i = 9; i <= 11; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				healerSignetsHeadWeaponButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head / Weapon Close Button onClickListener
	OnClickListener healerSignetsHeadWeaponButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 9; i <= 10; i++) {
				viewHolder = linearLayoutHealerSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			healerSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
			healerSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
		}
	};

	// Major Open Button onCLickListener
	OnClickListener healerSignetsMajorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutHealerSignets.getChildAt(14).getVisibility() == View.VISIBLE) {
				for (int i = 14; i <= 15; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				healerSignetsMajorButtonClose.setVisibility(View.GONE);
				healerSignetsMajorBlank.setVisibility(View.VISIBLE);
			} else {
				healerSignetsMajorBlank.setVisibility(View.GONE);
				for (int i = 14; i <= 16; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				healerSignetsMajorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Major Close Button onClickListener
	OnClickListener healerSignetsMajorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 14; i <= 15; i++) {
				viewHolder = linearLayoutHealerSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			healerSignetsMajorButtonClose.setVisibility(View.GONE);
			healerSignetsMajorBlank.setVisibility(View.VISIBLE);
		}
	};

	// Minor Open Button onCLickListener
	OnClickListener healerSignetsMinorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutHealerSignets.getChildAt(19).getVisibility() == View.VISIBLE) {
				for (int i = 19; i <= 20; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				healerSignetsMinorButtonClose.setVisibility(View.GONE);
				healerSignetsMinorBlank.setVisibility(View.VISIBLE);
			} else {
				healerSignetsMinorBlank.setVisibility(View.GONE);
				for (int i = 19; i <= 21; i++) {
					viewHolder = linearLayoutHealerSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				healerSignetsMinorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Minor Close Button onClickListener
	OnClickListener healerSignetsMinorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 19; i <= 20; i++) {
				viewHolder = linearLayoutHealerSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			healerSignetsMinorButtonClose.setVisibility(View.GONE);
			healerSignetsMinorBlank.setVisibility(View.VISIBLE);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.healer_signets_activity, menu);
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
