package com.example.user.farmking;

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


public class Register extends AppCompatActivity {

    EditText fname,lname,email,password;
    Button submit;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        fname=(EditText)findViewById(R.id.etfirstname);
        lname=(EditText)findViewById(R.id.etlastname);
        email=(EditText)findViewById(R.id.etemail);
        password=(EditText)findViewById(R.id.etpasswordreg);

        submit=(Button)findViewById(R.id.btsubmit);
        //set onclick listener to button submit
        //saving to external database
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //classdownloaded

                AsyncHttpClient client=new AsyncHttpClient();


                RequestParams p=new RequestParams();

                p.put("fname",fname.getText().toString());
                p.put("lname",lname.getText().toString());
                p.put("email",email.getText().toString());
                p.put("password",password.getText().toString());

                //first parameter url path to php files
                // text response handler/string
                client.post("http://appbeesafrica.com/farm/farmking.php", p, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

                        Toast.makeText(Register.this,"Data insertion failed",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {


                        if (responseString.contains("true")){
                            Toast.makeText(Register.this,"Data was successfully inserted",Toast.LENGTH_SHORT).show();
                            //clearing the text after finishing
                            fname.setText("");
                            lname.setText("");
                            email.setText("");
                            password.setText("");

                        }
                        else if (responseString.contains("false")){
                            Toast.makeText(Register.this,"Failed to insert data",Toast.LENGTH_SHORT).show();
                        }

                        else if (responseString.contains("error")){
                            Toast.makeText(Register.this,"Id already registered",Toast.LENGTH_SHORT).show();
                        }







                    }
                });

            }
        });

    }
}
