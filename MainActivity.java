package com.jd.shop.gitbranch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        funMaster();
        funBranch1();
    }

    private void funBranch1() {
        Log.d("funBranch1","funMaster");
    }

    private void funMaster() {
        Log.d("funMaster","funMaster");
        Log.d("funBranch11","funMaster");
    }
}
