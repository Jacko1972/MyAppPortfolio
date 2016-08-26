package com.jacko1972.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Hidden to implement recommended changes by Udacity reviewer
//        Button popular_movies = (Button) findViewById(R.id.popular_movies);
//        Button stock_hawk = (Button) findViewById(R.id.stock_hawk);
//        Button build_it_bigger = (Button) findViewById(R.id.build_it_bigger);
//        Button make_your_app_material = (Button) findViewById(R.id.make_your_app_material);
//        Button go_ubiquitous = (Button) findViewById(R.id.go_ubiquitous);
//        Button capstone = (Button) findViewById(R.id.capstone);
//
//        popular_movies.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This button will launch my Popular Movies app!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        stock_hawk.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This button will launch my Stock Hawk app!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        build_it_bigger.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This button will launch my Build It Bigger app!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        make_your_app_material.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) { Toast.makeText(MainActivity.this, "This button will launch my Make Your App Material app!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        go_ubiquitous.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This button will launch my Go Ubiquitous app!", Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        capstone.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(MainActivity.this, "This button will launch my Capstone app!", Toast.LENGTH_SHORT).show();
//            }
//        });
    }

    public void displayToast(View view) {
        Button button = (Button) view;
        String displayString = "Opens the app " + button.getText().toString();

        Toast.makeText(this, displayString, Toast.LENGTH_SHORT).show();
    }
}
