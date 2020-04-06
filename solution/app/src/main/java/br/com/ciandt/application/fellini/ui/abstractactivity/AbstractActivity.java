package br.com.ciandt.application.fellini.ui.abstractactivity;

import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.TextView;

public class AbstractActivity extends AppCompatActivity {

    /**
     * Sets the Window of App with no Limits
     */
    protected void enableWindowNoLimits() {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);
    }

    protected void applyMarquee(TextView textView) {
        textView.setSingleLine(true);
        //textView.setHorizontallyScrolling(true);
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setSelected(true);
        textView.setFreezesText(true);
        textView.setHorizontalFadingEdgeEnabled(true);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setMarqueeRepeatLimit(10);
    }

}
