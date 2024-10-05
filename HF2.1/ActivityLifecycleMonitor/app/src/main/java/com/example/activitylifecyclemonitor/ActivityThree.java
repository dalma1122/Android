package com.example.activitylifecyclemonitor;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ActivityThree extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_three);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Log.d("Statusz:", "ActivityThree - onCreate");

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Statusz:", "ActivityThree - onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Statusz:", "ActivityThree - onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Statusz:", "ActivityThree - onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Statusz:", "ActivityThree - onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Statusz:", "ActivityThree - onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Statusz:", "ActivityThree - onDestroy");
    }
}