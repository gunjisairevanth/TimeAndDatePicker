package com.staytools.adf;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class date extends AppCompatActivity {

    DatePicker date;
    int dd,mm,yy;
    Button set_date;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_date);
        date=(DatePicker)findViewById(R.id.date);
        set_date=(Button)findViewById(R.id.set_date);
        set_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dd=date.getDayOfMonth();
                yy=date.getYear();
                mm=date.getMonth();
                display=(TextView)findViewById(R.id.set_date_display);
                display.setText(dd+"/"+mm+"/"+yy);
            }
        });



    }
}
