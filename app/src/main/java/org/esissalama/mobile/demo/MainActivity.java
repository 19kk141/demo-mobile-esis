package org.esissalama.mobile.demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int[] img = {
            R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,
            R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView image = findViewById(R.id.img1);
        Button button = findViewById(R.id.btn1);

       button.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               image.setImageResource(img[new Random().nextInt(6)]);
           }
       });
    }
}