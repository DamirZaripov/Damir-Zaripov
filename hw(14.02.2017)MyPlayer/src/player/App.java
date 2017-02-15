package player;

import player.data.MusicStorage;
import player.musicAdaptation.Player;
import player.utils.ConsoleUserInteractor;
import player.utils.UserInteractor;
import player.utils.UserInteractorReadException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rubingood
 */
public class App extends Application {

    private UserInteractor consoleInteractor;
    private MusicStorage musicStorage;
    private Player MP3player;

    private App(String[] args) {
        super(args);
    }

    public static void main(String[] args) {
        new App(args);
    }

    @Override
    public void init() {
        consoleInteractor = new ConsoleUserInteractor();
        musicStorage = new MusicStorage();
    }

    @Override
    public void start() {
        try {
            String command;
            while (true) {
                command = consoleInteractor.readCommand();
                switch (command) {
                    case ("exit"):
                        System.out.print("Close the program");
                        System.exit(0);
                        break;
                    case ("sort"):
                        musicStorage.sort();
                        break;
                    case ("search"):
                        String keyword = consoleInteractor.readKeyword();
                        musicStorage.search(keyword);
                        break;
                    case ("create playlist"):
                        musicStorage.createPlaylist();
                        break;
                    default:
                        System.out.println("Command not found, sorry, bro");
                        break;
                }
            }
        } catch (UserInteractorReadException e) {
            System.out.println(e.getMessage());
        }
    }
}
