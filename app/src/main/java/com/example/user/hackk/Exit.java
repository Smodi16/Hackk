package com.example.user.hackk;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

/**
 * Created by user on 16-02-2018.
 */

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;


import java.net.MalformedURLException;
//import java.net.URL;


public class Exit extends AppCompatActivity {
    String[] array={};
    AsyncTask<String, Void, String> s=null;
    Button button;
    String code;
    // ImageView imageView;
    // private static final String TAG =URL.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exit);
        Intent intent=getIntent();
        code=intent.getStringExtra("qr");
       // Toast.makeText(this, ""+code, Toast.LENGTH_SHORT).show();
        //TextView textView=(TextView)findViewById(R.id.text);
        //TextView textView=findViewById(R.id.text);
       // ImageView imageView=findViewById(R.id.imageview);
        button=findViewById(R.id.btn1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                url2 ur = new url2(Exit.this);
                // TextView textView=(TextView)findViewById(R.id.text);
                try{

                    //s=ur.execute("http://192.168.43.200/docs/saloni1.php").get();
                    s=ur.execute("https://99smodi.000webhostapp.com/saloni/exit.php?value="+code);

                    // Log.d(TAG,s);
                }catch(Exception IO){}

               onBackPressed();


            }
        });//listView.setAdapter(adapter);


    }
    public void onBackPressed() {
        moveTaskToBack(true);
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(1);
    }
}

