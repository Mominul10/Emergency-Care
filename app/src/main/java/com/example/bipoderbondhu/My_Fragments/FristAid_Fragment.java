package com.example.bipoderbondhu.My_Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ViewFlipper;

import com.example.bipoderbondhu.R;
import com.example.bipoderbondhu.e;
import com.example.bipoderbondhu.learn_Activity;
import com.example.bipoderbondhu.more_activity;
import com.example.bipoderbondhu.prepare;

/**
 * A simple {@link Fragment} subclass.
 */
public class FristAid_Fragment extends Fragment {
    CardView cardView_learn,cardView_prepare,cardView_emarjancy,cardView_more;

    public FristAid_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frist_aid_, container, false);
        cardView_learn = view.findViewById(R.id.learn);
        cardView_more = view.findViewById(R.id.more);
        cardView_prepare = view.findViewById(R.id.prostoti);
        cardView_emarjancy=view.findViewById(R.id.emer);

        cardView_emarjancy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), e.class);
                startActivity(intent);
            }
        });


        cardView_prepare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), prepare.class);
                startActivity(intent);
            }
        });

        cardView_more.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), more_activity.class);
                startActivity(intent);
            }
        });


        cardView_learn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), learn_Activity.class));
            }
        });
        //iuyiuyiyui
        return view;
    }




}
