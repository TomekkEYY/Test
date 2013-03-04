package com.eyyeyy.tsw_signets.utils;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.eyyeyy.tsw_signets.R;

public class AppRater {
	private final static String APP_TITLE = "TSW - Signets";
	private final static String APP_PNAME = "com.eyyeyy.tsw_signets";

	private final static int DAYS_UNTIL_PROMPT = 1;
	private final static int LAUNCHES_UNTIL_PROMPT = 3;

	public static void app_launched(Context mContext) {
		SharedPreferences prefs = mContext.getSharedPreferences("apprater", 0);
		if (prefs.getBoolean("dontshowagain", false)) {
			return;
		}

		SharedPreferences.Editor editor = prefs.edit();

		// Increment launch counter
		long launch_count = prefs.getLong("launch_count", 0) + 1;
		editor.putLong("launch_count", launch_count);

		// Get date of first launch
		Long date_firstLaunch = prefs.getLong("date_firstlaunch", 0);
		if (date_firstLaunch == 0) {
			date_firstLaunch = System.currentTimeMillis();
			editor.putLong("date_firstlaunch", date_firstLaunch);
		}

		// Wait at least n days before opening
		if (launch_count >= LAUNCHES_UNTIL_PROMPT) {
			if (System.currentTimeMillis() >= date_firstLaunch + (DAYS_UNTIL_PROMPT * 24 * 60 * 60 * 1000)) {
				showRateDialog(mContext, editor);
			}
		}

		editor.commit();
	}

	public static void showRateDialog(final Context mContext, final SharedPreferences.Editor editor) {
		final Dialog dialog = new Dialog(mContext);

		LinearLayout rateDialogLL = new LinearLayout(mContext);
		rateDialogLL.setOrientation(LinearLayout.VERTICAL);

		View separatorOne = new View(mContext);
		separatorOne.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorOne, 325, 1);

		ImageView dialogLogo = new ImageView(mContext);
		dialogLogo.setImageResource(R.drawable.rate_this_app);
		dialogLogo.setPadding((int) dialogLogo.getResources().getDimension(R.dimen.dialog_logo_padding),
				(int) dialogLogo.getResources().getDimension(R.dimen.dialog_logo_padding), (int) dialogLogo
						.getResources().getDimension(R.dimen.dialog_logo_padding), (int) dialogLogo.getResources()
						.getDimension(R.dimen.dialog_logo_padding));
		rateDialogLL.addView(dialogLogo);

		View separatorTwo = new View(mContext);
		separatorTwo.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorTwo, 325, 1);

		TextView rateDialogTX = new TextView(mContext);
		rateDialogTX.setText(R.string.rate_and_comment_support);
		rateDialogTX.setWidth(250);
		rateDialogTX.setTextSize((int) rateDialogTX.getResources().getDimension(R.dimen.dialog_text_size));
		rateDialogTX.setGravity(Gravity.CENTER);
		rateDialogTX.setPadding((int) rateDialogTX.getResources().getDimension(R.dimen.dialog_text_padding),
				(int) rateDialogTX.getResources().getDimension(R.dimen.dialog_text_padding), (int) rateDialogTX
						.getResources().getDimension(R.dimen.dialog_text_padding), (int) rateDialogTX.getResources()
						.getDimension(R.dimen.dialog_text_padding));
		rateDialogLL.addView(rateDialogTX);

		View separatorThree = new View(mContext);
		separatorThree.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorThree, 325, 1);

		Button rateAndComment = new Button(mContext);
		rateAndComment.setBackgroundResource(R.drawable.button);
		rateAndComment.setText(R.string.rate_and_comment);
		rateAndComment.setTextColor(Color.WHITE);
		rateAndComment.setTextSize((int) rateAndComment.getResources().getDimension(R.dimen.dialog_text_size));
		rateAndComment.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				mContext.startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + APP_PNAME)));
				dialog.dismiss();
			}
		});
		rateDialogLL.addView(rateAndComment);

		View separatorFour = new View(mContext);
		separatorFour.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorFour, 325, 1);

		Button remindMeLater = new Button(mContext);
		remindMeLater.setBackgroundResource(R.drawable.button);
		remindMeLater.setText(R.string.remind_me_later);
		remindMeLater.setTextColor(Color.WHITE);
		remindMeLater.setTextSize((int) remindMeLater.getResources().getDimension(R.dimen.dialog_text_size));
		remindMeLater.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				dialog.dismiss();
			}
		});
		rateDialogLL.addView(remindMeLater);

		View separatorFive = new View(mContext);
		separatorFive.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorFive, 325, 1);

		Button dontShowAgain = new Button(mContext);
		dontShowAgain.setBackgroundResource(R.drawable.button);
		dontShowAgain.setText(R.string.no_thanks);
		dontShowAgain.setTextColor(Color.WHITE);
		dontShowAgain.setTextSize((int) dontShowAgain.getResources().getDimension(R.dimen.dialog_text_size));
		dontShowAgain.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (editor != null) {
					editor.putBoolean("dontshowagain", true);
					editor.commit();
				}
				dialog.dismiss();
			}
		});
		rateDialogLL.addView(dontShowAgain);

		View separatorSix = new View(mContext);
		rateDialogLL.addView(separatorSix, 325, 1);
		separatorSix.setBackgroundColor(Color.WHITE);

		// disable dialog title
		dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
		dialog.setContentView(rateDialogLL);
		dialog.show();
	}
}
