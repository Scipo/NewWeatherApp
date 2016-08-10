package com.androidweather.newappweather;

/**
 * Created by Home on 1.8.2016 г..
 */
public class WeatherDataCollection extends WeatherDataCollectionAbstract {


        public static class Wind extends WeatherDataCollectionAbstract.Wind{
            private float speed;
            private float deg;
            private float chill;
            private float gust;

            public Wind(){

            }

            public Wind(float speed, float deg, float chill, float gust) {
                this.speed = speed;
                this.deg = deg;
                this.chill = chill;
                this.gust = gust;
            }

            public void setSpeed(float speed) {
                this.speed = speed;
            }

            public void setDeg(float deg) {
                this.deg = deg;
            }

            public void setChill(float chill) {
                this.chill = chill;
            }

            public void setGust(float gust) {
                this.gust = gust;
            }

            @Override
            public float getSpeed() {
                return speed;
            }

            @Override
            public float getDeg() {
                return deg;
            }

            @Override
            public float getChill() {
                return chill;
            }

            @Override
            public float getGust() {
                return gust;
            }
        }


    public static class Temperature extends WeatherDataCollectionAbstract.Temperature{

        private float temp;
        private float minTemp;
        private float maxTemp;

        public Temperature(){

        }
        public Temperature(float temp,float minTemp,float maxTemp){
            this.temp=temp;
            this.minTemp=minTemp;
            this.maxTemp=maxTemp;
        }
        public void setTemp(float temp){
            this.temp=temp;
        }
        public void setMinTemp(float minTemp){
            this.minTemp=minTemp;
        }
        public void setMaxTemp(float maxTemp){
            this.maxTemp=maxTemp;
        }
        @Override
        public float getTemp(){
            return temp;
        }
        @Override
        public float getMinTemp(){
            return minTemp;
        }
        @Override
        public float getMaxTemp(){
            return maxTemp;
        }

    }
    public static class Conditions extends WeatherDataCollectionAbstract.Conditions{
        private float pressure;
        private float humidity;
        private float visibility;

        public Conditions(){

        }

        public Conditions(float pressure,float humidity, float visibility){
            this.pressure=pressure;
            this.humidity=humidity;
            this.visibility=visibility;
        }
        public void setPressure(float pressure){
            this.pressure=pressure;
        }
        public void setHumidity(float humidity){
            this.humidity=humidity;
        }
        public void setVisibility(float visibility){
            this.visibility=visibility;
        }

        @Override
        public float getPressure() {
            return pressure;
        }

        @Override
        public float getHumidity() {
            return humidity;
        }

        @Override
        public float getVisibility() {
            return visibility;
        }
    }
    public static class Rain extends WeatherDataCollectionAbstract.Rain{
        private String time;
        private float amount;
        private float chance;

        public Rain(){

        }

        public Rain(String time, float amount,float chance){
            this.time=time;
            this.amount=amount;
            this.chance=chance;
        }
        public void setTime(String time){
            this.time=time;
        }
        public void setAmount(float amount){
            this.amount=amount;
        }
        public void setChance(float chance){
            this.chance=chance;
        }

        @Override
        public String getTime() {
            return time;
        }

        public float getAmount() {
            return amount;
        }

        @Override
        public float getChance() {
            return chance;
        }
    }

    public static class Snow extends WeatherDataCollectionAbstract.Snow{
        private String time;
        private float amount;
        private float chance;

        public Snow(){

        }

        public Snow(String time,float amount,float chance){
            this.time=time;
            this.amount=amount;
            this.chance=chance;
        }
        public void setTime(String time){
            this.time=time;
        }
        public  void setAmount(float amount){
            this.amount=amount;
        }
        public void setChance(float chance){
            this.chance=chance;
        }

        @Override
        public String getTime() {
            return time;
        }

        @Override
        public float getAmount() {
            return amount;
        }

        @Override
        public float getChance() {
            return chance;
        }
    }

   public static class Clouds extends WeatherDataCollectionAbstract.Clouds{
       private int percentage;

       public Clouds(){

       }
       public Clouds(int percentage) {
           this.percentage = percentage;
       }

       public void setPercentage(int percentage) {
           this.percentage = percentage;
       }

       @Override
       public int getPercentage() {
           return percentage;
       }
   }

    public Wind wind=new Wind();
    public Temperature temperature=new Temperature();
    public Conditions currentCondition=new Conditions();
    public Snow snow = new Snow();
    public Rain rain = new Rain();
    public Clouds clouds=new Clouds();
    public LocationAndCoordinates locationAndCoordinates= new LocationAndCoordinates();

    public float getTemp (){
        return temperature.getTemp();
    }
    public float getHumidity (){
        return currentCondition.getHumidity();
    }
    public float getPressure (){
        return currentCondition.getPressure();
    }
    public float getWindSpeed (){
        return wind.getSpeed();
    }
}
