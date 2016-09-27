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
public class KeyboardInput extends MessageInput {
    
    
    @Override
    public final String receiveInput(MessageInput msg) {
        return msg.toString();
    }
}
