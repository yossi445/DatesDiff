package com.example.yossi.datesdiff;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn;
    Date dt1 ;
    Date dt2 ;

    TextView tvStart, tvStop, tvTotal;

    String s = "Hello";




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        btn.setOnClickListener(this);

        tvStart=findViewById(R.id.tvStart);
        tvStop=findViewById(R.id.tvStop);
        tvTotal=findViewById(R.id.tvTotal);


    }

    @Override
    public void onClick(View v) {

        Button b = (Button) v;
        if (b.getText().toString().equals("start")){
            dt1 = new Date();

            dt1.getTime();
            tvStart.setText(String.valueOf(dt1.toString()));

            b.setText("stop");
        }
        else if (b.getText().toString().equals("stop")){

            dt2 = new Date();
            dt2.getTime();

            tvStop.setText(String.valueOf(dt2.toString()));

            long diff = dt2.getTime() - dt1.getTime();
            long diffMinutes = diff / (60 * 1000) % 60;

            tvTotal.setText(String.valueOf(diffMinutes));

            //b.setText("st");
            btn.setVisibility(View.INVISIBLE);




        }






    }
}
