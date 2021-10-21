package com.udinus.kalkulator_12047;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText edtPanjang, edtLebar, edtAlas, edtTinggi, edtDiameter;
    TextView txtRLuas, txtRKeliling, txtLuas, txtKeliling;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponent();
    }
    private void initComponent(){
        edtAlas = findViewById(R.id.edtAlas);
        edtPanjang = findViewById(R.id.edtPanjang);
        edtLebar = findViewById(R.id.edtLebar);
        edtTinggi = findViewById(R.id.edtTinggi);
        edtDiameter = findViewById(R.id.edtDiameter);
        txtLuas = findViewById(R.id.txtLuas);
        txtKeliling = findViewById(R.id.txtKeliling);
        txtRLuas = findViewById(R.id.txtRumusLuas);
        txtRKeliling = findViewById(R.id.txtRumusKeliling);
    }

    public void hitungPersegi(View view){
        txtRLuas.setText("Rumus luas persegi : s x s");
        txtRKeliling.setText("Rumus keliling persegi : s+s+s+s");

        double s = Double.parseDouble(edtPanjang.getText().toString());

        double luas = s * s;
        double keliling = s + s + s + s;

        txtLuas.setText("luas persegi : "+String.format("%.2f",luas));
        txtKeliling.setText("keliling persegi : " + String.format("%.2f",keliling));
    }

    public void hitungLingkaran(View view){
        txtRLuas.setText("Rumus luas lingkaran : phi x r xr");
        txtRKeliling.setText("Rumus keliling lingkaran : phi x 2 x r");

        double r = Double.parseDouble(edtDiameter.getText().toString())/2d;
        double phi = 22d/7d;

        double luas = phi * r * r;
        double keliling = phi * 2 * r;

        // set format 2 angka di belakang ,
        DecimalFormat df = new DecimalFormat("#.##");
        txtLuas.setText("luas lingkaran : "+df.format(luas));
        // set format 2 angka di belakang ,
        txtKeliling.setText("keliling lingkaran : " + String.format("%.2f",keliling));
    }

    public void hitungSegitiga(View view){
        txtRLuas.setText("Rumus luas segitiga : 1/2 a x t ");
        txtRKeliling.setText("Rumus keliling segitiga sama sisi : s+s+s");

        double a = Double.parseDouble(edtAlas.getText().toString());
        double t = Double.parseDouble(edtTinggi.getText().toString());
        double s = Double.parseDouble(edtPanjang.getText().toString());

        double luas = 0.5 * a * t;
        double keliling = s + s + s;

        txtLuas.setText("luas segitiga : "+String.format("%.2f",luas));
        txtKeliling.setText("keliling segitiga sama sisi : " + String.format("%.2f",keliling));
    }
}