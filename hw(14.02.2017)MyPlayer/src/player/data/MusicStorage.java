/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.data;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collections;
import player.entities.Track;

/**
 *
 * @author Rubingood
 */
public class MusicStorage {

    private DataStorage dataStorage;
    private ArrayList<Track> tracks;

    public MusicStorage() {
        dataStorage = new IntornalDataStorage();
        tracks = new ArrayList<>();
    }


    public ArrayList<Track> scan() {
        try {
            tracks = dataStorage.scan(new URI("file:///C:/Music"));
            return tracks;
        } catch (URISyntaxException e) {
            System.out.println("Error..path not correct");
            e.printStackTrace();
        }
        return null;
    }
    
    public void sort() {
        Collections.sort(tracks, (track1, track2) -> track1.getName().compareTo(track2.getName()));
    }

    public void search(String keyword) {
        int numberOfTrack = 0;
        for (Track track : tracks) {
            numberOfTrack++;
            String trackName = track.getName();
            if (trackName.contains(keyword)) {
                System.out.println(numberOfTrack + "." + " " + trackName);
            }
        }
    }

    public void createPlaylist() {
        scan();
        int numberOfTrack = 0;
        for (Track track : tracks) {
            numberOfTrack++;
            System.out.println(numberOfTrack + "." + " " + track.getName());
        }
    }
}