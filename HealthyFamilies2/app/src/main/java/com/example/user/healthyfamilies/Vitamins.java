package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vitamins extends AppCompatActivity {


    String []vitamins1={"Vitamins","Functions of vitamins","Benefits of vitamins"};
    String [] vitamins={
            "1.FRUITS Apple, Apricot, Avocado, Blackberries, Blueberries, Cantaloupe, Cranberries, Grapefruit, Grapes, Guava, Kiwi, Mango, Nectarine, Orange, Papaya, Peach, Pear, Pineapple, Raspberries, Strawberries, Tangerine, Watermelon.\n" +
            "2.VEGETABLES, (Vitamins)Alfalfa sprouts, Asparagus, Butterhead lettuce, Broccoli, Brussels Sprouts, Cabbage, Carrot, Cauliflower, Celery,  Cabbage, Chilli Peppers, Corn (sweet), Cucumber, Edamame, , Eggplant, Ginger Root, Green Bell Peppers, Iceberg Lettuce, Mushrooms, Okra, Onions, Radishes, Red Bell Peppers, Romaine lettuce, Scallions, 1/2 cup raw, Spinach, Swiss Chard, Zucchini.\n ",


                    "1.Thiamine (vitamin B1), Part of an enzyme needed for energy metabolism; important to nerve function, Found in all nutritious foods in moderate amounts: pork, whole-grain or enriched breads and cereals, legumes, nuts and seeds\n" +
                    "2.Riboflavin(vitamin B2), Part of an enzyme needed for energy metabolism; important for normal vision and skin health, Milk and milk products; leafy green vegetables; whole-grain, enriched breads and cereals\n" +
                    "3.Niacin(vitamin B3), Part of an enzyme needed for energy metabolism; important for nervous system, digestive system, and skin health, Meat, poultry, fish, whole-grain or enriched breads and cereals, vegetables (especially mushrooms, asparagus, and leafy green vegetables), peanut butter\n" +
                    "4.Pantothenic acid, Part of an enzyme needed for energy metabolism, Widespread in foods\n" +
                    "5.Biotin, Part of an enzyme needed for energy metabolism, Widespread in foods; also produced in intestinal tract by bacteria\n" +
                    "6.Pyridoxine (vitamin B6), Part of an enzyme needed for protein metabolism; helps make red blood cells, Meat, fish, poultry, vegetables, fruits\n" +
                    "7.Folic acid, Part of an enzyme needed for making DNA and new cells, especially red blood cells, Leafy green vegetables and legumes, seeds, orange juice, and liver; now added to most refined grains\n" +
                    "8.Cobalamin (vitamin B12), Part of an enzyme needed for making new cells; important to nerve function, Meat, poultry, fish, seafood, eggs, milk and milk products; not found in plant foods\n" +
                    "9.Ascorbic acid(vitamin C), Antioxidant; part of an enzyme needed for protein metabolism; important for immune system health; aids in iron absorption, Found only in fruits and vegetables, especially citrus fruits, vegetables in the cabbage family, cantaloupe, strawberries, peppers, tomatoes, potatoes, lettuce, papayas, mangoes, kiwifruit\n" +
                    "10.Vitamin A (and its precursor*, beta-carotene)\n" +
                    "*A precursor is converted by the body to the vitamin., Needed for vision, healthy skinand mucous membranes, bone and tooth growth, immune system health, Vitamin A from animal sources (retinol): fortified milk, cheese, cream, butter, fortified margarine, eggs, liver\n" +
                    "Beta-carotene (from plant sources): Leafy, dark green vegetables; dark orange fruits (apricots, cantaloupe) and vegetables (carrots, winter squash, sweet potatoes, pumpkin)\n" +
                    "11.Vitamin D, Needed for proper absorption of calcium; stored in bones, Egg yolks, liver, fatty fish, fortified milk, fortified margarine. When exposed to sunlight, the skin can make vitamin D.\n" +
                    "12.Vitamin E, Antioxidant; protects cell walls, Polyunsaturated plant oils (soybean, corn, cottonseed, safflower); leafy green vegetables; wheat germ; whole-grain products; liver; egg yolks; nuts and seeds\n" +
                    "13.Vitamin K, Needed for proper blood clotting, Leafy green vegetables and vegetables in the cabbage family; milk; also produced in intestinal tract by bacteria.\n",

                    "1.Vitamin A or Retinol is useful in treating eye disorders, acne, skin disorders, and infections, as well as speeding up the healing process of wounds. It is also good for preventing macular degeneration and cataracts, and as a carotenoid, it also helps improve the health of your hair.\n" +
                    "2.Vitamin B1 or Thiamine can prevent beriberi, heart diseases, and indigestion, while boosting the body’s metabolism, blood circulation, and brain development. 3.Vitamin B2 or Riboflavin helps to treat cataracts, skin disorders, and anemia, while also improving the body’s metabolic activity, immunity, and nervous system.\n" +
                    "4.Vitamin B3 or Niacin can reduce weakness, indigestion, skin disorders, migraines, heart disorders, high blood pressure, high blood cholesterol, diabetes, and diarrhea.\n" +
                    "5.Vitamin B5 or Pantothenic Acid can relieve stress, arthritis, various infections, skin disorders, greying of the hair, and high cholesterol.\n" +
                    "6.Vitamin B6 or Pyridoxamine is useful in the treatment of diabetes, piles, convulsions, excessive menstrual bleeding, stress, insomnia, morning sickness, and travel sickness. It is also associated with reducing homocysteine levels in the body.\n" +
                    "7.Vitamin B7 or Biotin can treat skin disorders, improve the body’s metabolism, and boost hair care.\n" +
                    "8.Vitamin B9 or Folic Acid is a very powerful too against anemia, indigestion, sprue, abnormal brain growth, skin disorders, and gout, while increasing red blood cell formation.   It is mainly associated with neural tube defects, and is increasingly studied in relation to inhibiting homocysteine levels and thereby protecting against coronary heart disease.\n" +
                    "9.Vitamin B12 or Cyanocobalamin can reduce symptoms and side effects of anemia, smoking, pregnancy, liver disorders, kidney disorders, and mouth ulcers. When combined with adequate amounts of B6 and folic acid, B12 is essential in defending against various heart conditions, including strokes.\n" +
                    "10.Vitamin C or Ascorbic Acid works to treat various eye disorders, cancer, scurvy, the common cold, infections, diabetes, stress, high blood cholesterol, heart diseases, cancer, high blood pressure, kidney disorders, internal bleeding, piles, corneal ulcers, inflammations, and lead poisoning,while also boosting the immune system. It is one of the most powerful and essential antioxidants that we have in our body.\n" +
                    "11.Vitamin D treats rickets, arthritis, tooth decay, and diabetes. It is also very beneficial for bone repair, immunity, and blood pressure. It is also used to prevent osteoporosis and has been positively linked to preventing a variety of different cancers and multiple sclerosis in patients already suffering from osteoarthritis.\n" +
                    "12.Vitamin E or Tocopherol is often used for its anti-aging properties, and as a way to boost skin care, and protect against heart diseases, sterility, brain malfunction, menopause, painful menstrual cycles, and eye disorders, as well as improving blood circulation,\n" +
                    "13.Vitamin K is a very important vitamin to prevent internal bleeding, biliary obstruction, osteoporosis, excessive menstrual flow, and menstrual pain, including an ability to improve blood clotting. It is also linked to bone metabolism, preventing of atherosclerosis, improved nerve signalling, and kidney stones.\n"};

    int[] vitaminss={R.drawable.vitami,R.drawable.vitamin1,R.drawable.vitamin2};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vitamins);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<3;i++){
            HashMap<String, String> hm=new HashMap<String, String>();

            hm.put("vitamins1",vitamins1[i]);
            hm.put("vitamins",vitamins[i]);
            hm.put("vitaminss",Integer.toString(vitaminss[i]));


            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"vitaminss","vitamins","vitamins1"};
        //keys from support layout
        int [] to={R.id.ivvitamins,R.id.tvvitamins,R.id.tvvitamins1};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.vitaminssupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listvitamins);

        listView.setAdapter(adapter);


    }
}
