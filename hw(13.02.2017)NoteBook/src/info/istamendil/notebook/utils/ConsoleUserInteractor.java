package info.istamendil.notebook.utils;

import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        System.out.println("Enter your command:");
        return scanner.nextLine();
    }

    @Override
    public void print(String output) throws UserInteractorWriteException {
        System.out.println(">>" + output);
    }
    
}
