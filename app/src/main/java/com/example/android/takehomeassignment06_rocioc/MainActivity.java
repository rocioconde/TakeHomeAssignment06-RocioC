package com.example.android.takehomeassignment06_rocioc;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText amount;
    private EditText taxPercentage;
    private EditText tipPercentage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        amount = (EditText) findViewById(R.id.amount);
        taxPercentage = (EditText) findViewById(R.id.tax_percentage);
        tipPercentage = (EditText) findViewById(R.id.tip_percentage);
    }

    public void submit(View view) {

        String amount1 = amount.getText().toString();
        double amount2 = Double.parseDouble(amount1);
        String taxPercentage1 = taxPercentage.getText().toString();
        double taxPercentage2 = Double.parseDouble(taxPercentage1);
        String tipPercentage1 = tipPercentage.getText().toString();
        double tipPercentage2 = Double.parseDouble(tipPercentage1);

        ReceiptInformation receipt = new ReceiptInformation(amount2, taxPercentage2, tipPercentage2);


        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(Keys.NEW_ORDER, receipt);
        startActivity(intent);
//        startActivityForResult(intent, 25);

    }
}
