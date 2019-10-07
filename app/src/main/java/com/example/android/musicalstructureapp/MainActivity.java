package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    public int position = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final TrackData data = new TrackData();
        final ArrayList<Track> tracks = data.getTracks();


        final ImageView albumArtImageView = findViewById(R.id.album_art);
        final TextView trackNameTextView = findViewById(R.id.track_name);
        final TextView albumNameTextView = findViewById(R.id.album_name);
        final TextView artistNameTextView = findViewById(R.id.artist_name);
        albumArtImageView.setImageResource(tracks.get(position).getArtImageId());
        trackNameTextView.setText(tracks.get(position).getAlbumName());
        albumNameTextView.setText(tracks.get(position).getTrackName());
        artistNameTextView.setText(tracks.get(position).getArtistName());


        TextView next = findViewById(R.id.next_track);
        next.setText("Next");
        TextView previousTrack = findViewById(R.id.previous_track);
        previousTrack.setText("Previous");

        Log.v("tracklistsize", " " + tracks.size());


        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    position++;
                    Log.v("Position", "is" + position);
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());


                } else if (!(position == tracks.size() - 1)) {
                    position++;
                    Log.v("Position", "is" + position);
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());


                } else {

                    position = 0;
                    Log.v("Position", "is" + position);
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());
                }

            }
        });


        // When View Clicked open Tracks activity

        final TextView tracksListTextView = findViewById(R.id.tracks_list);
        tracksListTextView.setText("Tracks List");

        tracksListTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, TracksActivity.class);
                startActivity(intent);

            }
        });

        // Still Not usable code
        previousTrack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    position = tracks.size() - 1;
                    Log.v("Position", "is" + position);
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());

                } else if (position < tracks.size()) {

                    position--;
                    Log.v("Position", "is" + position);
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());

                }
            }
        });
    }


}