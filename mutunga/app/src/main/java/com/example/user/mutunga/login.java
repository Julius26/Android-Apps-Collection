package com.example.user.mutunga;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);

        EditText username=(EditText)findViewById(R.id.username);
        EditText password=(EditText)findViewById(R.id.password);
        final Button login=(Button)findViewById(R.id.login);
        final Button createaccount=(Button)findViewById(R.id.createaccount);

        createaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rregisterIntent=new Intent(login.this,register.class);
                login.this.startActivity(rregisterIntent);
            }
        });

    }
}
