package com.example.activitylifecyclemonitor;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView txt;
    EditText editText;
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
        Button gomb1 = findViewById(R.id.btnStartActivityTwo);
        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ActivityTwo.class);
                startActivity(intent);
            }
        });

        txt = findViewById(R.id.txtSzoveg);
        txt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt.append("\n" + txt.getText().toString());
            }
        });

        editText = findViewById(R.id.edttxt);

        Log.d("Statusz:", "MainActivity - onCreate");
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("txt", txt.getText().toString());
        outState.putString("editTxt", editText.getText().toString());
        Log.d("Statusz:", "MainActivity - onSaveInstanceState");
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("Statusz:", "MainActivity - onRestoreInstanceState");
        txt.setText(savedInstanceState.getString("txt"));
        editText.setText(savedInstanceState.getString("editTxt"));
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz:", "MainActivity - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz:", "MainActivity - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:", "MainActivity - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:", "MainActivity - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz:", "MainActivity - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:", "MainActivity - onDestroy");
    }

}