package com.example.hackdavis2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.UUID;
import java.util.Map;
import com.rapidapi.rapidconnect.RapidApiConnect;
import com.rapidapi.utils.RapidApiConnect;
import com.rapidapi.utils.Argument;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Forum extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forum);
        String UID = UUID.randomUUID().toString();

    }

    RapidApiConnect connect = new RapidApiConnect("hd2017", "a75a38d3-8c55-4c9d-91be-9c94463d29b4");

    Map<String, Argument> body = new HashMap<String, Argument>();

    body.put("token", new Argument("data", "xoxp-129659158343-130536768227-130141584240-f3ce6aad33a8c8955184dac6d0b981ce"));
    body.put("simpleLatest", new Argument("data", ""));
    body.put("noUnreads", new Argument("data", ""));
    body.put("mpimAware", new Argument("data", ""));


    try {
        Map<String, Object> response = connect.call('Slack', 'startRealTimeMessaging', body);
        if(response.get("success") != null) {
            System.out.println("s");

        } else{
              System.out.println("f");

        }
    } catch(Exception e){


    }
}
