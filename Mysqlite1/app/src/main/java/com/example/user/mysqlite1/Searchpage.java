package com.example.user.mysqlite1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Searchpage extends AppCompatActivity {
    Button b;
    EditText ed;
    TextView results;
    SQLiteDatabase db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searchpage);

        ed=(EditText)findViewById(R.id.edtext);
        b=(Button)findViewById(R.id.search);
        results=(TextView)findViewById(R.id.results);

        db=openOrCreateDatabase("studentsDB", Context.MODE_PRIVATE,null);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c=db.rawQuery("SELECT * FROM students WHERE rollno='"+ed.getText()+"'",null);
                if (c.getCount()==0){
                    showmessage("Sorry","No records found");
                }
                else if (c.moveToFirst()){
                    results.setText(c.getString(0)+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n");
                }
                showmessage("Error","No matching records");
            }
        });

    }
    public void showmessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

    }

