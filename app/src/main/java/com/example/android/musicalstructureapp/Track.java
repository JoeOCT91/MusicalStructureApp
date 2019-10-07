package com.example.android.musicalstructureapp;

import android.os.Parcel;
import android.os.Parcelable;

public class Track implements Parcelable {

    private String mArtistName;
    private String mAlbumName;
    private String mTrackName;
    private int mArtImageId;

    public Track(String artistName, String albumName, String trackName, int artImageId) {

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

    protected Track(Parcel in) {
        mArtistName = in.readString();
        mAlbumName = in.readString();
        mTrackName = in.readString();
        mArtImageId = in.readInt();

    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(mArtistName);
        dest.writeString(mAlbumName);
        dest.writeString(mTrackName);
        dest.writeInt(mArtImageId);

    }

    @SuppressWarnings("unused")
    public static final Parcelable.Creator<Track> CREATOR = new Parcelable.Creator<Track>() {
        @Override
        public Track createFromParcel(Parcel in) {
            return new Track(in);
        }

        @Override
        public Track[] newArray(int size) {
            return new Track[size];
        }


    };


}


