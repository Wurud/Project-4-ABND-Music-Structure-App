package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class SongsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_songs);

        ListView listView = (ListView) findViewById(R.id.list3);
        ArrayList<Song> songs = new ArrayList<>();

        songs.add(new Song("Nice For What", "Drake"));
        songs.add(new Song("God's Plan", "Drake"));
        songs.add(new Song("Psycho", "Post Malone"));
        songs.add(new Song("The Middle", "Zedd, Maren Morris & Grey"));
        songs.add(new Song("Perfect", "Ed Sheeran"));
        songs.add(new Song("Freaky Friday", "Lil Dicky Featuring Chris Brown"));
        songs.add(new Song("I Like It", "Cardi B,"));
        songs.add(new Song("Chun-Li", "Nicki Minaj"));
        songs.add(new Song("Walk It Talk It", "Migos Featuring Drake"));
        songs.add(new Song("Finesse", "Bruno Mars & Cardi B"));
        songs.add(new Song("Never Be The Same", "Camila Cabello"));
        songs.add(new Song("Mine", "Bazzi"));

        SongAdapter songsAdapter = new SongAdapter(this, songs);

        listView.setAdapter(songsAdapter);
    }
}
