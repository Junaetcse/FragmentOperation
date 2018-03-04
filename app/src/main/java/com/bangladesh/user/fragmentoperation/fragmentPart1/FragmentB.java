package com.bangladesh.user.fragmentoperation.fragmentPart1;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bangladesh.user.fragmentoperation.R;

/**
 * Created by User on 3/3/2018.
 */

public class FragmentB extends Fragment {
    private static final String TAG = FragmentA.class.getSimpleName();

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_b,container,false);
        return view;
    }
}
