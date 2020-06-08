package com.example.uberapp;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this).
                applicationId("CjZANddnCHLfl4p9W2AgfpfE2adrSAVUwtlxPage")
                .clientKey("dE40NABCQN1UfgrQZ36w6OfrXzwR02xE1nfm440y")
                .server("https://parseapi.back4app.com/").build());
    }
}
