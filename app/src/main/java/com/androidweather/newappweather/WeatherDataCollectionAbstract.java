package com.androidweather.newappweather;

/**
 * Created by Home on 29.7.2016 г..
 */
abstract public class WeatherDataCollectionAbstract {

    static abstract public class Temperature{

       private float temp;
       private float minTemp;
       private float maxTemp;

       abstract public float getTemp();
       abstract public float getMinTemp();
       abstract public float getMaxTemp();
    }

    static abstract public class Conditions{
        private float pressure;
        private float humidity;
        private float visibility;

        abstract public float getPressure ();
        abstract public float getHumidity ();
        abstract public float getVisibility();
    }

    static abstract public class Wind{

        private float speed;
        private float deg;
        private float chill;
        private float gust;

        abstract public float getSpeed();
        abstract public float getDeg ();
        abstract public float getGust ();
        abstract public float getChill();
    }
    static abstract public class Rain{

            private String time;
            private float amount;
            private float chance;

        abstract public String getTime();
        abstract public float getAmount();
        abstract public float getChance();

    }
    public static abstract class Snow{
        private String time;
        private float amount;
        private float chance;

        abstract public String getTime();
        abstract public float getAmount();
        abstract public float getChance();
    }
    public static abstract class Clouds{
        private int percentage;
        abstract public int getPercentage();
    }

    abstract public float getTemp ();
    abstract public float getHumidity ();
    abstract public float getPressure ();
    abstract public float getWindSpeed ();

}





