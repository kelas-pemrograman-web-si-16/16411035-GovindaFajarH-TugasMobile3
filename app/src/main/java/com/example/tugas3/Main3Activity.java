package com.example.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Main3Activity extends AppCompatActivity {

    @BindView(R.id.txtNpm)
    TextView txtNpm;
    @BindView(R.id.txtNama)
    TextView txtNama;
    @BindView(R.id.txtNilai)
    TextView txtNilai;
    @BindView(R.id.txtGrade)
    TextView txtGrade;

    String strNpm, strNama, strNilai, strGrade;
    double dblNilai;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ButterKnife.bind( this);

        Intent getData = getIntent();
        strNpm = getData.getStringExtra("NPM");
        strNama = getData.getStringExtra("Nama");
        strNilai = getData.getStringExtra("Nilai");
        strGrade = getData.getStringExtra("Grade");


        txtNpm.setText("NPM     : " + strNpm);
        txtNama.setText("Nama   : " + strNama);
        txtNilai.setText("Nilai : " + strNilai);


        dblNilai = Double.parseDouble(strNilai);

        if (dblNilai >=80 && dblNilai <=100){
            txtGrade.setText("A");
        }else if (dblNilai >=65 && dblNilai <=79){
            txtGrade.setText("B");
        }else if (dblNilai >=60 && dblNilai <=64){
            txtGrade.setText("C");
        }else if (dblNilai >=40 && dblNilai <=59){
            txtGrade.setText("D");
        }else{
            txtGrade.setText("E");
        }
    }

}