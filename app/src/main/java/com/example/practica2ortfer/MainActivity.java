package com.example.practica2ortfer;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static String EXTRA_MESSAGE;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void pressScience(){
        Intent intent = new Intent(this, SecondActivityOrtFer.class);
        intent.putExtra(EXTRA_MESSAGE, "SCIENCE");
        startActivity(intent);
    }
    public void pressTechnology(){
        Intent intent = new Intent(this, SecondActivityOrtFer.class);
        intent.putExtra(EXTRA_MESSAGE, "TECHNOLOGY");
        startActivity(intent);
    }
    public void pressHealth(){
        Intent intent = new Intent(this, SecondActivityOrtFer.class);
        intent.putExtra(EXTRA_MESSAGE, "HEALTH");
        startActivity(intent);
    }
    public void pressURL(){
        EditText editText = findViewById(R.id.editTxtUrl);
        String url = String.valueOf(editText.getText());
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}