package com.awing.awingquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is);
    }

    public void home(View view){
        Intent h = new Intent(this, ActivityOne.class);
        startActivity(h);

    }

    public void cs(View view){
        Intent cs = new Intent(this, CS.class);
        startActivity(cs);

    }

    public void it(View view){
        Intent it = new Intent(this, IT.class);
        startActivity(it);

    }
}
