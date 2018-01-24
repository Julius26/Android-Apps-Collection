package com.example.user.referralhospital;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    String[] hospital =
            {"KNH",
            "Mathare",
            "Mama Lucy",
            "Goodlife",
            "Nyeri Hospital",
            "Nairobi hospital",
            "Getrudes",
            "Lang'ata",
            "Karen"};
    ListView l;
    /*int[] imageView={R.drawable.knh,//why is flags int?
            R.drawable.nairobiwest,
            R.drawable.nairobihospital,
            R.drawable.aghakan,
            R.drawable.mpshah,
            R.drawable.mpshah,
            R.drawable.machakos,
            R.drawable.karenhospital,
            R.drawable.karenhospital,
            R.drawable.nairobiwest};*/


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//using hashmaps
       /* List<HashMap<String, String>> alist = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 9; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();

            hm.put("txt", hospital[i]);

            hm.put("flag",Integer.toString(imageView[i]));

            alist.add(hm);
        }
        //keys used in the hashmap
        String[] from={"flag","txt"};
        //keys from support layout
        int []to={R.id.imageView2,R.id.hospitals};
        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.support,from,to);
        ListView hospital = (ListView) findViewById(R.id.list);
        hospital.setAdapter(adapter);*/

       l=(ListView)findViewById(R.id.list);
        ArrayAdapter<String> adp=new ArrayAdapter<String>((this),R.layout.support,hospital);
        l.setAdapter(adp);



        l.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                                                @Override
                                                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                                                    if (position == 0) {
                                                        //intent
                                                       Intent local=new Intent(MainActivity.this,Hospitallocation.class);
                                                        startActivity(local);
                                                    } else if (position == 1) {
                                                        //intent
                                                        Intent mathare=new Intent(MainActivity.this,Matharehospital.class);
                                                        startActivity(mathare);
                                                    } else if (position == 2) {
                                                        //intent
                                                        Intent mama=new Intent(MainActivity.this,Mamalucyhospital.class);
                                                        startActivity(mama);
                                                    } else if (position == 3) {
                                                        //intent4
                                                        Intent good=new Intent(MainActivity.this,Goodlife.class);
                                                        startActivity(good);
                                                    } else if (position == 4) {
                                                        //intgent
                                                        Intent nyeri=new Intent(MainActivity.this,Nyeri.class);
                                                        startActivity(nyeri);
                                                    } else if (position == 5) {
                                                        //ingtent
                                                        Intent knh=new Intent(MainActivity.this,Kenyattahospital.class);
                                                        startActivity(knh);
                                                    } else if (position == 6) {
                                                        //intent
                                                        Intent getrudes=new Intent(MainActivity.this,Getrudeshospital.class);
                                                        startActivity(getrudes);
                                                    } else if (position == 7) {
                                                        Intent langata=new Intent(MainActivity.this,Langata.class);
                                                        startActivity(langata);
                                                    }
                                                    else if (position==8){
                                                        //intent
                                                        Intent karen=new Intent(MainActivity.this,Karenhospital.class);
                                                        startActivity(karen);
                                                    }
                                                }
                                            }
            );


        }
    }
