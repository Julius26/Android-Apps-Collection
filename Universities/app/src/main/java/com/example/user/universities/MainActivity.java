package com.example.user.universities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[]schools={"Kemu","Riara","Strathmore","Laikipia","UON","JKUAT","TUK","KU","MOI"};



    String[] mottos={"Connnecting People",
            "Communicating with people",
            "Masomo baadae",
            "Lea The way",
            "Give me  boy I give you a girl",
            "Knowledge  is power",
            "We love reading",
            "Come teach me to learn",
            "Do not Hesistate",
            };


            int[]flags={R.drawable.images,
                    R.drawable.images,
                    R.drawable.images,
                    R.drawable.images,
                    R.drawable.images,
                    R.drawable.images,
                    R.drawable.images,
                    R.drawable.images,
                    R.drawable.images};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        List<HashMap<String, String>> alist = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 9; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();

            hm.put("txt", schools[i]);
            hm.put("text2", mottos[i]);
            hm.put("flag",Integer.toString(flags[i]));

            alist.add(hm);
        }
        //keys used in the hashmap
        String[] from={"flag","txt","Text2"};
        //keys from support layout
        int []to={R.id.imageView,R.id.textView,R.id.textView2};
        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.listview_layout,from,to);
        ListView listView = (ListView) findViewById(R.id.lst);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(MainActivity.this,"Welcome to Kemu University",Toast.LENGTH_LONG).show();
                }
                else if(position==1) {
                    Toast.makeText(MainActivity.this, "Welcome To Riara university", Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
