package com.example.maxim.gps_app;

import android.app.IntentService;
import android.content.Intent;
import android.location.Geocoder;
import android.os.Bundle;
import android.os.ResultReceiver;

import java.util.Locale;
//
//public class FetchAddressIntentService extends IntentService {
//    protected ResultReceiver receiver;
//
//    @Override
//    protected void onHandleIntent(Intent intent) {
//        if (intent == null) {
//            return;
//        }
//
//        Geocoder geocoder = new Geocoder(this, Locale.getDefault());
//    }
//
//    private void deliverResultToReceiver(int resultCode, String message) {
//        Bundle bundle = new Bundle();
//        bundle.putString(Constants.RESULT_DATA_KEY, message);
//        receiver.send(resultCode, bundle);
//    }
//}
