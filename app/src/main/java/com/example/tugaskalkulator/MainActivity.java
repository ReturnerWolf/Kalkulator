package com.example.tugaskalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText txt1, txt2;
    Spinner spnBtn;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Componen();
    }

    private void Componen(){
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        spnBtn = findViewById(R.id.spnBtn);
        txthasil = findViewById(R.id.txthasil1);

        ArrayList<Operator> list_operator = new ArrayList<>();
        list_operator.add(new Operator("Pilih Operator"));
        list_operator.add(new Operator("Pertambahan"));
        list_operator.add(new Operator("Pengurangan"));
        list_operator.add(new Operator("Pembagian"));
        list_operator.add(new Operator("Perkalian"));

        ArrayAdapter<Operator> arrayAdapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, list_operator);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spnBtn.setAdapter(arrayAdapter);
    }

    public void hitung(View v){
        double text1 = Double.parseDouble(txt1.getText().toString());
        double text2 = Double.parseDouble(txt1.getText().toString());
    }
}