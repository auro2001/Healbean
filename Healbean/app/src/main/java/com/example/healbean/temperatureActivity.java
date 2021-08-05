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

public class temperatureActivity extends AppCompatActivity {

        public TextView tempvalues;
        public ProgressDialog progressDialog;
        public int i=0;
        public int[] tempvalue;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_temperature);

            tempvalue = new int[]{88, 78, 90, 73, 88, 90, 77, 97, 77, 87, 89, 76, 81, 71, 85, 74, 79, 83, 94, 87, 81, 85,};
            progressDialog = new ProgressDialog(this);

            tempvalues= findViewById(R.id.tempvalue);
            Button but = findViewById(R.id.updatebuttemp);

            but.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Toast.makeText(temperatureActivity.this,"Successfully Updated",Toast.LENGTH_SHORT).show();
                    Random r= new Random();
                    int i = r.nextInt(35-30+1)+30;

                    ProgressDialog dialog = ProgressDialog.show(temperatureActivity.this, "Update", "Please Wait while your data is updating",true);
                    dialog.show();
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            dialog.dismiss();
                        }
                    },1000);

                    tempvalues.setText(i+"");
                }
            });


    }
}