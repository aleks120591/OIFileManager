package org.android.filemanager;

import android.os.Bundle;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.v4.content.ContextCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import org.android.filemanager.ui.InputDialog;

import java.io.File;

public class mainAct extends AppCompatActivity {

    private static final String SAVED_DIRECTORY = "com.calintat.explorer.SAVED_DIRECTORY";
    private static final String SAVED_SELECTION = "com.calintat.explorer.SAVED_SELECTION";
    private static final String EXTRA_NAME = "com.calintat.explorer.EXTRA_NAME";
    private static final String EXTRA_TYPE = "com.calintat.explorer.EXTRA_TYPE";

    private CollapsingToolbarLayout toolbarLayout;
    private CoordinatorLayout coordinatorLayout;
    private DrawerLayout drawerLayout;
    private NavigationView navigationView;
    private Toolbar toolbar;
    private File currentDirectory;
    //private RecyclerAdapter recyclerAdapter;
    private String name;
    private String type;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        initActivityFromIntent();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_act);
        initAppBarLayout();
        initCoordinatorLayout();
        initDrawerLayout();
        initFloatingActionButton();
        initNavigationView();
        initRecyclerView();
        loadIntoRecyclerView();
        invalidateToolbar();
        invalidateTitle();
    }

    private void invalidateTitle() {

    }

    private void invalidateToolbar() {

    }

    private void loadIntoRecyclerView() {

    }

    private void initRecyclerView() {

    }

    private void initNavigationView() {

    }

    private void initFloatingActionButton() {
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.floating_action_button);
        if (floatingActionButton == null) return;
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                actionCreate();
            }
        });
    }

    private void initDrawerLayout() {

    }

    private void initCoordinatorLayout() {

    }

    private void initAppBarLayout() {
        toolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsing_toolbar_layout);
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setOverflowIcon(ContextCompat
                .getDrawable(this,
                        R.drawable.ic_more
                ));
        setSupportActionBar(toolbar);
    }

    private void initActivityFromIntent() {

    }

    private void actionCreate() {
        InputDialog inputDialog = new InputDialog(this, "Create", "Create directory") {
            @Override
            public void onActionClick(String text) {

            }
        };
    }
}
