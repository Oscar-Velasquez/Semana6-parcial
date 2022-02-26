package com.example.multifuncion;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.VideoView;

public class video extends AppCompatActivity {

    VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        videoView = (VideoView)findViewById(R.id.Video);

        String path = "android.resource://"+ getPackageName() + "/" +
                R.raw.video;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}