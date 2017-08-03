package com.cliffpanos.truepass.Activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.cliffpanos.truepass.Fragment.TabFragment;
import com.cliffpanos.truepass.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager tabFragmentManager;
    private FragmentTransaction tabFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabFragmentManager = getSupportFragmentManager();
        tabFragmentTransaction = tabFragmentManager.beginTransaction();
        tabFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("TruePass");
        setSupportActionBar(toolbar);
    }

}
