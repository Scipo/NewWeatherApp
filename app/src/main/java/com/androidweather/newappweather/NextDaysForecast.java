package com.androidweather.newappweather;

import java.util.ArrayList;
import java.util.List;

public class NextDaysForecast extends MainWeatherComponents{
    protected List<NextDayWeatherConditions> nextDayWeatherConditions=new ArrayList<NextDayWeatherConditions>();
    public void addForecast(NextDayWeatherConditions forecast){
        nextDayWeatherConditions.add(forecast);
    }
    public NextDayWeatherConditions getForecast(int dayNumber){
        return nextDayWeatherConditions.get(dayNumber);
    }
    public List<NextDayWeatherConditions>getWeatherForecast(){
        return this.nextDayWeatherConditions;
    }
}
