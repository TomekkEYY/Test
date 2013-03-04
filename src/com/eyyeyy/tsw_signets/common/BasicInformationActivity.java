package com.eyyeyy.tsw_signets.common;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.eyyeyy.tsw_signets.R;

public class BasicInformationActivity extends Activity {

	// "What are Signets?
	private View whatAreSignetsBlank;
	private View signetInfoPart1;
	private View pictureFreeSignetSlot;
	private View signetsThreeTypes;
	private View picture10signet10;
	private View noteOverview;
	private Button whatAreSignetVisibilityButton;
	private Button whatAreSignetVisibilityButtonClose;

	// "Signet Attaching"
	private View attachSignetBlank;
	private View attachSignetText;
	private View pictureSingetItemAssemblyWindow;
	private View overwriteSignetText;
	private Button attachSignetVisiblityButton;
	private Button attachSignetVisiblityButtonClose;

	// "Where do I get Signets?"
	private View whereDoIGetSignetsBlank;
	private View findSignetsText;
	private View bankMailLondon;
	private Button whereDoIGetSignetsVisibilityButton;
	private Button whereDoIGetSignetsVisibilityButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.basic_information_activity);

		// "What are Signets?" Views
		whatAreSignetsBlank = findViewById(R.id.what_are_signets_blank);
		signetInfoPart1 = findViewById(R.id.signet_info_part1);
		pictureFreeSignetSlot = findViewById(R.id.picture_free_signet_slot);
		signetsThreeTypes = findViewById(R.id.signets_three_types);
		picture10signet10 = findViewById(R.id.picture_10signet10);
		noteOverview = findViewById(R.id.note_overview);

		// "What are Signets?" Buttons
		whatAreSignetVisibilityButton = (Button) findViewById(R.id.visibility_signet_info);
		whatAreSignetVisibilityButtonClose = (Button) findViewById(R.id.visibility_signet_info_close);

		// "What are Signets?" Buttons onClickListener
		whatAreSignetVisibilityButton.setOnClickListener(whatAreSignetVisibilityListener);
		whatAreSignetVisibilityButtonClose.setOnClickListener(whatAreSignetVisibilityCloseListener);

		// "Signet Attaching" Views
		attachSignetBlank = findViewById(R.id.attach_signet_blank);
		attachSignetText = findViewById(R.id.attach_signet_text);
		pictureSingetItemAssemblyWindow = findViewById(R.id.picture_singet_item_assembly_window);
		overwriteSignetText = findViewById(R.id.overwrite_signet_text);
		// "Signet Attaching" Buttons
		attachSignetVisiblityButton = (Button) findViewById(R.id.visibility_attach_signet);
		attachSignetVisiblityButtonClose = (Button) findViewById(R.id.visibility_attach_signet_close);

		// "Signet Attaching" Buttons onClickListener
		attachSignetVisiblityButton.setOnClickListener(attachSignetVisibleListener);
		attachSignetVisiblityButtonClose.setOnClickListener(attachSignetVisibleCloseListener);

		// "Where do I get Signets?" Views
		whereDoIGetSignetsBlank = findViewById(R.id.where_do_i_get_signets_blank);
		findSignetsText = findViewById(R.id.find_signets_text);
		bankMailLondon = findViewById(R.id.bank_mail_london);

		// "Where do I get Signets?" Buttons
		whereDoIGetSignetsVisibilityButton = (Button) findViewById(R.id.visibility_where_do_i_get_signets);
		whereDoIGetSignetsVisibilityButtonClose = (Button) findViewById(R.id.visibility_where_do_i_get_signets_close);

		// "Where do I get Signets?" Buttons onClickListener
		whereDoIGetSignetsVisibilityButton.setOnClickListener(whereDoIGetSignetsVisibilityListener);
		whereDoIGetSignetsVisibilityButtonClose.setOnClickListener(whereDoIGetSignetsVisibilityCloseListener);
	}

	// "What are Signets?" Open Button onCLickListener
	OnClickListener whatAreSignetVisibilityListener = new OnClickListener() {
		public void onClick(View v) {
			if (noteOverview.getVisibility() == View.VISIBLE) {
				noteOverview.setVisibility(View.GONE);
				signetInfoPart1.setVisibility(View.GONE);
				pictureFreeSignetSlot.setVisibility(View.GONE);
				signetsThreeTypes.setVisibility(View.GONE);
				picture10signet10.setVisibility(View.GONE);
				whatAreSignetVisibilityButtonClose.setVisibility(View.GONE);
				whatAreSignetsBlank.setVisibility(View.VISIBLE);
			} else {
				whatAreSignetsBlank.setVisibility(View.GONE);
				noteOverview.setVisibility(View.VISIBLE);
				signetInfoPart1.setVisibility(View.VISIBLE);
				pictureFreeSignetSlot.setVisibility(View.VISIBLE);
				signetsThreeTypes.setVisibility(View.VISIBLE);
				picture10signet10.setVisibility(View.VISIBLE);
				whatAreSignetVisibilityButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// "What are Signets?" Close Button onClickListener
	OnClickListener whatAreSignetVisibilityCloseListener = new OnClickListener() {
		public void onClick(View v) {

			noteOverview.setVisibility(View.GONE);
			signetInfoPart1.setVisibility(View.GONE);
			pictureFreeSignetSlot.setVisibility(View.GONE);
			signetsThreeTypes.setVisibility(View.GONE);
			picture10signet10.setVisibility(View.GONE);
			whatAreSignetVisibilityButtonClose.setVisibility(View.GONE);
			whatAreSignetsBlank.setVisibility(View.VISIBLE);

		}
	};

	// "Signet Attaching" Open Button onClickListener
	OnClickListener attachSignetVisibleListener = new OnClickListener() {
		public void onClick(View v) {
			if (attachSignetText.getVisibility() == View.VISIBLE) {
				attachSignetText.setVisibility(View.GONE);
				pictureSingetItemAssemblyWindow.setVisibility(View.GONE);
				overwriteSignetText.setVisibility(View.GONE);
				attachSignetVisiblityButtonClose.setVisibility(View.GONE);
				attachSignetBlank.setVisibility(View.VISIBLE);
			} else {
				attachSignetBlank.setVisibility(View.GONE);
				attachSignetText.setVisibility(View.VISIBLE);
				pictureSingetItemAssemblyWindow.setVisibility(View.VISIBLE);
				overwriteSignetText.setVisibility(View.VISIBLE);
				attachSignetVisiblityButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// "Signet Attaching" Close Button onClickListener
	OnClickListener attachSignetVisibleCloseListener = new OnClickListener() {
		public void onClick(View v) {

			attachSignetText.setVisibility(View.GONE);
			pictureSingetItemAssemblyWindow.setVisibility(View.GONE);
			overwriteSignetText.setVisibility(View.GONE);
			attachSignetVisiblityButtonClose.setVisibility(View.GONE);
			attachSignetBlank.setVisibility(View.VISIBLE);

		}
	};

	// "Where do I get Signets?" Open Button onClickListener
	OnClickListener whereDoIGetSignetsVisibilityListener = new OnClickListener() {
		public void onClick(View v) {
			if (findSignetsText.getVisibility() == View.VISIBLE) {
				findSignetsText.setVisibility(View.GONE);
				bankMailLondon.setVisibility(View.GONE);
				whereDoIGetSignetsVisibilityButtonClose.setVisibility(View.GONE);
				whereDoIGetSignetsBlank.setVisibility(View.VISIBLE);
			} else {
				whereDoIGetSignetsBlank.setVisibility(View.GONE);
				findSignetsText.setVisibility(View.VISIBLE);
				bankMailLondon.setVisibility(View.VISIBLE);
				whereDoIGetSignetsVisibilityButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// "Where do I get Signets?" Close Button onClickListener
	OnClickListener whereDoIGetSignetsVisibilityCloseListener = new OnClickListener() {
		public void onClick(View v) {

			findSignetsText.setVisibility(View.GONE);
			bankMailLondon.setVisibility(View.GONE);
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
}
