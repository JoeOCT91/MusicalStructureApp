package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

        Intent i = getIntent();


        if (getIntent().getExtras() == null) {

            Log.v("Message1", "null");


            albumArtImageView.setImageResource(tracks.get(position).getArtImageId());
            trackNameTextView.setText(tracks.get(position).getAlbumName());
            albumNameTextView.setText(tracks.get(position).getTrackName());
            artistNameTextView.setText(tracks.get(position).getArtistName());




        } else {

            Log.v("Message2", "Else");


            String albumName = i.getStringExtra("ALBUM");
            String artistName = i.getStringExtra("ARTIST");
            String trackName = i.getStringExtra("TRACK");
            int albumArtId = i.getIntExtra("ART-IMG", 0);


            albumArtImageView.setImageResource(albumArtId);
            trackNameTextView.setText(trackName);
            albumNameTextView.setText(albumName);
            artistNameTextView.setText(artistName);

        }







        LinearLayout songsLinearLayout = findViewById(R.id.songs);
        songsLinearLayout.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, TracksActivity.class);
                intent.putExtra("LIST", tracks);
                startActivity(intent);

            }
        });


        // When View Clicked open Tracks activity

        final TextView tracksListTextView = findViewById(R.id.tracks_list);
        tracksListTextView.setText("Tracks List");

        tracksListTextView.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent intent = new Intent(MainActivity.this, TracksActivity.class);
                intent.putExtra("LIST", tracks);
                startActivity(intent);

            }
        });


        // Control ImageView to get Next item on the array list
        ImageView next = findViewById(R.id.next_track);
        next.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    position++;
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());
                    albumArtImageView.setImageResource(tracks.get(position).getArtImageId());


                } else if (!(position == tracks.size() - 1)) {
                    position++;
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());
                    albumArtImageView.setImageResource(tracks.get(position).getArtImageId());


                } else {

                    position = 0;
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());
                    albumArtImageView.setImageResource(tracks.get(position).getArtImageId());
                }

            }
        });

        // Control ImageView to get Next item on the array list
        ImageView previousTrack = findViewById(R.id.previous_track);
        previousTrack.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                if (position == 0) {
                    position = tracks.size() - 1;
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());
                    albumArtImageView.setImageResource(tracks.get(position).getArtImageId());

                } else if (position < tracks.size()) {

                    position--;
                    trackNameTextView.setText(tracks.get(position).getAlbumName());
                    albumNameTextView.setText(tracks.get(position).getTrackName());
                    artistNameTextView.setText(tracks.get(position).getArtistName());
                    albumArtImageView.setImageResource(tracks.get(position).getArtImageId());

                }
            }
        });
    }


}
