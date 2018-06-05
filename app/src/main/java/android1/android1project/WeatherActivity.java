package android1.android1project;

import android.content.Intent;
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
        String city = intent.getStringExtra("city");
        TextView weather = findViewById(R.id.weather);
        weather.setText(city);
    }
}
