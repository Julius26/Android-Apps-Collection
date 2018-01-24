package com.example.user.mysqlite;

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

public class Search extends AppCompatActivity {
    SQLiteDatabase db;
    EditText a;
    Button search;
    TextView view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        a=(EditText)findViewById(R.id.search);
        search=(Button)findViewById(R.id.btnsearch);
        view=(TextView)findViewById(R.id.viewsearched);

        //database
        db=openOrCreateDatabase("StudentsDB", Context.MODE_PRIVATE,null);

        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = db.rawQuery("SELECT * FROM students WHERE rollno='"+a.getText()+"'", null);

                if (c.getCount() == 0) {
                    showmessage("Sorry", "No results");
            }
            else if (c.moveToFirst()){
                    view.setText(c.getString(0)+"\n"+c.getString(1)+"\n"+c.getString(2)+"\n");
                }
                else {
                    showmessage("Error","No matching records");
                }
        };

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
}