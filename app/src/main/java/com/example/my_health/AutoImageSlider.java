package com.example.my_health;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class AutoImageSlider extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auto_image_slider);
        ImageSlider is = findViewById(R.id.imageSlider);
        ArrayList<SlideModel> sm = new ArrayList<>();
        sm.add(new SlideModel(R.drawable.first, ScaleTypes.FIT));
        sm.add(new SlideModel(R.drawable.second, ScaleTypes.FIT));
        sm.add(new SlideModel(R.drawable.third, ScaleTypes.FIT));
        sm.add(new SlideModel(R.drawable.fourth, ScaleTypes.FIT));
        sm.add(new SlideModel(R.drawable.fifth, ScaleTypes.FIT));

        is.setImageList(sm,ScaleTypes.FIT);

    }
}