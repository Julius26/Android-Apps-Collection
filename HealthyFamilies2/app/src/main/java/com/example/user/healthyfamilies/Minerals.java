package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Minerals extends AppCompatActivity {



    String [] minerals1={"Minerals", "Functions of minerals", "Benefits of Minerals"};
    String [] minerals={
            "Nuts, Beans and Lentils, Dark leafy greens, Fish, Seeds," +
            " Shellfish, Mushrooms, Whole grains, Milk and Yoghurt, Beef" +
            " and Lamb, Avocados, Dark chocolate ,cocoa powder, Cheese, Dried fruits\n ",


                    "Just like vitamins, minerals help your body grow, develop, and stay healthy. \n" +
                    "1. from building strong bones \n" +
                    "2. transmitting nerve impulses. \n" +
                    "3.Some minerals are even used to make hormones or maintain a normal heartbeat.\n",

                    "1. Magnesium helps convert blood sugar to energy, and is the 'anti-stress' mineral.\n" +
                    "2. Calcium is the most abundant mineral in your body; it initiates DNA synthesis, maintains bone health and strong teeth.\n" +
                    "3. Potassium maintains acid/alkaline balance in your blood.\n" +
                    "4. Zinc promotes proper nerve, immune and digestive health and boosts immunity.\n" +
                    "5. Phosphorous helps maintain heart regularity, provides energy and aids in metabolism of fats and starches.\n" +
                    "6. Minerals can even help you sleep better at night\n"};

    int[] mineralss={R.drawable.minerals1,R.drawable.mineralsalts,R.drawable.minerals2};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minerals);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<3;i++){
            HashMap<String, String> hm=new HashMap<String, String>();
            hm.put("minerals1",minerals1[i]);
            hm.put("minerals",minerals[i]);
            hm.put("mineralss",Integer.toString(mineralss[i]));


            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"mineralss","minerals","minerals1"};
        //keys from support layout
        int [] to={R.id.ivminerals,R.id.tvminerals,R.id.tvminerals1};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.mineralssupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listminerals);

        listView.setAdapter(adapter);


    }
}
