package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Protein extends AppCompatActivity {

    String [] protein={"Proteins","Functions of Proteins","Benefits of Proteins"};
    String [] proteins={
            "Black beans, Black beans," +
            " Garbanzo beans, Garbanzo (Chickpeas), Kidney beans," +
            " Lentils, Lentils, Lima Beans, Navy Beans, Pinto Beans, " +
            "Soybeans, Split Peas, Egg, Milk, Fresh soybeans, Almonds," +
            " Brazil nuts, Cashew nuts, Coconut, Macadamia nuts, Peanuts," +
            " Pecans, Pistachios, Pumpkin seeds, Sesame seeds, Sunflower, Walnuts, " +
            "Pigeon peas, Green grams ,Red Meat, White Meat\n ",


                    "1.Repair and Maintenance-Protein is termed the building block of the body. It is called this because protein is vital in the maintenance of body tissue, including development and repair. \n" +
                    "2.Energy-Protein is a major source of energy. If you consume more protein than you need for body tissue maintenance and other necessary functions, your body will use it for energy. \n" +
                    "3.Hormones-Protein is involved in the creation of some hormones. These substances help control body functions that involve the interaction of several organs. Insulin, a small protein, is an example of a hormone that regulates blood sugar. \n" +
                    "4.Enzymes-Enzymes are proteins that increase the rate of chemical reactions in the body. In fact, most of the necessary chemical reactions in the body would not efficiently proceed without enzymes. \n" +
                    "5.Transportation and Storage of Molecules-Protein is a major element in transportation of certain molecules. For example, hemoglobin is a protein that transports oxygen throughout the body. Protein is also sometimes used to store certain molecules. Ferritin is an example of a protein that combines with iron for storage in the liver.\n" +
                    "6.Antibodies-Protein forms antibodies that help prevent infection, illness and disease. These proteins identify and assist in destroying antigens such as bacteria and viruses\n",

            "1. They help you maintain and lose weight.\n" +
            "2.Stabilize your blood sugar levels.\n" +
            "3. Improve your ability to learn and concentrate.\n" +
            "4. Reduce brain fog, boost your energy levels.\n" +
            "5.Support your muscles and bones.\n" +
            "6.Support the absorption of important nutrients. \n"};

    int[] proteinss={R.drawable.protein2,R.drawable.protein,R.drawable.proteins};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<3;i++){
            HashMap<String, String> hm=new HashMap<String, String>();
            hm.put("protein",protein[i]);
            hm.put("proteins",proteins[i]);
            hm.put("proteinss",Integer.toString(proteinss[i]));


            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"proteinss","protein","proteins"};
        //keys from support layout
        int [] to={R.id.ivproteins,R.id.tvproteins1,R.id.tvproteins};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.proteinsupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listprotein);

        listView.setAdapter(adapter);

    }
}
