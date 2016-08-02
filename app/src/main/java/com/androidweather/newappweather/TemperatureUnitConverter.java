package com.androidweather.newappweather;

public class TemperatureUnitConverter {

  public static float Celsius(float tmp){
      return (int)Math.round((tmp-32)/1.8);
  }

   public static int fahrenheit(float tmp){
        return (int)Math.round((tmp-273.15)*1.8+32);
   }

   public static int KMH(float kil){
       return (int) Math.round(kil * 0.2778);
   }



}
