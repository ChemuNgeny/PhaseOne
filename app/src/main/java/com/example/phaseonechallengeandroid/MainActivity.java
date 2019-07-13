package com.example.phaseonechallengeandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btnOne)
    Button btnOne;
    @BindView(R.id.btnTwo)
    Button btnTwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnOne)
    public void btnOne(){
        startActivity(new Intent(MainActivity.this, ActivityB.class));
    }

    @OnClick(R.id.btnTwo)
    public void btnTwo(){
        startActivity(new Intent(MainActivity.this, ActivityC.class));
    }
}
