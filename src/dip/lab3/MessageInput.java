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
public abstract class MessageInput {
    private String input;
    
    public abstract String receiveInput(MessageInput msg);

    @Override
    public final String toString() {
        return "MessageInput{" + "input=" + input + '}';
    }
    
    
}
