package com.example.android.takehomeassignment06_rocioc;

import java.io.Serializable;

/**
 * Created by ccteuser on 3/6/17.
 */

public class ReceiptInformation implements Serializable {

    private double amount;
    private double taxPercentage;
    private double tipPercentage;

    public ReceiptInformation(double amount, double taxPercentage, double tipPercentage) {
        this.amount = amount;
        this.taxPercentage = taxPercentage;
        this.tipPercentage = tipPercentage;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTaxPercentage() {
        return taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double getTipPercentage() {
        return tipPercentage;
    }

    public void setTipPercentage(double tipPercentage) {
        this.tipPercentage = tipPercentage;
    }

    @Override
    public String toString() {
        double grandTotal = amount + (amount * taxPercentage) + (amount * tipPercentage);
        return "Amount: " + amount +
                "\nSales Tax: " + amount * taxPercentage +
                "\nTip: " + amount * tipPercentage +
                "\nGrand Total: " + grandTotal;
    }
}
