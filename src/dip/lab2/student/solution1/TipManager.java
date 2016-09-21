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
public class TipManager {
    private TipCalculator tipCalculator;
    
    public TipManager(TipCalculator tc) {
        this.tipCalculator = tc;
    }

    public TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        this.tipCalculator = tipCalculator;
    }
    
    public double calculateTip(TipCalculator tc) {
        return tipCalculator.getTip();
    }
}
