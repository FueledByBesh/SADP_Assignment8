package patternsex.iterator.system;

import java.util.ArrayList;
import java.util.List;

public class PlaylistImpl implements Playlist{

    private String title;
    private List<Song> songs;


    public PlaylistImpl(String title){
        this.title=title;
        this.songs = new ArrayList<>();
    }

    @Override
    public Iterator<Song> createIterator() {
        Song[] array = new Song[songs.size()];
        return new RandomIterator<Song>(songs.toArray(array));
    }

    @Override
    public void addSong(Song song) {
        this.songs.add(song);
    }
}
