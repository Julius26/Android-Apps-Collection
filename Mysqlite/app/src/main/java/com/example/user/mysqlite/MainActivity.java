package com.example.user.mysqlite;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Message;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
     //declare variables
    EditText editRollNo,editName,editMarks;
    Button btnAdd,btnView,delete,search;

    //creating a database
    SQLiteDatabase db;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //find your edit texts
        editRollNo=(EditText)findViewById(R.id.editRollNo);
        editName=(EditText)findViewById(R.id.editName);
        editMarks=(EditText)findViewById(R.id.editMarks);

        //find your buttons
        btnAdd=(Button)findViewById(R.id.btnAdd);
        btnView=(Button)findViewById(R.id.btnView);
        delete=(Button)findViewById(R.id.delete);
        search=(Button)findViewById(R.id.search);


        //database
        db=openOrCreateDatabase("StudentsDB", Context.MODE_PRIVATE,null);
        //table
        db.execSQL("CREATE TABLE IF NOT EXISTS students(rollno VARCHAR,name VARCHAR,marks VARCHAR);");


        //setting onclick listener
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (editRollNo.getText().toString().trim().length() == 0) {
                    showmessage("ROLL No Error", "Please type the RollNo");
                } else if (editName.getText().toString().trim().length() == 0) {
                    showmessage("Name Error!!", "Please Type Name");
                } else if (editMarks.getText().toString().trim().length() == 0) {
                    showmessage("MARKS ERROR", "PLease Type The marks");
                } else {
                    db.execSQL("INSERT INTO students VALUES ('"+editRollNo.getText()+"','"+editName.getText()+"','"+editMarks.getText()+"');");
                    showmessage("Sele","Message Inserted successfully");
                    textclear();
                }
            }
        });
        //setting onclick listener
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = db.rawQuery("SELECT * FROM students", null);

                if (c.getCount() == 0) {
                    showmessage("Sorry", "No results");
                }
                StringBuffer buffer = new StringBuffer();
                while (c.moveToNext()) {
                    buffer.append("Roll Number:" + c.getString(0));
                    buffer.append("\n");
                    buffer.append("Student name:" + c.getString(1));
                    buffer.append("\n");
                    buffer.append("Student marks:" + c.getString(2));
                    buffer.append("\n---------");
                }
                showmessage("STUDENT RECORDS",buffer.toString());
            }

    });
        //add and delete onclick listener
        //onclick listener to delete page
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent delete =new Intent(MainActivity.this,Delete.class);
                startActivity(delete);
            }
        });

//onclick listener to search
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search=new Intent(MainActivity.this,Search.class);
                startActivity(search);
            }
        });


    }


    //independent method to show message
    public void  showmessage(String title,String message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(message);
        builder.show();
    }
    //clearing the messages
    public void textclear(){
        editRollNo.setText("");
        editName.setText("");
        editMarks.setText("");
    }


}
