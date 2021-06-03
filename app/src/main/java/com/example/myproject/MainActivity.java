package com.example.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private RadioGroup rg1,rg2,rg3;
    private RadioButton rb1,rb2,rb3;
    private EditText em;
    private Button b1;
    private TextView tview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg1=findViewById(R.id.radiogroup);
        rg1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb1=findViewById(checkedId);
            }
        });
        rg2=findViewById(R.id.radiogroup1);
        rg2.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb2=findViewById(checkedId);
            }
        });
        rg3=findViewById(R.id.radiogroup2);
        rg3.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                rb3=findViewById(checkedId);
            }
        });
        em=findViewById(R.id.editText);
        tview=findViewById(R.id.textView6);
        b1=findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int rs=Integer.parseInt(em.getText().toString());
                double ts=rs*0.05;
                double tt=00.00,a=00.00,b=00.00,c=00.00;
                switch(rb1.getId()){
                    case R.id.radioButton4:
                        a=ts*0.45;
                        break;
                    case R.id.radioButton5:
                        a=ts*0.35;
                        break;
                    case R.id.radioButton6:
                        a=ts*0.25;
                        break;
                }
                switch(rb2.getId()){
                    case R.id.radioButton7:
                        b=ts*0.45;
                        break;
                    case R.id.radioButton8:
                        b=ts*0.35;
                        break;
                    case R.id.radioButton9:
                        b=ts*0.25;
                        break;
                }
                switch(rb3.getId()){
                    case R.id.radioButton10:
                        c=ts*0.1;
                        break;
                    case R.id.radioButton11:
                        c=ts*0.08;
                        break;
                    case R.id.radioButton12:
                        c=ts*0.06;
                        break;
                }
                tt=a+b+c;
                tview.setText(Double.toString(tt));

            }
        });


    }

}






