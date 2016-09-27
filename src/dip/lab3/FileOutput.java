/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jenna
 */
public class FileOutput extends MessageOutput {
        private String newFile;

    public String getNewFile() {
        return newFile;
    }

    public void setNewFile(String newFile) {
        this.newFile = newFile;
    }

    @Override
    public final void performOutput(MessageOutput msg) {
                
		
		File data = new File(File.separatorChar + "Temp" + 
			  File.separatorChar + setNewFile(newFile));
		PrintWriter out = null;
			  
		
			out = new PrintWriter(
				new BufferedWriter(
				new java.io.FileWriter(data) ) );
			out.println(msg);
			out.close();
			
		
    }
}
