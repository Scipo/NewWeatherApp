package com.androidweather.newappweather;

public class TemperatureUnitConverter {

    public static float celsiusToFahrenheit(float celsius){
        return ((celsius * 9) / 5) + 32;
        //return Math.round(((celsius * 1.8) + 32) *10.0)/10.0;
    }

    public static float fahrenheitToCelsius(float fahrenheit){
        return ((fahrenheit - 32) * 5 / 9);
        //return Math.round(((fahrenheit/1.8) - 32 )*10.0)/10.0;
    }

}
