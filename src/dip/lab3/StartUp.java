/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

/**
 *
 * @author Jenna
 */
public class StartUp {
    MessageInput mi = new KeyboardInput();
    MessageOutput co = new ConsoleOutput();
    MessageManager mm = new MessageManager(mi, co);
    
    
}
