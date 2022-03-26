package ru.Dew1nger.lesson1.Obstacles;

import ru.Dew1nger.*;
import ru.Dew1nger.lesson1.Players.Player;

public class Wall implements Barrier{
    private double height;


    public Wall(double height) {
        this.height = height;
    }

    @Override
    public boolean doBarrier(Player player) {
        return player.jump(height);
    }
}