package com.example.hackdavis2017;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

public class AddDate extends AppCompatActivity {

    private LinearLayout mLayout;


    private EditText mEditText;
    private EditText mEditText2;
    private Button mButton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_date);

        mLayout = (LinearLayout) findViewById(R.id.activity_add_date);
        //mLayout1 = (LinearLayout) findViewById(R.id.add_date1);
        //mLayout2 = (LinearLayout) findViewById(R.id.add_date2);

        mEditText = (EditText) findViewById(R.id.edit_message);
        mEditText2 = (EditText) findViewById(R.id.date);

        mButton = (Button) findViewById(R.id.add);


    }

}
