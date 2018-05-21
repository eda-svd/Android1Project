package android1.android1project;

import android.content.res.Resources;
import android.support.constraint.ConstraintLayout;
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

    }

    public void refreshButton(View view){
        ConstraintLayout background = (ConstraintLayout) findViewById(R.id.background);
    }



    private String currentWeather(){
        Resources resources = getResources();
        String username = resources.getString(R.string.user_name);

        return username +"\n"+ "Текущая температура:" + tValue() +"°";
    }
    private int tValue(){
        Random rnd = new Random(System.currentTimeMillis());
        int temperature = -68 + rnd.nextInt(128);
        return temperature;
    }
}
