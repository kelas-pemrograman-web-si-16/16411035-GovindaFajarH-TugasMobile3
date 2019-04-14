package com.example.tugas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.edNPM)
    EditText edNPM;
    @BindView(R.id.edNama)
    EditText edNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

        @OnClick(R.id.btnSubmit)
        void submit () {
            String strNPM, strNama;

            strNPM = edNPM.getText().toString();
            strNama = edNama.getText().toString();

            if (strNPM.isEmpty() && strNama.isEmpty()) {
                Toast.makeText(getApplicationContext(),
                        "Lengkapi data", Toast.LENGTH_LONG).show();
            } else {
                Intent a = new Intent(MainActivity.this, Main2Activity.class);
                a.putExtra("NPM", strNPM);
                a.putExtra("Nama", strNama);
                startActivity(a);
                finish();
            }
        }
    }