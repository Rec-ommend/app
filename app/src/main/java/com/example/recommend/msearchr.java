package com.example.recommend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaRecorder;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

public class msearchr extends AppCompatActivity {
    final private static String RECORDED_FILE = "/sdcard/recorded.mp4";
    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_msearchr);

        ImageButton ibutton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton ibutton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton ibutton5 = (ImageButton) findViewById(R.id.imageButton5);
        ImageButton ibutton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton ibutton8 = (ImageButton) findViewById(R.id.imageButton8);
        ImageButton ibutton9 = (ImageButton) findViewById(R.id.imageButton9);
        ImageButton ibutton10 = (ImageButton) findViewById(R.id.imageButton10);
        ImageButton ibutton17= (ImageButton) findViewById(R.id.imageButton17);
        ImageButton ibutton12= (ImageButton) findViewById(R.id.imageButton12);
        final ImageView imageView3=(ImageView) findViewById(R.id.imageView3);
        final ImageView imageView7=(ImageView) findViewById(R.id.imageView7);
        final ImageView imageView8=(ImageView) findViewById(R.id.imageView8);
        final ImageView imageView9=(ImageView) findViewById(R.id.imageView9);

        ibutton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                Intent intent = new Intent(msearchr.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                Intent intent = new Intent(msearchr.this, tsearch.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                Intent intent = new Intent(msearchr.this, option.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                imageView3.setVisibility(android.view.View.VISIBLE);
                imageView7.setVisibility(android.view.View.INVISIBLE);
                imageView8.setVisibility(android.view.View.INVISIBLE);
                imageView9.setVisibility(android.view.View.INVISIBLE);

            }
        });
        ibutton9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                imageView3.setVisibility(android.view.View.INVISIBLE);
                imageView7.setVisibility(android.view.View.VISIBLE);
                imageView8.setVisibility(android.view.View.INVISIBLE);
                imageView9.setVisibility(android.view.View.INVISIBLE);
            }
        });
        ibutton10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                imageView3.setVisibility(android.view.View.INVISIBLE);
                imageView7.setVisibility(android.view.View.INVISIBLE);
                imageView8.setVisibility(android.view.View.VISIBLE);
                imageView9.setVisibility(android.view.View.INVISIBLE);
            }
        });
        ibutton17.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                imageView3.setVisibility(android.view.View.INVISIBLE);
                imageView7.setVisibility(android.view.View.INVISIBLE);
                imageView8.setVisibility(android.view.View.INVISIBLE);
                imageView9.setVisibility(android.view.View.VISIBLE);
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
            }
                try {
                    player = new MediaPlayer ();

                    player.setDataSource(RECORDED_FILE);
                    player.prepare();
                    player.start();


                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        });
        ibutton12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (player != null) {
                    player.stop();
                    player.release();
                    player = null;
                }
                Intent intent = new Intent(msearchr.this, moreinfo.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
    }

}