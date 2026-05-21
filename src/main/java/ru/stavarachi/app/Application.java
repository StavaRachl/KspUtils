package ru.stavarachi.app;

import ru.stavarachi.handler.UserHandler;

import java.util.Scanner;

public class Application {
    UserHandler userHandler = new UserHandler();
    public void initialize() {
        boolean isAlive = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println(">=====< KSP Utils >=====<");
        System.out.println("> 1. Delta-V calculator");
        System.out.println("> 2. Rocket name generator");
        System.out.println("> 0. Exit");

        userHandler.listener(isAlive, scanner);
    }
}
