package com.awing.awingquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IT extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_it);
    }

    public void home(View view){
        Intent h = new Intent(this, ActivityOne.class);
        startActivity(h);

    }

    public void cs(View view){
        Intent cs = new Intent(this, CS.class);
        startActivity(cs);

    }

    public void is(View view){
        Intent is = new Intent(this, IS.class);
        startActivity(is);

    }
}
