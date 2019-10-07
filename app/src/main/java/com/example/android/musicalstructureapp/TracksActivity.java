package com.example.android.musicalstructureapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;


public class TracksActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.track_list);



        //TrackAdapter adapter = new TrackAdapter(this, tracks);




        /*



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
        });*/

    }
}