package com.example.recommend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class msearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                    WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_msearch);
            ImageButton ibutton3 = (ImageButton) findViewById(R.id.imageButton3);
            ImageButton ibutton4 = (ImageButton) findViewById(R.id.imageButton4);
            ImageButton ibutton5= (ImageButton) findViewById(R.id.imageButton5);
            ImageButton ibutton6 = (ImageButton) findViewById(R.id.imageButton6);
            ImageButton ibutton7 = (ImageButton) findViewById(R.id.imageButton7);
            ibutton3.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent=new Intent(msearch.this,MainActivity.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }
            });
            ibutton5.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent=new Intent(msearch.this,tsearch.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }
            });
            ibutton6.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent=new Intent(msearch.this,option.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }
            });
            ibutton7.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                    Intent intent=new Intent(msearch.this,msearch0.class);
                    startActivity(intent);
                    overridePendingTransition(R.anim.fadein, R.anim.fadeout);
                }
            });
    }
}