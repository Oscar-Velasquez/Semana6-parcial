package com.example.multifuncion;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

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
    public void Atras11(View view) {
        Intent Atras = new Intent(this, rep_audio_y_video.class);
        startActivity(Atras);
    }
}