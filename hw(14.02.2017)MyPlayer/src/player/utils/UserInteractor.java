/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.utils;

/**
 *
 * @author Rubingood
 */
public interface UserInteractor {
    public String readCommand() throws UserInteractorReadException;
    public String readKeyword() throws UserInteractorReadException;
    public int readTrackNumber() throws UserInteractorInputException;
}
