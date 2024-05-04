package patternsex.iterator.system;

public interface Playlist {

    Iterator<Song> createIterator();
    void addSong(Song song);

}
