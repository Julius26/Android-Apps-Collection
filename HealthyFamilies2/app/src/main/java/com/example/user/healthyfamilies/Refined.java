package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Refined extends AppCompatActivity {


    String [] refined1={"Foods to Avoid"};
    String [] refined={
            "1. French Fries and Potato Chips-: French fries and potato chips are unhealthy and fattening. On the other hand, whole, boiled potatoes are very healthy and help fill you up.\n" +
            "2. Sugary Drinks-Sugary drinks can negatively affect your weight and general health. If weight loss is your goal, then giving up soda and similar drinks may have a big impact.Bottom Line: \n" +
            "3. White Bread- White bread is made from very fine flour, and can spike your blood sugar levels and lead to overeating. However, there are many other types of bread you can eat.\n" +
            "4. Candy Bars-Candy bars are extremely unhealthy. Candy bars consist of unhealthy ingredients like sugar, refined flour and added oils. They are high in calories, but not very filling.\n" +
            "5. Most Fruit Juices- Fruit juice is high in calories and added sugar, but usually contains no fiber. It is best to stick to whole fruit .\n" +
            "6. Pastries, Cookies and Cakes- Pastries, cookies and cakes often contain large amounts of added sugar, refined flour and sometimes trans fat. These foods are high in calories but not very filling.\n" +
            "7. Some Types of Alcohol (Especially Beer)- If you are trying to lose weight, you may want to consider cutting back on alcohol or skipping it altogether. Wine in small amounts seems to be fine.\n" +
            "8. Ice Cream- Store-bought ice cream is high in sugar, and homemade ice cream is a better alternative. Remember to be mindful of portions, as it’s very easy to eat too much ice cream.\n" +
            "9. Pizza- Commercial pizzas are often made from highly refined and processed ingredients. A homemade pizza with healthier ingredients is a much better option.\n" +
            "10. High-Calorie Coffee Drinks- Plain, black coffee can be very healthy and help you burn fat. However, high-calorie coffee drinks that contain artificial ingredients are very unhealthy and fattening.\n" +
            "11. Foods High in Added Sugar-: Added sugar is one of the unhealthiest ingredients in the modern diet. Many products, such as low-fat and fat-free foods, seem healthy but are loaded with sugar.\n" +
            "*-Take Home Message\n" +
            "The worst foods for weight loss are highly processed junk foods. These foods are typically loaded with added sugar, refined wheat and/or added fats.\n" +
            "If you’re not sure if a food is healthy or unhealthy, read the label. However, watch out for the different names for sugar and misleading health claims.\n" +
            "Also, remember to consider the serving sizes. Some healthy foods, like nuts, dried fruit and cheese, are high in calories, and it can be very easy to eat too much.\n"};

    int[] refinedd={R.drawable.refined};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_refined);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<1;i++){
            HashMap<String, String> hm=new HashMap<String, String>();
            hm.put("refined1",refined1[i]);
            hm.put("refined",refined[i]);
            hm.put("refinedd",Integer.toString(refinedd[i]));


            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"refinedd","refined1","refined"};
        //keys from support layout
        int [] to={R.id.ivrefined,R.id.tvrefined1,R.id.tvrefined };

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.refinedsupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listrefined);

        listView.setAdapter(adapter);

    }
}
