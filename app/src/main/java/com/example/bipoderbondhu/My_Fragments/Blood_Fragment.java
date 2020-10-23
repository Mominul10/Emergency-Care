package com.example.bipoderbondhu.My_Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SearchView;

import com.example.bipoderbondhu.R;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class Blood_Fragment extends Fragment {
    SearchView searchView;
    ListView listView;


    ArrayList<String> list;
    ArrayAdapter adapter;

    public Blood_Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_blood_, container, false);


        searchView = view.findViewById(R.id.my_search);
        listView = view.findViewById(R.id.my_list);

        list= new ArrayList<String>();

        list.add("বান্দরবান\n" +
                "ফোন নম্বর: 0361-62302\n" +
                "রেড ক্রিসেন্ট ইউনিট \n ");

        list.add("বরিশাল\n" +
                "ফোন নম্বর: 0431-2177246\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("ভোলা\n" +
                "ফোন নম্বর: 0491-61470\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");


        list.add("বগুড়া\n" +
                "ফোন নম্বর: 01720544112\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("চট্টগ্রাম\n" +
                "ফোন নম্বর: 031-620685/612395\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("কুমিল্লা\n" +
                "ফোন নম্বর: 081-68022\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");


        list.add("চাঁদপুর\n" +
                "ফোন নম্বর: 0841-65233\n" +
                "রেড ক্রিসেন্ট ইউনিট \n ");

        list.add("দিনাজপুর\n" +
                "ফোন নম্বর: 0531-64021\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("ঢাকা সিটি\n" +
                "ফোন নম্বর: 02-7125997\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add(" ঢাকা জেলা\n" +
                "ফোন নম্বর: 02-7111883\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");


        list.add("জামালপুর\n" +
                "ফোন নম্বর: 01912010769\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("কুড়িগ্রাম\n" +
                "ফোন নম্বর: 0581-61159\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");


        list.add("নেত্রকোনা\n" +
                "ফোন নম্বর: 091-51750\n" +
                "রেড ক্রিসেন্ট ইউনিট " );


        list.add("শেরপুর\n" +
                "ফোন নম্বর: 0931-61845\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("রংপুর\n" +
                "ফোন নম্বর: 0521-55693\n" +
                "রেড ক্রিসেন্ট ইউনিট  \n");
        list.add("রাঙ্গামাটি\n" +
                "ফোন নম্বর: 0381-61734\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("নোয়াখালী \n" +
                "ফোন নম্বর: 0321-71771\n" +
                "রেড ক্রিসেন্ট ইউনিট\n ");

        list.add("খাগড়াছড়ি\n" +
                "ফোন নম্বর: 0371-62464\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("লক্ষ্মীপুর\n" +
                "Phone No: 0381-61734 \n" +
                "রেড ক্রিসেন্ট ইউনিট\n ");

        list.add("নরসিংদী\n" +
                "ফোন নম্বর:02-9463596\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");


        list.add("ফরিদপুর\n" +
                "ফোন নম্বর: 0631-62539\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");


        list.add("মুন্সিগঞ্জ\n" +
                "ফোন নম্বর: 02-7612796\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("নারায়ণগঞ্জ\n" +
                "Phone No: +88 01754 865881\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("বরগুনা\n" +
                "ফোন নম্বর: 0448-62826/62382/62137\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("পিরোজপুর\n" +
                "ফোন নম্বর: +8801734318743\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("পটুয়াখালী\n" +
                "ফোন নম্বর: +8801712981322\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");



        list.add("ঝালকাঠি\n" +
                "ফোন নম্বর: 0498-62233\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("কুষ্টিয়া\n" +
                "ফোন নম্বর: 071-62250\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("খুলনা জেলা\n" +
                "ফোন নম্বর: +8801712999762\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("মাগুরা\n" +
                "ফোন নম্বর: +8801723806697\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("সাতক্ষীরা\n" +
                "ফোন নম্বর: 0471-62577\n" +
                "রেড ক্রিসেন্ট ইউনিট\n ");

        list.add("নড়াইল\n" +
                "ফোন নম্বর: 0481-62609\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("বাগেরহাট\n" +
                "ফোন নম্বর: +8801712297992\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("চুয়াডাঙ্গা\n" +
                "ফোন নম্বর: +8801748997414\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");


        list.add("যশোর\n" +
                "ফোন নম্বর: 0421-68882\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("মেহেরপুর\n" +
                "ফোন নম্বর: +8801817762442\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("সিলেট\n" +
                "ফোন নম্বর: 0821-716568\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("সুনামগঞ্জ\n" +
                "ফোন নম্বর: 0871-62596\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("হবিগঞ্জ\n" +
                "ফোন নম্বর: 01711360432\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("মৌলভীবাজার\n" +
                "ফোন নম্বর: 0861-62170\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("নওগাঁ\n" +
                "ফোন নম্বর: 0471-61699\n" +
                "রেড ক্রিসেন্ট ইউনিট \n");

        list.add("চাঁপাই নবাবগঞ্জ\n" +
                "ফোন নম্বর: 0781-62547\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");

        list.add("রাজশাহী শহর\n" +
                "ফোন নম্বর: 0721-812154\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");


        list.add("পাবনা\n" +
                "ফোন নম্বর: 0731-64674\n" +
                "রেড ক্রিসেন্ট ইউনিট\n");




        list.add("\n" +
                "\n" +
                "\n" +
                "");




        adapter = new ArrayAdapter<>(getContext(), android.R.layout.simple_list_item_1,list);
        listView.setAdapter(adapter);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }
            @Override
            public boolean onQueryTextChange(String newText) {

                adapter.getFilter().filter(newText);


                return false;
            }
        });






        return view;
    }
}
