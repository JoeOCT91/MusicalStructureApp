package com.example.android.musicalstructureapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);

        Intent i = getIntent();
        final ArrayList<Track> tracks = (ArrayList<Track>) i.getSerializableExtra("TRACKS");
        TrackAdapter adapter = new TrackAdapter(this, tracks);
        final ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                long viewId = view.getId();
                final String Nme = tracks.get(position).getAlbumName();


                if (viewId == R.id.art_img) {



                    Intent intent = new Intent(TracksActivity.this, MainActivity.class);
                    intent.putExtra("Value",Nme);
                    startActivity(intent);


                } else if (viewId == R.id.album_name) {
                    Toast.makeText(TracksActivity.this, "Button 2 clicked", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(TracksActivity.this, "ListView clicked" + id, Toast.LENGTH_SHORT).show();
                }


            }
        });

    }
}