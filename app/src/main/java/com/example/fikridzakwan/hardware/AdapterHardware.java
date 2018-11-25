package com.example.fikridzakwan.hardware;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class AdapterHardware extends RecyclerView.Adapter<AdapterHardware.ViewHolder> {

    Context context;
    String[] namaHardware,detailHardware;
    int[] gambarHardware;


    public AdapterHardware(Context context, String[] namaHardware, String[] detailHardware, int[] gambarHardware) {
        this.context = context;
        this.namaHardware = namaHardware;
        this.detailHardware = detailHardware;
        this.gambarHardware = gambarHardware;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_hardware, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, final int i) {
        viewHolder.txtNamaHardware.setText(namaHardware[i]);
        Glide.with(context).load(gambarHardware[i]).into(viewHolder.imgGambarHardware);
        viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailHardware.class);
                intent.putExtra("NH", namaHardware[i]);
                intent.putExtra("DH", detailHardware[i]);
                intent.putExtra("GH", gambarHardware[i]);
                context.startActivity(intent);
            }
        });


    }

    @Override
    public int getItemCount() {
        return gambarHardware.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgGambarHardware;
        TextView txtNamaHardware;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            imgGambarHardware = itemView.findViewById(R.id.imgGambarHardware);
            txtNamaHardware = itemView.findViewById(R.id.txtNamaHardware);
        }
    }
}
