package com.example.user.thingstodo;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    FloatingActionButton add;
    Toolbar toolbar;
    TextView first;

    ImageView ifempty;
    TextView ifempty2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        add = (FloatingActionButton) findViewById(R.id.add);
        setSupportActionBar(toolbar);
        first = (TextView)findViewById(R.id.first);
        ifempty = (ImageView)findViewById(R.id.ifempty);
        ifempty2 = (TextView)findViewById(R.id.ifempty2);
        first.setVisibility(View.INVISIBLE);

        add.setOnClickListener(this);
        Intent save = getIntent();
        String todo = save.getStringExtra("todo");
        int count=save.getIntExtra("1",0);
        first.setText(todo);
        if(count==1){
            ifempty.setVisibility(View.INVISIBLE);
            ifempty2.setVisibility(View.INVISIBLE);
            first.setVisibility(View.VISIBLE);
        }



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {


        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        Intent addtodo = new Intent(this,addtodo.class);
        switch (v.getId()){
            case R.id.add :


                startActivity(addtodo);
                finish();

                break;

        }

    }
}
