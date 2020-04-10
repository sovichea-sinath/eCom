package kh.edu.paragoniu.ecom;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class VideoPlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        playVideo();
    }

    @Override
    protected void onPause() {
        super.onPause();

        pauseVideo();
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        resumeVideo();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        stopVideo();
    }

    void playVideo(){}
    void pauseVideo(){}
    void resumeVideo(){}
    void stopVideo(){}

}
