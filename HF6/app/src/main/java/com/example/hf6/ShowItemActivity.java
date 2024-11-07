package com.example.hf6;

import android.content.res.Configuration;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class ShowItemActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_item);

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE){
            finish();
            return;
        }

        Bundle extras = getIntent().getExtras();
        if (extras != null){
            String selectedItem = extras.getString("item");
            TextView textView = findViewById(R.id.selectedopt);
            textView.setText("You have selected "+ selectedItem);
        }
    }
}
