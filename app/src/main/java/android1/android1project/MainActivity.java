package android1.android1project;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView weather = (TextView)  findViewById(R.id.weather);
        weather.setText(currentWeather());
    }

    public void refreshButton(View view){
        TextView weather = (TextView)  findViewById(R.id.weather);
        weather.setText(currentWeather());
    }

    private String currentWeather(){
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        Resources resources = getResources();
        String username = resources.getString(R.string.user_name);
        Random rnd = new Random(System.currentTimeMillis());
        int temperature = -68 + rnd.nextInt(128);
        return username +"\n"+ "Текущая температура:" + temperature +"градусов";
    }
}
