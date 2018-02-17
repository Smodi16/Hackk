package com.example.user.hackk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Imagess extends AppCompatActivity {
    String code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagess);
        Intent intent=getIntent();
         code=intent.getStringExtra("qr");
        ImageView imageView=findViewById(R.id.imageview);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inten=new Intent(Imagess.this,Nescafe.class);
                inten.putExtra("qr",code);
                startActivity(inten);
            }
        });

    }
}
