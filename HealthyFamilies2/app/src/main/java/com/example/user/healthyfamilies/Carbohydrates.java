package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Carbohydrates extends AppCompatActivity {



    String [] names={"Carbohydrates","Functions of Carbohydrates","Benefits of Carbohydrates"};
   String [] examples= {
           "Ugali, Cheese, Yogurt, Rice, Wheat, Bread,  Chapati, Porridge, Oatmeal, Pancake, buckwheat mix, Pancake,  Pasta,  Popcorn, Rice, Potatoes, Spaghetti, Cakes, Cookies, Barley, Pumpkin, Cereals(Weetabix, conflakes, Oatbix ), Yams, Chips, Pizza, Avocados\n",



            "1.\tCarbohydrates provide fuel for the central nervous system and energy for working muscles.\n"+
            "\n"+
            "2. They also prevent protein from being used as an energy source and enable fat metabolism.\n"+
            "3. Important for brain function. They are an influence on mood, memory, etc.\n"+
            "4. They are Quick energy sources.\n"+
            "5.Two recent studies published in PNAS have also linked carbohydrates to decision-making.In the studies, people who ate a high-carbohydrate breakfast were less willing to share when playing the ultimatum game than those who ate high-protein breakfasts. Scientists speculate this may be caused by baseline dopamine levels, which are higher after eating carbohydrates.\n",


                   "1. Mental health-Carbohydrates may be important to mental health. A study published in 2009 in the journal JAMA Internal Medicine found that people on a high-fat, low-carb diet for a year had more anxiety, depression and anger than people on a low-fat, high-carb diet. \n" +
                   "2. Weight loss- A study published in the Journal of Nutrition in 2009 followed middle-age women for 20 months and found that participants who ate more fiber lost weight, while those who decreased their fiber intake gained weight. Another recent study linked fat loss with low-fat diets, not low-carb ones.\n" +
                   "3. Good source of nutrients-Whole, unprocessed fruits and vegetables are well known for their nutrient content. Some are even considered superfoods because of it — and all of these leafy greens, bright sweet potatoes, juicy berries, tangy citruses and crunchy apples contain carbs.\n" +
                   "4. Heart health-Fiber helps to lower cholesterol.The digestive process requires bile acids, which are made partly with cholesterol. As your digestion improves, the liver pulls cholesterol from the blood to create more bile acid, thereby reducing the amount of LDL, the \"bad\" cholesterol.\n"
    };

    //finding carbohydrates images

    int[] carbohydrates={R.drawable.carbohydrate2, R.drawable.carbo8,R.drawable.carbo7

    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_carbohydrates);

        //start of first
        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<3;i++){
            HashMap<String, String> hm=new HashMap<String, String>();

            hm.put("names",names[i]);
            hm.put("examples",examples[i]);
            hm.put("carbo",Integer.toString(carbohydrates[i]));


            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"carbo","names","examples"};
        //keys from support layout
        int [] to={R.id.carbosupport,R.id.carboexplain1,R.id.carboexplane};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.supportcarbohydrates,from,to);

        ListView listView=(ListView) findViewById(R.id.listcarbo);

        listView.setAdapter(adapter);
        //end of first


        //start of second string and image




        //end of second


    }
}
