package com.example.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.edNpm)
    EditText edNpm;
    @BindView(R.id.edNama)
    EditText edNama;
    @BindView(R.id.edTugas)
    EditText edTugas;
    @BindView(R.id.edQuis)
    EditText edQuis;
    @BindView(R.id.edUts)
    EditText edUts;
    @BindView(R.id.edUas)
    EditText edUas;

    String strNpm, strNama;
    double dblTugas, dblQuis, dblUts, dblUas, dblHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        Intent getData = getIntent();
        strNpm = getData.getStringExtra("NPM");
        strNama = getData.getStringExtra("Nama");

        edNpm.setText(strNpm);
        edNama.setText(strNama);
    }
    @OnClick(R.id.btnSubmit)
    void btnSubmit(){
        dblTugas = Double.parseDouble(edTugas.getText().toString());
        dblQuis = Double.parseDouble(edQuis.getText().toString());
        dblUts = Double.parseDouble(edUts.getText().toString());
        dblUas = Double.parseDouble(edUas.getText().toString());

        dblHasil = (dblTugas + dblQuis + dblUts + dblUas) / 4;

        Toast.makeText(getApplicationContext(), String.valueOf(dblHasil),
                Toast.LENGTH_LONG).show();

        Intent a = new Intent(Main2Activity.this, Main3Activity.class);
        a.putExtra("nama", strNama);
        a.putExtra("npm", strNpm);
        a.putExtra("nilai", String.valueOf(dblHasil));
        startActivity(a);
        finish();
    }
}



