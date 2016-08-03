package com.androidweather.newappweather;

/**
 * Created by Home on 3.8.2016 г..
 */
public class CityBuilder {
    private String id;
    private String name;
    private String region;
    private String country;
    private float longitude;
    private float latitude;

    public CityBuilder(City build){
        this.id=build.id;
        this.name=build.name;
        this.region=build.region;
        this.country=build.country;
        this.longitude=build.longitude;
        this.latitude=build.latitude;
    }
    public void setId(String id){
        this.id=id;
    }
    public String getId(){
        return id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setRegion(String region){
        this.region=region;
    }
    public String getRegion(){
        return region;
    }
    public void setCountry(String country){
        this.country=country;
    }
    public String getCountry(){
        return country;
    }
    public void setLongitude(float longitude){
        this.longitude=longitude;
    }
    public float getLongitude(){
        return longitude;
    }
    public void setLatitude(float latitude){
        this.latitude=latitude;
    }
    public float getLatitude(){
        return latitude;
    }
    public String toString(){
        return this.name+", "+this.region+", "+this.country;
    }

    //artificial copy-constructor
    public static class City{

        private String id;
        private String name;
        private String region;
        private String country;
        private float longitude;
        private float latitude;

        public City id(String id){
            this.id=id;
            return this;
        }
        public City name(String name){
            this.name=name;
            return this;
        }
        public City region(String region){
            this.region=region;
            return this;
        }
        public City country(String country){
            this.country=country;
            return this;
        }
        public City Coordinates(float longitude,float latitude){
            this.longitude=longitude;
            this.latitude=latitude;
            return this;
        }
        public CityBuilder builder(){
            return new CityBuilder(this);
        }

    }



}

