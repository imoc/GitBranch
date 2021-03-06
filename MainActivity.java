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
        funBranch2();
    }

    private void funBranch1() {
        Log.d("funBranch1","funMaster");
    }

    private void funBranch2() {
        Log.d("funBranch2", "funMaster");
    }

    private void funMaster() {
        Log.d("funMaster","funMaster");
        Log.d("funBranch1","funMaster");
        Log.d("funBranch2", "funMaster");
    }

    /**
     * feature-1
     * display HelloWorld
     * @param view
     */
    public void feature1(View view) {
        if (btn_feature_1.getText().toString().equals("功能1")) {
            btn_feature_1.setText(R.string.feature_1_dis);
        } else {
            btn_feature_1.setText(R.string.feature_1);
        }
    }

    /**
     * feature-2
     * display HelloAndroid
     * @param view
     */
    public void feature2(View view) {
        if (btn_feature_2.getText().toString().equals("功能2")) {
            btn_feature_2.setText(R.string.feature_2_dis);
        } else {
            btn_feature_2.setText(R.string.feature_2);
        }
    }

    /**
     * feature-5
     * display Hello
     * @param view
     */
    public void feature5(View view) {
        btn_feature_5.setText(R.string.feature_5_dis);
    }
}
