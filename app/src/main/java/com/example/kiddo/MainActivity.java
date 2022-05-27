package com.example.kiddo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void OnClickButton(View view)
    {
        button=findViewById(view.getId());
        int imageResource;
        switch (Integer.parseInt(button.getText().toString())) {
            case 1:
                imageResource = R.drawable.one;
                break;
            case 2:
                imageResource = R.drawable.two;
                break;
            case 3:
                imageResource = R.drawable.three;
                break;
            case 4:
                imageResource = R.drawable.four;
                break;
            case 5:
                imageResource = R.drawable.five;
                break;
            case 6:
                imageResource = R.drawable.six;
                break;
            case 7:
                imageResource = R.drawable.seven;
                break;
            case 8:
                imageResource = R.drawable.eight;
                break;
            case 9:
                imageResource = R.drawable.nine;
                break;
            default:
                imageResource = R.drawable.ten;
                break;
        }
        Intent intent=new Intent(MainActivity.this,DisplayImagesActivity.class);
        intent.putExtra("Image", String.valueOf(imageResource));
        intent.putExtra("buttonText",button.getText().toString());
        startActivity(intent);
    }

}