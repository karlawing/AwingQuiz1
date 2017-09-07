package com.awing.awingquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ActivityOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void gotoCS(View view){
        Intent cs = new Intent(this, CS.class);
        startActivity(cs);

    }

    public void gotoIT(View view){
        Intent it = new Intent(this, IT.class);
        startActivity(it);

    }

    public void gotoIS(View view){
        Intent is = new Intent(this, IS.class);
        startActivity(is);

    }
}
