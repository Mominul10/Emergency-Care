package com.example.bipoderbondhu.My_Fragments;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.bipoderbondhu.Next_333_Activity;
import com.example.bipoderbondhu.R;
import com.example.bipoderbondhu.next_105_Activity;
import com.example.bipoderbondhu.next_109_Activity;
import com.example.bipoderbondhu.next_163_Activity;
import com.example.bipoderbondhu.next_999_Activity;

/**
 * A simple {@link Fragment} subclass.
 */
public class Call_Fragment extends Fragment {
    Button button,button_909,button163,button05,button09;
    TextView textView,textView_999,textView163,textView05,textView09;


    public Call_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_call_, container, false);

        textView163 = view.findViewById(R.id.next163);
        button163 = view.findViewById(R.id.button_16326);
        button05 = view.findViewById(R.id.button_105);
        textView05 = view.findViewById(R.id.next105);
        textView09 = view.findViewById(R.id.next109);
        button09 =view.findViewById(R.id.button_109);
        button = view.findViewById(R.id.button_333);
        button_909 = view.findViewById(R.id.button_999);
        textView_999 = view.findViewById(R.id.next999);
        textView=view.findViewById(R.id.next333);


        textView09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_109 = new Intent(getContext(), next_109_Activity.class);
                startActivity(next_109);

            }
        });


        button09.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_109 = new Intent(Intent.ACTION_CALL);
                call_109.setData(Uri.parse("tel:"+"109"));
                startActivity(call_109);

            }
        });

        textView05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent next_105 = new Intent(getContext(), next_105_Activity.class);
                startActivity(next_105);

            }
        });


        button05.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_05 = new Intent(Intent.ACTION_CALL);
                call_05.setData(Uri.parse("tel:"+"105"));
                startActivity(call_05);
            }
        });


        textView163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_163 = new Intent(getContext(), next_163_Activity.class);
                startActivity(next_163);
            }
        });

        button163.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent call_163 = new Intent(Intent.ACTION_CALL);
                call_163.setData(Uri.parse("tel:"+"16263"));
                startActivity(call_163);

            }
        });


        button_909.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_999 = new Intent(Intent.ACTION_CALL);
                call_999.setData(Uri.parse("tel:"+"999"));
                startActivity(call_999);

            }
        });

        textView_999.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next_999 = new Intent(getContext(), next_999_Activity.class);
                startActivity(next_999);
            }
        });



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent call_333 = new Intent(Intent.ACTION_CALL);
                call_333.setData(Uri.parse("tel:" +"333"));
                startActivity(call_333);
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent next = new Intent(getContext(), Next_333_Activity.class);
                startActivity(next);
            }
        });

        return view;
    }
}
