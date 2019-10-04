package com.example.asus.pizza;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class ImageFull extends AppCompatActivity {
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_full);
        Bundle bundle = getIntent().getExtras();

        image = (ImageView) findViewById(R.id.imageView);
        if(bundle!=null){
            int resid = bundle.getInt("resId");
            image.setImageResource(resid);
        }
    }
}
