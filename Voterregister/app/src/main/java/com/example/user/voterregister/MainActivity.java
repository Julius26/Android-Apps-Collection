package com.example.user.voterregister;

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

public class MainActivity extends AppCompatActivity {
    //DECLARING BUTTONS AND EDITTEXTS
    EditText a,b,c;
    Button reg,view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //finding edittexts
        a=(EditText)findViewById(R.id.name);
        b=(EditText)findViewById(R.id.idno);
        c=(EditText)findViewById(R.id.pollstation);
        //finding buttons
        reg=(Button)findViewById(R.id.register);
        view=(Button)findViewById(R.id.view);

        //set onclick listener
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //find the class downloaded
                AsyncHttpClient client=new AsyncHttpClient();
                RequestParams p=new RequestParams();

                p.put("uname",a.getText().toString());
                p.put("uid",b.getText().toString());
                p.put("uward",c.getText().toString());


                client.post("http://ccpafrica.net/safari/register.php", p, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {
                        //using toast to display records
                        Toast.makeText(MainActivity.this,"Failure to submit records",Toast.LENGTH_LONG).show();
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {

                        //clearing the text after submitting
                        a.setText("");
                        b.setText("");
                        c.setText("");

                    }
                });

            }
        });

    }
}
