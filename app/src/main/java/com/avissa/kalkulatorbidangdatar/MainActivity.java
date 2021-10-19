package com.avissa.kalkulatorbidangdatar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText a, b, c, d;
    Button e, f, g, h;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = (EditText) findViewById(R.id.garis1);
        b = (EditText) findViewById(R.id.garis2);
        c = (EditText) findViewById(R.id.k);
        d = (EditText) findViewById(R.id.l);

        e = (Button) findViewById(R.id.pp);
        f = (Button) findViewById(R.id.segitiga);
        g = (Button) findViewById(R.id.lingkaran);
        h = (Button) findViewById(R.id.clear);

        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length()==0&&b.length()==0){
                    Toast.makeText(getApplication(), "Panjang & Lebar TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
                else if (a.length()==0){
                    Toast.makeText(getApplication(), "Panjang TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
                else if (b.length()==0){
                    Toast.makeText(getApplication(), "Lebar TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                }
                else {
                    int panjang = Integer.parseInt(a.getText().toString());
                    int lebar = Integer.parseInt(b.getText().toString());
                    int keliling = 2 * (panjang + lebar);
                    c.setText(String.valueOf(keliling));
                    int luas = panjang * lebar;
                    d.setText(String.valueOf(luas));
                }
            }
        });

        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length() == 0 && b.length() == 0) {
                    Toast.makeText(getApplication(), "Alas & Tinggi TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                } else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Alas TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                } else if (b.length() == 0) {
                    Toast.makeText(getApplication(), "Tinggi TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                } else {
                    int alas = Integer.parseInt(a.getText().toString());
                    int tinggi = Integer.parseInt(b.getText().toString());
                    int keliling = 3 * alas;
                    c.setText(String.valueOf(keliling));
                    int luas = alas * tinggi / 2;
                    d.setText(String.valueOf(luas));
                }
            }
        });

        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Diameter TIDAK BOLEH KOSONG", Toast.LENGTH_SHORT).show();
                } else {
                    int diameter = Integer.parseInt(a.getText().toString());
                    double phi = 3.14;
                    double keliling = phi * diameter;
                    c.setText(String.valueOf(keliling));
                    double luas = phi * diameter * diameter /4;
                    d.setText(String.valueOf(luas));
                }
            }
        });

        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
            }
        });
    }
}