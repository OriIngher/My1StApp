package com.example.oriin_bsqgiqy.my_application;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button)findViewById(R.id.button1);
        //listen for clicks
        button1.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        Button button1 = (Button)findViewById(R.id.button1);
        if (button1==v)
        {
            button1.setText("Oh, yea, I’ve been clicked!");
        }
    }
}
