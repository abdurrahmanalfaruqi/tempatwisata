package com.example.forsubmission;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class wisataDetail extends AppCompatActivity {
    public TextView tvDetail;
    public ImageView imgPhoto;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profilewisata);

        tvDetail = findViewById(R.id.tv_data);
        imgPhoto = findViewById(R.id.img_wisataphoto);

        Wisata extra =getIntent().getParcelableExtra("objek");
        imgPhoto.setImageResource(extra.getPhoto());
        tvDetail.setText(extra.getDetail());
    }
}
