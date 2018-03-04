package com.bangladesh.user.fragmentoperation.fragmentToFragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bangladesh.user.fragmentoperation.R;
import com.bangladesh.user.fragmentoperation.fragmentToActivity.MyListener;

public class DataParseFF extends AppCompatActivity implements MyListener{
    private static final String TAG = DataParseFF.class.getSimpleName();

    private FragmentManager manager;
    private int num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_parse_ff);
        manager = getFragmentManager();
        addFragmentA();
        addFragmentB();
    }

    public void sendDataToFragmentB(View view) {
        FragmentFFB fragmentB = (FragmentFFB) manager.findFragmentByTag("fragB");
        if (fragmentB != null) {
            fragmentB.addTwoNumbers(num1, num2);
        }
    }

    @Override
    public void addTwoNumbers(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        Toast.makeText(this, "Numbers Received in Activity : " + num1 + " , " + num2, Toast.LENGTH_LONG).show();
    }



    public void addFragmentA() {
        FragmentFFA fragmentA = new FragmentFFA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentFF, fragmentA, "fragA");
        transaction.commit();
    }

    private void addFragmentB() {

        FragmentFFB fragmentB = new FragmentFFB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentB, fragmentB, "fragB");
        transaction.commit();
    }
}
