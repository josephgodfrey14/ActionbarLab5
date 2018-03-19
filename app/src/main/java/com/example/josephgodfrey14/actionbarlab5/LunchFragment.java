package com.example.josephgodfrey14.actionbarlab5;

/**
 * Created by josephgodfrey14 on 3/19/2018.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.*;

public class LunchFragment extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        return inflater.inflate(R.layout.fragment_lunch, container, false);
    }
}
