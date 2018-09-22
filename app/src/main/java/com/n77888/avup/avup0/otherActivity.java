package com.n77888.avup.avup0;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class otherActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout layout= new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);

        TextView tv = new TextView(this);
        tv.setWidth(900);
        tv.setId(0);
        tv.setText("jsjsjsj");
        LinearLayout lLayout = new LinearLayout(this);
        lLayout.addView(tv);

        android.widget.Button bt= new Button(this);
        bt.setText("guava");
        LinearLayout lLayout2 = new LinearLayout(this);
        lLayout.addView(bt);

        layout.addView(lLayout2);
        layout.addView(lLayout);
        setContentView(layout);
    }
}
