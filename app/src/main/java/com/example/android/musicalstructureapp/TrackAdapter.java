package com.example.android.musicalstructureapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Activity context, ArrayList<Track> tracks) {

        super(context, 0, tracks);
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);

        }

        TextView artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
        TextView albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name);
        ImageView albumArtView = (ImageView) listItemView.findViewById(R.id.art_img);
        Track currentTrack = getItem(position);
        albumArtView.setImageResource(currentTrack.getArtImageId());
        artistNameTextView.setText(currentTrack.getArtistName());
        albumNameTextView.setText(currentTrack.getAlbumName());


        return listItemView;
    }


}


