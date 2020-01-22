package com.rio.absen;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class HomeAct extends AppCompatActivity {

    TextView hari,datetx;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        hari = findViewById(R.id.hari);
        datetx = findViewById(R.id.date);

        Calendar sCalendar = Calendar.getInstance();
        String dayLongName = sCalendar.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());

        hari.setText(dayLongName +",");

            Date today = Calendar.getInstance().getTime();//getting date
            SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");//formating according to my need
            String date = formatter.format(today);
            datetx.setText(date);

    }
}
