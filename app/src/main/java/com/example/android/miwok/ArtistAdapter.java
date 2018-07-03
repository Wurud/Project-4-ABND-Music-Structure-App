package com.example.android.miwok;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ArtistAdapter extends ArrayAdapter<Artist> {

    private Context context;
    private List<Artist> artistsList = new ArrayList<>();
    View listItem;

    public ArtistAdapter(Context currentContext, ArrayList<Artist> list) {

        super(currentContext, 0, list);
        context = currentContext;
        artistsList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        listItem = convertView;

        if (listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.activity_artists_list, parent, false);

        Artist currentArtist = artistsList.get(position);

        TextView currentName = (TextView) listItem.findViewById(R.id.artist_name);
        currentName.setText(currentArtist.getName());

        TextView currentAlbum = (TextView) listItem.findViewById(R.id.artist_album);
        currentAlbum.setText(currentArtist.getAlbum());

        return listItem;
    }
}
