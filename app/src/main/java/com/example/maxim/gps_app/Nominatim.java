package com.example.maxim.gps_app;


import android.util.JsonReader;
import com.google.gson.Gson;
import java.io.InputStreamReader;
import java.net.URL;
import javax.net.ssl.HttpsURLConnection;

public class Nominatim {
    private String URL = "https://nominatim.openstreetmap.org/reverse";
    private Gson gson = new Gson();

    public Market find(double lat, double lon) {
        try {
            URL endpoint = new URL(this.URL + "?lat=%s&lon=%s&format=jsonv2", Double.toString(lat), Double.toString(lon));
            HttpsURLConnection conn = (HttpsURLConnection) endpoint.openConnection();

            conn.setRequestProperty("User-Agent", "mobapp-client");
            conn.setRequestProperty("Accept", "application/json");

            if (conn.getResponseCode() == 200) {
                JsonReader reader = new JsonReader(new InputStreamReader(conn.getInputStream(), "UTF-8"));

                this.gson.fromJson(reader, Market.class);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
