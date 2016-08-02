package com.androidweather.newappweather;

/**
 * Created by Home on 29.7.2016 г..
 */
public class LocationAndCoordinates {
    private float longitude;
    private float latitude;
    private String country;
    private String region;
    private String city;
    private long sunset;
    private long sunrise;

    public LocationAndCoordinates(){
        this.longitude = 0;
        this.latitude = 0;
        this.country = "NoCountry";
        this.region="NoRegion";
        this.city = "NoCity";
        this.sunset = 0;
        this.sunrise = 0;
     }

    public LocationAndCoordinates(float longitude, float latitude, String country,String region, String city,
                                  long sunset, long sunrise) {
        this.longitude = longitude;
        this.latitude = latitude;
        this.country = country;
        this.region=region;
        this.city = city;
        this.sunset = sunset;
        this.sunrise = sunrise;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setRegion(String region){
        this.region=region;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setSunset(long sunset) {
        this.sunset = sunset;
    }

    public void setSunrise(long sunrise) {
        this.sunrise = sunrise;
    }

    public float getLongitude() {
        return longitude;
    }

    public float getLatitude() {
        return latitude;
    }

    public String getCountry() {
        return country;
    }

    public String getRegion(){
        return region;
    }

    public String getCity() {
        return city;
    }

    public long getSunset() {
        return sunset;
    }

    public long getSunrise() {
        return sunrise;
    }
}
