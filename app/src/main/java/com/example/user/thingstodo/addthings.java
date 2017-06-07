package com.example.user.thingstodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by user on 2017-06-08.
 */

public class addthings extends AppCompatActivity implements View.OnClickListener {

    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addthings);
        back = (Button)findViewById(R.id.back);

        back.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent back = new Intent(this,MainActivity.class);
        switch(v.getId()){
            case R.id.back :

                startActivity(back);
                break;
        }

    }
}
