package com.example.walkmypet;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Adaptador extends ArrayAdapter<Cuidadores> {

    Context context;
    List<Cuidadores>arrayListaCuidador;
    public Adaptador(@NonNull Context context, List<Cuidadores>arrayListaCuidador) {
        super(context,R.layout.my_list_item,arrayListaCuidador);

        this.context=context;
        this.arrayListaCuidador=arrayListaCuidador;
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent){
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.my_list_item,null,true);
        TextView tvid=view.findViewById(R.id.tvid);
        TextView tvnombre=view.findViewById(R.id.tvnombre);

        tvid.setText(arrayListaCuidador.get(position).getId());
        tvnombre.setText(arrayListaCuidador.get(position).getNombre());
        return view;
    }

}
