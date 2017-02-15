/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.entities;

/**
 *
 * @author Rubingood
 */
public class Track {
    
    private final String name;
    private final String format;

    public Track(String name, String format) {
        this.name = name;
        this.format = format;
    }

    public String getName() {
        return name;
    }

    public String getFormat() {
        return format;
    }

}
