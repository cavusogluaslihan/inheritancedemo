package com.example.inheritancedemo;

public class DemoMain {
    public static void main(String args[]){

       // OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
      //  ogretmenKrediManager.calculate();
        LoanUI loanUi = new LoanUI();
        loanUi.loanCalculate(new OgretmenKrediManager());
        loanUi.loanCalculate(new TarimKrediManager());

    }
}
