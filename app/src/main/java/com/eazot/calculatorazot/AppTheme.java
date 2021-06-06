package com.eazot.calculatorazot;

public enum AppTheme {


    LIGHT (R.style.Theme_CalculatorAZot, "light"),
    DARK (R.style.Theme_CalculatorAZotDark,"dark");

    private int resource;
    private String key;

    AppTheme(int resource,String key) {
        this.resource = resource;
        this.key = key;
    }

    public int getResource() {
        return resource;
    }

    public String getKey() {
        return key;
    }
}
