package com.bangladesh.user.fragmentoperation.fragmentToActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.bangladesh.user.fragmentoperation.R;

public class DataParseFA extends AppCompatActivity implements MyListener{
    private static final String TAG = DataParseFA.class.getSimpleName();

    private FragmentManager manager;
    private TextView txvResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_parse_fa);

        txvResult = (TextView) findViewById(R.id.txvResult);

        manager = getFragmentManager();
        addFragmentA();
    }


    public void addFragmentA() {

        FragmentFA fragmentA = new FragmentFA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentA, fragmentA, "fragA");
        transaction.commit();
    }


    @Override
    public void addTwoNumbers(int num1, int num2) {
        int result = num1 + num2;
        txvResult.setText("Result : " + result);
    }
}
