package com.demo.sampleproject.datahandler.util;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by kevinpanuelos on 11/16/13.
 */
public abstract class AsyncHttpHandler<N> extends AsyncTask<String, Integer, InputStream> {

    @Override
    protected InputStream doInBackground(String... uri) {
        InputStream httpResponse = null;
        try {
            httpResponse = HttpHandler.queryHtml(uri[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return httpResponse;
    }

    protected abstract void onPostExecute(InputStream result);

}
