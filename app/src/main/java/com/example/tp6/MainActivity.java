package com.example.tp6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity implements MainFragment.Callback {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.mainLayout, new MainFragment());
        ft.commit();
    }

    public void goTo(View v) {
        FrameLayout fl = (FrameLayout) findViewById(R.id.result);
        if (fl!= null ){
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
            if (v.getId() == R.id.b1) {
                ft.replace(R.id.result, new SecondFragment());
            }
            if (v.getId() == R.id.b2) {
                ft.replace(R.id.result, new ThirdFragment());
            }
            ft.commit();
        } else {
            if (v.getId() == R.id.b1) {
                Intent i = new Intent(this, SecondActivity.class);
                startActivity(i);
            }
            if (v.getId() == R.id.b2) {
                Intent i = new Intent(this, ThirdActivity.class);
                startActivity(i);
            }
        }
    }


}