package de.eyyeyy.tsw_signets.common.maps;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;

import com.polites.android.GestureImageView;

import de.eyyeyy.tsw_signets.MainActivity;
import de.eyyeyy.tsw_signets.R;
import de.eyyeyy.tsw_signets.utils.ShowInfo;

public class FangsMapMarkedActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.fangs_map_marked_activity);

		LayoutParams params = new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);

		GestureImageView view = new GestureImageView(this);

		if (this.getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
			view.setImageResource(R.drawable.fangs_map_marked);
		} else {
			view.setImageResource(R.drawable.fangs_map_marked_land);
		}

		view.setLayoutParams(params);

		ViewGroup layout = (ViewGroup) findViewById(R.id.ll_fangs_map_marked_map);

		layout.addView(view);
	}

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
}
