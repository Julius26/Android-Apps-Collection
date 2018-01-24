package com.example.user.mysqlite1;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Contentdelete extends AppCompatActivity {
    //finding your edit text
    EditText delete;
    Button del;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contentdelete);


        delete=(EditText)findViewById(R.id.etdelete);
        del=(Button)findViewById(R.id.delete);

        db = openOrCreateDatabase("studentsDB", Context.MODE_PRIVATE, null);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

       /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (del.getText().toString().trim().length() == 0) {
                    showmessage("Error", "Please type a roll number");

                    Cursor c=db.rawQuery("SELECT * FROM students WHERE rollno='"+del.getText()+"'",null);

                    if (c.moveToFirst()){
                        db.execSQL(("DELETE FROM students WHERE rollno='"+del.getText()+"'"));
                        Snackbar.make(view, "Record deleted succcessfully", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                    }
                    //back option

                }
            }
        });*/
       del.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               if (delete.getText().toString().trim().length() == 0) {
                   showmessage("Error", "Please type a roll number");
               }
                   Cursor c=db.rawQuery("SELECT * FROM students WHERE rollno='"+delete.getText()+"'",null);

                   if (c.moveToFirst()){
                       db.execSQL(("DELETE FROM students WHERE rollno='"+delete.getText()+"'"));
                      showmessage("Congatulations","Record deleted successfully");
                   }
                   //back option

               }

           });
       }

    //creating method to show message
    public void showmessage(String title, String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setMessage(message);
        builder.setTitle(title);
        builder.show();

    }
}
