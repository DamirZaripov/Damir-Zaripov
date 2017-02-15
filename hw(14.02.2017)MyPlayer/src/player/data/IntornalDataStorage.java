/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.data;

import java.io.File;
import java.net.URI;
import java.util.ArrayList;
import player.entities.Track;

/**
 *
 * @author Rubingood
 */
public class IntornalDataStorage implements DataStorage {

    private ArrayList<Track> tracks;

    public IntornalDataStorage() {
        tracks = new ArrayList<>();
    }

    @Override
    public ArrayList<Track> scan(URI folderPath) {
        final File folder = new File(folderPath);
        File[] listFiles = folder.listFiles();
        if (listFiles != null) {
            for (final File fileEntry : listFiles) {
                if (fileEntry.isDirectory()) {
                    scan(fileEntry.toURI());
                } else {
                    String name = fileEntry.getName();
                    String format = FilenameUtils.getExtension(name);
                    Track track = new Track(name, format);
                    tracks.add(track);
                }
            }
        }
        return tracks;
    }

    @Override
    public void remove(URI namePath) {

    }

    @Override
    public void read(URI readPath) {

    }

}
