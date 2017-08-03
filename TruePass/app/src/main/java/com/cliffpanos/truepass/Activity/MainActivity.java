package com.cliffpanos.truepass.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.cliffpanos.truepass.fragment.TabFragment;
import com.cliffpanos.truepass.R;

public class MainActivity extends AppCompatActivity {

    private FragmentManager tabFragmentManager;
    private FragmentTransaction tabFragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        TextView mTitle = (TextView) toolbar.findViewById(R.id.toolbar_title);

        setSupportActionBar(toolbar);
        mTitle.setText(toolbar.getTitle());
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        tabFragmentManager = getSupportFragmentManager();
        tabFragmentTransaction = tabFragmentManager.beginTransaction();
        tabFragmentTransaction.replace(R.id.containerView, new TabFragment()).commit();


    }

}
