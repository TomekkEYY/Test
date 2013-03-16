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

public class AllSignets extends Activity {

	private ViewGroup linearLayoutAllSignets;
	private View viewHolder;

	// Head
	private View allSignetsHeadBlank;

	private TextView allSignetsHeadText;

	private Button allSignetsHeadButton;
	private Button allSignetsHeadButtonClose;

	// Head / Weapon
	private View allSignetsHeadWeaponBlank;

	private TextView allSignetsHeadWeaponText;

	private Button allSignetsHeadWeaponButton;
	private Button allSignetsHeadWeaponButtonClose;

	// Major
	private View allSignetsMajorBlank;

	private TextView allSignetsMajorText;

	private Button allSignetsMajorButton;
	private Button allSignetsMajorButtonClose;

	// Minor
	private View allSignetsMinorBlank;

	private TextView allSignetsMinorText;

	private Button allSignetsMinorButton;
	private Button allSignetsMinorButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.all_signets_activity);
	}

	protected void onStart() {
		super.onStart();
		linearLayoutAllSignets = (ViewGroup) findViewById(R.id.ll_all_signets);

		// Head Views
		allSignetsHeadBlank = findViewById(R.id.all_signets_head_blank);

		allSignetsHeadText = (TextView) findViewById(R.id.all_signets_head_text);
		allSignetsHeadText.setText(Html.fromHtml(getString(R.string.all_signets_head_text)));

		// Head Buttons
		allSignetsHeadButton = (Button) findViewById(R.id.all_signets_head);
		allSignetsHeadButtonClose = (Button) findViewById(R.id.all_signets_head_close);

		// Head Buttons onClickListener
		allSignetsHeadButton.setOnClickListener(allSignetsHeadButtonListener);
		allSignetsHeadButtonClose.setOnClickListener(allSignetsHeadButtonCloseListener);

		// Head / Weapon Views
		allSignetsHeadWeaponBlank = findViewById(R.id.all_signets_head_weapon_blank);

		allSignetsHeadWeaponText = (TextView) findViewById(R.id.all_signets_head_weapon_text);
		allSignetsHeadWeaponText.setText(Html.fromHtml(getString(R.string.all_signets_head_weapon_text)));

		// Head / Weapon Buttons
		allSignetsHeadWeaponButton = (Button) findViewById(R.id.all_signets_head_weapon);
		allSignetsHeadWeaponButtonClose = (Button) findViewById(R.id.all_signets_head_weapon_close);

		// Head / Weapon Buttons onClickListener
		allSignetsHeadWeaponButton.setOnClickListener(allSignetsHeadWeaponButtonListener);
		allSignetsHeadWeaponButtonClose.setOnClickListener(allSignetsHeadWeaponButtonCloseListener);

		// Major Views
		allSignetsMajorBlank = findViewById(R.id.all_signets_major_blank);

		allSignetsMajorText = (TextView) findViewById(R.id.all_signets_major_text);
		allSignetsMajorText.setText(Html.fromHtml(getString(R.string.all_signets_major_text)));

		// Major Buttons
		allSignetsMajorButton = (Button) findViewById(R.id.all_signets_major);
		allSignetsMajorButtonClose = (Button) findViewById(R.id.all_signets_major_close);

		// Major Buttons onClickListener
		allSignetsMajorButton.setOnClickListener(allSignetsMajorButtonListener);
		allSignetsMajorButtonClose.setOnClickListener(allSignetsMajorButtonCloseListener);

		// Minor Views
		allSignetsMinorBlank = findViewById(R.id.all_signets_minor_blank);

		allSignetsMinorText = (TextView) findViewById(R.id.all_signets_minor_text);
		allSignetsMinorText.setText(Html.fromHtml(getString(R.string.all_signets_minor_text)));

		// Minor Buttons
		allSignetsMinorButton = (Button) findViewById(R.id.all_signets_minor);
		allSignetsMinorButtonClose = (Button) findViewById(R.id.all_signets_minor_close);

		// Minor Buttons onClickListener
		allSignetsMinorButton.setOnClickListener(allSignetsMinorButtonListener);
		allSignetsMinorButtonClose.setOnClickListener(allSignetsMinorButtonCloseListener);
	}

	// Head Open Button onCLickListener
	OnClickListener allSignetsHeadButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAllSignets.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 5; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				allSignetsHeadButtonClose.setVisibility(View.GONE);
				allSignetsHeadBlank.setVisibility(View.VISIBLE);
			} else {
				allSignetsHeadBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				allSignetsHeadButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head Close Button onClickListener
	OnClickListener allSignetsHeadButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 5; i++) {
				viewHolder = linearLayoutAllSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			allSignetsHeadButtonClose.setVisibility(View.GONE);
			allSignetsHeadBlank.setVisibility(View.VISIBLE);
		}
	};

	// Head / Weapon Open Button onCLickListener
	OnClickListener allSignetsHeadWeaponButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAllSignets.getChildAt(9).getVisibility() == View.VISIBLE) {
				for (int i = 9; i <= 10; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				allSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
				allSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
			} else {
				allSignetsHeadWeaponBlank.setVisibility(View.GONE);
				for (int i = 9; i <= 11; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				allSignetsHeadWeaponButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Head / Weapon Close Button onClickListener
	OnClickListener allSignetsHeadWeaponButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 9; i <= 10; i++) {
				viewHolder = linearLayoutAllSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			allSignetsHeadWeaponButtonClose.setVisibility(View.GONE);
			allSignetsHeadWeaponBlank.setVisibility(View.VISIBLE);
		}
	};

	// Major Open Button onCLickListener
	OnClickListener allSignetsMajorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAllSignets.getChildAt(14).getVisibility() == View.VISIBLE) {
				for (int i = 14; i <= 15; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				allSignetsMajorButtonClose.setVisibility(View.GONE);
				allSignetsMajorBlank.setVisibility(View.VISIBLE);
			} else {
				allSignetsMajorBlank.setVisibility(View.GONE);
				for (int i = 14; i <= 16; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				allSignetsMajorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Major Close Button onClickListener
	OnClickListener allSignetsMajorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 14; i <= 15; i++) {
				viewHolder = linearLayoutAllSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			allSignetsMajorButtonClose.setVisibility(View.GONE);
			allSignetsMajorBlank.setVisibility(View.VISIBLE);
		}
	};

	// Minor Open Button onCLickListener
	OnClickListener allSignetsMinorButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAllSignets.getChildAt(19).getVisibility() == View.VISIBLE) {
				for (int i = 19; i <= 20; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				allSignetsMinorButtonClose.setVisibility(View.GONE);
				allSignetsMinorBlank.setVisibility(View.VISIBLE);
			} else {
				allSignetsMinorBlank.setVisibility(View.GONE);
				for (int i = 19; i <= 21; i++) {
					viewHolder = linearLayoutAllSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				allSignetsMinorButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Minor Close Button onClickListener
	OnClickListener allSignetsMinorButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 19; i <= 20; i++) {
				viewHolder = linearLayoutAllSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			allSignetsMinorButtonClose.setVisibility(View.GONE);
			allSignetsMinorBlank.setVisibility(View.VISIBLE);
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
