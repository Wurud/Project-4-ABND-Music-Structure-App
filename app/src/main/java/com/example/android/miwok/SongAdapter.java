package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SongAdapter extends ArrayAdapter<Song> {

    private Context context;
    View listItem;
    private List<Song> songsList = new ArrayList<>();

    public SongAdapter(Context currentContext, ArrayList<Song> list) {
        super(currentContext, 0, list);
        context = currentContext;
        songsList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        listItem = convertView;

        if (listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.activity_songs_list, parent, false);

            Song currentSong = songsList.get(position);

            TextView currentName = (TextView) listItem.findViewById(R.id.song_name);
            currentName.setText(currentSong.getName());

            TextView currentAlbum = (TextView) listItem.findViewById(R.id.singer_name);
            currentAlbum.setText(currentSong.getSingerName());

        return listItem;
    }

}
