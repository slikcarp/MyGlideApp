package com.mobileappscompany.training.myglideapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private static int index = 0;
    private static int TOTAL_OF_IMAGES = 3;

    private ImageView imageView;
    private String[] images = new String[]
            {"https://images4.alphacoders.com/179/thumb-1920-179936.jpg",
            "https://images3.alphacoders.com/797/79729.jpg",
            "https://images.alphacoders.com/699/699132.jpg"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = (ImageView) findViewById(R.id.iView);

        Glide.with(this).load(images[0]).into(imageView);
    }

    public void changeImage(View view) {
        imageView.getLayoutParams().width=3000;
        imageView.getLayoutParams().height=3000;
        imageView.requestLayout();

        Glide.with(this).load(images[++index%3]).into(imageView);
    }

}
