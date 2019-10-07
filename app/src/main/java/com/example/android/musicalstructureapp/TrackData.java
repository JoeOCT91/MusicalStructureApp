package com.example.android.musicalstructureapp;

import java.util.ArrayList;

public class TrackData {

    private ArrayList<Track> tracks = new ArrayList<>();


    public TrackData(){
        tracks.add(new Track("Mohamed Hamaki", "Kol Yom Men Dah","Ya Sattar", R.drawable.kolyoummn));
        tracks.add(new Track("Mohamed Hamaki", "Kol Yom Men Dah","Mel Bedaya", R.drawable.kolyoummn));
        tracks.add(new Track("Amr Diab", "El Leila","Garaly Eeh", R.drawable.image1));
        tracks.add(new Track("Amr Diab", "El Leila","Khalina Lewahdina", R.drawable.ellila));
        tracks.add(new Track("Amr Diab", "El Leila","Habeet Ya Alby", R.drawable.ellila));
        tracks.add(new Track("Amr Diab", "Tamally Maak","ya 7abibey", R.drawable.ellila));
        tracks.add(new Track("Amr Diab", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr Diab", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr Diab", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr Diab", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Amr Diab", "Tamally Maak","ya 7abibey", R.drawable.image1));
        tracks.add(new Track("Mohamed Hamaki", "Kol Yom Men Dah","Oddam El Nas", R.drawable.kolyoummn));
        tracks.add(new Track("Mohamed Hamaki", "Kol Yom Men Dah","Aalo Annek", R.drawable.kolyoummn));
        tracks.add(new Track("Mohamed Hamaki", "Kol Yom Men Dah","Kan We Kan", R.drawable.kolyoummn));
        tracks.add(new Track("Mohamed Hamaki", "Omro Ma Yegheeb","Agmal Youm", R.drawable.omro));
        tracks.add(new Track("Mohamed Hamaki", "Omro Ma Yegheeb","Mabalash", R.drawable.omro));
        tracks.add(new Track("Mohamed Hamaki", "Omro Ma Yegheeb","Mayni", R.drawable.omro));
        tracks.add(new Track("Mohamed Hamaki", "Omro Ma Yegheeb","Kanet Henak", R.drawable.omro));
        tracks.add(new Track("Mohamed Hamaki", "Omro Ma Yegheeb","Yalli Zaalan", R.drawable.omro));



    }

    public  ArrayList<Track> getTracks()
    {

        return  tracks;
    }

    public  ArrayList<Track> getAlbums(String albumName)
    {


        return  tracks;
    }






}
