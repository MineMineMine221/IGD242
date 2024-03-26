package com.example.a62043258_slideimage_1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

   //     image_slider
        imageSlider = (ImageSlider) findViewById(R.id.image_slider);
        List<SlideModel> slideModelsList = new ArrayList<>();
        slideModelsList.add((new SlideModel("https://i.pinimg.com/474x/d4/38/11/d43811e378d0a985e76d9d82cca017aa.jpg", ScaleTypes.CENTER_CROP)));
        slideModelsList.add((new SlideModel("https://i.pinimg.com/736x/1e/b2/3b/1eb23b26a9ffd05e4fb1862439aa04a5.jpg", ScaleTypes.CENTER_CROP)));
        slideModelsList.add((new SlideModel("https://i.pinimg.com/736x/3c/f7/c3/3cf7c31533391b8e569bc275f7043d72.jpg", ScaleTypes.CENTER_CROP)));
        imageSlider.setImageList(slideModelsList,ScaleTypes.CENTER_CROP);

    }
}