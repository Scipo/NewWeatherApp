package com.androidweather.newappweather;

import android.preference.PreferenceActivity;

import java.util.List;

/**
 * Created by Home on 24.7.2016 г..
 */
public class MyPreferenceActivity extends PreferenceActivity {

    @Override
    public void onBuildHeaders(List<Header>target){
        loadHeadersFromResource(R.xml.headers_preference,target);
    }
    @Override
    protected boolean isValidFragment(String fragmentName){
        return MyPreferenceFragment.class.getName().equals(fragmentName);
    }

}
