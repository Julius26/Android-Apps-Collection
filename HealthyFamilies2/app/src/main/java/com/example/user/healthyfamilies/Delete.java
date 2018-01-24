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

public class Delete extends AppCompatActivity {

    //finding your edit text
    EditText delete;
    Button del;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete);

        delete = (EditText) findViewById(R.id.etdelete);
        del = (Button) findViewById(R.id.btdelete);

        db = openOrCreateDatabase("healthyfamiliesDB", Context.MODE_PRIVATE, null);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (delete.getText().toString().trim().length() == 0) {
                    showmessage("Error", "Please add a day");
                }
                Cursor c = db.rawQuery("SELECT * FROM records WHERE day='" + delete.getText() + "'", null);

                if (c.moveToFirst()) {
                    db.execSQL(("DELETE FROM records WHERE day='" + delete.getText() + "'"));
                    showmessage("Congatulations", "Record deleted successfully");
                    delete.setText("");
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