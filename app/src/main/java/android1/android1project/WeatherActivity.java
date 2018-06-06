package android1.android1project;

import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

import static java.security.AccessController.getContext;

public class WeatherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.weather_activity);
        Intent intent = getIntent();
        int city = intent.getIntExtra("city2",0);
        TextView weather = findViewById(R.id.textView);
        Resources resources = getResources();
        TypedArray temperatures = getResources().obtainTypedArray(R.array.cities);
        String s;
        weather.setText(temperatures.getText(city));
    }
}
