package com.example.healbean;

import androidx.appcompat.app.AppCompatActivity;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.Random;


public class heartBeatActivity extends AppCompatActivity {

    public TextView heartbeatvalue;
    public ProgressDialog progressDialog;
    public int i=0;
    public int[] heartbeat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart_beat);

        heartbeat = new int[]{88, 78, 90, 73, 88, 90, 77, 97, 77, 87, 89, 76, 81, 71, 85, 74, 79, 83, 94, 87, 81, 85,};
        progressDialog = new ProgressDialog(this);

        heartbeatvalue= findViewById(R.id.heartBeatValue);
        Button but = findViewById(R.id.updatebut);

        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(heartBeatActivity.this,"Successfully Updated",Toast.LENGTH_SHORT).show();
                Random r= new Random();
                int i = r.nextInt(82-70+1)+70;

                ProgressDialog dialog = ProgressDialog.show(heartBeatActivity.this, "Update", "Please Wait while your data is updating",true);
                dialog.show();
                Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        dialog.dismiss();
                    }
                },1000);

                heartbeatvalue.setText(i+"");
            }
        });


    }
}