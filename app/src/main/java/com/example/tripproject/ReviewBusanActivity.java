package com.example.tripproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class ReviewBusanActivity extends AppCompatActivity {

    ImageView bs_review;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_busan);

        bs_review = findViewById(R.id.bs_review);
        bs_review.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReviewBusanActivity.this, BusanCommentActivity.class);
                startActivity(intent);
            }
        });


    }
}
