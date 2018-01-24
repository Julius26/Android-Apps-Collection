package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Rhoughages extends AppCompatActivity {


    String [] rhoughages1={"Rhoughages","Functions of Rhoughages", "Benefits of rhoughages"};
    String [] rhoughages={
            "Dietary fiber or roughage is the indigestible portion of food derived from plants.\n" +
            "1.Sources of insoluble fiber include:\n" +
            "•\twhole grain foods\n" +
            "•\twheat and corn bran\n" +
            "•\tlegumes such as beans and peas\n" +
            "•\tnuts and seeds\n" +
            "•\tpotato skins\n" +
            "•\tlignans\n" +
            "•\tvegetables such as green beans, cauliflower, zucchini (courgette), celery, and nopal\n" +
            "•\tsome fruits including avocado, and unripe bananas\n" +
            "•\tthe skins of some fruits, including kiwifruit, grapes and tomatoes\n" +
            "2.Soluble fibre-\n" +
            "Legumes,Grains,Fruits,Vegetables,Flaxseeds\n",


                    "\n" +
                    "1.They give your food bulk and make you feel full quicker.\n" +
                    "2. They trap carbohydrates during digestion, and thus keep blood sugar levels in check. 3.They reduce the risk of heart disease, by lowering cholesterol. \n" +
                    "4.They regulate blood sugar and help against diabetes.\n" +
                    " 5.Dietary fibre is an important part of the digestive process, and it also helps prevent constipation.\n" +
                    "6.It has also been shown to lower the risk of colorectal cancer. \n"
            ,

                    "\n" +
                    "1-Blood sugar control: Soluble fiber may help to slow your body's breakdown of carbohydrates and the absorption of sugar, helping with blood sugar control.\n" +
                    "2-Heart health: An inverse association has been found between fiber intake and heart attack, and research shows that those eating a high-fiber diet have a 40 percent lower risk of heart disease.1\n" +
                    "3-Stroke: Researchers have found that for every seven-grams more fiber you consume on a daily basis, your stroke risk is decreased by 7 percent.2\n" +
                    "4-Weight loss and management: Fiber supplements have been shown to enhance weight loss among obese people,3likely because fiber increases feelings of fullness.\n" +
                    "5-Skin health: Fiber, particularly psyllium husk, may help move yeast and fungus out of your body, preventing them from being excreted through your skin where they could trigger acne or rashes.4\n" +
                    "6-Diverticulitis: Dietary fiber (especially insoluble) may reduce your risk of diverticulitis – an inflammation of polyps in your intestine – by 40 percent.5\n" +
                    "7-Hemorrhoids: A high-fiber diet may lower your risk of hemorrhoids.\n" +
                    "8-Irritable bowel syndrome (IBS): Fiber may provide some relief from IBS.\n" +
                    "9-Gallstones and kidney stones: A high-fiber diet may reduce the risk of gallstones and kidney stones, likely because of its ability to help regulate blood sugar.\n"};

    int[] rhoughagess={R.drawable.rhoughages1,R.drawable.rhoughage2,R.drawable.rhoughage3};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rhoughages);


        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<3;i++){
            HashMap<String, String> hm=new HashMap<String, String>();
            hm.put("rhoughages1",rhoughages1[i]);
            hm.put("rhoughages",rhoughages[i]);
            hm.put("rhoughagess",Integer.toString(rhoughagess[i]));


            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"rhoughagess","rhoughages","rhoughages1"};
        //keys from support layout
        int [] to={R.id.ivrhoughages,R.id.tvrhoughages,R.id.tvrhoughages1};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.rhoughagesupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listrhoughages);

        listView.setAdapter(adapter);


    }
}
