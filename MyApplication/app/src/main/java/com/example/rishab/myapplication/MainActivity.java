package com.example.rishab.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionBarPolicy;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {

    public Button ok_btn;
    public Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ok_btn = (Button) findViewById(R.id.button);
        ok_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(MainActivity.this,VideoActivity.class);
                MainActivity.this.startActivity(intent);
            }
        });

    }
}
