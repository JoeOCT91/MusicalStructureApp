package com.example.android.musicalstructureapp;

public class Track {

    private String mArtistName;
    private String mAlbumName;
    private String mTrackName;
    private int mArtImageId;

    public Track(String artistName, String albumName,String trackName, int artImageId) {

        mArtistName = artistName;
        mAlbumName = albumName;
        mTrackName = trackName;
        mArtImageId = artImageId;
    }

    public String getArtistName() {
        return mArtistName;
    }

    public String getAlbumName() {
        return mAlbumName;
    }

    public String getTrackName() {
        return mTrackName;
    }

    public int getArtImageId() {

        return mArtImageId;
    }







}