package com.example.uts_mp_muhammad_farhan_mhs_2022;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.submit4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(MainActivity.this, "Aplikasi Ini Buatan MUHAMMAD FARHAN NPM 43E57006195026",Toast.LENGTH_LONG).show();
            }
        });
    }

    public void panggil(View view) {
        String nomor = "08814083274";
        Intent panggil = new Intent(Intent.
                ACTION_DIAL);
        panggil.setData(Uri.
                fromParts("tel", nomor, null));
        startActivity(panggil);
    }

    public void buka(View view) {
        String url = "https://stmik-kharisma.ac.id/";
        Intent
                bukabrowser = new Intent(Intent.
                ACTION_VIEW);
        bukabrowser.setData(Uri.parse(url));
        startActivity(bukabrowser);
    }

    public void pesan(View view) {
        Intent pesan= new Intent(MainActivity.this,
                Pesan.class);
        startActivity(pesan);
    }
}