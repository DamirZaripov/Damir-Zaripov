/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.utils;

import java.util.Scanner;

/**
 *
 * @author Rubingood
 */
public class ConsoleUserInteractor implements UserInteractor {
    
    private Scanner scanner;

    public ConsoleUserInteractor() {
        scanner = new Scanner(System.in);
    }
    
    @Override
    public String readCommand() throws UserInteractorReadException {
        System.out.print("Enter the command: ");
        String command = scanner.nextLine();
        if (command.equals("")) throw new UserInteractorReadException("Error. You command is empty, try again");
        return command;
    }

    @Override
    public String readKeyword() throws UserInteractorReadException {
        System.out.print("Enter the keyword: ");
        String keyword = scanner.nextLine();
        if (keyword.equals("")) throw new UserInteractorReadException("Error. You keyword is empty");
        return keyword;
    }

    @Override
    public int readTrackNumber() throws UserInteractorInputException {
       System.out.print("Enter number of track: ");
       return Integer.parseInt(scanner.nextLine());
    }
    
}
