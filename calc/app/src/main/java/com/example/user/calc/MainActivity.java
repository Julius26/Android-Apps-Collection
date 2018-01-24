package com.example.user.calc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText a,b;
    Button add;
    TextView ans;
    String one,two;
    double convoone,convotwo,answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        a=(EditText)findViewById(R.id.editText2);
        b=(EditText)findViewById(R.id.editText4);
        add=(Button) findViewById(R.id.button);
        ans=(TextView)findViewById(R.id.textView2);

      add.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
            one=a.getText().toString();
              two=b.getText().toString();

               convoone=Double.parseDouble(one);
               convotwo=Double.parseDouble(two);
              answer=convoone+convotwo;
              ans.setText("The answer is" +answer);



          }
      });
    }
}
