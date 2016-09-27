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
public abstract class MessageOutput {
    private String output;
    
    public abstract void performOutput(MessageOutput msg);

    @Override
    public String toString() {
        return "MessageOutput{" + "output=" + output + '}';
    }
    
}
