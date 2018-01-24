package com.example.user.healthyfamilies;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
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

public class Trackmeals extends AppCompatActivity {

    EditText etday,etc,etp,etv;
    Button save,view,delete,search;
    //create a database
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trackmeals);

        //finding my edittexts

        etday=(EditText)findViewById(R.id.etday);
        etc=(EditText)findViewById(R.id.etcarbohydrate);
        etp=(EditText)findViewById(R.id.etprotein);
        etv=(EditText)findViewById(R.id.etvitamin);

        //finding my buttons
        save=(Button)findViewById(R.id.btsave);
        view=(Button)findViewById(R.id.btview);
        delete=(Button)findViewById(R.id.btdelete);
        search=(Button)findViewById(R.id.btsearch);

        //creating database
        db=openOrCreateDatabase("healthyfamiliesDB", Context.MODE_PRIVATE,null);
        //creating table
        db.execSQL("CREATE TABLE IF NOT EXISTS records (day VARCHAR,carbohydrate VARCHAR,proteins VARCHAR,vitamins VARCHAR);");
        //set onclick listeners to buttons
        //set onclick listener to the external database

//saving to external database
        /*save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //classdownloaded

                AsyncHttpClient client=new AsyncHttpClient();


                RequestParams p=new RequestParams();

                p.put("etdayy",etday.getText().toString());
                p.put("etcc",etc.getText().toString());
                p.put("etpp",etp.getText().toString());
                p.put("etvv",etv.getText().toString());

                //first parameter url path to php files
                // text response handler/string
                client.post("http://ccpafrica.net/family/families.php", p, new TextHttpResponseHandler() {
                    @Override
                    public void onFailure(int statusCode, Header[] headers, String responseString, Throwable throwable) {

                        Toast.makeText(Trackmeals.this,"Data inser tion failed",Toast.LENGTH_SHORT).show();

                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, String responseString) {


                        if (responseString.contains("true")){
                            Toast.makeText(Trackmeals.this,"Data was successfully inserted",Toast.LENGTH_SHORT).show();
                            //clearing the text after finishing
                            etday.setText("");
                            etc.setText("");
                            etp.setText("");
                            etv.setText("");

                        }
                        else if (responseString.contains("false")){
                            Toast.makeText(Trackmeals.this,"Failed to insert data",Toast.LENGTH_SHORT).show();
                        }
                        else if (responseString.contains("error")){
                            Toast.makeText(Trackmeals.this,"Id already registered",Toast.LENGTH_SHORT).show();
                        }







                    }
                });

            }
        });


*/


//saving to local database

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etday.getText().toString().trim().length()==0){
                    showmessage("ERROR!!!","Plese add a day");
                }
                else if (etc.getText().toString().trim().length()==0){
                    showmessage("ERROR!!", "Pease add a carbohydrate meal");
                }
                else if (etp.getText().toString().trim().length()==0){
                    showmessage("ERROR!!","Please a protein meal");
                }
                else if (etv.getText().toString().trim().length()==0){
                    showmessage("ERROR!!","Please a vitamin meal");
                }

                else {
                    db.execSQL("INSERT INTO records VALUES('"+etday.getText()+"','"+etc.getText()+"','"+etp.getText()+"','"+etv.getText()+"')");
                    showmessage("Congratulations","Insertion Successsful");
                    textclear();
                }
            }
        });



        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c=db.rawQuery("SELECT * FROM records",null);

                if (c.getCount() == 0) {
                    showmessage("Sorry","No results");
                }
                StringBuffer buffer=new StringBuffer();
                while (c.moveToNext()){
                    buffer.append("Day of the week:"+c.getString(0));
                    buffer.append("\n");
                    buffer.append("Carbohydrate meal:"+c.getString(1));
                    buffer.append("\n");
                    buffer.append("Protein meal:"+c.getString(2));
                    buffer.append("\n");
                    buffer.append("Vitamin meal:"+c.getString(3));
                    buffer.append("\n---------");

                }

                showmessage("FAMILY RECORDS",buffer.toString());
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delete=new Intent(Trackmeals.this,Delete.class);
                startActivity(delete);
            }
        });

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search=new Intent(Trackmeals.this,Search.class);
                startActivity(search);
            }
        });






    }
    //creating method to show message
    public void showmessage(String title,String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.show();
    }
    //clearingdata
    public void textclear(){
        etday.setText("");
        etc.setText("");
        etp.setText("");
        etv.setText("");

    }
}
