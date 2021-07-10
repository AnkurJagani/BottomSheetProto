package com.ankur.bottomsheetproto;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.ankur.bottomsheetproto.widgets.BottomSheet;
import com.ankur.bottomsheetproto.widgets.BottomSheet1;
import com.ankur.bottomsheetproto.widgets.BottomSheet2;
import com.ankur.bottomsheetproto.widgets.BottomSheet3;
import com.ankur.bottomsheetproto.widgets.BottomSheet4;
import com.ankur.bottomsheetproto.widgets.BottomSheet5;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBottomClick(View view) {
        new BottomSheet().show(getSupportFragmentManager(), "BSD");
    }

    public void onBottomClick1(View view) {
        new BottomSheet1().show(getSupportFragmentManager(), "BSD1");
    }

    public void onBottomClick2(View view) {
        new BottomSheet2().show(getSupportFragmentManager(), "BSD2");
    }

    public void onBottomClick3(View view) {
        new BottomSheet3().show(getSupportFragmentManager(), "BSD3");
    }

    public void onBottomClick4(View view) {
        new BottomSheet4().show(getSupportFragmentManager(), "BSD4");
    }

    public void onBottomClick5(View view) {
        new BottomSheet5().show(getSupportFragmentManager(), "BSD5");
    }
}