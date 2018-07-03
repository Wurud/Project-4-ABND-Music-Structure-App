package com.example.android.miwok;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.widget.ListView;


public class ArtistsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artists);

        ListView listView = (ListView) findViewById(R.id.list2);
        ArrayList<Artist> artists = new ArrayList<>();

        artists.add(new Artist("Jason Aldean", "RearView Town"));
        artists.add(new Artist("Cardi B", "Invasion of Privacy"));
        artists.add(new Artist("Drake", "Scorpion"));
        artists.add(new Artist("Breaking Benjamin", "Ember"));
        artists.add(new Artist("Ed Sheeran", "Coffret 2 CD"));
        artists.add(new Artist("The Weeknd", "My Dear Melancholy,"));
        artists.add(new Artist("Post Malone", "beerbongs & bentleys"));
        artists.add(new Artist("Kendrick Lamar", "DAMN"));
        artists.add(new Artist("John Prine", "The Tree of Forgiveness"));
        artists.add(new Artist("Nicki Minaj", "Pinkprint"));
        artists.add(new Artist("Metallica", "Metallica Live At The Reunion"));
        artists.add(new Artist("BTS", "Face Yourself"));

        ArtistAdapter artistsAdapter = new ArtistAdapter(this, artists);
        listView.setAdapter(artistsAdapter);

    }



}
