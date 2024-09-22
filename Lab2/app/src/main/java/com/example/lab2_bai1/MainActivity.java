package com.example.lab2_bai1;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ProgressBar;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    ImageView imgView;
    private ConstraintLayout cl;
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

        imgView = findViewById(R.id.imageView);
        cl = findViewById(R.id.main);

        int[] imgs ={R.drawable.cat, R.drawable.dog,
                R.drawable.penguin, R.drawable.turtle, R.drawable.hamster};
        int[] colors = {R.color.purple_200, R.color.purple_500,
                R.color.purple_700, R.color.teal_200, R.color.teal_700};

        Random r = new Random();
        int rn = r.nextInt(5);
        imgView.setImageResource(imgs[rn]);

        int rc = r.nextInt(5);
        cl.setBackgroundColor(colors[rc]);
    }
}