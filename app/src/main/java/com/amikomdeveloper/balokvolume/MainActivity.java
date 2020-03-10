package com.amikomdeveloper.balokvolume;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText edtpanjang, edtlebar, edttinggi;
    Button hitung;
    private static final String STATE_RESULT = "state_result";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtpanjang = (EditText) findViewById(R.id.valuePanjang);
        edtlebar = (EditText) findViewById(R.id.valueLebar);
        edttinggi = (EditText) findViewById(R.id.valueTinggi);
        hitung = (Button) findViewById(R.id.tombolHitung);

        hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                total();
            }
        });
    }


    public void total(){

        String panjang = edtpanjang.getText().toString().trim();
        String lebar = edtlebar.getText().toString().trim();
        String tinggi = edttinggi.getText().toString().trim();

        Double total = Double.valueOf(panjang) * Double.valueOf(lebar) * Double.valueOf(tinggi);

        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Hasil volume Balok :")
                .setMessage(total.toString())
                .setCancelable(false)
                .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        return;
                    }
                }).show();
    }
}
