package com.bangladesh.user.fragmentoperation.fragmentToFragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bangladesh.user.fragmentoperation.R;

/**
 * Created by User on 3/3/2018.
 */

public class FragmentFFB extends Fragment {

    private static final String TAG = FragmentFFB.class.getSimpleName();

    private TextView txvResult;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ffb,container,false);
        txvResult = (TextView) view.findViewById(R.id.txvResult);

        return view;
    }

    public void addTwoNumbers(int x, int y) {

        int result = x + y;
        txvResult.setText("Result : " + result);
    }
}
