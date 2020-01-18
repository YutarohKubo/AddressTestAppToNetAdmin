package com.waffle.p000527207.addressapitestapp;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class AsyncNetworkTaskGet extends AsyncTask<String, Integer, String> {

    private static final String TAG = "AsyncNetworkTaskGet";
    private MainActivity activity;

    public AsyncNetworkTaskGet(Context context) {
        super();
        if (context instanceof MainActivity) {
            activity = (MainActivity) context;
        }
    }

    @Override
    protected String doInBackground(String... params) {
        StringBuilder builder = new StringBuilder();
        try {
            URL url = new URL("https://people.googleapis.com/v1/people/me?key=AIzaSyD4WH95LedjVBzlKY6SjbEmRFlWOrwmvzw");
            HttpURLConnection con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("Authorization", "Bearer ya29.Il-6B5ji0v_F7kfiRTJBHcsvkj3udBE42L0ZSORpa5pZqHqnX0fjVXT6CjGsl-rNuzA7PkyQud70dUai2pKgxJcapPM1OxABkxmMiUw5o_Q9JpwN_OPvkFLencam-DXk4g");
            con.setRequestProperty("Content-type", "application/json; charset=utr-8");
            con.setDoOutput(true);

            BufferedReader reader = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
            String line;
            while((line = reader.readLine()) != null) {
                builder.append(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return builder.toString();    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected void onPostExecute(String s) {
        Log.i(TAG, s);
    }
}
