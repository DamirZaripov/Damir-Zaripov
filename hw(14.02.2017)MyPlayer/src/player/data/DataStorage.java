/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.data;

import java.net.URI;
import java.util.ArrayList;
import player.entities.Track;

/**
 *
 * @author Rubingood
 */
public interface DataStorage {
    
    public ArrayList<Track> scan(URI folderPath);
    public void remove(URI namePath);
    public void read(URI readPath);
}
