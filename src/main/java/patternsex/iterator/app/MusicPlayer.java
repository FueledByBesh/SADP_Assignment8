package patternsex.iterator.app;

import patternsex.iterator.system.*;

public class MusicPlayer {

    public static void main(String[] args) {

        Song song1 = new Song("Bohemian Rhapsody", "Queen");
        Song song2 = new Song("Imagine", "John Lennon");
        Song song3 = new Song("Hallelujah", "Leonard Cohen");
        Song song4 = new Song("Hey Jude", "The Beatles");
        Song song5 = new Song("Yesterday", "The Beatles");

        Playlist playlist = new PlaylistImpl("favorite");
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);
        playlist.addSong(song4);
        playlist.addSong(song5);

        Iterator<Song> iterator = playlist.createIterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next().getTitle());
        }
    }
}
