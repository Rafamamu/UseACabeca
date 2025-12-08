package jukebox;
import jukebox.Song;
import jukebox.Songs;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
   public static void main(String[] args) {

     List<Song> songs = new Songs().getSongs();

     List<Song> rockSongs = songs.stream()
             .filter(song -> song.getGenre().contains("Rock"))
             .collect(Collectors.toList());

      System.out.println(rockSongs);


      System.out.println("------------Playlist do Sleep token -----------------");
      System.out.println("");

      List<Song> sleepTokenSongs = songs.stream()
              .filter(song -> song.getArtist().contains("Sleep Token"))
              .collect(Collectors.toList());
      System.out.println(sleepTokenSongs);

      System.out.println("--------Start with H ------------");
      System.out.println("");

      List<Song> songsWithH = songs.stream()
              .filter(song -> song.getTitle().contains("H"))
              .collect(Collectors.toList());
      System.out.println(songsWithH);


      System.out.println("-----Released after 1995-------");
      System.out.println("");

      List<Song> after1995 = songs.stream()
              .filter(song -> song.getYear() > 1995)
              .collect(Collectors.toList());

      System.out.println(after1995);

       System.out.println("---------LIst all genres-----------");
       System.out.println(" ");

      List<String> genreList = songs.stream()
              .map(song -> song.getGenre())
              .distinct()
              .collect(Collectors.toList());

       System.out.println(genreList);

   }
}
