package android1.android1project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Random;

import static android.provider.Telephony.Mms.Part.TEXT;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String city = getIntent().getExtras().getString(TEXT);
        TextView textView = findViewById(R.id.textView);
        textView.setText(city);
        TextView weather = findViewById(R.id.temperature);
        weather.setText(currentWeather());
    }

    private String currentWeather(){
        return "Текущая температура:" + tValue() +"°";
    }

    private int tValue(){
        Random rnd = new Random(System.currentTimeMillis());
        int temperature = -68 + rnd.nextInt(128);
        return temperature;
    }

}
