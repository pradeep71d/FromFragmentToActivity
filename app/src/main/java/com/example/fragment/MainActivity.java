package com.example.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.e1);
        et2=findViewById(R.id.e2);
        button=findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("key1",s1);
                bundle.putString("key2",s2);
                FirstFragment firstFragment=new FirstFragment();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                firstFragment.setArguments(bundle);
                fragmentTransaction.replace(R.id.f1,firstFragment);
                fragmentTransaction.commit();
            }
        });
    }
}
