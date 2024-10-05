package com.example.activitylifecyclemonitor;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_two);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Log.d("Statusz:", "ActivityTwo - onCreate");

        Button gomb1 = findViewById(R.id.btnMainActivity);
        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button gomb2 = findViewById(R.id.btnActivityThree);
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityTwo.this, ActivityThree.class);
                startActivity(intent);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz:", "ActivityTwo - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz:", "ActivityTwo - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:", "ActivityTwo - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:", "ActivityTwo - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz:", "ActivityTwo - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:", "ActivityTwo - onDestroy");
    }
}