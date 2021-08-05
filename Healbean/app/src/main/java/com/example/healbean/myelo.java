package com.example.healbean;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class myelo extends AppCompatActivity {

    public TextView myelovalue;
    public ProgressDialog progressDialog;
    public int i=0;
    public int[] myelo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myelo);

        myelo = new int[]{88, 78, 90, 73, 88, 90, 77, 97, 77, 87, 89, 76, 81, 71, 85, 74, 79, 83, 94, 87, 81, 85,};
        progressDialog = new ProgressDialog(this);

        myelovalue= findViewById(R.id.myeloValue);
        Button but = findViewById(R.id.updatebutmyelo);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(myelo.this,"Successfully Updated",Toast.LENGTH_SHORT).show();
                Random r= new Random();
                int i = r.nextInt(639-620+1)+620;

                ProgressDialog dialog = ProgressDialog.show(myelo.this, "Update", "Please Wait while your data is updating",true);
                dialog.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        dialog.dismiss();
                    }
                },1000);

                myelovalue.setText(i+"");
            }
        });


    }
}