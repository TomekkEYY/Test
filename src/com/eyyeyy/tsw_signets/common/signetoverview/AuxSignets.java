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

public class AuxSignets extends Activity {

	private ViewGroup linearLayoutAuxSignets;
	private View viewHolder;

	// Chainsaw
	private View auxSignetsChainsawBlank;

	private TextView auxSignetsChainsawText;

	private Button auxSignetsChainsaw;
	private Button auxSignetsChainsawClose;

	// Rocketlauncher
	private View auxSignetsRocketlauncherBlank;

	private TextView auxSignetsRocketlauncherText;

	private Button auxSignetsRocketlauncher;
	private Button auxSignetsRocketlauncherClose;

	// Quantum Brace
	private View auxSignetsQuantumBlank;

	private TextView auxSignetsQuantumText;

	private Button auxSignetsQuantum;
	private Button auxSignetsQuantumClose;

	// Quantum Brace
	private View auxSignetsWhipBlank;

	private TextView auxSignetsWhipText;

	private Button auxSignetsWhip;
	private Button auxSignetsWhipClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aux_signets_activity);

	}

	protected void onStart() {
		super.onStart();
		linearLayoutAuxSignets = (ViewGroup) findViewById(R.id.ll_aux_signets);

		// Chainsaw Views
		auxSignetsChainsawBlank = findViewById(R.id.aux_signets_chainsaw_blank);

		auxSignetsChainsawText = (TextView) findViewById(R.id.aux_signets_chainsaw_text);
		auxSignetsChainsawText.setText(Html.fromHtml(getString(R.string.aux_signets_chainsaw_text)));

		// Chainsaw Buttons
		auxSignetsChainsaw = (Button) findViewById(R.id.aux_signets_chainsaw);
		auxSignetsChainsawClose = (Button) findViewById(R.id.aux_signets_chainsaw_close);

		// Chainsaw Buttons onClickListener
		auxSignetsChainsaw.setOnClickListener(auxSignetsChainsawListener);
		auxSignetsChainsawClose.setOnClickListener(auxSignetsChainsawCloseListener);

		// Rocketlauncher Views
		auxSignetsRocketlauncherBlank = findViewById(R.id.aux_signets_rocketlauncher_blank);

		auxSignetsRocketlauncherText = (TextView) findViewById(R.id.aux_signets_rocketlauncher_text);
		auxSignetsRocketlauncherText.setText(Html.fromHtml(getString(R.string.aux_signets_rocketlauncher_text)));

		// Rocketlauncher Buttons
		auxSignetsRocketlauncher = (Button) findViewById(R.id.aux_signets_rocketlauncher);
		auxSignetsRocketlauncherClose = (Button) findViewById(R.id.aux_signets_rocketlauncher_close);

		// Rocketlauncher Buttons onClickListener
		auxSignetsRocketlauncher.setOnClickListener(auxSignetsRocketlauncherListener);
		auxSignetsRocketlauncherClose.setOnClickListener(auxSignetsRocketlauncherCloseListener);

		// Quantum Views
		auxSignetsQuantumBlank = findViewById(R.id.aux_signets_quantum_blank);

		auxSignetsQuantumText = (TextView) findViewById(R.id.aux_signets_quantum_text);
		auxSignetsQuantumText.setText(Html.fromHtml(getString(R.string.aux_signets_quantum_text)));

		// Quantum Buttons
		auxSignetsQuantum = (Button) findViewById(R.id.aux_signets_quantum);
		auxSignetsQuantumClose = (Button) findViewById(R.id.aux_signets_quantum_close);

		// Quantum Buttons onClickListener
		auxSignetsQuantum.setOnClickListener(auxSignetsQuantumListener);
		auxSignetsQuantumClose.setOnClickListener(auxSignetsQuantumCloseListener);

		// Whip Views
		auxSignetsWhipBlank = findViewById(R.id.aux_signets_whip_blank);

		auxSignetsWhipText = (TextView) findViewById(R.id.aux_signets_whip_text);
		auxSignetsWhipText.setText(Html.fromHtml(getString(R.string.aux_signets_whip_text)));

		// Whip Buttons
		auxSignetsWhip = (Button) findViewById(R.id.aux_signets_whip);
		auxSignetsWhipClose = (Button) findViewById(R.id.aux_signets_whip_close);

		// Whip Buttons onClickListener
		auxSignetsWhip.setOnClickListener(auxSignetsWhipListener);
		auxSignetsWhipClose.setOnClickListener(auxSignetsWhipCloseListener);
	}

	// Chainsaw Button onCLickListener
	OnClickListener auxSignetsChainsawListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAuxSignets.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 5; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				auxSignetsChainsawClose.setVisibility(View.GONE);
				auxSignetsChainsawBlank.setVisibility(View.VISIBLE);
			} else {
				auxSignetsChainsawBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				auxSignetsChainsawClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Chainsaw Button onClickListener
	OnClickListener auxSignetsChainsawCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 5; i++) {
				viewHolder = linearLayoutAuxSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			auxSignetsChainsawClose.setVisibility(View.GONE);
			auxSignetsChainsawBlank.setVisibility(View.VISIBLE);
		}
	};

	// Rocketlauncher Button onCLickListener
	OnClickListener auxSignetsRocketlauncherListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAuxSignets.getChildAt(9).getVisibility() == View.VISIBLE) {
				for (int i = 9; i <= 10; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				auxSignetsRocketlauncherClose.setVisibility(View.GONE);
				auxSignetsRocketlauncherBlank.setVisibility(View.VISIBLE);
			} else {
				auxSignetsRocketlauncherBlank.setVisibility(View.GONE);
				for (int i = 9; i <= 11; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				auxSignetsRocketlauncherClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Rocketlauncher Button onClickListener
	OnClickListener auxSignetsRocketlauncherCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 9; i <= 10; i++) {
				viewHolder = linearLayoutAuxSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			auxSignetsRocketlauncherClose.setVisibility(View.GONE);
			auxSignetsRocketlauncherBlank.setVisibility(View.VISIBLE);
		}
	};

	// Quantum Button onCLickListener
	OnClickListener auxSignetsQuantumListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAuxSignets.getChildAt(14).getVisibility() == View.VISIBLE) {
				for (int i = 14; i <= 15; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				auxSignetsQuantumClose.setVisibility(View.GONE);
				auxSignetsQuantumBlank.setVisibility(View.VISIBLE);
			} else {
				auxSignetsQuantumBlank.setVisibility(View.GONE);
				for (int i = 14; i <= 16; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				auxSignetsQuantumClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Quantum Button onClickListener
	OnClickListener auxSignetsQuantumCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 14; i <= 15; i++) {
				viewHolder = linearLayoutAuxSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			auxSignetsQuantumClose.setVisibility(View.GONE);
			auxSignetsQuantumBlank.setVisibility(View.VISIBLE);
		}
	};

	// Whip Button onCLickListener
	OnClickListener auxSignetsWhipListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutAuxSignets.getChildAt(19).getVisibility() == View.VISIBLE) {
				for (int i = 19; i <= 20; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				auxSignetsWhipClose.setVisibility(View.GONE);
				auxSignetsWhipBlank.setVisibility(View.VISIBLE);
			} else {
				auxSignetsWhipBlank.setVisibility(View.GONE);
				for (int i = 19; i <= 21; i++) {
					viewHolder = linearLayoutAuxSignets.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				auxSignetsWhipClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Whip Button onClickListener
	OnClickListener auxSignetsWhipCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 19; i <= 20; i++) {
				viewHolder = linearLayoutAuxSignets.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			auxSignetsWhipClose.setVisibility(View.GONE);
			auxSignetsWhipBlank.setVisibility(View.VISIBLE);
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
