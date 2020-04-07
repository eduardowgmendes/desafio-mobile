package br.com.ciandt.application.fellini;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;

public class ConnectivityReceiver extends BroadcastReceiver {

    private static final String TAG = "conn_broadcast";
    private MovieApplication movieApplication = MovieApplication.getInstance();

    @Override
    public void onReceive(Context context, Intent intent) {
        Log.d(TAG, context + " isConnected: " + isConnected());
    }

    private boolean isConnected() {
        ConnectivityManager connectivityManager = movieApplication.getConnectivityManager();
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();

        if (activeNetworkInfo != null) {
            return activeNetworkInfo.isConnectedOrConnecting();
        }

        return false;
    }
}
