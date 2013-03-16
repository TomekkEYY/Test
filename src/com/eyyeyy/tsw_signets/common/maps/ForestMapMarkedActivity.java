package com.eyyeyy.tsw_signets.common.maps;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

import com.eyyeyy.tsw_signets.R;
import com.eyyeyy.tsw_signets.utils.ShowInfo;
import com.polites.android.GestureImageView;

public class ForestMapMarkedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.forest_map_marked_activity);

		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		GestureImageView view = new GestureImageView(this);

		if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
			view.setImageResource(R.drawable.forest_map_marked);
		} else {
			view.setImageResource(R.drawable.forest_map_marked_land);
		}

		view.setLayoutParams(params);

		ViewGroup layout = (ViewGroup) findViewById(R.id.ll_forest_map_marked_map);

		layout.addView(view);
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
}
