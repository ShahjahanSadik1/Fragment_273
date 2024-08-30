package com.shahjahan.fragment_273;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    ImageView profilr_button,gift_button,home_button;

    LinearLayout toolbar,main_lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        profilr_button = findViewById(R.id.profilr_button);
        gift_button = findViewById(R.id.gift_button);
        home_button = findViewById(R.id.home_button);
       // toolbar = findViewById(R.id.toolbar);
        main_lay = findViewById(R.id.main_lay);



        //home set Fragment>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
        FragmentManager fmanagerr = getSupportFragmentManager();
        FragmentTransaction fragmentTransactionn = fmanagerr.beginTransaction();
        fragmentTransactionn.add(R.id.framelayout,new Fast_fragment());
        fragmentTransactionn.commit();

        main_lay.setBackgroundColor(Color.parseColor("#4CAF50"));


        //ggggggggggggggggggggggggg
        if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){

            Window window = getWindow();

            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

            window.setNavigationBarColor(Color.parseColor("#4CAF50"));
            window.setStatusBarColor(Color.parseColor("#4CAF50"));
        }
        //home set Fragment>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>








        //home button Fragment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<
        home_button.setOnClickListener(v -> {

            main_lay.setBackgroundColor(Color.parseColor("#4CAF50"));

            FragmentManager fmanager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fmanager.beginTransaction();
            fragmentTransaction.add(R.id.framelayout,new Fast_fragment());
            fragmentTransaction.commit();


            //ggggggggggggggggggggggggg
            if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){

                Window window = getWindow();

                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

                window.setNavigationBarColor(Color.parseColor("#4CAF50"));
                window.setStatusBarColor(Color.parseColor("#4CAF50"));
            }


        });
        //home button Fragment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<


        //gift button Fragment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<
        gift_button.setOnClickListener(v -> {

            main_lay.setBackgroundColor(Color.parseColor("#B22222"));

            //ggggggggggggggggggggggggg
            if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){

                Window window = getWindow();

                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

                window.setNavigationBarColor(Color.parseColor("#B22222"));
                window.setStatusBarColor(Color.parseColor("#B22222"));
            }


            FragmentManager fmanager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fmanager.beginTransaction();
            fragmentTransaction.add(R.id.framelayout,new Sacend_fragment());
            fragmentTransaction.commit();


        });
        //gift button Fragment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<


        //profile button Fragment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<
        profilr_button.setOnClickListener(v -> {

            main_lay.setBackgroundColor(Color.parseColor("#9932CC"));
            //ggggggggggggggggggggggggg
            if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.LOLLIPOP){

                Window window = getWindow();

                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);

                window.setNavigationBarColor(Color.parseColor("#9932CC"));
                window.setStatusBarColor(Color.parseColor("#9932CC"));
            }

            FragmentManager fmanager = getSupportFragmentManager();
            FragmentTransaction fragmentTransaction = fmanager.beginTransaction();
            fragmentTransaction.add(R.id.framelayout,new Three_fragment());
            fragmentTransaction.commit();


        });
        //profile button Fragment >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<







    }//onCreac Mathud end here =============================================================




}//public class end here==========================================