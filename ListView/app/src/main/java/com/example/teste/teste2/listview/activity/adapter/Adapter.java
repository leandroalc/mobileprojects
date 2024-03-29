package com.example.teste.teste2.listview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.teste.teste2.listview.R;
import com.example.teste.teste2.listview.activity.model.Filme;

import org.w3c.dom.Text;

import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    private List<Filme> listaFilmes;

    public Adapter(List<Filme> lista) {
        this.listaFilmes = lista;
    }

    //Cria as visualizações, apenas a view que é exibida para o usuário.
    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lista, parent, false);

        return new MyViewHolder(itemLista);

    }

    //Cria visualição dos itens.
    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        //Recuperando dados:
        Filme filme = listaFilmes.get(position);
        holder.titulo.setText(filme.getTituloFilme());
        holder.genero.setText(filme.getGeneroFilme());
        holder.ano.setText(filme.getAnoFilme());

    }

    //Retorna a quantidade de itens que serão exibidos.
    @Override
    public int getItemCount() {
        return listaFilmes.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        TextView titulo;
        TextView ano;
        TextView genero;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            titulo = itemView.findViewById(R.id.textViewTitulo);
            ano = itemView.findViewById(R.id.textViewAno);
            genero = itemView.findViewById(R.id.textViewGenero);

        }

    }

}
