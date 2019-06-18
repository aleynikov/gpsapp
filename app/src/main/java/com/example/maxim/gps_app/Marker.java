package com.example.maxim.gps_app;


import android.media.Image;

class Market  extends Object {
    private String name;
    private double lat;
    private double lon;
    private Image icon;

    public String getName() {
        return name;
    }

    public double getLat() {
        return lat;
    }

    public double getLon() {
        return lon;
    }

    public Image getIcon() {
        return icon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public void setIcon(Image icon) {
        this.icon = icon;
    }
}