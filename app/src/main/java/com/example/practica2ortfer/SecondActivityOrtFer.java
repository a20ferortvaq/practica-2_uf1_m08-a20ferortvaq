package com.example.practica2ortfer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivityOrtFer extends AppCompatActivity {
    TextView tit;
    TextView subtit;
    TextView art;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity_ort_fer);
        tit=findViewById(R.id.titol);
        subtit=findViewById(R.id.subtitol);
        art=findViewById(R.id.article);
        Intent intent = getIntent();
        String getTxt = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        if(getTxt.equals("SCIENCE")){
            tit.setText(getResources().getText(R.string.titol));
            subtit.setText(getResources().getText(R.string.subtitolScience));
            art.setText(getResources().getText(R.string.text_articleScience));
        }else if(getTxt.equals("TECHNOLOGY")){
            tit.setText(getResources().getText(R.string.titol));
            subtit.setText(getResources().getText(R.string.subtitolTech));
            art.setText(getResources().getText(R.string.text_articleTech));
        }else if(getTxt.equals("HEALTH")){
            tit.setText(getResources().getText(R.string.titol));
            subtit.setText(getResources().getText(R.string.subtitolHealth));
            art.setText(getResources().getText(R.string.text_articleHealth));
        }
    }
}
