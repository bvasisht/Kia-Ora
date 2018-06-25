package com.example.hackdavis2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Home extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void AddDate(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, AddDate.class);
        ImageButton imageButton = (ImageButton) findViewById(R.id.add1);
        startActivity(intent);
    }

    public void PlayMedia(View view){
        Intent intent = new Intent(this, PlayMedia.class);
        ImageButton imageButton = (ImageButton) findViewById(R.id.play);
        startActivity(intent);
    }

    public void Forum(View view){
        Intent intent = new Intent(this, Forum.class);
        ImageButton imageButton = (ImageButton) findViewById(R.id.forums);
        startActivity(intent);
    }
}
