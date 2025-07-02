package application;

import boardgame.Position;

public class App {
    public static void main(String[] args) {
        System.out.println("CLI Chess");

        Position pos = new Position(3,5);
        System.out.println(pos);
    }
}