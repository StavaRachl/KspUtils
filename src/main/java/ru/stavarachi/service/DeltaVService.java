package ru.stavarachi.service;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DeltaVService {
    public double logarithm(double wetMass, double dryMass) {
        return Math.log(wetMass/dryMass);
    }

    public double countDeltaV(double naturalLogarithm, int pulse, double gravity) {
        double deltaV = pulse * gravity * naturalLogarithm;
        BigDecimal bigDecimal = new BigDecimal(Double.toString(deltaV));
        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
        return bigDecimal.doubleValue();
    }
}
