package ru.stavarachi.handler;

import ru.stavarachi.service.RenderService;
import ru.stavarachi.service.RocketNameService;

import java.util.Scanner;

public class UserHandler {
    RenderService renderService = new RenderService();
    RocketNameService rocketNameService = new RocketNameService();

    public void listener(boolean isAlive, Scanner scanner) {
        int choice, pulse, key;
        double wetMass, dryMass;

        while (isAlive) {
            System.out.print("> Enter your choice: ");
            choice = scanner.nextByte();

            if (choice == 1) {
                System.out.print("> Enter wet mass: ");
                wetMass = scanner.nextDouble();

                System.out.print("> Enter dry mass: ");
                dryMass = scanner.nextDouble();

                System.out.print("> Enter engine pulse: ");
                pulse = scanner.nextInt();

                String deltaV = renderService.previewDeltaV(wetMass, dryMass, pulse);

                System.out.println(deltaV);
            } else if (choice == 2) {
                System.out.println(">=====< Name patterns >=====<");
                System.out.println("> prefix name suffix");
                System.out.println("> prefix name");
                System.out.println("> name suffix");
                System.out.println("> name");
                System.out.print("> Enter pattern: ");

                key = scanner.nextByte();

                if (key <= 4) {
                    String name = rocketNameService.generateName(key);
                    System.out.println("> " + name);
                } else {
                    System.out.println("Invalid pattern");
                }
            } else if (choice == 0) {
                isAlive = false;
            }
        }
    }
}
