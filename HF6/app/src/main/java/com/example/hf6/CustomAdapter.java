package com.example.hf6;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomAdapter extends ArrayAdapter {
    private Activity context;
    private Integer[] kepek;
    private String[] mono;
    private String[] nev;
    private String[] venni;
    private String[] eladni;


    public CustomAdapter(@NonNull Activity context, String[] mono, String[] names, String[] buy, String[] sell, Integer[] images) {
        super(context, R.layout.list_item, names);
        this.context = context;
        this.nev = names;
        this.mono = mono;
        this.venni = buy;
        this.eladni = sell;
        this.kepek = images;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View view = inflater.inflate(R.layout.list_item,null,true);
        TextView monogram = view.findViewById(R.id.monogram);
        TextView name = view.findViewById(R.id.name);
        TextView penzVesz = view.findViewById(R.id.penzVesz);
        TextView penzElad = view.findViewById(R.id.penzElad);
        ImageView imageView = view.findViewById(R.id.flag);

        monogram.setText(mono[position]);
        name.setText(nev[position]);
        penzVesz.setText(venni[position]);
        penzElad.setText(eladni[position]);
        imageView.setImageResource(kepek[position]);

        return view;
    }
}
