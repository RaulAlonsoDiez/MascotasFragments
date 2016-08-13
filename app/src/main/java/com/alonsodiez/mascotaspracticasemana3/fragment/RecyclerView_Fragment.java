package com.alonsodiez.mascotaspracticasemana3.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alonsodiez.mascotaspracticasemana3.R;
import com.alonsodiez.mascotaspracticasemana3.adapter.MascotaAdaptador;
import com.alonsodiez.mascotaspracticasemana3.pojo.Mascota;

import java.util.ArrayList;

/**
 * Created by LOBEZNO on 12/08/2016.
 */
public class RecyclerView_Fragment extends Fragment {
    ArrayList<Mascota> mascotas;
    private RecyclerView listaMascotas;
    public MascotaAdaptador adaptador;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_recyclerview, container, false);

        listaMascotas = (RecyclerView) v.findViewById(R.id.rvMascotas);
        //ahora de qué forma queremos mostrar los datos
        LinearLayoutManager llm = new LinearLayoutManager(getActivity());
        llm.setOrientation(LinearLayoutManager.VERTICAL);
        listaMascotas.setLayoutManager(llm);
        inicializarListaMascotas();
        inicializarAdaptador();

        return v;
    }

    public void inicializarListaMascotas() {
        mascotas = new ArrayList<Mascota>();

        mascotas.add(new Mascota(R.drawable.img3, "Sandokan", "Tigre", true, 8));
        mascotas.add(new Mascota(R.drawable.img4, "Bob", "Perro", true, 3));
        mascotas.add(new Mascota(R.drawable.img5, "Pirata", "Loro", false, 0));
        mascotas.add(new Mascota(R.drawable.img6, "Bokeh", "Águila", true, 4));
        mascotas.add(new Mascota(R.drawable.img7, "Thunder", "Caballo", true, 9));
        mascotas.add(new Mascota(R.drawable.img8, "Pingu", "Pantera", true, 8));
        mascotas.add(new Mascota(R.drawable.img1, "Teddy", "Hamster", false, 0));
        mascotas.add(new Mascota(R.drawable.img2, "Paddy", "Conejo", false, 0));
    }

    public void inicializarAdaptador(){
        //Creamos un objeto de MascotaAdaptador
        adaptador = new MascotaAdaptador(mascotas, getActivity());
        listaMascotas.setAdapter(adaptador);
    }

}
