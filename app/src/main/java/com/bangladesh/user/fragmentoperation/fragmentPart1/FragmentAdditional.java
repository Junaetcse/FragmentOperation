package com.bangladesh.user.fragmentoperation.fragmentPart1;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.bangladesh.user.fragmentoperation.R;

public class FragmentAdditional extends AppCompatActivity implements FragmentManager.OnBackStackChangedListener{
    private static final String TAG = FragmentAdditional.class.getSimpleName();
    private FragmentManager manager;
    private static final String TAG_A="fragA";
    private static final String TAG_B="fragB";





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_additional);
        manager = getFragmentManager();
       manager.addOnBackStackChangedListener(this);
    }

    public void addFragmentA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentA, TAG_A);
        transaction.addToBackStack("AddFragA");
        transaction.commit();

    }

    public void removeFragmentA(View view) {

        FragmentA fragmentA = (FragmentA) manager.findFragmentByTag(TAG_A);
        FragmentTransaction transaction = manager.beginTransaction();
        if (fragmentA!=null){
            transaction.remove(fragmentA);
            transaction.addToBackStack("RemoveFragA");
            transaction.commit();
        }else {
            Toast.makeText(this, "Fragment A not Found", Toast.LENGTH_SHORT).show();
        }
    }

    public void addFragmentB(View view) {

        FragmentB fragmentB = new FragmentB();

        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.container, fragmentB, TAG_B);
        transaction.addToBackStack("AddFragB");
        transaction.commit();
    }

    public void removeFragmentB(View view) {
        FragmentB fragmentB = (FragmentB) manager.findFragmentByTag(TAG_B);
        FragmentTransaction transaction = manager.beginTransaction();

        if (fragmentB != null) {
            transaction.remove(fragmentB);
            transaction.addToBackStack("RemoveFragB");
            transaction.commit();
        } else {
            Toast.makeText(this, "Fragment B not Found", Toast.LENGTH_SHORT).show();
        }
    }

    public void replaceByFragmentA(View view) {
        FragmentA fragmentA = new FragmentA();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragmentA, TAG_A);
        transaction.addToBackStack("ReplaceByFragA");
        transaction.commit();
    }

    public void replaceByFragmentB(View view) {
        FragmentB fragmentB = new FragmentB();
        FragmentTransaction transaction = manager.beginTransaction();
        transaction.replace(R.id.container, fragmentB, TAG_B);
        transaction.addToBackStack("ReplaceByFragB");
        transaction.commit();

    }
    @Override
    public void onBackStackChanged() {
        int length = manager.getBackStackEntryCount();
        StringBuilder msg = new StringBuilder("");

        for (int i = length - 1; i >= 0; i--) {

            msg.append("Index ").append(i).append(" : ");
            msg.append(manager.getBackStackEntryAt(i).getName());
            msg.append(" \n");
        }
    }
    @Override
    public void onBackPressed() {
        if (manager.getBackStackEntryCount() > 0) {
            manager.popBackStack();
        } else {
            super.onBackPressed();
        }
    }
}
