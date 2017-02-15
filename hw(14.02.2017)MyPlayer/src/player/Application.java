/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author Rubingood
 */
public abstract class Application {
     protected String[] args;
  
  public Application(String[] args){
    this.args = args;
    this.init();
    this.start();
  }
  
  public abstract void init();
  public abstract void start();
}
