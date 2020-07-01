package com.example.checklist;

import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView dayTextField = findViewById(R.id.day);
        dayTextField.setText(getDay());
    }

    static Date date = new Date();
    static SimpleDateFormat formatter = new SimpleDateFormat("EEEE");
    static String day = formatter.format(date);

    private static String getDay(){
        switch(day.toLowerCase()){
            case "monday": return day + " - Triceps/Biceps";
            case "tuesday": return day + " - Shoulders";
            case "wednesday": return day + " - Legs";
            case "thursday": return day + " - Chest";
            case "friday": return day + " - Back";
        }
        return "Error";
    }

    private static String[] getWorkOuts(String choice){
        switch(choice.toLowerCase()) {
            case "monday": return new String[]{"Tricep Pulldown", "Weight Pullback", "Skull Crusher", "Seated Dips", "Curls", "Reverse curl", "Bent over row"};
            case "tuesday": return new String[]{"Dumbell raise", "Shoulder shrug", "Rope behind back", "Shoulder press", "Front dumbell raise", "Lateral raises", "Bent over angle"};
            case "wednesday": return new String[]{"Leg curl", "Leg extension", "Squats", "Leg press", "Tire", "Inner thigh", "Outer thigh"};
            case "thursday": return new String[]{"Bent over row", "Single arm dumbell row", "Inverted row", "Lawnmower", "Lat pulldown", "Seated cable rows", "Chest supported cable rows"};
            case "friday": return new String[]{"Barbell bench", "Incline dumbell bench", "Push ups", "Dips", "Dumbell pullover", "Dumbell fly", "Cable crossover"};
        }
        return new String[]{"Error"};
    }
}