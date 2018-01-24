package com.example.user.mutunga;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Button alreadyhaveaccount=(Button)findViewById(R.id.alreadyhaveaccount);
        EditText surname=(EditText)findViewById(R.id.surname);
        EditText firstname=(EditText)findViewById(R.id.firstname);
        EditText age=(EditText)findViewById(R.id.age);
        EditText password=(EditText)findViewById(R.id.password);
        Button register=(Button)findViewById(R.id.register);

    }
}
