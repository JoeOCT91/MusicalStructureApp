package com.example.android.musicalstructureapp;

import java.util.ArrayList;

public class TrackData {

    private ArrayList<Track> tracks = new ArrayList<>();


    public TrackData(){
        tracks.add(new Track("Amr diab1", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab2", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab3", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab4", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab5", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab6", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab7", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab8", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab9", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr diab10", "Tamally Maak","ya 7abibey", R.drawable.image1));



    }

    public  ArrayList<Track> getTracks()
    {
        return  tracks;
    }

}
