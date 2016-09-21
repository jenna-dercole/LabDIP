/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author Jenna
 */
public class StartUp {
    public static void main(String[] args) {
        TipCalculator fstc = new FoodServiceTipCalculator("fair", 234.65);
        TipManager tp = new TipManager(fstc);
        tp.calculateTip(fstc);
    }
}
