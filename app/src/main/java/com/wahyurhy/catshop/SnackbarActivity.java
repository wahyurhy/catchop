package com.wahyurhy.catshop;

import androidx.appcompat.app.AppCompatActivity;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class SnackbarActivity extends AppCompatActivity {

    private Button mSnackbarBtn;
    private FloatingActionButton mFabBtn;
    private CoordinatorLayout mSnackbarLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snackbar);

        mSnackbarBtn = findViewById(R.id.snackbar_btn);
        mFabBtn = findViewById(R.id.fab);
        mSnackbarLayout = findViewById(R.id.snackbar_layout);

        mSnackbarBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar snackbar = Snackbar.make(view, "You just clicked the snackbar button", Snackbar.LENGTH_LONG);
                snackbar.setDuration(10000);
                snackbar.setAnchorView(mFabBtn);
                snackbar.setAnimationMode(BaseTransientBottomBar.ANIMATION_MODE_SLIDE);
                snackbar.setAction("Okay", new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        // do something here
                    }
                });
                snackbar.show();

            }
        });

    }
}