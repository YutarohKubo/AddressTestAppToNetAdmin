package com.waffle.p000527207.addressapitestapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonConnection = findViewById(R.id.button_connection);
        buttonConnection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AsyncNetworkTaskGet taskGet = new AsyncNetworkTaskGet(MainActivity.this);
                taskGet.execute();
            }
        });
    }
}
