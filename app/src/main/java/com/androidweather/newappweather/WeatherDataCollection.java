package com.androidweather.newappweather;

/**
 * Created by Home on 1.8.2016 г..
 */
import org.json.JSONObject;

public class WeatherDataCollection extends WeatherDataCollectionAbstract {


        public static class Wind extends WeatherDataCollectionAbstract.Wind{

        private final float speed;
        private final int deg;
        private final float gust;

        public Wind(JSONObject json){
            this.speed=(float)json.optDouble(Wind.JSpeed);
            this.deg=json.optInt(Wind.JDeg,Integer.MIN_VALUE);
            this.gust=(float)json.optDouble(Wind.JGust);

        }

        public boolean isSpeed(){
            return !Float.isNaN(this.speed);
        }
        public float getSpeed(){
            return this.speed;
        }
        public boolean isDegree(){
            return this.deg!=Integer.MIN_VALUE;
        }
        public int getDeg(){
            return this.deg;
        }
        public boolean isGust(){
            return !Float.isNaN(this.gust);
        }
        public float getGust(){
            return this.gust;
        }
     }


    public static class Temperature extends WeatherDataCollectionAbstract.Temperature{
            private final float temp;
            private final float tmp_max;
            private final float tmp_min;

        public Temperature(JSONObject json){
            this.temp=(float)json.optDouble(Temperature.JTemperature);
            this.tmp_max=(float) json.optDouble(Temperature.JTemperatureMAX);
            this.tmp_min=(float) json.optDouble(Temperature.JTemperatureMin);
        }
        public  boolean isTemperature(){
            return !Float.isNaN(this.temp);
        }
        public float getTemp (){
            return this.temp;
        }
        public boolean isTmpMin(){
            return !Float.isNaN(this.tmp_min);
        }

        public float getTempMin (){
            return this.tmp_min;
        }

        public boolean isTempMax(){
            return !Float.isNaN(this.tmp_max);
        }
        public float getTempMax (){
            return this.tmp_max;
        }

    }
    public static class Humidity extends WeatherDataCollectionAbstract.Humidity{
        private final float humidity;
        private final float pressure;

            public Humidity(JSONObject json){
            this.humidity=(float)json.optDouble(Humidity.JHumidity);
            this.pressure=(float)json.optDouble(Humidity.JPressure);
        }
        public boolean isHumidity(){
            return !Float.isNaN(this.humidity);
        }
        public float getHumidity(){
            return this.humidity;
        }

        public boolean isPressure(){
            return !Float.isNaN(this.pressure);
        }
        public float getPressure (){
            return this.pressure;
        }

    }

    public static class Snow{
        private String time;
        private float amount;

        public void setTime(String time){
            this.time=time;
        }
        public String getTime(){
            return this.time;
        }
        public void setAmount(float amount){
            this.amount=amount;
        }
        public float getAmount(){
            return this.amount;
        }
     }

    public static class Rain{
        private String time;
        private float amount;

        public void setTime(String time){
            this.time=time;
        }
        public String getTime(){
            return this.time;
        }
        public void setAmount(float amount){
            this.amount=amount;
        }
        public float getAmount(){
            return this.amount;
        }

    }

    public  class Clouds {
        private int visibility;
        public void setVisibility(int visibility){
            this.visibility=visibility;
        }
        public int getVisibility(){
            return visibility;
        }

    }
    ///////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////
    private Wind wind;
    private Temperature temperature;
    private Humidity humidity;
    private Humidity pressure;

    public float getTemp (){
        if(this.temperature.isTemperature()){
            return this.temperature.getTemp();
        }
        return Float.NaN;
    }
    public float getHumidity (){
        if(this.humidity.isHumidity()){
            return this.humidity.getHumidity();
        }
        return Float.NaN;
    }
    public float getPressure (){
        if(this.pressure.isPressure()){
            return this.pressure.getPressure();
        }
        return Float.NaN;
    }

    public int getWindDeg () {
        if (this.wind.isDegree())
            return this.wind.getDeg ();
        return Integer.MIN_VALUE;
    }
    public float getWindSpeed () {
        if (this.wind.isSpeed ())
            return this.wind.getSpeed ();
        return Float.NaN;
    }

    public float getWindGust () {
        if (this.wind.isGust ())
            return this.wind.getGust ();
        return Float.NaN;
    }

}
