package com.mai.tdd;

public class TaxCalculator {

    private NdsResolver ndsResolver;

    public TaxCalculator(NdsResolver ndsResolver) {
        this.ndsResolver = ndsResolver;
    }

    public double withNds(double price) {
        return price * ndsResolver.resolveNds()+price;
    }
}
