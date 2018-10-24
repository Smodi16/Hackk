
package com.example.user.hackk;



import android.content.Intent;
import android.location.Location;
import android.net.Uri;
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


public class Imagess extends AppCompatActivity {
    String[] array={};
    AsyncTask<String, Void, String> s=null;
    Button button;
    String code;
    Button button2;
    // ImageView imageView;
    // private static final String TAG =URL.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagess);
        Intent intent=getIntent();
        code=intent.getStringExtra("qr");
        ImageView imageView=findViewById(R.id.imageview);
        button=findViewById(R.id.btn1);
        button2=findViewById(R.id.navigation);

        url3 ur = new url3(Imagess.this);
        try{
            s=ur.execute("https://99smodi.000webhostapp.com/saloni/slot_generation.php?value="+code);

            // Log.d(TAG,s);
        }catch(Exception IO){}

        button2.setOnClickListener(new View.OnClickListener()
        {

            url4 ur = new url4(Imagess.this);
            public void onClick(View view)
            {

                try{

                    s=ur.execute("https://99smodi.000webhostapp.com/saloni/latitude.php?value="+code);

                    // Log.d(TAG,s);
                }catch(Exception IO){}


            }
        });
        button.setOnClickListener(new View.OnClickListener() {


            public void onClick(View v) {



                Intent inten=new Intent(Imagess.this,Nescafe.class);
                inten.putExtra("qr",code);
                startActivity(inten);
            }
        });


    }
}


