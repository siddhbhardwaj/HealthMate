package com.example.my_health;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class Home extends AppCompatActivity {
    CardView labtest,buymedicine,findmydoc,articles,orders,logout;
    DrawerLayout drawerLayout;
    ImageView menu;
    LinearLayout home,about,AI;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        menu = findViewById(R.id.menu);
        labtest = findViewById(R.id.c_labtest);
        buymedicine= findViewById(R.id.c_buymedicine);
        findmydoc = findViewById(R.id.c_finddoc);
        articles = findViewById(R.id.c_articles);
        orders = findViewById(R.id.c_orderdetails);
        logout = findViewById(R.id.logout);
        labtest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Home.this,labtest.class));
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);

            }
        });

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Home.this,AutoImageSlider.class));
            }
        });

        findmydoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(Home.this,findmydoc.class));
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);

            }
        });
        logout.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                startActivity(new Intent(Home.this,Login.class));
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }

        });
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,myorders.class));
                overridePendingTransition(R.anim.slide_in_right,R.anim.slide_out_left);
            }
        });

        buymedicine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,medicines.class));
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);

            }
        });
        articles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home.this,articles.class));
                overridePendingTransition(R.anim.slide_in_right,
                        R.anim.slide_out_left);

            }
        });
    }
}