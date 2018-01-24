package com.example.user.mysqlite1;

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

public class MainActivity extends AppCompatActivity {
    //declaring edit texts
    EditText editrollno,editname,editmarks;

    //declaring buttons
    Button btnsave,btnview,btndelete,btnsearch;
    //creating a DB
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding your edittexts
        editrollno=(EditText)findViewById(R.id.editrollno);
        editname=(EditText)findViewById(R.id.editname);
        editmarks=(EditText)findViewById(R.id.editmarks);

        //finding your buttons
        btnsave=(Button)findViewById(R.id.btnsave);
        btnview=(Button)findViewById(R.id.btnview);
        btndelete=(Button)findViewById(R.id.btndelete);
        btnsearch=(Button)findViewById(R.id.btnsearch);

        //creating database
        db=openOrCreateDatabase("studentsDB", Context.MODE_PRIVATE,null);
        //creating table
        db.execSQL("CREATE TABLE IF NOT EXISTS students (rollno VARCHAR,name VARCHAR,marks VARCHAR);");
       //setting onclick listener

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editrollno.getText().toString().trim().length()==0){
                    showmessage("ROLL NO ERROR!!!","Plese enter correct no");
                }
                else if (editname.getText().toString().trim().length()==0){
                    showmessage("Enter name or", "fuck off");
                }
                else if (editmarks.getText().toString().trim().length()==0){
                    showmessage("Marks incorrect","Please input marks");
                }
                else {
                    db.execSQL("INSERT INTO students VALUES('"+editrollno.getText()+"','"+editname.getText()+"','"+editmarks.getText()+"')");
                    showmessage("Congratulations","Insertion Successsful");
                    textclear();
                }
            }
        });
        btnview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c=db.rawQuery("SELECT * FROM students",null);

                if (c.getCount() == 0) {
                    showmessage("Sorry","No results");
                }
                StringBuffer buffer=new StringBuffer();
                while (c.moveToNext()){
                    buffer.append("Roll Number:"+c.getString(0));
                    buffer.append("\n");
                    buffer.append("Student name:"+c.getString(1));
                    buffer.append("\n");
                    buffer.append("Student marks:"+c.getString(2));
                    buffer.append("\n---------");

                }

                showmessage("STUDENT RECORDS",buffer.toString());
            }
        });
       btndelete.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent delete=new Intent(MainActivity.this,Contentdelete.class);
               startActivity(delete);

           }
       });

        btnsearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent search=new Intent(MainActivity.this,Searchpage.class);
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
        editrollno.setText("");
        editname.setText("");
        editmarks.setText("");
    }
}
