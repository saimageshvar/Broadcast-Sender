package com.example.sai.callanotherapp;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("HIT OUTGOING");
        Intent i = new Intent();
        i.putExtra("Msg","Hello");
        i.setAction("jason.wei.custom.intent.action.CUSTOM_INTENT");
        sendBroadcast(i);

    }
}
