package com.example.activitystatesavetwo;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    CheckBox box;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        txt = findViewById(R.id.edtTxt);
        box = findViewById(R.id.checkBox);

        Log.d("Statusz:", "MainActivity - onCreate");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("txt", txt.getText().toString());
        outState.putBoolean("checkBox", box.isChecked());
        Log.d("Statusz:", "MainActivity - onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Statusz:", "MainActivity - onRestoreInstanceState");
        txt.setText(savedInstanceState.getString("txt"));
        box.setChecked(savedInstanceState.getBoolean("checkBox"));
    }
}