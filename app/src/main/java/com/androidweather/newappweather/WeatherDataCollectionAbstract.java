package com.androidweather.newappweather;

/**
 * Created by Home on 29.7.2016 г..
 */
abstract public class WeatherDataCollectionAbstract {
    protected static final String JDateTime = "JDT";
    protected  static final String JWind= "JWind";
    //protected  static final String JRain="JRain";
    //protected static  final String JSnow="JSnow";

    static abstract public class Temperature{

        protected static final String JTemperature="tmp";
        protected static final String JTemperatureMin="tmp_min";
        protected static final String JTemperatureMAX="tmp_max";

        abstract public float getTemp ();
        abstract public float getTempMin ();
        abstract public float getTempMax ();
    }

    static abstract public class Humidity{
        protected static final String JHumidity="Humidity";
        protected static final String JPressure="Pressure";

        abstract public float getPressure ();
        abstract public float getHumidity ();
    }
    static abstract public class Wind{

        protected static final String JSpeed= "speed";
        protected static final String JDeg = "deg";
        protected static final String JGust= "gust";

        abstract public float getSpeed ();
        abstract public int getDeg ();
        abstract public float getGust ();
    }

    abstract public float getTemp ();
    abstract public float getHumidity ();
    abstract public float getPressure ();
    abstract public float getWindSpeed ();
    abstract public float getWindGust ();
    abstract public int getWindDeg ();
    //abstract public int getRain ();
    //abstract public int getSnow ();
    //abstract public int getPrecipitation ();

}





