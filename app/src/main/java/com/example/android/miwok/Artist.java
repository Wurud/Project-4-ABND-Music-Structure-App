package com.example.android.miwok;

public class Artist {

    private String name;
    private String album;

    public Artist(String ArtistName, String ArtistAlbum) {
        name = ArtistName;
        album = ArtistAlbum;
    }

    public String getName() {
        return name;
    }

    public String getAlbum() {
        return album;
    }

}
