package com.rizky92.dicodingsubmissionv2;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.rizky92.dicodingsubmissionv2.model.Hape;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RowAdapter extends RecyclerView.Adapter<RowAdapter.CardViewHolder> {
    private ArrayList<Hape> listHape;
    RowAdapter(ArrayList<Hape> list) { this.listHape = list; }

    @NonNull
    @Override
    public RowAdapter.CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_xiaomi, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final RowAdapter.CardViewHolder holder, int position) {
         final Hape hape = listHape.get(position);

        Picasso.get().load(hape.getFoto()).into(holder.img);

        holder.tvNama.setText(hape.getNama());
        holder.tvPrice.setText(hape.getPrice());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_HAPE, hape);
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() { return listHape.size(); }

    class CardViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama, tvPrice;
        ImageView img;
        Button btnDetail;

        CardViewHolder(@NonNull View itemView) {
            super(itemView);

            img = itemView.findViewById(R.id.img_item_foto);
            tvNama = itemView.findViewById(R.id.tv_name);
            tvPrice = itemView.findViewById(R.id.tv_price);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
