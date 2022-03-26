package ru.Dew1nger.lesson1.Obstacles;

import ru.Dew1nger.lesson1.Players.Player;


public class Treadmill implements Barrier {
    private double length;

    public Treadmill(double length) {
        this.length = length;
    }


    @Override
    public boolean doBarrier(Player player) {
        return player.run(length);
    }
}
