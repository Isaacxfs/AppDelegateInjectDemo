package com.delegateinject.isa.subfeature;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

/**
 * @author fangsxu
 */
public class SubActivity extends AppCompatActivity {
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        btn = findViewById(R.id.btn);

        btn.setOnClickListener(AppDelegate.getManager());
    }
}
