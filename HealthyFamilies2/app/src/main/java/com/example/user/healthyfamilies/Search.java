package com.example.user.healthyfamilies;

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

    EditText a;
    Button b;
    TextView d;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        a=(EditText)findViewById(R.id.etsearch);
        b=(Button)findViewById(R.id.btsearch);
        d=(TextView)findViewById(R.id.tvsearch);

        db=openOrCreateDatabase("healthyfamiliesDB", Context.MODE_PRIVATE,null);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Cursor c = db.rawQuery("SELECT * FROM records WHERE day='" + a.getText() + "'", null);
                if (c.getCount() == 0) {
                    showmessage("Sorry", "No records found");
                } else if (c.moveToFirst()) {
                    d.setText(c.getString(0) + "\n" + c.getString(1) + "\n" + c.getString(2) + "\n");

                }



            }
        });
        d.setText("");
    }

    public void showmessage(String title,String Message){
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setCancelable(true);
        builder.setTitle(title);
        builder.setMessage(Message);
        builder.show();
    }

}
