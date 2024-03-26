package com.example.a62043258_videoview;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    private VideoView vdoFile;
    private VideoView vdoUrl;
    private MediaController mediaControllerFile;
    private MediaController mediaControllerUrl;
    private Uri uriFile;
    private Uri uriUrl;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    //fild
        vdoFile = (VideoView) findViewById(R.id.videoView1);
        String videoFilePath = "android.resource://" + getPackageName()+"/" +R.raw.vdo;
        uriFile = Uri.parse(videoFilePath);
        vdoFile.setVideoURI(uriFile);

        mediaControllerFile = new MediaController(this);
        vdoFile.setMediaController(mediaControllerFile);
        mediaControllerFile.setAnchorView(vdoFile);
    //ur
        vdoUrl = (VideoView) findViewById(R.id.videoView2);
        String videoUrlPath = "https://cdn.discordapp.com/attachments/1164573644358426725/1222142907381841960/vdo.mp4?ex=66152447&is=6602af47&hm=a85f50fd19f266a9407cc9fb287edfe787f9b1a520c4d32a08b56f048f1282be&";
        vdoUrl.setVideoPath(videoUrlPath);

        mediaControllerUrl = new MediaController(this);
        vdoUrl.setMediaController(mediaControllerUrl);
        mediaControllerUrl.setAnchorView(vdoUrl);
    }
}