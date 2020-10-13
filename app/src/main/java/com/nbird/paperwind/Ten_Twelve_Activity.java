package com.nbird.paperwind;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Ten_Twelve_Activity extends AppCompatActivity {

    Button tenstdButton,twelvestdButton;
    int Exam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten__twelve_);

        Exam=getIntent().getIntExtra("Exam",0);


        Toolbar toolbar=findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        tenstdButton=(Button) findViewById(R.id.tenstdbutton);
        twelvestdButton=(Button) findViewById(R.id.twelvestdbutton);

        tenstdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),PaperCategoryBoardsActivity.class);
                intent.putExtra("Exam",Exam);
                intent.putExtra("Std",1);

                startActivity(intent);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });

        twelvestdButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1=new Intent(getBaseContext(),PaperCategoryBoardsActivity.class);
                intent1.putExtra("Exam",Exam);
                intent1.putExtra("Std",2);
                startActivity(intent1);
                overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
            }
        });


        BottomNavigationView bottomNavigationView=findViewById(R.id.bottomnavigatio);

        bottomNavigationView.setSelectedItemId(R.id.home);


        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.home:
                        return true;

                    case R.id.rankpredictor:
                        startActivity(new Intent(getApplicationContext(),RankPredictorActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.Formulas:
                        startActivity(new Intent(getApplicationContext(),FormulaSTDActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                    case R.id.money:
                        startActivity(new Intent(getApplicationContext(),MoneyActivity.class));
                        overridePendingTransition(0,0);
                        return true;
                }
                return false;
            }
        });




    }

    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id=item.getItemId();

        if(id==R.id.share){
            Toast.makeText(this, "Share", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.about){
            Toast.makeText(this, "about", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.history){
            Toast.makeText(this, "history", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.propic){
            Toast.makeText(this, "Profile", Toast.LENGTH_SHORT).show();
        }else if(id==R.id.coins){
            Toast.makeText(this, "Money", Toast.LENGTH_SHORT).show();
        }
        return true;
    }

}