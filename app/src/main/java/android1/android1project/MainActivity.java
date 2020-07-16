package android1.android1project;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static android.provider.Telephony.Mms.Part.TEXT;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




/*        final EditText text = findViewById(R.id.editText);
        Button button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                if ("".equals(text.getText().toString().trim())){
                    Toast.makeText(MainActivity.this, R.string.empty_city,Toast.LENGTH_SHORT).show();
                }else {

                    Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                    intent.putExtra(TEXT, text.getText().toString());
                    MainActivity.this.startActivity(intent);
                }
            }
        });*/

    }
}

