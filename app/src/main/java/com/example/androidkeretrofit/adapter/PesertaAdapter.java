package com.example.androidkeretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.androidkeretrofit.R;
import com.example.androidkeretrofit.model.Peserta;

import java.util.List;

public class PesertaAdapter extends RecyclerView.Adapter<PesertaAdapter.PesertaViewHolder> {

    private Context context;
    private List<Peserta> peserta;

    public PesertaAdapter(Context context, List<Peserta> peserta) {
        this.context = context;
        this.peserta = peserta;
    }

    @NonNull
    @Override
    public PesertaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater=LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_layout,parent,false);
        return new PesertaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PesertaViewHolder holder, int position) {
        holder.txtNama.setText(peserta.get(position).getNama());
        holder.txtUmur.setText(peserta.get(position).getUmur());
        Glide.with(context).load("https://e1be-139-192-158-19.ngrok.io/foto-peserta/"+peserta.get(position).getGambar())
                .into(holder.imagePeserta);
    }

    @Override
    public int getItemCount() {
        return peserta.size();
    }

    public class PesertaViewHolder  extends RecyclerView.ViewHolder{
        ImageView imagePeserta;
        TextView txtNama,txtUmur;
        public PesertaViewHolder(@NonNull View itemView) {
            super(itemView);
            imagePeserta=itemView.findViewById(R.id.imagePeserta);
            txtNama=itemView.findViewById(R.id.txtNama);
            txtUmur=itemView.findViewById(R.id.txtUmur);
        }
    }
}
