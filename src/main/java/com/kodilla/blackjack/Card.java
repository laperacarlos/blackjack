package com.kodilla.blackjack;

import javafx.scene.image.Image;

public class Card {
    private String suit;
    private String figure;
    private int value;
    private Image cardImg;

    public Card(String suit, String figure, int value, Image cardImg) {
        this.suit = suit;
        this.figure = figure;
        this.value = value;
        this.cardImg = cardImg;
    }

    public int getValue() {
        return value;
    }

    public Image getCardImg() {
        return cardImg;
    }

    public String getSuit() {
        return suit;
    }

    public String getFigure() {
        return figure;
    }
}
