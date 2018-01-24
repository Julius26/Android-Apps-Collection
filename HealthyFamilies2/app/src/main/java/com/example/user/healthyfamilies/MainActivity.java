package com.example.user.healthyfamilies;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    int[] flags={R.drawable.carbohydrates,//why is flags int?
            R.drawable.protein6,
            R.drawable.inkedvitamin,
            R.drawable.mineralsalts,
            R.drawable.rhoughages,
            R.drawable.diseases,
            R.drawable.refined
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<HashMap<String, String>> alist=new ArrayList<HashMap<String, String>>();
        for (int i=0;i<7;i++){
            HashMap<String, String> hm=new HashMap<String, String>();
            hm.put("flag", Integer.toString(flags[i]));

            alist.add(hm);
        }
        //keys usedin the hashmap
        String [] from={"flag"};
        //keys from support layout
        int [] to={R.id.carbosupportlayout};

        SimpleAdapter adapter=new SimpleAdapter(getBaseContext(),alist,R.layout.mainactivitysupport,from,to);

        ListView listView=(ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Toast.makeText(MainActivity.this,"Learn more on carbohydrates",Toast.LENGTH_SHORT).show();
                    Intent carbo=new Intent(MainActivity.this,Carbohydrates.class);
                    startActivity(carbo);
                }
                if (position==1){
                    Toast.makeText(MainActivity.this,"Learn more on proteins",Toast.LENGTH_SHORT).show();
                    Intent proteins=new Intent(MainActivity.this,Protein.class);
                    startActivity(proteins);
                }
                if (position==2){
                    Toast.makeText(MainActivity.this,"Learn more on vitamins",Toast.LENGTH_SHORT).show();
                    Intent vitamins=new Intent(MainActivity.this,Vitamins.class);
                    startActivity(vitamins);
                }
                if (position==3){
                    Toast.makeText(MainActivity.this,"Learn more on minerals",Toast.LENGTH_SHORT).show();
                    Intent minerals=new Intent(MainActivity.this,Minerals.class);
                    startActivity(minerals);
                }

                if (position==4){
                    Toast.makeText(MainActivity.this,"Learn more on Rhoughages",Toast.LENGTH_SHORT).show();
                    Intent rhoughages=new Intent(MainActivity.this,Rhoughages.class);
                    startActivity(rhoughages);
                }
                if (position==5){
                    Toast.makeText(MainActivity.this,"Learn more on Protective foods",Toast.LENGTH_SHORT).show();
                    Intent diseases=new Intent(MainActivity.this,Diseases.class);
                    startActivity(diseases);
                }
                if (position==6) {
                    Toast.makeText(MainActivity.this,"Learn more on highly refined foods",Toast.LENGTH_SHORT).show();
                    Intent refined = new Intent(MainActivity.this, Refined.class);
                    startActivity(refined);
                }
            }
        });


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);






        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_camera) {
            Intent c=new Intent("android.media.action.IMAGE_CAPTURE");
            startActivityForResult(c,0);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.Balanced_diet) {
            Intent balanceddiet=new Intent(MainActivity.this,Balanceddiet.class);
            startActivity(balanceddiet);
        } else if (id == R.id.Track_your_meals) {
            Intent track=new Intent(MainActivity.this,Trackmeals.class);
            startActivity(track);
        } else if (id == R.id.Reminder) {
           Intent reminder=new Intent(MainActivity.this,Homeremedy.class);
            startActivity(reminder);
        }  else if (id == R.id.nav_share) {

            Intent browser=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/julius.mutunga.71"));
            startActivity(browser);


        } else if (id == R.id.nav_call) {
            Intent k=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:(+254)708094353"));
            startActivity(k);


        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
