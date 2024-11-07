package com.example.hf6;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class MainActivity extends AppCompatActivity {
    private static final String FRAG1 = "1";
    private static final String FRAG2 = "2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_LANDSCAPE) {
            fragmentTransaction.add(R.id.fragment1, new Fragment1(), FRAG1);
            fragmentTransaction.add(R.id.fragment2, new Fragment2(), FRAG2);
        } else {
            if (fragmentManager.findFragmentByTag(FRAG2) != null)
                fragmentTransaction.remove(fragmentManager.findFragmentByTag(FRAG2));
            fragmentTransaction.add(R.id.fragment1, new Fragment1(), FRAG2);
        }
        fragmentTransaction.commit();
    }
}