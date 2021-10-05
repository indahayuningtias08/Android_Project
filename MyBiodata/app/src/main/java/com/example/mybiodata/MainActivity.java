package com.example.mybiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //untuk memanggil variabel
    EditText etNama;
    RadioButton rbPria,rbWanita;
    Button btnTampilkan,btnKosongkan;
    Spinner spinner1;
    CheckBox cb1,cb2,cb3,cb4,cb5,cb6,cb7,cb8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inisialisasi dengan memanggil variabel
        etNama = (EditText) findViewById(R.id.etNama);
        rbPria = (RadioButton) findViewById(R.id.rbPria);
        rbWanita = (RadioButton) findViewById(R.id.rbWanita);
        spinner1 = (Spinner) findViewById(R.id.spinner);
        cb1 = (CheckBox) findViewById(R.id.cbKiri1);
        cb2 = (CheckBox) findViewById(R.id.cbKanan1);
        cb3 = (CheckBox) findViewById(R.id.cbKiri2);
        cb4 = (CheckBox) findViewById(R.id.cbKanan2);
        cb5 = (CheckBox) findViewById(R.id.cbKiri3);
        cb6 = (CheckBox) findViewById(R.id.cbKanan3);
        cb7 = (CheckBox) findViewById(R.id.cbKiri4);
        cb8 = (CheckBox) findViewById(R.id.cbKanan4);

        //Untuk menampilkan data
        btnTampilkan = (Button) findViewById(R.id.btnTampilkan);

        btnTampilkan.setOnClickListener(this);

    }
    //Untuk mengosongkan tampilan
    public void bersihkan (View v) {
        Intent intent = getIntent();
        finish();
        startActivity(intent);
        etNama.requestFocus();
    }

    @Override
    public void onClick(View view) {
        //Menampilkan View
        String vNama = etNama.getText().toString();
        String firstItem = String.valueOf(spinner1.getSelectedItem());
        String a = "";
        String b = "";


        //Percabangan untuk Radio Button
        if (rbPria.isChecked()) {
            a+="Pria";
        }
        if (rbWanita.isChecked()) {
            a+="Wanita";
        }
        //Percabangan untuk Checkbox
        if (cb1.isChecked()) {
            b+="Indonesia";
        }
        if (cb2.isChecked()) {
            b+="Inggris";
        }
        if (cb3.isChecked()) {
            b+="Malaysia";
        }
        if (cb4.isChecked()) {
            b+="Amerika";
        }
        if (cb5.isChecked()) {
            b+="Singapura";
        }
        if (cb6.isChecked()) {
            b+="Arab";
        }
        if (cb7.isChecked()) {
            b+="Filiphina";
        }
        if (cb8.isChecked()) {
            b+="Korea";
        }

        //Menampilkan Hasil
        Toast.makeText(this, "Nama : "+vNama+ "\n"+"Jenis Kelamin :"+a+ "\n"
                +"Negara Asal :" +firstItem+"\n"+"Kemampuan Bahasa :"+b+"\n", Toast.LENGTH_SHORT).show();
    }
}