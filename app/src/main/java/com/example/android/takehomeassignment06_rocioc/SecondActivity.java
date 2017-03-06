package com.example.android.takehomeassignment06_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView displayReceipt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        displayReceipt = (TextView) findViewById(R.id.display_receipt);

        Intent intent = getIntent();
        ReceiptInformation r = (ReceiptInformation) intent.getSerializableExtra(Keys.NEW_ORDER);
        displayReceipt.setText(r.toString());

    }
}
