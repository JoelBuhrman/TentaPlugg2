package com.example.joelbuhrman.tentaplugg;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by JoelBuhrman on 2015-12-09.
 */
public class DigCom extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.digcom_main);
    }


    public void openDigComExtenta(View view){
        startActivity(new Intent(this, DigComExtentor.class));

    }

}
