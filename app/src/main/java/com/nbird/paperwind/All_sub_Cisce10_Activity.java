package com.nbird.paperwind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class All_sub_Cisce10_Activity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12,button13,button14;
    int Exam,Std,Paper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_sub__cisce10_);

        Exam=getIntent().getIntExtra("Exam",0);
        Std=getIntent().getIntExtra("Std",0);
        Paper=getIntent().getIntExtra("Paper",0);


        button1=(Button) findViewById(R.id.tipButton1);
        button2=(Button) findViewById(R.id.tipButton2);
        button3=(Button) findViewById(R.id.tipButton3);
        button4=(Button) findViewById(R.id.tipButton4);
        button5=(Button) findViewById(R.id.tipButton5);
        button6=(Button) findViewById(R.id.tipButton6);
        button7=(Button) findViewById(R.id.tipButton7);
        button8=(Button) findViewById(R.id.tipButton8);
        button9=(Button) findViewById(R.id.tipButton9);
        button10=(Button) findViewById(R.id.tipButton10);
        button11=(Button) findViewById(R.id.tipButton11);
        button12=(Button) findViewById(R.id.tipButton12);
        button13=(Button) findViewById(R.id.tipButton13);
        button14=(Button) findViewById(R.id.tipButton14);


        cigar();

    }

    public void cigar(){
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",1);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",2);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",3);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",4);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",5);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",6);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",7);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",8);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",9);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",10);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",11);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",12);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",13);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),Recycler_Exam_Activity.class);
                intent.putExtra("Chapter",14);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",Std);
                intent.putExtra("Paper",Paper);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

    }

}