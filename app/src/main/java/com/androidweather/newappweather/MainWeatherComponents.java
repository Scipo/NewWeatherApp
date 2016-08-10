package com.androidweather.newappweather;

/**
 * Created by Home on 3.8.2016 г..
 */
public abstract class MainWeatherComponents {
    private WeatherDataCollection units;

    public void setUnits(WeatherDataCollection units){
        this.units=units;
    }

    public WeatherDataCollection getUnits(){
        return units;
    }

    public static class WeatherDataCollection{
        public String WindSpeedUnit;
        public String tempUnit;
        public String pressureUnit;
        public String distanceUnit;
    }
//Under construction not well done

}
