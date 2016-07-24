package com.androidweather.newappweather;

import android.os.Bundle;
import android.preference.PreferenceFragment;

/**
 * Created by Home on 24.7.2016 г..
 */
public class MyPreferenceFragment extends PreferenceFragment {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preference);
    }

}
