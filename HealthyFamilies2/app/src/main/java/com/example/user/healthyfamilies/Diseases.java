package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Diseases extends AppCompatActivity {



    String [] diseases={" Cancer", "Arthritis", "Heartdisease", "Bloodpressure", "Premature aging", "Diabetes", "Obesity", "Anaemia"};
    //cancer
    String [] protectivefoods=
            {" Cancer fighting foods\n" +
            "1-Leafy green vegetables example spinach, kales, collad greens, romaine,  water cress,Algura salad.\n" +
            "2- Cruciferous Vegetables examples broccoli, Cabbage, Brusselsprouts.\n" +
            "3-Berries examples strawberries, Blue berries, Raspberries, goji berries, camu camu, black berries\n" +
            "4. Brightly Orange-Colored Fruits and Vegetables (Citrus Fruits, Squash, Sweet Potatoes, pumpkins etc.)\n" +
            "5. Organic Meats-Organic meats including beef or chicken liver are recommended on many cancer-fighting diets since they’re considered some of the most nutrient-dense foods.\n" +
            "6-Raw milk such as cheese, Kefir and  yogurt.\n" +
            "\n" +
            "7-Nuts and seeds\n" +
            "\n" +
            "8-Chia and Flax seeds are the most nutrient dense in the world. . Hemp seeds, sesame seeds, pumpkin seeds and sunflower seeds are also beneficial and full of healthy fatty acids, as are walnuts, brazil nuts and almonds. Can be used easily in smoothies, baked goods and  with yogurt. \n" +
            "\n" +
            "9-Healthy Unrefined Oils (Coconut, Flax, Cod Liver and Extra Virgin Olive Oil).\n" +
            "\n" +
            "10- Mushrooms- Reishi,  Cordyceps and maitake in particular can improve immune function and cell regeneration. Look for them in capsule or tincture form, and cook with them whole whenever possible too.\n" +
            "11-Traditional Teas-i.e Green tea,black tea and oolong tea.\n" +
            "\n" +
            "12-Wild caught fish- small fish, including salmon, mackerel and sardines are anti-inflammatory omega-3 foods that are correlated with better brain, hormonal and nervous system health.\n" +
            "\n" +
            "\n" +
            "\n" +
            "Foods that increase cancer risk\n" +
            "1-Sugar\n" +
            "2-Refined oil\n" +
            "3-Refined carbohydrates\n" +
            "4-Farm raised meat\n" +
            "5-Conventional dairy\n ",


            //arthritis
                    " Arthritis fighting foods\n" +
            "1-Broccoli- broccoli, cauliflower, and other cruciferous vegetables were shown to protect against the development of arthritis.\n" +
                    "2-Vitamin D- Consider a 20-minute stroll to take in some vitamin D-stimulating sunlight\n" +
                    "3- Olive Oil- reduce pain and stiffness in patients with rheumatoid arthritis.\n" +
                    "4- Ginger\n" +
                    "5- Vitamin C- oranges, mangos, strawberries, pineapple, and kidney beans.\n" +
                    "6- Anthocyanins-  foods like cherries, blackberries, raspberries, strawberries, grapes, and eggplant.\n" +
                    "7- Beta-Cryptoxanthin-  sweet peppers, squash, pumpkin, papayas, tangerines, collard greens, and apricots.\n"
            ,

            //heartdisease
                    " Heart disease fighting foods\n" +
            "1-Salmon-Salmon and other fatty fish such as sardines and mackerel are the superstars of heart-healthy foods.\n" +
            "2-Oatmeal\n" +
            "3-Blueberries\n" +
            "4-Dark chocolate\n" +
            "5-Citrus fruits\n" +
            "6-Soy \n" +
            "7- Potatoes\n" +
            "8-Tomatoes\n" +
            "9-Nuts\n" +
            "10-Legumes\n" +
            "11- Extra-virgin olive oil\n" +
            "12-Red wine\n" +
            "13-Green tea\n" +
            "14- Broccoli, spinach and kale\n" +
            "15-Coffee\n" +
            "16-Flax seeds\n" +
            "17-Avocado\n" +
            "18- Pomegranate and apples\n"


            ,
            //bloodpressure
                    " Bloodpressure fighting foods\n" +
            "1.Leafy greens, which are high in potassium, include: romaine lettuce, arugula, kale ,turnip greens, collard greens, spinach, beet greens, Swiss chard.\n" +
                    "2.Berrries\n" +
                    "3. Red beets- Beetroot is delicious when roasted or added to stir-fries and stews. You can also bake them into chips.\n" +
                    "4.  Skim milk and yogurt \n" +
                    "5-Oatmeal\n" +
                    "6.Bananas\n" +
                    "7. Salmon, mackerel, and fish\n" +
                    "8.Seeds-Sunflower, Pumpkins or Squash seeds.\n" +
                    "9. Garlic and herbs\n" +
                    "10. Dark chocolate\n" +
                    "11. Pistachios\n" +
                    "12.Olive oil\n" +
                    "13.Apples and Pomegranates\n",

            //prematureaging
            "Want to age slower\n" +
                    "1.Anti-oxidant Rich Teas – Green tea, white tea, oolong tea, rooibos tea, and black tea contain antioxidants called polyphenols that protect your cells from free radical damage.\n" +
                    "2.Wild-caught fish – Provide anti-inflammatory omega-3 fats to slow the aging process.  Wild Alaskan Salmon contains unrivaled levels of Vitamin D and astaxanthin.  Both vitamin and astaxanthin are powerful antioxidants that help fight the signs of aging.\n" +
                    "3.Green leafy vegetables – Kale, swiss chard, beet greens and spinach provide important nutrients to support bone health, eye health, and even prevent cancer.  Spirulina (a sea vegetable) provides high levels of anti-oxidants including polythenols.  This super anti-oxidant is a powerhouse weapon against pre-mature aging.\n" +
                    "4.Berries – Are full of powerful antioxidants known as anthocyanins which help maintain muscle and may prevent cancer.\n" +
                    "5.Herbs – Turmeric and garlic contain anti-oxidants and cleansing nutrients that can slow the aging process.\n" +
                    "Foods that Cause Faster Aging\n" +
                    "1.Refined sugar  – Promotes a process called glycation.  Glycation damages cells and causes wrinkles.  It’s the top food that speeds aging in most people.\n" +
                    "2.Grains – Pro-inflammatory if not sprouted and lead to glycation, which will speed up the aging process.\n" +
                    "3.Trans fats and hydrogenated oils – These processed fats promote inflammation which may lead to premature aging, heart disease, and certain types of cancer.\n" +
                    "4.Alcohol – Although an occasional glass of red wine may be beneficial for health as it has an important anti-oxidant known as resveratrol, the overall consumption of alcohol is pro-inflammatory and speeds up the aging process.\n" +
                    "5.Artificial sugar or other artificial ingredients – These contain a large number of chemicals which can speed up the aging process.\n",

//diabetes
                    " Diabetes fighting foods\n" +
            "1. Apples\n" +
            " Eat them whole and unpeeled for the greatest benefit, or make a quick ‘baked’ apple. After washing and chopping one apple, put it in a bowl with a dusting of cinnamon and microwave until soft (about 4 minutes). Enjoy with yogourt and oat bran sprinkles for a nutritious dessert, or serve over oatmeal for breakfast.\n" +
            "2. Avocado\n" +
            "Rich, creamy, and packed with beneficial monounsaturated fat, avocado slows digestion and helps keep blood sugar from spiking after a meal. \n" +
            "3. Barley\n" +
            "Choosing this grain instead of white rice can reduce the rise in blood sugar after a meal by almost 70 per cent’and keep your blood sugar lower and steadier for hours. \n" +
            "4. Beans\n" +
            "5. Beef\n" +
            "Yes, beef is a diabetes-friendly food, as long as you choose the leanest cuts and keep portions to one-fourth your plate. \n" +
            "6. Berries\n" +
            "7. Broccoli\n" +
            "8. Carrots-The amount of sugar in carrots is extremely low. That’s good news because carrots are one of nature’s richest sources of beta-carotene, which is linked to a lower risk of diabetes and better blood-sugar control\n" +
            "9. Chicken or turkey-These meats can be high-fat disasters or perfectly healthy fare. It all depends on the cut and how it’s prepared. Breast meat, whether ground or whole, is always lower in fat than dark meat such as thighs and drumsticks. Never eat the skin because of its high saturated fat content, and when buying ground turkey, make sure the package says ground turkey breast. Otherwise, you may as well be eating hamburger. \n" +
            "10. Eggs\n" +
            "Eggs are another excellent, inexpensive source of high-quality protein’so high, in fact, that egg protein is the gold standard nutritionists use to rank all other proteins. \n" +
            "11. Fish\n" +
            "The single deadliest complications of diabetes is heart disease, and eating fish just once a week can reduce your risk by 40 per cent.\n" +
            "12. Flaxseed\n" +
            "They’re rich in protein, fibre, and good fats similar to the kind found in fish. They’re also a source of magnesium, a mineral that’s key to blood-sugar control because it helps cells use insulin\n" +
            "13. Milk and Yogurt\n" +
            "14. Nuts\n" +
            "Because of their high fibre and protein content, nuts are ‘slow burning’ foods that are friendly to blood sugar\n" +
            "15. Seeds\n" +
            "Like nuts, seeds of all types pumpkin, sunflower, sesame are filled with good fats, protein, and fibre that work together to keep blood sugar low and stave off heart disease\n" +
            "16. Oatmeal\n" +
            "Just as it sticks to your bowl, it also forms a gummy barrier between the digestive enzymes in your stomach and the starch molecules in your meal. So it takes longer for your body to convert the carbs you’ve eaten into blood sugar.\n" +
            "17. Olive Oil\n" +
            " A touch of olive oil also slows digestion, so your meal is less likely to spike your glucose. Dribble it on salads, baked potatoes, pasta, just about anything.\n" +
            "18. Peanut Butter\n" +
            ". The monounsaturated fats in Peanut Butter  help control blood sugar.\n" +
            "19. Whole-Grain Bread\n" +
            "Eating white bread is practically like eating table sugar when it comes to raising blood sugar. So if you eat a lot of it (and this includes bagels), simply switching to whole grain may improve your sensitivity to insulin hence control bloodsugar. \n" +
            "20. Sweet Potatoes\n" +
            "Choose a baked sweet potato instead of a baked white potato, and your blood sugar will rise about 30 percent less. \n",

//obesity
                    "Foods which cause obesity\n" +
            "1.eating processed or fast food high in fat\n" +
            "2.not eating fruit, vegetables and unrefined carbohydrates, such as wholemeal bread and brown rice\n" +
            "3.drinking too much alcohol – alcohol contains a lot of calories, and heavy drinkers are often overweight\n" +
            "4.eating out a lot – you may have a starter or dessert in a restaurant, and the food can be higher in fat and sugar\n" +
            "5.eating larger portions than you need - you may be encouraged to eat too much if your friends or relatives are also eating large portions\n" +
            "6.comfort eating – if you feel depressed or have low self-esteem you may comfort eat to make yourself feel better.\n" +
            "           7. Lack of exercise and physical activity\n",

//anaemia
                    " Anaemia fighting foods\n" +
    "You can reduce your risk of iron deficiency anemia by choosing iron-rich foods.\n" +
            "Choose iron-rich foods\n" +
            "Foods rich in iron include:\n" +
            "1.Red meat, pork and poultry\n" +
            "2.Seafood\n" +
            "3.Beans\n" +
            "4.Dark green leafy vegetables, such as spinach\n" +
            "5.Dried fruit, such as raisins and apricots\n" +
            "6.Iron-fortified cereals, breads and pastas\n" +
            "7.Peas\n"};

    int[] images={R.drawable.cancer,
            R.drawable.arthritis,
            R.drawable.heartdisease,
            R.drawable.bloodpressure,
            R.drawable.prematureaging,
            R.drawable.diabetes,
            R.drawable.obesity,
            R.drawable.anaemia};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diseases);


        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<7;i++){
            HashMap<String, String> hm=new HashMap<String, String>();

            hm.put("disease",diseases[i]);
            hm.put("protectivefood",protectivefoods[i]);
            hm.put("image",Integer.toString(images[i]));

            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"image","protectivefood","disease"};
        //keys from support layout
        int [] to={R.id.ivdiseases,R.id.explanation,R.id.namedisease};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.diseasesupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listdiseases);

        listView.setAdapter(adapter);

    }
}
