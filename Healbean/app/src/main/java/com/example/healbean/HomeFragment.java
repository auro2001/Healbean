package com.example.healbean;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import com.google.android.material.card.MaterialCardView;
import com.google.firebase.auth.FirebaseAuth;

import java.util.Objects;

public class HomeFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.activity_home_fragment, container, false);

        //initialize the cards
        CardView heartCard = view.findViewById(R.id.heartCard);
        CardView tempCard = view.findViewById(R.id.tempCard);
        CardView phcard = view.findViewById(R.id.phcard);
        CardView myelocard = view.findViewById(R.id.myelocard);
        //CardView ecgCard = view.findViewById(R.id.ecgCard);


        //***** NAVIGATION TO OTHER ACTIVITIES ******//

        //navigate to realtime heartbeat activity
        heartCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), heartBeatActivity.class);
                startActivity(intent);
            }
        });

        //navigate to realtime temp activity
        tempCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), temperatureActivity.class);
                startActivity(intent);
            }
        });

        phcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),Ph.class);
                startActivity(intent);
            }
        });

        myelocard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(),myelo.class);
                startActivity(intent);
            }
        });
        return view;
    }
}