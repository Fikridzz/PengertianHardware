package com.example.fikridzakwan.hardware;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecyclerViewActivity extends AppCompatActivity {

    int[] gambarHardware;
    String[] namaHardware, detailHardware;
    @BindView(R.id.recyclerView)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        ButterKnife.bind(this);

        namaHardware = getResources().getStringArray(R.array.nama_hardware);
        detailHardware = getResources().getStringArray(R.array.detail_hardwae);
        gambarHardware = new int[]{R.drawable.motherboard, R.drawable.procecor, R.drawable.ram, R.drawable.casing, R.drawable.powersuply, R.drawable.fan,
        R.drawable.vga, R.drawable.cpucoller, R.drawable.internal, R.drawable.ekternal};

        AdapterHardware adapterHardware = new AdapterHardware(this, namaHardware, detailHardware, gambarHardware);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapterHardware);


    }
}
