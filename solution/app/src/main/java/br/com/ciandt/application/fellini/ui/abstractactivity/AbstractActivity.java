package br.com.ciandt.application.fellini.ui.abstractactivity;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.WindowManager;
import android.widget.ActionMenuView;
import android.widget.TextView;

import br.com.ciandt.application.fellini.ConnectivityReceiver;
import br.com.ciandt.application.fellini.MovieApplication;
import br.com.ciandt.application.fellini.domain.movie.Movie;

public class AbstractActivity extends AppCompatActivity {

    private final static MovieApplication APPLICATION = MovieApplication.getInstance();

    protected ConnectivityManager connectivityManager;

    private ConnectivityReceiver connectivityReceiver;
    private IntentFilter connectionIntentFilter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        connectivityManager = APPLICATION.getConnectivityManager();

        connectionIntentFilter = new IntentFilter(ConnectivityManager.EXTRA_NO_CONNECTIVITY);
        connectionIntentFilter.addAction(ConnectivityManager.CONNECTIVITY_ACTION);

        connectivityReceiver = new ConnectivityReceiver();
        registerReceiver(connectivityReceiver, connectionIntentFilter);
    }

    protected boolean isConnected() {
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnectedOrConnecting();
        }

        return false;
    }

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

    @Override
    protected void onDestroy() {
        super.onDestroy();
        unregisterReceiver(connectivityReceiver);
    }
}
