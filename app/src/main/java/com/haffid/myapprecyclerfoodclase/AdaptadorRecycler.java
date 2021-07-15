package com.haffid.myapprecyclerfoodclase;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class AdaptadorRecycler extends RecyclerView.Adapter<AdaptadorRecycler.ViewHolder> {

    ArrayList<DatosVO> listaDatos = new ArrayList<>();

    public AdaptadorRecycler(ArrayList<DatosVO> listaDatos) {
        this.listaDatos = listaDatos;
    }

    @Override
    public AdaptadorRecycler.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, null, false);
        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull AdaptadorRecycler.ViewHolder holder, int position) {

        holder.asignarDatos(listaDatos.get(position).getNombreC(), listaDatos.get(position).getNumeroC(), listaDatos.get(position).getImagenC());

    }

    @Override
    public int getItemCount() {
        return this.listaDatos.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView textViewNom, textViewNum;
        ImageView imageView;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            textViewNom = itemView.findViewById(R.id.txtNombreC);
            textViewNum = itemView.findViewById(R.id.txtNumeroC);
            imageView = itemView.findViewById(R.id.imgR);
        }

        public void asignarDatos(String nom, int num, int img){
            textViewNom.setText(nom);
            textViewNum.setText(String.valueOf(num));
            imageView.setImageResource(img);

        }

    }
}
