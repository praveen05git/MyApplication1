package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt= findViewById(R.id.result);
                Random gen=new Random();
                String[] arr=new String[]{"HEADS","TAILS"};

                txt.setText(arr[gen.nextInt(2)]);
            }
        });

        Button clear=findViewById(R.id.clearBtn);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txt= findViewById(R.id.result);
                txt.setText("");
            }
        });

    }

}
