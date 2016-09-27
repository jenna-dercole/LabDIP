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
public class MessageManager {
    private MessageInput messageInput;
    private MessageOutput messageOutput;
    
    public MessageManager(MessageInput messageInput, MessageOutput messageOutput) {
        this.messageInput = messageInput;
        this.messageOutput = messageOutput;
    }

    public MessageInput getMessageInput() {
        return messageInput;
    }

    public void setMessageInput(MessageInput messageInput) {
        this.messageInput = messageInput;
    }

    public MessageOutput getMessageOutput() {
        return messageOutput;
    }

    public void setMessageOutput(MessageOutput messageOutput) {
        this.messageOutput = messageOutput;
    }
    
    public void receiveInput(MessageInput messageInput) {
        messageInput.receiveInput(messageInput);
    }
    
    public void performOutput(MessageOutput messageOutput) {
        messageOutput.performOutput(messageOutput);
    }
}
