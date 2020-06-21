package com.example.android.swipeimages;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageData.setImageIds();
        ImageAdapterFrag adapter=new ImageAdapterFrag(this);
        ViewPager2 viewPager=findViewById(R.id.pager);
        viewPager.setAdapter(adapter);

    }
}