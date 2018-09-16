package com.staytools.adf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.TimePicker;

import java.util.Calendar;

public class onea extends AppCompatActivity {

    TimePicker time;
    String dd;
    Integer mm;
    String yy;
    Integer hh;
    Button set_time;
    TextView time_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onea);
        time=(TimePicker)findViewById(R.id.time);
        time.setIs24HourView(true);
        time_view=(TextView)findViewById(R.id.time_display);
        set_time=(Button)findViewById(R.id.set_time);
        set_time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                hh=time.getCurrentHour();
                mm=time.getCurrentMinute();
                if(hh<=9)
                {
                    if(mm<=9)
                    {
                        time_view.setText("0"+hh+": "+mm);
                    }
                    else
                    {
                        time_view.setText("0"+hh+": "+mm);
                    }
                }
                else
                {
                    if(mm<=9)
                    {
                        time_view.setText(hh+": 0"+mm);
                    }
                    else
                    {
                        time_view.setText(hh+": "+mm);
                    }
                }
            }
        });



    }
}
