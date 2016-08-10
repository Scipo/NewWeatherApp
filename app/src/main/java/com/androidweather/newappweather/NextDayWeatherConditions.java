package com.androidweather.newappweather;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NextDayWeatherConditions extends NextDayWeatherDataCollection{
    private SimpleDateFormat DataFormat=new SimpleDateFormat("dd.MM.yyyy");
    public NexDayData nexDayData = new NexDayData();

    public String getNextDate(){
        return DataFormat.format(new Date(dayStamp));
    }
    public class NexDayData{
        public float day;
        public float minTem;
        public float maxTem;
        public float morning;
        public float noon;
        public float evening;
        public float night;
    }


}
