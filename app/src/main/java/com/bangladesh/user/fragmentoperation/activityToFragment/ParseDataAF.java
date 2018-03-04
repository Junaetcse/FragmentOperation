package com.bangladesh.user.fragmentoperation.activityToFragment;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.bangladesh.user.fragmentoperation.R;

public class ParseDataAF extends AppCompatActivity {
    private static final String TAG = ParseDataAF.class.getSimpleName();

    private FragmentManager manager;
    private EditText etFirstNumber, etSecondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parse_data);

        etFirstNumber = (EditText) findViewById(R.id.etFirstNumber);
        etSecondNumber = (EditText) findViewById(R.id.etSecondNumber);

        manager = getFragmentManager();


    }

    public void sendDataToFragment(View view) {
        FragmentA fragmentA=new FragmentA();
        int firstNumber = Integer.valueOf(etFirstNumber.getText().toString());
        int secondNumber = Integer.valueOf(etSecondNumber.getText().toString());

        //Using bundle Object
        Bundle bundle = new Bundle();
        bundle.putInt(Constants.FIRST_NUM, firstNumber);
        bundle.putInt(Constants.SECOND_NUM, secondNumber);
        fragmentA.setArguments(bundle);







        FragmentTransaction transaction = manager.beginTransaction();
        transaction.add(R.id.containerFragmentA, fragmentA, "fragA");
        transaction.commit();
    }
}
