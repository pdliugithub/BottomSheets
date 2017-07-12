package com.example.pd_liu.bottomsheets;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

/**
 * @author pd_liu
 */
public class BottomSheetActivity extends AppCompatActivity {


    private BottomSheetBehavior behavior;
    private Toast mToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_sheet);

        /*
        app:behavior_hideable="true"
        app:behavior_peekHeight="0dp"
        app:layout_behavior="@string/bottom_sheet_behavior"
         */
        /*
        app:behavior_peekHeight="50dp" peekHeight是当Bottom Sheets关闭的时候，底部我们能看到的高度,默认是0不可见。
        app:behavior_hideable="true" hideable是当我们拖拽下拉的时候，bottom sheet是否能全部隐藏。
        layout_behavior指向bottom_sheet_behavior,代表这是一个bottom Sheets
         */
        mToast = Toast.makeText(this, "", Toast.LENGTH_SHORT);
        control();

        findViewById(R.id.floatBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int state = behavior.getState();
                if (state == BottomSheetBehavior.STATE_COLLAPSED) {
                    behavior.setState(BottomSheetBehavior.STATE_EXPANDED);
                } else {
                    behavior.setState(BottomSheetBehavior.STATE_COLLAPSED);
                }
            }
        });
    }

    private void control() {

        View bottomSheet = findViewById(R.id.bottom_sheet);
        behavior = BottomSheetBehavior.from(bottomSheet);
        //set
        behavior.setState(BottomSheetBehavior.PEEK_HEIGHT_AUTO);

        //bottom sheet callback
        behavior.setBottomSheetCallback(new BottomSheetBehavior.BottomSheetCallback() {
            @Override
            public void onStateChanged(@NonNull View bottomSheet, int newState) {
                if (mToast != null) {
                    mToast.setText("改变了");
                    mToast.show();
                }
            }

            @Override
            public void onSlide(@NonNull View bottomSheet, float slideOffset) {
                if (mToast != null) {
                    mToast.setText("slide");
                    mToast.show();
                }
            }
        });
    }
}
