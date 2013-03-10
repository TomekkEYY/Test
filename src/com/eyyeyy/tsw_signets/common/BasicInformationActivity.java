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

/**
 * @author tiwaniec
 * 
 */
public class BasicInformationActivity extends Activity {

	private ViewGroup linearLayoutBasicInformation;
	private View viewHolder;

	// "What are Signets?
	private View whatAreSignetsBlank;

	private TextView signetInfoPart1;
	private TextView signetsThreeTypes;
	private TextView noteOverview;

	private Button whatAreSignetVisibilityButton;
	private Button whatAreSignetVisibilityButtonClose;

	// "Signet Attaching"
	private View attachSignetBlank;

	private TextView attachSignetText;
	private TextView overwriteSignetText;

	private Button attachSignetVisiblityButton;
	private Button attachSignetVisiblityButtonClose;

	// "Where do I get Signets?"
	private View whereDoIGetSignetsBlank;

	private TextView findSignetsText;

	private Button whereDoIGetSignetsVisibilityButton;
	private Button whereDoIGetSignetsVisibilityButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basic_information_activity);
	}

	protected void onStart() {
		super.onStart();
		linearLayoutBasicInformation = (ViewGroup) findViewById(R.id.ll_basic_information);

		// "What are Signets?" Views
		whatAreSignetsBlank = findViewById(R.id.what_are_signets_blank);

		signetInfoPart1 = (TextView) findViewById(R.id.signet_info_part1);
		signetInfoPart1.setText(Html.fromHtml(getString(R.string.basic_information_part1)));
		signetsThreeTypes = (TextView) findViewById(R.id.signets_three_types);
		signetsThreeTypes.setText(Html.fromHtml(getString(R.string.basic_information_part2)));
		noteOverview = (TextView) findViewById(R.id.note_overview);
		noteOverview.setText(Html.fromHtml(getString(R.string.basic_information_part3)));

		// "What are Signets?" Buttons
		whatAreSignetVisibilityButton = (Button) findViewById(R.id.visibility_signet_info);
		whatAreSignetVisibilityButtonClose = (Button) findViewById(R.id.visibility_signet_info_close);

		// "What are Signets?" Buttons onClickListener
		whatAreSignetVisibilityButton.setOnClickListener(whatAreSignetVisibilityListener);
		whatAreSignetVisibilityButtonClose.setOnClickListener(whatAreSignetVisibilityCloseListener);

		// "Signet Attaching" Views
		attachSignetBlank = findViewById(R.id.attach_signet_blank);

		attachSignetText = (TextView) findViewById(R.id.attach_signet_text);
		attachSignetText.setText(Html.fromHtml(getString(R.string.basic_information_part4)));

		overwriteSignetText = (TextView) findViewById(R.id.overwrite_signet_text);
		overwriteSignetText.setText(Html.fromHtml(getString(R.string.basic_information_part5)));

		// "Signet Attaching" Buttons
		attachSignetVisiblityButton = (Button) findViewById(R.id.visibility_attach_signet);
		attachSignetVisiblityButtonClose = (Button) findViewById(R.id.visibility_attach_signet_close);

		// "Signet Attaching" Buttons onClickListener
		attachSignetVisiblityButton.setOnClickListener(attachSignetVisibleListener);
		attachSignetVisiblityButtonClose.setOnClickListener(attachSignetVisibleCloseListener);

		// "Where do I get Signets?" Views
		whereDoIGetSignetsBlank = findViewById(R.id.where_do_i_get_signets_blank);

		findSignetsText = (TextView) findViewById(R.id.find_signets_text);
		findSignetsText.setText(Html.fromHtml(getString(R.string.find_signets_text)));

		// "Where do I get Signets?" Buttons
		whereDoIGetSignetsVisibilityButton = (Button) findViewById(R.id.visibility_where_do_i_get_signets);
		whereDoIGetSignetsVisibilityButtonClose = (Button) findViewById(R.id.visibility_where_do_i_get_signets_close);

		// "Where do I get Signets?" Buttons onClickListener
		whereDoIGetSignetsVisibilityButton.setOnClickListener(whereDoIGetSignetsVisibilityListener);
		whereDoIGetSignetsVisibilityButtonClose.setOnClickListener(whereDoIGetSignetsVisibilityCloseListener);
	};

	// "What are Signets?" Open Button onCLickListener
	OnClickListener whatAreSignetVisibilityListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutBasicInformation.getChildAt(6).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 9; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				whatAreSignetVisibilityButtonClose.setVisibility(View.GONE);
				whatAreSignetsBlank.setVisibility(View.VISIBLE);
			} else {
				whatAreSignetsBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 10; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				whatAreSignetVisibilityButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// "What are Signets?" Close Button onClickListener
	OnClickListener whatAreSignetVisibilityCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 9; i++) {
				viewHolder = linearLayoutBasicInformation.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			whatAreSignetVisibilityButtonClose.setVisibility(View.GONE);
			whatAreSignetsBlank.setVisibility(View.VISIBLE);
		}
	};

	// "Signet Attaching" Open Button onClickListener
	OnClickListener attachSignetVisibleListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutBasicInformation.getChildAt(14).getVisibility() == View.VISIBLE) {
				for (int i = 13; i <= 16; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				attachSignetVisiblityButtonClose.setVisibility(View.GONE);
				attachSignetBlank.setVisibility(View.VISIBLE);
			} else {
				attachSignetBlank.setVisibility(View.GONE);
				for (int i = 13; i <= 17; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				attachSignetVisiblityButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// "Signet Attaching" Close Button onClickListener
	OnClickListener attachSignetVisibleCloseListener = new OnClickListener() {
		public void onClick(View v) {
			for (int i = 13; i <= 16; i++) {
				viewHolder = linearLayoutBasicInformation.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			attachSignetVisiblityButtonClose.setVisibility(View.GONE);
			attachSignetBlank.setVisibility(View.VISIBLE);
		}
	};

	// "Where do I get Signets?" Open Button onClickListener
	OnClickListener whereDoIGetSignetsVisibilityListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutBasicInformation.getChildAt(21).getVisibility() == View.VISIBLE) {
				for (int i = 20; i <= 21; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				whereDoIGetSignetsVisibilityButtonClose.setVisibility(View.GONE);
				whereDoIGetSignetsBlank.setVisibility(View.VISIBLE);
			} else {
				whereDoIGetSignetsBlank.setVisibility(View.GONE);
				for (int i = 20; i <= 22; i++) {
					viewHolder = linearLayoutBasicInformation.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				whereDoIGetSignetsVisibilityButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// "Where do I get Signets?" Close Button onClickListener
	OnClickListener whereDoIGetSignetsVisibilityCloseListener = new OnClickListener() {
		public void onClick(View v) {
			for (int i = 20; i <= 21; i++) {
				viewHolder = linearLayoutBasicInformation.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			whereDoIGetSignetsVisibilityButtonClose.setVisibility(View.GONE);
			whereDoIGetSignetsBlank.setVisibility(View.VISIBLE);
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
