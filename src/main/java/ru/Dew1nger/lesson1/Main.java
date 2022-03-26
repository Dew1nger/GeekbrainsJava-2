package ru.Dew1nger.lesson1;


import ru.Dew1nger.lesson1.Obstacles.*;
import ru.Dew1nger.lesson1.Players.*;

public class Main {
    public static void main(String[] args) {

        Player[] players = {
                new Human("Сергей"),
                new Robot("Терминатор"),
                new Cat("Тимоша")
        };

        Barrier[] barriers = {
                new Treadmill(500),
                new Wall(10)
        };

        for (Player p : players) {
            for (Barrier b : barriers) {
                if (!b.doBarrier(p)) {
                    break;
                }
            }
        }
    }
}