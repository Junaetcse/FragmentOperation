package com.bangladesh.user.fragmentoperation.activityToFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bangladesh.user.fragmentoperation.R;

/**
 * Created by User on 3/3/2018.
 */

public class FragmentA extends Fragment {
    private static final String TAG = FragmentA.class.getSimpleName();
    private Button btnAdd;
    private TextView txvResult;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_af, container, false);
        // Retrieve the incoming Bundle Object
        Bundle bundle = getArguments();
        final int firstNumber = bundle.getInt(Constants.FIRST_NUM, 0); // Assigned a default value as well
        final int secondNumber = bundle.getInt(Constants.SECOND_NUM, 0);
        txvResult = (TextView) view.findViewById(R.id.txvResult);
        btnAdd = (Button) view.findViewById(R.id.btnAdd);
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                addTwoNumbers(firstNumber, secondNumber);
            }
        });
        return view;
    }




    private void addTwoNumbers(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        txvResult.setText("Result : " + result);
    }






}
