package com.androidweather.newappweather;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;

public class MyPreferencesActivity extends PreferenceActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getFragmentManager().beginTransaction()
                .replace(android.R.id.content, new MyPreferenceFragment())
                .commit();
    }
    public static class MyPreferenceFragment extends PreferenceFragment{
        @Override
        public void onCreate(final Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            addPreferencesFromResource(R.xml.preference);
        }
    }
    SharedPreferences SP = PreferenceManager.getDefaultSharedPreferences(getBaseContext());
    String key_unit=SP.getString("key_pref_unit","1");
}
