package com.example.radiobutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup guestion1,guestion2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guestion1=(RadioGroup) findViewById(R.id.g1);
        guestion2=(RadioGroup) findViewById(R.id.g2);
        guestion1.setOnCheckedChangeListener(this);
        guestion2.setOnCheckedChangeListener(this);

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId){
            case R.id.men:
                message("You are a men");
                break;
            case R.id.women:
                message("You are a women");
                break;
            case R.id.dont:
                message("You a mysterious");
                break;
            case R.id.single:
                message("You dont have a partner");
                break;
            case R.id.inRelationship:
                message("You have a partner");
                break;
            case R.id.dontr:
                message("You a mysterious");
                break;
        }
    }

    public void message(String txt){
        Toast.makeText(this,txt,Toast.LENGTH_SHORT).show();
    }

}
