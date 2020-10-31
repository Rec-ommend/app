package com.example.recommend;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class msearch0 extends AppCompatActivity {

    final private static String RECORDED_FILE = "/sdcard/recorded.mp4";

    MediaPlayer player;
    MediaRecorder recorder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        permissionCheck();
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_msearch0);


        ImageButton ibutton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton ibutton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton ibutton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton ibutton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton ibutton7 = (ImageButton) findViewById(R.id.imageButton7);


        if (recorder == null) {
            recorder = new MediaRecorder();
        }

        recorder.setAudioSource(MediaRecorder.AudioSource.MIC);
        recorder.setOutputFormat(MediaRecorder.OutputFormat.MPEG_4);
        recorder.setAudioEncoder(MediaRecorder.AudioEncoder.DEFAULT);
        recorder.setOutputFile(RECORDED_FILE);
        try {
            recorder.prepare();
            recorder.start();
        } catch (Exception ex) {
            Log.e("SampleAudioRecorder", "Exception : ", ex);
        }

        final TextView time1 = (TextView) findViewById(R.id.textView4);
        final Timer timer=new Timer();
        final TimerTask ti=new TimerTask(){
            int second,minute,seconds=0;
            @Override
            public void run(){
                seconds+=1;
                minute=seconds/60;
                second=seconds%60;
                time1.setText(String.format("%02d : %02d",minute,second));
            }
        };
        timer.schedule(ti,0,1000);

        ibutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(msearch0.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(msearch0.this, tsearch.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(msearch0.this, option.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (recorder == null)
                    return;
                recorder.stop(); // 녹음 중지
                recorder.release(); // recorder에 지정된 리소스 해제
                recorder = null;

                Intent intent = new Intent(msearch0.this, msearchr.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);

            }
        });
    }
    public void permissionCheck(){
        if (ContextCompat.checkSelfPermission(this, Manifest.permission.WRITE_EXTERNAL_STORAGE) != PackageManager.PERMISSION_GRANTED
                || ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.RECORD_AUDIO}, 1);
        }
    }
}