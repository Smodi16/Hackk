package com.example.user.hackk;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
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



import java.net.MalformedURLException;
//import java.net.URL;


public class Nescafe extends AppCompatActivity {
    String[] array={};
    AsyncTask<String, Void, String> s=null;
    // ImageView imageView;
    // private static final String TAG =URL.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nescafe);
        Intent intent=getIntent();
        String code=intent.getStringExtra("qr");
        //TextView textView=(TextView)findViewById(R.id.text);
        TextView textView=findViewById(R.id.text);
        ImageView imageView=findViewById(R.id.imageview);
        //listView.setAdapter(adapter);
        url ur = new url(Nescafe.this,imageView);
        // TextView textView=(TextView)findViewById(R.id.text);
        try{

            //s=ur.execute("http://192.168.43.200/docs/saloni1.php").get();
            s=ur.execute("https://99smodi.000webhostapp.com/saloni/img_qr.php?value="+code);
            // Log.d(TAG,s);
        }catch(Exception IO){}



    }
}
