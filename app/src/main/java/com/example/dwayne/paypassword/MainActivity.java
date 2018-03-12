package com.example.dwayne.paypassword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

/**
 *
 * @author Dwayne
 * @email dev1024@foxmail.com
 * @time 2018/3/13 0:49
 * @change
 * @chang time
 * @class describe
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.bt_pay).setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

    }

}
