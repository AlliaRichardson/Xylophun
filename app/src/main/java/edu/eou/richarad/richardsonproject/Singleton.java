package edu.eou.richarad.richardsonproject;

import android.content.Context;

public class Singleton {
    private static final Singleton ourInstance = new Singleton();
    private static Context appContext;
    private static float volume = 0.75f;

    //creates an instance of Singleton
    public static Singleton getInstance(Context context) {
        appContext = context;
        return ourInstance;
    }

    //constructor
    private Singleton() {
    }

    //records new volume
    public static void setVolume(float vol) {
        volume = vol;
    }

    // Gets new Volume
    public static float getVolume(){
        return volume;
    }

}
