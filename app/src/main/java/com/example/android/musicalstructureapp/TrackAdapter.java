package com.example.android.musicalstructureapp;


import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TrackAdapter extends ArrayAdapter<Track> {

    public TrackAdapter(Activity context, ArrayList<Track> tracks) {

        super(context, 0, tracks);
    }



    static class ViewHolder {
        TextView albumNameTextView;
        TextView artistNameTextView;
        ImageView albumArtView;

    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup parent) {

        ViewHolder holder;


        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent ,false);

            // create a new "Holder" with subviews
            holder = new ViewHolder();
            holder.artistNameTextView = (TextView) listItemView.findViewById(R.id.artist_name);
            holder.albumNameTextView = (TextView) listItemView.findViewById(R.id.album_name);
            holder.albumArtView = (ImageView) listItemView.findViewById(R.id.art_img);

            // hang onto this holder for future recycling
            listItemView.setTag(holder);
        } else {

            // skip all the expensive inflation/findViewById
            // and just get the holder you already made
            holder = (ViewHolder) listItemView.getTag();
        }


        Track currentTrack = getItem(position);
        holder.albumArtView.setImageResource(currentTrack.getArtImageId());
        holder.artistNameTextView.setText(currentTrack.getArtistName());
        holder.albumNameTextView.setText(currentTrack.getAlbumName());


        // I don't understand those lines of code

        holder.artistNameTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((ListView) parent).performItemClick(v, position, 0);
                // Let the event be handled in onItemClick()
            }
        });

        holder.albumNameTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((ListView) parent).performItemClick(v, position, 0); // Let the event be handled in onItemClick()
            }
        });

        holder.albumArtView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                ((ListView) parent).performItemClick(v, position, 0); // Let the event be handled in onItemClick()
            }
        });


        return listItemView;
    }


}


