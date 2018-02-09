package com.example.saikishoreeppalagudem.pwdtester;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static String pwd;
    public static Boolean pwdStrength = false;
    public static TextView tv;
    public static EditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        tv = findViewById(R.id.textView);
        editText = findViewById(R.id.editText);
        editText.getText();
       }

    public void btnClick(View view) {
        //Method to handle button click event.
        pwd = String.valueOf(editText.getText());
        Log.d("pwd", pwd);
        pwdStrength = Validator.validatePassword(pwd);
        Log.d("logmsg", pwdStrength.toString());
        if (pwdStrength) {
                tv.setTextColor(Color.parseColor("#0ab598"));
                tv.setText("Strong");
                editText.setBackgroundColor(Color.parseColor("#0ab598"));
            Log.d("logmsg", "btnClick: true");
        }
        else
        {
            tv.setTextColor(Color.parseColor("#e00b0b"));
            tv.setText("Weak");
            editText.setBackgroundColor(Color.parseColor("#e00b0b"));
            Log.d("logmsg", "btnClick: false");
        }


    }
}
