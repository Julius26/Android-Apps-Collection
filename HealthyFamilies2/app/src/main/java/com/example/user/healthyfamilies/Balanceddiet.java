package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Balanceddiet extends AppCompatActivity {
    //making of strings for a balanced diet pane
    String[] carbohydrate =
            {       "Ugali", "Cheese", "Yogurt", "Rice", "Wheat",
                    "Bread",  "Chapati", "Porridge", "Oatmeal", "Pancake", "buckwheat mix", "Pancake",  "Pasta",  "Popcorn", "Rice", "Potatoes", "Spaghetti",
                    "Cakes", "Cookies", "Barley", "Pumpkin", "Cereals(Weetabix, conflakes, Oatbix )",
                    "Yams", "Chips", "Pizza", "Avocados"};

    String[] protein =
            {      "Black beans", "Black beans", "Garbanzo beans", "Garbanzo (Chickpeas)",
                    "Kidney beans", "Lentils", "Lentils", "Lima Beans", "Navy Beans", "Pinto Beans",
                    "Soybeans", "Split Peas", "Egg", "Milk", "Fresh soybeans", "Almonds", "Brazil nuts",
                    "Cashew nuts", "Coconut", "Macadamia nuts", "Peanuts", "Pecans", "Pistachios",
                    "Pumpkin seeds", "Sesame seeds", "Sunflower", "Walnuts", "Pigeon peas", "Green grams",
                    "Red Meat", "White Meat"};
    String[] vitamin =
            {      "1.FRUITS" ,"Apple", "Apricot", "Avocado", "Blackberries", "Blueberries", "Cantaloupe", "Cranberries",
                    "Grapefruit", "Grapes", "Guava", "Kiwi", "Mango", "Nectarine", "Orange", "Papaya",
                    "Peach", "Pear", "Pineapple", "Raspberries", "Strawberries", "Tangerine", "Watermelon.\n" ,
                    "2.VEGETABLES", "(Vitamins)Alfalfa sprouts", "Asparagus", "Butterhead lettuce", "Broccoli",
                    "Brussels Sprouts", "Cabbage", "Carrot", "Cauliflower", "Celery",  "Cabbage", "Chilli Peppers",
                    "Corn (sweet)", "Cucumber", "Edamame",  "Eggplant", "Ginger Root", "Green Bell Peppers",
                    "Iceberg Lettuce", "Mushrooms", "Okra", "Onions", "Radishes", "Red Bell Peppers", "Romaine lettuce", "Scallions", "Spinach", "Swiss Chard", "Zucchini.\n"};




    //declaring balanced diet listviews
    ListView carbohydrates,proteins,vitamins;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_balanceddiet);


        //find the list
        carbohydrates=(ListView)findViewById(R.id.lstcarbo);
        ArrayAdapter<String> adpc=new ArrayAdapter<String>((this),R.layout.support,carbohydrate);
        carbohydrates.setAdapter(adpc);

        proteins=(ListView)findViewById(R.id.lstproteins);
        ArrayAdapter<String> adpp=new ArrayAdapter<String>((this),R.layout.support,protein);
        proteins.setAdapter(adpp);

        vitamins=(ListView)findViewById(R.id.lstvitamins);
        ArrayAdapter<String> adpv=new ArrayAdapter<String>((this),R.layout.support,vitamin);
        vitamins.setAdapter(adpv);



    }
}
