import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.hf6.R;

import java.util.List;

public class CustomAdapter extends ArrayAdapter {
    private Activity context;
    private Integer[] kepek;
    private String[] mono;
    private String[] nev;
    private String[] venni;
    private String[] eladni;

    public CustomAdapter(Activity context, Integer[] kepek, String[] mono, String[] nev, String[] venni, String[] eladni) {
        super(context, R.layout.list_item, nev);
        this.context = context;
        this.kepek = kepek;
        this.mono = mono;
        this.nev = nev;
        this.venni = venni;
        this.eladni = eladni;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
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
