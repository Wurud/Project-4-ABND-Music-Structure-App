package com.example.android.miwok;

public class Song {


    private String name;
    private String singer;

    public Song(String SongName, String SingerName) {
        name = SongName;
        singer = SingerName;
    }

    public String getName() {
        return name;
    }

    public String getSingerName() {
        return singer;
    }

}
