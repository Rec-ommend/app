package com.example.recommend;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.TextView;

public class moreinfo2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_moreinfo);
        LinearLayout cona=(LinearLayout)findViewById(R.id.con);
        TextView[] textView=new TextView[100];
        for(int i=0; i<=99; i++)
        {
            textView[i] = new TextView(this);
            textView[i].setTextSize(15);
            textView[i].setText((i+1)+"번째 노래");
            cona.addView(textView[i]);
        }
        for(int i=0;i<=5;i++)
        {
            textView[i] = new TextView(this);
            textView[i].setTextSize(15);
            textView[i].setText("");
            cona.addView(textView[i]);
        }

    }
}