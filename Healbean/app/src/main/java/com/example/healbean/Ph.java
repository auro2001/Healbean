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

public class Ph extends AppCompatActivity {

        public TextView phvalue;
        public ProgressDialog progressDialog;
        public int i=0;
        public int[] heartbeat;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_ph);

            heartbeat = new int[]{8, 7, 9, 7, 8, 9, 7, 7, 7, 8, 9, 7, 8, 1, 5, 4, 9, 3, 4, 7, 8, 5,};
            progressDialog = new ProgressDialog(this);

            phvalue= findViewById(R.id.phvalue);
            Button but = findViewById(R.id.updatebuph);

            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(Ph.this,"Successfully Updated",Toast.LENGTH_SHORT).show();
                    Random r= new Random();
                    int i = r.nextInt(8-7+1)+6;

                    ProgressDialog dialog = ProgressDialog.show(Ph.this, "Update", "Please Wait while your data is updating",true);
                    dialog.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            dialog.dismiss();
                        }
                    },1000);

                    phvalue.setText(i+"");
                }
            });
    }
}