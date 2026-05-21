package ru.stavarachi.service;

import ru.stavarachi.config.PhysicConfig;

public class RenderService {
    DeltaVService deltaVService = new DeltaVService();
    PhysicConfig physicConfig = new PhysicConfig();

    public String previewDeltaV(double wetMass, double dryMass, int pulse) {
        double gravity = physicConfig.getGRAVITY();

        double naturalLogarithm = deltaVService.logarithm(wetMass, dryMass);

        double deltaV = deltaVService.countDeltaV(naturalLogarithm, pulse, gravity);

        String presentation = "> Delta V your rocket\n" +
                "> " + deltaV + "\n" +
                "> Rocket data:\n" +
                "> Wet mass: " + wetMass + "\n" +
                "> Dry mass: " + dryMass + "\n" +
                "> Pulse: " + pulse;

        return presentation;
    }
}
