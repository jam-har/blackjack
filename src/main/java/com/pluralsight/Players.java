package com.pluralsight;

public class Players {
    String name;
    int score;
    Hand hand;

    public Players(String name) {
        this.name = name;
        hand = new Hand();
    }
}
