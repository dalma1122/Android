package com.example.myproducts;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Product> products = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText edtCode = findViewById(R.id.edtCode);
        EditText edtName = findViewById(R.id.edtName);
        EditText edtPrice = findViewById(R.id.edtPrice);

        Button gombAdd = findViewById(R.id.btnAdd);
        gombAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product product = new Product(edtCode.getText().toString(), edtName.getText().toString(), edtPrice.getText().toString());
                products.add(product);

                edtCode.setText("");
                edtName.setText("");
                edtPrice.setText("");
            }
        });

        Button gombCancel = findViewById(R.id.btnCancel);
        gombCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtCode.setText("");
                edtName.setText("");
                edtPrice.setText("");
            }
        });

        Button gombShow = findViewById(R.id.btnShow);
        TextView txt = findViewById(R.id.txtViewProducts);
        gombShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder termekek = new StringBuilder();
                for (Product product : products) {
                    termekek.append(product.toString());
                }
                txt.setText(termekek.toString());
            }
        });

    }
}