package com.example.bipoderbondhu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ExpandableListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class heart extends AppCompatActivity {
    ExpandableListView expandableListView;
    List<String> list_data_header;
    HashMap<String,List<String>> list_data_chid;
    CustomAdaptar customAdaptar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heart);


        prepare_data();

        expandableListView = findViewById(R.id.myexlist);
        customAdaptar = new CustomAdaptar(this,list_data_header,list_data_chid);
        expandableListView.setAdapter(customAdaptar);

    }

    private void prepare_data() {

        String [] header_string = getResources().getStringArray(R.array.headername);
        String [] child_string = getResources().getStringArray(R.array.childname);

        list_data_header = new ArrayList<>();
        list_data_chid = new HashMap<>();

        for (int i =0; i<header_string.length; i++){

            list_data_header.add(header_string[i]);

            List<String> child = new ArrayList<>();
            child.add(child_string[i]);
            list_data_chid.put(list_data_header.get(i),child);


        }




    }
}
