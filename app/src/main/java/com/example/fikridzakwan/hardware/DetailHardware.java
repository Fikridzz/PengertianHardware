package com.example.fikridzakwan.hardware;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DetailHardware extends AppCompatActivity {

    @BindView(R.id.imgLogo)
    ImageView imgLogo;
    @BindView(R.id.txtTitle)
    TextView txtTitle;
    @BindView(R.id.txtDetail)
    TextView txtDetail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hardware);
        ButterKnife.bind(this);

        txtTitle.setText(getIntent().getStringExtra("NH"));
        txtDetail.setText(getIntent().getStringExtra("DH"));
        Glide.with(this).load(getIntent().getIntExtra("GH",0)).into(imgLogo);
    }
}
