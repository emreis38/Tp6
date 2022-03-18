package com.example.tp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.ThirdLayout, new ThirdFragment());
        ft.commit();

    }
}