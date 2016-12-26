package com.example.abozaid.countingclicks;

import android.app.Activity;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    public int counter1 = 0;
    public int counter2 = 0;
    public int counter3 = 0;
    public int counter4 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter1 += 1;
                Button bt = (Button) findViewById(R.id.button);
                bt.setText("" + counter1);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter2 += 1;
                Button bt = (Button) findViewById(R.id.button2);
                bt.setText("" + counter2);
            }
        });
        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter3 += 1;
                Button bt = (Button) findViewById(R.id.button3);
                bt.setText("" + counter3);
            }
        });

        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                counter4 += 1;
                Button bt = (Button) findViewById(R.id.button4);
                bt.setText("" + counter4);
            }
        });
    }
}