package com.example.rishab.myapplication;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.VideoView;

/**
 * Created by RISHAB on 27-May-16.
 */
public class VideoActivity extends AppCompatActivity {

   public VideoView videoview;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);
         videoview = (VideoView) findViewById(R.id.videoView);

        Uri uri = Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.video);

        videoview.setVideoURI(uri);
        videoview.start();
    }
}
