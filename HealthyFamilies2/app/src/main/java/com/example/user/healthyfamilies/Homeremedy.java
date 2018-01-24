package com.example.user.healthyfamilies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Homeremedy extends AppCompatActivity {

    String [] name={"Hairloss","Dandruff treatment","Headache relief","Constipation","Teeth whitening","SMoothening face"};

    String [] explain={"1.The initial step you should take is to massage your scalp with suitable oil. Scalp massage will increase blood flow to the hair follicles; it will further condition the scalp, and enhance the strength of your hairroots. Oils like coconut or almond oil, Olive oil, Castor oil and others can be used for massage. Repeat two time a week for  several weeks to see benefits.\n" +
            "2. Use egg oil (eyova). Massage egg oil into the scalp and leave on overnight.\n" +
            "•\tShampoo off in the morning with a mild, preferably herbal shampoo. Use shampoo only once as repetition removes the natural lipids of hair making it dry and brittle.\n" +
            "•\tUse egg oil 2-3 times a week for at least 12 weeks for visible results. Regular, continued use is important for proper nourishment of the cell membranes.\n" +
            "•\tContinue long term massage therapy of egg oil to prevent hairfall and graying. Discontinuing use may gradually bring back hairfall problems and resume graying.\n" +
            "•\tEgg oil (eyova) is mess free and stable. It is a more convenient alternative to egg yolk masks and does not smell like raw egg yolks or cook in the hair during a hot shower. There is no risk of salmonella which could give you a scalp infection.\n" +
            "•\tYou can make egg oil at home [[1]] or buy it online.\n" +
            "\n" +
            "3. Restore moisture through hot oil treatments. You can use any natural oil including safflower and canola or olive oil. Use this method judiciously as frequent use of hot oil or using oil which is too hot can bring on premature graying.\n" +
            "•\tHeat the oil up so it is warm, but not too hot. The ideal temperature is not exceeding 40 degrees Celsius (104 degrees Fahrenheit). Then, massage the oil into your scalp.\n" +
            "•\tPut on a shower cap for about an hour. When the hour is up, rinse or shampoo out the oil.\n" +
            "•\tMayonnaise also works well as a conditioner. Slather your hair with a generous dollop, put on a shower cap for up to an hour, and then rinse it off.\n" +
            " \n" +
            "4. Try rubbing your scalp with garlic juice, onion juice, or ginger juice. Make sure you only use 1 of these juices; don't mix them. Leave the juice on your scalp overnight, and wash it out in the morning.\n" +
            "5. Rub rangoli henna into your hair. It is a green powder with the texture of talc that seals the hair cuticle, which strengthens the hair shaft at the root.\n" +
            "6. Rub green tea into your hair. The tea contains anti-oxidants, which may prevent hair loss and help hair growth.\n" +
            "•\tBrew 2 bags of green tea in 1 cup of water. Let the tea cool slightly, and then apply it to your hair.\n" +
            "•\tLeave the tea on for 1 hour. Then, rinse your hair thoroughly.\n" +
            "\n" +
            "7. Boil potatoes and rosemary in water on your stove top. Strain the liquid, and use it daily as a hair rinse.\n",
           "1. Tea tree oil -shampoos with just 5 percent tea tree oil significantly improves the severity of dandruff. You can also add a few drops of tea tree oil to your favorite shampoo as you wash normally.\n" +
                   "2. Baking soda-Your kitchen could hold the key to an itch-free, flake-free scalp. Wet your hair and then rub a handful of baking soda vigorously into your scalp. Skip the shampoo and go right to rinsing. Baking soda reduces overactive fungi that can cause dandruff. Your hair may get dried out at first, but after a few weeks your scalp will start producing natural oils, leaving your hair softer and free of flakes.\n" +
                   "\n" +
                   "3. Apple cider vinegar-apple cider vinegar as a dandruff treatment, as the acidity of apple cider vinegar changes the pH of your scalp, making it harder for yeast to grow. Mix a quarter cup apple cider vinegar with a quarter cup water in a spray bottle and spritz on your scalp. Wrap your head in a towel and let sit for 15 minutes to an hour, then wash your hair as usual. Do this twice a week.\n" +
                   "\n" +
                   "4. Mouth wash-To treat a bad case of dandruff, wash your hair with your regular shampoo, then rinse with an alcohol-based mouthwash. Follow with your regular conditioner. Mouthwash's anti-fungal properties help prevent dandruff-causing yeast from growing.\n" +
                   "5. Apply honey to get rid of pimples.\n" +
                   "6. Toothpaste can also be used to treat pimples. Apply it overnight and wash in the morning.\n" +
                   "7.Steaming your self-This helps open up the hair pores.\n"
            ,"1.Relax and breath. Stretch your body whenever you have a headache. Don’t take stress.\n" +
            "2. Slowly move your shoulder and do some neck exercises.\n" +
            "3. Slice some ginger root. Smash it and put it in warm water. Drink it very slowly you’ll get relief.\n" +
            "4. Apply peppermint oil .It will give you a soothing effect.\n" +
            "5. Drink water. It will surely have immediate effect in relieving from headache.\n" +
            "6. Learn some acupuncture exercises for headache.\n" +
            "7. Take Vitamin B2 and Magnesium. \n" +
            "8.Ice pack is one easy way to get rid of headache .But don’t use for too long.\n"
            ,
            "1. Drink warm water before going to bed.\n" +
                    "2. In the morning when you wake up, again   follow the same routine of drinking warm water . \n" +
                    "3. Drink milk.\n" +
                    "4. Avoid caffeine as much as you can . No soft drink or soda.\n" +
                    "5.Go for food with full of fibers. Whole grain  breads, Peas, Beans, Nuts, Brocolli , Brussels sprouts, Raspberries, Avocados, Pears, Oatmeal\n",
            "1.Brush your teeth atleast two times a day.\n" +
                    "2.Baking soda and lemon act as a great teeth whitener.Use it once a week as it can clear tooth enamel if used frequently.\n" +
                    "3.Floss your teeth to keep it clean and healthy.\n" +
                    "4.Always wash your Mouth with warm water after eating chocolates.\n" +
                    "5.Wash your mouth with warm water after eating .\n",
            "1.Drink water. Water is a natural resource to flush toxics from your body which directly affects the skin on the face.\n" +
                    "2.Lemon juice is another natural antibacterial content; it immediately starts acting on your face.\n" +
                    "3. Yourghut is another good home quick fix to your dull face skin. Apply yourghut and leave it for 15-20 minutes. Then wash it off with warm water.\n" +
                    "4.Honey mask is another way to smoothn your skin. Apply honey on your face for 15 to 20 mins and wash it off with warm water.\n"
    };

    int[] images={R.drawable.hairloss,
            R.drawable.dandruffs,
            R.drawable.headache,
            R.drawable.constipation,
            R.drawable.whiteteeth,
            R.drawable.smoothskin
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeremedy);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();

        for (int i=0;i<6;i++){
            HashMap<String, String> hm=new HashMap<String, String>();

            hm.put("name",name[i]);
            hm.put("explain",explain[i]);
            hm.put("images",Integer.toString(images[i]));

            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"images","name","explain"};
        //keys from support layout
        int [] to={R.id.ivremedy,R.id.tvremedy,R.id.tvremedy1};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.homeremedysupport,from,to);

        ListView listView=(ListView) findViewById(R.id.listremedy);

        listView.setAdapter(adapter);

    }
}
