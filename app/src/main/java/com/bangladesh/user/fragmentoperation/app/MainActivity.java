package com.bangladesh.user.fragmentoperation.app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.bangladesh.user.fragmentoperation.R;
import com.bangladesh.user.fragmentoperation.activityToFragment.ParseDataAF;
import com.bangladesh.user.fragmentoperation.fragmentPart1.FragmentAdditional;
import com.bangladesh.user.fragmentoperation.fragmentToActivity.DataParseFA;
import com.bangladesh.user.fragmentoperation.fragmentToFragment.DataParseFF;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void additional(View view) {
        Intent intent=new Intent(MainActivity.this, FragmentAdditional.class);
        startActivity(intent);
    }

    public void activityToFragment(View view) {
        Intent intent=new Intent(MainActivity.this, ParseDataAF.class);
        startActivity(intent);
    }

    public void FragmentToactivity(View view) {
        Intent intent=new Intent(MainActivity.this, DataParseFA.class);
        startActivity(intent);

    }

    public void FragmentToFragment(View view) {
        Intent intent=new Intent(MainActivity.this, DataParseFF.class);
        startActivity(intent);
    }
}
