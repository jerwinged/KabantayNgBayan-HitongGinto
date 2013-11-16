package com.demo.sampleproject.datahandler;

import android.util.JsonReader;

import com.demo.sampleproject.datahandler.object.SaroEntry;
import com.demo.sampleproject.datahandler.util.AsyncHttpHandler;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

/**
 * Created by kevinpanuelos on 11/16/13.
 */
public class SaroHttpHandler {

    AsyncHttpHandler<SaroEntry> queryHandler = new AsyncHttpHandler<SaroEntry>() {
        @Override
        protected void onPostExecute(InputStream result) {
            try {
                JsonReader jsonReader = new JsonReader(new InputStreamReader(result, "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
    };
}
