package com.eyyeyy.tsw_signets.common.quest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

import com.eyyeyy.tsw_signets.R;

public class QuestAlarm extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quest_alarm_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.quest_alarm_activity, menu);
		return true;
	}

}
