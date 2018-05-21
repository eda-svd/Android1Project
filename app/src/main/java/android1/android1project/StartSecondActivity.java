package android1.android1project;


import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.widget.EditText;

import static android.provider.Telephony.Mms.Part.TEXT;

public class StartSecondActivity implements View.OnClickListener {
    private Activity sourceActivity;
    public StartSecondActivity(Activity sourceActivity){
        this.sourceActivity = sourceActivity;
    }

    @Override
    public void onClick(View view) {
        EditText input = sourceActivity.findViewById(R.id.editText1);
        Intent intent = new Intent(sourceActivity, SecondActivity.class);
        intent.putExtra(TEXT,input.getText().toString());
        sourceActivity.startActivity(intent);
    }
}
