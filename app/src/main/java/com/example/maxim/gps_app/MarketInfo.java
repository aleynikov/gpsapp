package com.example.maxim.gps_app;


import android.media.Image;

public class MarketInfo extends Object {
    public String name;
    public double lat;
    public double lon;
    public Image icon;

    public void MarketInfo(String name, double lat, double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;

        switch (name) {
            case MarketConstants.ATB_NAME:
                break;
            case MarketConstants.FORA_NAME:
                break;
            case MarketConstants.NOVUS_NAME:
                break;
            case MarketConstants.SILPO_NAME:
                break;
        }
    }
}

