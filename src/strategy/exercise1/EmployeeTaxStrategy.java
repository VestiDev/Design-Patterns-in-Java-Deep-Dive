/*
 * This class forms part of the Design Patterns Course by
 * Dr Heinz Kabutz from JavaSpecialists.eu and may not be
 * distributed without written consent.
 *
 * Copyright 2001-2021, Heinz Kabutz, All rights reserved.
 */

package strategy.exercise1;

public class EmployeeTaxStrategy implements TaxStrategy {
    public static final double RATE = 0.45;

    private final TaxPayer payer;

    public EmployeeTaxStrategy(TaxPayer payer) {
        this.payer = payer;
    }

    public double extortCash() {
        return payer.getIncome() * RATE;
    }
}