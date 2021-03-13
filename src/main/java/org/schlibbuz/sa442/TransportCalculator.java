/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.schlibbuz.sa442;

/**
 *
 * @author Stefan
 */
public class TransportCalculator implements Calculator {

    private long estimatedCost;

    public TransportCalculator(long estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public long getEstimatedCost() {
        return estimatedCost;
    }

    public void setEstimatedCost(long estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

}
