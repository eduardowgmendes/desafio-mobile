package br.com.ciandt.application.fellini;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;

import com.squareup.picasso.Picasso;

import br.com.ciandt.application.fellini.service.legacycode.Client;
import br.com.ciandt.application.fellini.service.legacycode.CrewService;
import br.com.ciandt.application.fellini.service.legacycode.GenresService;
import br.com.ciandt.application.fellini.service.legacycode.MovieService;
import br.com.ciandt.application.fellini.service.legacycode.SearchService;

public class MovieApplication extends Application {

    private ConnectivityManager connectivityManager;

    private static final String TAG = "movieapplication";

    private static MovieApplication instance = null;

    public static MovieApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        instance = this;

        connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(Context.CONNECTIVITY_SERVICE);

        /* SquareUp Picasso Lib Singleton Instance */
        Picasso.setSingletonInstance(new Picasso.Builder(this).build());

    }

    public ConnectivityManager getConnectivityManager() {
        return connectivityManager;
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
