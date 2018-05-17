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
    /*private String greetPhrase(){

        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        Resources resources = getResources();
        String username = resources.getString(R.string.user_name);
        if (currentHour <=12 && currentHour >5  ){
            return String.format("%s %s!",resources.getString(R.string.morning), username);
        }
        else if (currentHour <=5 && currentHour >= 0 ){
            return String.format("%s %s!",resources.getString(R.string.night), username);
        }
        else if (currentHour <=24 && currentHour >= 18 ){
            return String.format("%s %s!",resources.getString(R.string.evening), username);
        }
        else {return String.format("%s %s!",resources.getString(R.string.day), username);}
    }*/

    public void refreshButton(View view){
        Toast.makeText(this,"wat",Toast.LENGTH_SHORT).show();
    }

    private String currentWeather(){
        int currentHour = Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
        Resources resources = getResources();
        String username = resources.getString(R.string.user_name);
        Random rnd = new Random(System.currentTimeMillis());
        int temperature = -68 + rnd.nextInt(128);
        return String.format("%s %s!",resources.getString(R.string.day), username, temperature, currentHour);
    }
}
