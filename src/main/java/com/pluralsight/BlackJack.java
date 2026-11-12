package com.pluralsight;
import java.util.*;
public class BlackJack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        Players player = new Players(name);//didn't need player class
        Deck deck = new Deck();
        deck.shuffle();
        player.hand.deal(deck.deal());
        player.hand.deal(deck.deal());
        //print hand
        System.out.println(player.hand.getValue());
        if (player.hand.getValue() < 21 ) {
            System.out.println("Do you want to keep going? (enter to continue or quit game");
            String input = scanner.nextLine();
            player.hand.deal(deck.deal());
            System.out.println(player.hand.getValue());
        }

        //use if and else if to determine winners (at least two hands)
        //try bonus





    }
}
