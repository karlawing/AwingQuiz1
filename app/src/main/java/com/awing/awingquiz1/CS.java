package com.awing.awingquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class CS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cs);
    }

    public void home(View view){
        Intent h = new Intent(this, ActivityOne.class);
        startActivity(h);

    }

    public void it(View view){
        Intent it = new Intent(this, IT.class);
        startActivity(it);

    }

    public void is(View view){
        Intent is = new Intent(this, IS.class);
        startActivity(is);

    }
}
