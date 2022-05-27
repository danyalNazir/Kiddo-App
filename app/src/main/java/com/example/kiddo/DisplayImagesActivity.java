package com.example.kiddo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DisplayImagesActivity extends AppCompatActivity {

    TextView textView;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_images);

        textView=findViewById(R.id.TextViewButtonText);
        imageView=findViewById(R.id.imageView);
        Intent intent=getIntent();

        int imageResource=Integer.parseInt(intent.getStringExtra("Image"));
        String buttonText=intent.getStringExtra("buttonText");

        imageView.setImageResource(imageResource);
        imageView.setContentDescription(buttonText);
        textView.setText(buttonText);

    }
}