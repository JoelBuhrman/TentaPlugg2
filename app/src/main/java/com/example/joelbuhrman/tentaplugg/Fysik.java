package com.example.joelbuhrman.tentaplugg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by JoelBuhrman on 2015-12-09.
 */
public class Fysik extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fysik_main);
    }


    public void openMatstatExtenta(View view){
        startActivity(new Intent(this, FysikExtentor.class));

    }

}
