package com.example.user.farmking;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.RequestParams;
import com.loopj.android.http.TextHttpResponseHandler;

import cz.msebera.android.httpclient.Header;

public class Home extends AppCompatActivity {

    EditText  username,passwordlog;
    Button login,register,forgotpassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        username=(EditText)findViewById(R.id.etemaillog);
        passwordlog=(EditText)findViewById(R.id.etpassword);

        login=(Button)findViewById(R.id.btlogin);
        register=(Button)findViewById(R.id.btregister);
        forgotpassword=(Button)findViewById(R.id.btnfpassword);
        //set onclick listener to log in page
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //classdownloaded

                AsyncHttpClient client=new AsyncHttpClient();


                RequestParams p=new RequestParams();

                p.put("username",username.getText().toString());
                p.put("passwordlog",passwordlog.getText().toString());


                //first parameter url path to php files
                // text response handler/string
                client.post("http://appbeesafrica.com/farm/login.php", p, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

                        Toast.makeText(Home.this,"Log In failed",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {


                        if (responseString.contains("true")){
                            Toast.makeText(Home.this,"Log In Successfull",Toast.LENGTH_SHORT).show();
                            //clearing the text after finishing
                            username.setText("");
                            passwordlog.setText("");


                        }
                        if (responseString.contains("true")){
                            Toast.makeText(Home.this,"Log in not successful",Toast.LENGTH_SHORT).show();
                        }











                    }
                });

            }
        });

        //set an intent to register page
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reg=new Intent(Home.this,Register.class);
                startActivity(reg);


            }
        });

    }
}
