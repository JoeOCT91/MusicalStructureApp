package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);


        Intent i = getIntent();
        final ArrayList<Track> tracks = (ArrayList<Track>) i.getSerializableExtra("LIST");
        TrackAdapter adapter = new TrackAdapter(this, tracks);
        final ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                long viewId = view.getId();
                final String albumName = tracks.get(position).getAlbumName();
                final String artistName = tracks.get(position).getArtistName();
                final String trackName = tracks.get(position).getTrackName();
                final int artImgId = tracks.get(position).getArtImageId();




                Intent intent = new Intent(TracksActivity.this, MainActivity.class);
                intent.putExtra("ALBUM", albumName);
                intent.putExtra("ARTIST", artistName);
                intent.putExtra("TRACK", trackName);
                intent.putExtra("ART-IMG", artImgId);
                startActivity(intent);



            }
        });

    }
}