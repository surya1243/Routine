package com.example.surya.routine;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b2,b4,b6,b8;
        b2=(Button) findViewById(R.id.II);
        b4=(Button) findViewById(R.id.IV);
        b6=(Button) findViewById(R.id.VI);
        b8=(Button) findViewById(R.id.VIII);
        final Intent n = new Intent();
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                n.setClass(getApplicationContext(), II.class);
                startActivity(n);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                n.setClass(getApplicationContext(),IV.class);
                startActivity(n);
            }
        });
    }
    private void Testuplode(){
        int i=1+1;
        int ii=2+2;
        int iii=i+ii;
    }
}
