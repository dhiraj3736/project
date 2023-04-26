package com.example.chapte_5;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Dialog_Activity extends AppCompatActivity {
MaterialButton btn1,btn2,btn3,btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog);

        btn1=findViewById(R.id.asum);
                btn2=findViewById(R.id.aarea);
                btn3=findViewById(R.id.asi);
                btn4=findViewById(R.id.acircle);

                btn1.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        displaySum();
                    }
                });
                btn2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        displayAreaOfTriangle();
                    }
                });

                btn3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        displaySimpleinterest();
                    }
                });

                btn4.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        displayAreaOfCircle();
                    }
                });

    }
    private void displaySum(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Dialog_Activity.this);
        builder.setTitle("Calculate Sum");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.custome_dialog,null);
        builder.setView(view);
        EditText firstnum= view.findViewById(R.id.num1);
        EditText secondnum= view.findViewById(R.id.num2);
        MaterialButton add=view.findViewById(R.id.addbtn);
        TextView result=view.findViewById(R.id.resultTv);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int first, second,output;
                first=Integer.parseInt(firstnum.getText().toString());
                second=Integer.parseInt(secondnum.getText().toString());
                output=first+second;
                result.setText(String.valueOf(output));
            }
        });
        builder.show();

    }

    private void displayAreaOfTriangle(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Dialog_Activity.this);
        builder.setTitle("Calculate Area of Tringle");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.areaoftriangle,null);
        builder.setView(view);

        EditText b= view.findViewById(R.id.baseline);
        EditText h= view.findViewById(R.id.height);
        MaterialButton add=view.findViewById(R.id.areabtn);
        TextView result=view.findViewById(R.id.resultTv);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output=Math.round(Float.parseFloat(b.getText().toString())*Integer.parseInt(h.getText().toString())/2);
                result.setText(String.valueOf(output));
            }
        });
        builder.show();

    }
    private void displaySimpleinterest(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Dialog_Activity.this);
        builder.setTitle("Calculate Simple Intrest");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.simple_interest,null);
        builder.setView(view);

        EditText p= view.findViewById(R.id.principle);
        EditText t= view.findViewById(R.id.time);
        EditText r= view.findViewById(R.id.rate);
        MaterialButton add=view.findViewById(R.id.sibtn);
        TextView result=view.findViewById(R.id.resultTv);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output=(Float.parseFloat(p.getText().toString())*Integer.parseInt(t.getText().toString())*Integer.parseInt(r.getText().toString()))/100;
                result.setText(String.valueOf(output));
            }
        });
        builder.show();
    }

    private void displayAreaOfCircle(){
        AlertDialog.Builder builder=new AlertDialog.Builder(Dialog_Activity.this);
        builder.setTitle("Calculate Area of Circle");
        LayoutInflater inflater=getLayoutInflater();
        View view =inflater.inflate(R.layout.areaofcircle,null);
        builder.setView(view);

        EditText r= view.findViewById(R.id.radious);
        MaterialButton add=view.findViewById(R.id.circlebtn);
        TextView result=view.findViewById(R.id.resultTv);
        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float output;
                output= (float) (Float.parseFloat(r.getText().toString())*Float.parseFloat(r.getText().toString())*Math.PI);
                result.setText(String.valueOf(output));
            }
        });
        builder.show();
    }

}

