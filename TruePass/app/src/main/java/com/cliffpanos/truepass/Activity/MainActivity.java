package com.cliffpanos.truepass.Activity;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.cliffpanos.truepass.Fragment.TabFragment;
import com.cliffpanos.truepass.R;

import static com.cliffpanos.truepass.R.styleable.FloatingActionButton;
import static com.cliffpanos.truepass.R.styleable.NavigationView;
import static com.cliffpanos.truepass.R.styleable.Toolbar;

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
    }

}
