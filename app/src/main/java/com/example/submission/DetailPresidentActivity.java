package com.example.submission;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailPresidentActivity extends AppCompatActivity {

    TextView tvName;
    TextView tvDescription;
    ImageView ivPhoto;
    President president;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_president);

        tvName = findViewById(R.id.tv_item_name);
        tvDescription = findViewById(R.id.tv_item_remarks);
        ivPhoto = findViewById(R.id.img_item_photo);

        president = getIntent().getParcelableExtra("PRESIDENT");

        tvName.setText(president.getName());
        tvDescription.setText(president.getRemarks());
        Glide.with(this)
                .load(president.getPhoto())
                .apply(new RequestOptions().override(1000,1000))
                .into(ivPhoto);

    }

}
