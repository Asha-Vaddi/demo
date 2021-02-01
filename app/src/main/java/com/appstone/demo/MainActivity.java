package com.appstone.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class MainActivity extends AppCompatActivity {
    private MeowBottomNavigation mButtomNav;
    private static final int ID_HOME=1;
    private static final int ID_EXPLORE=2;
    private static final int ID_ADD=3;
    private static final int ID_CHAT=4;
    private static final int ID_PROFILE=5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mButtomNav = (MeowBottomNavigation) findViewById(R.id.btm_nav);

        mButtomNav.add(new MeowBottomNavigation.Model(1,R.drawable.ic_dashboard));
        mButtomNav.add(new MeowBottomNavigation.Model(2,R.drawable.ic_explore));
        mButtomNav.add(new MeowBottomNavigation.Model(3,R.drawable.ic_add));
        mButtomNav.add(new MeowBottomNavigation.Model(4,R.drawable.ic_chat_dark));
        mButtomNav.add(new MeowBottomNavigation.Model(5,R.drawable.ic_profile));

        mButtomNav.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                // Toast.makeText(getApplicationContext(),"clicked item"+item.getId(),Toast.LENGTH_LONG).show();
            }
        });
        mButtomNav.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {

                switch (item.getId()){
                    case ID_HOME:
                        Toast.makeText(MainActivity.this,"icon clicked",Toast.LENGTH_LONG).show();
                        break;
                    case ID_EXPLORE:
                        Toast.makeText(MainActivity.this,"icon clicked",Toast.LENGTH_LONG).show();
                        break;
                    case ID_ADD:
                        Toast.makeText(MainActivity.this,"icon clicked",Toast.LENGTH_LONG).show();
                        break;
                    case ID_CHAT:
                        Toast.makeText(MainActivity.this,"icon clicked",Toast.LENGTH_LONG).show();
                        break;
                    case ID_PROFILE:
                        Toast.makeText(MainActivity.this,"icon clicked",Toast.LENGTH_LONG).show();
                        break;
                    default:
                        Toast.makeText(MainActivity.this,"icon clicked",Toast.LENGTH_LONG).show();
                        break;
                }

            }
        });
        mButtomNav.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {

            }
        });


    }


}