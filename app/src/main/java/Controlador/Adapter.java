package Controlador;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.practica2trimestre.R;
import com.google.android.material.imageview.ShapeableImageView;

import java.util.ArrayList;

import Entidades.ListaProducto;

public class Adapter extends RecyclerView.Adapter<Adapter.MiAdaptador> {

    Context context;
    ArrayList<ListaProducto> listaProducto;

    public Adapter(Context context, ArrayList<ListaProducto> listaProducto) {
        this.context = context;
        this.listaProducto = listaProducto;
    }

    @NonNull
    @Override
    public Adapter.MiAdaptador onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View v = LayoutInflater.from(context).inflate(R.layout.recycleview, parent, false);

        return new MiAdaptador(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MiAdaptador holder, int position) {

        ListaProducto lista = listaProducto.get(position);
        holder.descripcionProducto.setText(lista.nombreProducto);
        holder.imagenProducto.setImageResource(lista.imagen);

    }

    @Override
    public int getItemCount() {
        return listaProducto.size();
    }

    public static class  MiAdaptador extends RecyclerView.ViewHolder{

        TextView descripcionProducto;
        ShapeableImageView imagenProducto;

        public MiAdaptador(@NonNull View itemView) {
            super(itemView);
            descripcionProducto = itemView.findViewById(R.id.descripcionProducto);
            imagenProducto = itemView.findViewById(R.id.imagenProducto);
        }
    }
}
