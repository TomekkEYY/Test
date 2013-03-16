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
import com.eyyeyy.tsw_signets.common.quests.EgyptQuestScorchedActivity;
import com.eyyeyy.tsw_signets.common.quests.EgyptQuestSunActivity;
import com.eyyeyy.tsw_signets.common.quests.SolomonIslandBlueQuestActivity;
import com.eyyeyy.tsw_signets.common.quests.TransylvaniaFangsQuestActivity;
import com.eyyeyy.tsw_signets.common.quests.TransylvaniaFarmQuestActivity;
import com.eyyeyy.tsw_signets.common.quests.TransylvaniaForestQuestActivity;
import com.eyyeyy.tsw_signets.utils.ShowInfo;

public class QuestsActivity extends Activity {

	private ViewGroup linearLayoutQuests;
	private View viewHolder;

	// Basics
	private View basicsQuestsBlank;

	private TextView basicsQuestsText;
	private TextView basicsQuestsText2;

	private Button basicsQuestsButton;
	private Button basicsQuestsButtonClose;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quests_activity);

	}

	@Override
	protected void onStart() {
		super.onStart();

		linearLayoutQuests = (ViewGroup) findViewById(R.id.ll_quests);

		// Basics Views
		basicsQuestsBlank = findViewById(R.id.basics_quests_blank);

		basicsQuestsText = (TextView) findViewById(R.id.basics_quests_text);
		basicsQuestsText.setText(Html.fromHtml(getString(R.string.basics_quests_text)));
		basicsQuestsText2 = (TextView) findViewById(R.id.basics_quests_text2);
		basicsQuestsText2.setText(Html.fromHtml(getString(R.string.basics_quests_text2)));

		// Basics Button
		basicsQuestsButton = (Button) findViewById(R.id.basics_quests);
		basicsQuestsButtonClose = (Button) findViewById(R.id.basics_quests_close);

		// Basics Buttons onClickListener
		basicsQuestsButton.setOnClickListener(basicsQuestsButtonListener);
		basicsQuestsButtonClose.setOnClickListener(basicsQuestsButtonCloseListener);
	}

	// Basics Open Button onCLickListener
	OnClickListener basicsQuestsButtonListener = new OnClickListener() {
		public void onClick(View v) {
			if (linearLayoutQuests.getChildAt(4).getVisibility() == View.VISIBLE) {
				for (int i = 4; i <= 6; i++) {
					viewHolder = linearLayoutQuests.getChildAt(i);
					viewHolder.setVisibility(View.GONE);
				}
				basicsQuestsButtonClose.setVisibility(View.GONE);
				basicsQuestsBlank.setVisibility(View.VISIBLE);
			} else {
				basicsQuestsBlank.setVisibility(View.GONE);
				for (int i = 4; i <= 7; i++) {
					viewHolder = linearLayoutQuests.getChildAt(i);
					viewHolder.setVisibility(View.VISIBLE);
				}
				basicsQuestsButtonClose.setVisibility(View.VISIBLE);
			}
		}
	};

	// Basics Close Button onClickListener
	OnClickListener basicsQuestsButtonCloseListener = new OnClickListener() {
		public void onClick(View v) {

			for (int i = 4; i <= 6; i++) {
				viewHolder = linearLayoutQuests.getChildAt(i);
				viewHolder.setVisibility(View.GONE);
			}
			basicsQuestsButtonClose.setVisibility(View.GONE);
			basicsQuestsBlank.setVisibility(View.VISIBLE);
		}
	};

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.options_menu, menu);
		return true;
	}

	public void startSolomonBlueQuest(View view) {

		Intent intent = new Intent(this, SolomonIslandBlueQuestActivity.class);
		startActivity(intent);
	}

	public void startEgyptScorchedQuest(View view) {

		Intent intent = new Intent(this, EgyptQuestScorchedActivity.class);
		startActivity(intent);
	}

	public void startEgyptSunQuest(View view) {

		Intent intent = new Intent(this, EgyptQuestSunActivity.class);
		startActivity(intent);
	}

	public void startTransFarmQuest(View view) {

		Intent intent = new Intent(this, TransylvaniaFarmQuestActivity.class);
		startActivity(intent);
	}

	public void startTransForestQuest(View view) {

		Intent intent = new Intent(this, TransylvaniaForestQuestActivity.class);
		startActivity(intent);
	}

	public void startTransFangsQuest(View view) {

		Intent intent = new Intent(this, TransylvaniaFangsQuestActivity.class);
		startActivity(intent);
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
