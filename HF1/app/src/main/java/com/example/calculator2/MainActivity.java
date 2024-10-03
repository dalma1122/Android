package com.example.calculator2;

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

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        EditText txt1 = findViewById(R.id.edtxt1);
        EditText txt2 = findViewById(R.id.edtxt2);
        Button gomb1 = findViewById(R.id.button);
        Button gomb2 = findViewById(R.id.button2);
        Button gomb3 = findViewById(R.id.button3);
        Button gomb4 = findViewById(R.id.button4);
        TextView txtv = findViewById(R.id.txtv);

        gomb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double number1 = Double.parseDouble(txt1.getText().toString());
                    double number2 = Double.parseDouble(txt2.getText().toString());
                    double eredmeny = number1 + number2;
                    txtv.setText(String.valueOf(eredmeny));
                } catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
        });
        gomb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double number1 = Double.parseDouble(txt1.getText().toString());
                    double number2 = Double.parseDouble(txt2.getText().toString());
                    double eredmeny = number1 - number2;
                    txtv.setText(String.valueOf(eredmeny));
                } catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
        });
        gomb3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double number1 = Double.parseDouble(txt1.getText().toString());
                    double number2 = Double.parseDouble(txt2.getText().toString());
                    double eredmeny = number1 * number2;
                    txtv.setText(String.valueOf(eredmeny));
                } catch (NumberFormatException e){
                    e.printStackTrace();
                }
            }
        });
        gomb4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    double number1 = Double.parseDouble(txt1.getText().toString());
                    double number2 = Double.parseDouble(txt2.getText().toString());
                    double eredmeny = number1 / number2;
                    txtv.setText(String.valueOf(eredmeny));
                } catch (NumberFormatException e){
                    e.printStackTrace();
                } catch (ArithmeticException e){
                    txtv.setText("Nem lehet 0-val osztani!");
                }
            }
        });
    }
}