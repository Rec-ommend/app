package com.example.recommend;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class tsearch extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_tsearch);
        ImageButton ibutton3 = (ImageButton) findViewById(R.id.imageButton3);
        ImageButton ibutton4 = (ImageButton) findViewById(R.id.imageButton4);
        ImageButton ibutton5= (ImageButton) findViewById(R.id.imageButton5);
        ImageButton ibutton6 = (ImageButton) findViewById(R.id.imageButton6);
        ImageButton ibutton7 = (ImageButton) findViewById(R.id.imageButton7);
        ibutton3.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(tsearch.this,MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton4.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(tsearch.this,msearch.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton6.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent=new Intent(tsearch.this,option.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            }
        });
        ibutton7.setOnClickListener(new View.OnClickListener(){
                public void onClick(View v){
                Intent intent=new Intent(tsearch.this,tsearch0.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
});
    }
}