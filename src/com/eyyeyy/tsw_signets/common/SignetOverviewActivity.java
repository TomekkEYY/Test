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
import com.eyyeyy.tsw_signets.common.signetoverview.AllSignets;
import com.eyyeyy.tsw_signets.common.signetoverview.AuxSignets;
import com.eyyeyy.tsw_signets.common.signetoverview.DpsSignets;
import com.eyyeyy.tsw_signets.common.signetoverview.HealerSignets;
import com.eyyeyy.tsw_signets.common.signetoverview.TankSignets;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class SignetOverviewActivity extends Activity {

	private ViewGroup linearLayoutBasicInformation;
	private View viewHolder;

	// Basics
	private View basicsSignetOverviewBlank;

	private TextView overviewInfo;
	private TextView overviewInfoDps;

	private Button basicsSignetsOverview;
	private Button basicsSignetsOverviewClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.signet_overview_activity);
	}

	protected void onStart() {
		super.onStart();
		linearLayoutBasicInformation = (ViewGroup) findViewById(R.id.ll_signet_overview);

		// Basics Views
		basicsSignetOverviewBlank = findViewById(R.id.basics_signet_overview_blank);

		overviewInfo = (TextView) findViewById(R.id.overview_info);
		overviewInfo.setText(Html.fromHtml(getString(R.string.overview_info)));
		overviewInfoDps = (TextView) findViewById(R.id.overview_info_dps);
		overviewInfoDps.setText(Html.fromHtml(getString(R.string.overview_info_dps)));

		// Basics Buttons
		basicsSignetsOverview = (Button) findViewById(R.id.basics_signets_overview);
		basicsSignetsOverviewClose = (Button) findViewById(R.id.basics_signets_overview_close);

		// Basics Buttons onClickListener
		basicsSignetsOverview.setOnClickListener(basicsSignetsOverviewListener);
		basicsSignetsOverviewClose.setOnClickListener(basicsSignetsOverviewCloseListener);
	}

	// Basics Open Button onCLickListener
	OnClickListener basicsSignetsOverviewListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutBasicInformation.getChildAt(6).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 8; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				basicsSignetsOverviewClose.setVisibility(View.GONE);
				basicsSignetOverviewBlank.setVisibility(View.VISIBLE);
			} else {
				basicsSignetOverviewBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 9; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				basicsSignetsOverviewClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Basics Close Button onClickListener
	OnClickListener basicsSignetsOverviewCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 8; i++) {
				viewHolder = linearLayoutBasicInformation.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			basicsSignetsOverviewClose.setVisibility(View.GONE);
			basicsSignetOverviewBlank.setVisibility(View.VISIBLE);
		}
	};

	public void startAllSignets(View view) {

		Intent intent = new Intent(this, AllSignets.class);
		startActivity(intent);
	}

	public void startDpsSignets(View view) {

		Intent intent = new Intent(this, DpsSignets.class);
		startActivity(intent);
	}

	public void startHealerSignets(View view) {

		Intent intent = new Intent(this, HealerSignets.class);
		startActivity(intent);
	}

	public void startTankSignets(View view) {

		Intent intent = new Intent(this, TankSignets.class);
		startActivity(intent);
	}

	public void startAuxSignets(View view) {

		Intent intent = new Intent(this, AuxSignets.class);
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
