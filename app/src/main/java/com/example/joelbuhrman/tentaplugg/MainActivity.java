package com.example.joelbuhrman.tentaplugg;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




    public void openFysik(View view){
        startActivity(new Intent(this, Fysik.class));

    }

    public void openDigCom(View view){
        startActivity(new Intent(this, DigCom.class));
    }
    public void openMatstat(View view){
        startActivity(new Intent(this, Matstat.class));
    }
    public void openRegler(View view){
        startActivity(new Intent(this, Regler.class));
    }
}
