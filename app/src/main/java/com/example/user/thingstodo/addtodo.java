package com.example.user.thingstodo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.support.design.widget.FloatingActionButton;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by user on 2017-06-08.
 */

public class addtodo extends AppCompatActivity implements View.OnClickListener {

    FloatingActionButton save;
    TextView testview;
    EditText edittext;
    int count=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addtodo);
        save = (FloatingActionButton)findViewById(R.id.save);
        testview = (TextView)findViewById(R.id.testview);
        edittext = (EditText)findViewById(R.id.edittext);
        save.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent save = new Intent(this,MainActivity.class);
        switch(v.getId()){
            case R.id.save:
                save.putExtra("todo",String.valueOf(edittext.getText()));
                save.putExtra("1",count);
                startActivity(save);
                finish();
                break;
        }

    }
}
