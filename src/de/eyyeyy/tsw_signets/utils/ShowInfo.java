package de.eyyeyy.tsw_signets.utils;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.view.Gravity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import de.eyyeyy.tsw_signets.R;

public class ShowInfo {

	public static void showInfoDialog(final Context mContext) {
		final Dialog dialog = new Dialog(mContext);

		LinearLayout rateDialogLL = new LinearLayout(mContext);
		rateDialogLL.setOrientation(LinearLayout.VERTICAL);

		View separatorOne = new View(mContext);
		separatorOne.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorOne, 325, 1);

		ImageView dialogLogo = new ImageView(mContext);
		dialogLogo.setImageResource(R.drawable.info);
		dialogLogo.setPadding((int) dialogLogo.getResources().getDimension(R.dimen.dialog_logo_padding),
				(int) dialogLogo.getResources().getDimension(R.dimen.dialog_logo_padding), (int) dialogLogo
						.getResources().getDimension(R.dimen.dialog_logo_padding), (int) dialogLogo.getResources()
						.getDimension(R.dimen.dialog_logo_padding));
		rateDialogLL.addView(dialogLogo);

		View separatorTwo = new View(mContext);
		separatorTwo.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorTwo, 325, 1);

		TextView rateDialogTX = new TextView(mContext);
		rateDialogTX.setText(R.string.info);
		rateDialogTX.setWidth(250);
		rateDialogTX.setGravity(Gravity.CENTER);
		rateDialogTX.setPadding((int) rateDialogTX.getResources().getDimension(R.dimen.dialog_text_padding),
				(int) rateDialogTX.getResources().getDimension(R.dimen.dialog_text_padding), (int) rateDialogTX
						.getResources().getDimension(R.dimen.dialog_text_padding), (int) rateDialogTX.getResources()
						.getDimension(R.dimen.dialog_text_padding));
		rateDialogLL.addView(rateDialogTX);

		View separatorThree = new View(mContext);
		separatorThree.setBackgroundColor(Color.WHITE);
		rateDialogLL.addView(separatorThree, 325, 1);

		Button dontShowAgain = new Button(mContext);
		dontShowAgain.setBackgroundResource(R.drawable.button);
		dontShowAgain.setText(R.string.ok);
		dontShowAgain.setTextColor(Color.WHITE);
		// dontShowAgain.setTextSize((int)
		// dontShowAgain.getResources().getDimension(R.dimen.dialog_text_size));
		dontShowAgain.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {

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
