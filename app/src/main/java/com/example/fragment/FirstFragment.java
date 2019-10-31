package com.example.fragment;


import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {
Button button;
TextView textView1,textView2;
    public FirstFragment() {
        // Required empty public constructor
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
      View view= inflater.inflate(R.layout.fragment_first, container, false);
      button=view.findViewById(R.id.b2);
      textView1=view.findViewById(R.id.t1);
      textView2=view.findViewById(R.id.t2);
      Bundle bundle=getArguments();
      String s3=bundle.getString("key1");
      String s4=bundle.getString("key2");
      textView1.setText(s3);
      textView2.setText(s4);
      button.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              Intent intent=new Intent(getActivity(),SecondActivity.class);
              startActivity(intent);
              Toast.makeText(getActivity(), "Moving from fragment to activity"+"\t"+"logout successfully", Toast.LENGTH_SHORT).show();
          }
      });
      return view;

    }

}
