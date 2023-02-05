package com.example.lab2b;

public class TemperatureConverter {
    public static String fahrenheitToCelcius (double f) {
        return String.valueOf(((f - 32) * 5) / 9);
    }

    public static String celciusToFahrenheit (double c) {
        return String.valueOf((c * (9/5.0)) + 32);
    }
}
