package com.example.hf5;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    ArrayList<String> listItems;
    ArrayAdapter<String> adapter;
    ListView list;
    int selectedItemPosition = -1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        list = findViewById(R.id.customListView);

        listItems = new ArrayList<>(Arrays.asList(getResources().getStringArray(R.array.days))) ;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, listItems);
        list.setAdapter(adapter);
        registerForContextMenu(list);


        list.setOnItemLongClickListener((parent, view, position, id) -> {
            selectedItemPosition = position;  // Mentjuk a kivalasztott poziciot
            return false;
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.option, menu);
        return true;
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);
        getMenuInflater().inflate(R.menu.context_menu, menu);

    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.delete) {
            listItems.clear();
            adapter.notifyDataSetChanged();
        } else if (id == R.id.sort) {
            Collections.sort(listItems);
            adapter.notifyDataSetChanged();
        }
        return true;
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        if (selectedItemPosition != -1) {
            // Megkapjuk a kivalasztott listaelem nezetet
            View selectedView = list.getChildAt(selectedItemPosition - list.getFirstVisiblePosition());
            TextView textView = selectedView.findViewById(android.R.id.text1);
            int id = item.getItemId();
            if (id == R.id.red) {
                textView.setTextColor(Color.RED);
            } else if (id == R.id.green) {
                textView.setTextColor(Color.GREEN);
            } else if (id == R.id.yellow) {
                textView.setTextColor(Color.YELLOW);
            }
        }
        return super.onContextItemSelected(item);
    }
}