package com.example.calculatortutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {

    private ImageSlider imageSlider;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        imageSlider=findViewById(R.id.imageSlider);

        //now we will create a list

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://c1.wallpaperflare.com/preview/261/1002/366/neonwave-outrun-vaporwave-cyberpunk.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://c4.wallpaperflare.com/wallpaper/482/330/453/studio-ghibli-spirited-away-anime-movies-wallpaper-preview.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://c4.wallpaperflare.com/wallpaper/374/444/900/animals-birds-baby-animals-duck-wallpaper-preview.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://c1.wallpaperflare.com/preview/603/151/753/green-neon-night-photography-night-time.jpg", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://c4.wallpaperflare.com/wallpaper/632/790/513/digital-digital-art-artwork-city-lights-hd-wallpaper-preview.jpg", ScaleTypes.FIT));

        imageSlider.setImageList(slideModels, ScaleTypes.FIT);

        //I have some imageurls which I will use in this slider
    }
}