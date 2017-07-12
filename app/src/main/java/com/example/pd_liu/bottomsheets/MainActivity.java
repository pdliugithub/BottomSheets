package com.example.pd_liu.bottomsheets;

import android.content.Intent;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.BottomSheetDialog;
import android.support.design.widget.BottomSheetDialogFragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 * BottomSheets Sample.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    /**
     * bottom sheets.
     *
     * @param view view.
     */
    public void bottomSheets(View view) {

        startActivity(new Intent(this, BottomSheetActivity.class));

    }

    /**
     * Bottom navigate
     *
     * @param view view
     */
    public void bottomNavigate(View view) {
        startActivity(new Intent(this, BottomNavigationActivity.class));
    }

    /**
     * bottom sheet dialog.
     *
     * @param view view.
     */
    public void bottomSheetDialog(View view) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(this);
        bottomSheetDialog.setCancelable(true);
        bottomSheetDialog.setTitle("Bottom_Sheet");
        bottomSheetDialog.setContentView(R.layout.item_dialog);
        bottomSheetDialog.show();
    }

    /**
     * bottom sheet fragment.
     *
     * @param view view.
     */
    public void bottomSheetFragment(View view) {
//        BottomSheetDialogFragment bottomSheetDialog = new BottomSheetDialogFragment();
//        bottomSheetDialog.sho
    }
}
