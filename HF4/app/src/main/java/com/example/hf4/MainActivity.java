package com.example.hf4;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        String[] mono = {"EUR","USD","GBP","AUD",
                "CAD","CHF","DKK","HUF",};

        String[] nev = {
                "Euro",
                "Dolar american",
                "Lira sterlina",
                "Dolar australian",
                "Dolar canadian",
                "Frank elvetian",
                "Corona daneza",
                "Forint maghiar",
        };

        String[] venni = {
                "4,4100 RON",
                "3,9700 RON",
                "6,1250 RON",
                "2,9600 RON",
                "3,0950 RON",
                "4,2300 RON",
                "0,5850 RON",
                "0,0136 RON",
        };

        String[] eladni = {
                "4,5500 RON",
                "4,4150 RON",
                "6,3550 RON",
                "3,0600 RON",
                "3,2650 RON",
                "4,3300 RON",
                "0,6150 RON",
                "0,0146 RON",
        };

        Integer[] kepek = {
          R.drawable.euflag,
          R.drawable.usd,
          R.drawable.gbp2,
          R.drawable.aud,
          R.drawable.cad2,
          R.drawable.chf2,
          R.drawable.dkk2,
          R.drawable.huf2
        };

        ListView list = findViewById(R.id.customListView);
        CustomAdapter adapter = new CustomAdapter(this, mono, nev, venni, eladni, kepek);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                String penznem = mono[i];
                String vetelar = venni[i];
                Toast.makeText(MainActivity.this, "Penznem: " + penznem + " Vetelar: " + vetelar, Toast.LENGTH_SHORT).show();
            }
        });
    }
}