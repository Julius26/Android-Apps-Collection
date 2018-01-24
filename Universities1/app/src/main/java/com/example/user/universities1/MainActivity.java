package com.example.user.universities1;

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
    String[]  univesities={"UON","KU","JKUAT","Riara","Strathmore","KEMU","USIU","Laikipia","MOI","Kirinyaga University"};
    String [] mottos={"United we Pass"
            ,"We love reading",
            "Education is the key to succcess",
            "Pride comes before a fall",
            "Knowledge is power",
            "Come learn with us",
             "The truth is told",
             "Give me a boy Igive you a man",
            "The voice of Kenya",
            "Kesi baadaye","Lead the way"};

int[] flags={R.drawable.uon,//why is flags int?
             R.drawable.jkuat,
             R.drawable.ku,
             R.drawable.riara,
             R.drawable.strathmore,
             R.drawable.catholic,
             R.drawable.kca,
             R.drawable.rongo,
             R.drawable.moi,
             R.drawable.usiu};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<9;i++){
            HashMap<String, String> hm=new HashMap<String, String>();

            hm.put("uni",univesities[i]);
            hm.put("moto",mottos[i]);
            hm.put("flag", Integer.toString(flags[i]));

            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"flag","moto","uni"};
        //keys from support layout
        int [] to={R.id.imageView2,R.id.motto,R.id.name};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.support,from,to);

        ListView listView=(ListView) findViewById(R.id.lst);

        listView.setAdapter(adapter);

        //action listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(MainActivity.this,"Welcome to UON",Toast.LENGTH_SHORT).show();
                }
                if (position==1){
                    Toast.makeText(MainActivity.this,"Welcome to Kenyatta University",Toast.LENGTH_LONG).show();
                }
            }
        });


    }
}
