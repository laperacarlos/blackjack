package com.kodilla.blackjack;

import javafx.scene.image.Image;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

    private List<Card> deck = new ArrayList<>();

    Card card2C = new Card("clubs", "two", 2, new Image("file:src/main/resources/2C.png"));
    Card card3C = new Card("clubs", "three", 3, new Image("file:src/main/resources/3C.png"));
    Card card4C = new Card("clubs", "four", 4, new Image("file:src/main/resources/4C.png"));
    Card card5C = new Card("clubs", "five", 5, new Image("file:src/main/resources/5C.png"));
    Card card6C = new Card("clubs", "six", 6, new Image("file:src/main/resources/6C.png"));
    Card card7C = new Card("clubs", "seven", 7, new Image("file:src/main/resources/7C.png"));
    Card card8C = new Card("clubs", "eight", 8, new Image("file:src/main/resources/8C.png"));
    Card card9C = new Card("clubs", "nine", 9, new Image("file:src/main/resources/9C.png"));
    Card card10C = new Card("clubs", "ten", 10, new Image("file:src/main/resources/10C.png"));
    Card cardJC = new Card("clubs", "jack", 10, new Image("file:src/main/resources/JC.png"));
    Card cardQC = new Card("clubs", "queen", 10, new Image("file:src/main/resources/QC.png"));
    Card cardKC = new Card("clubs", "king", 10, new Image("file:src/main/resources/KC.png"));
    Card cardAC = new Card("clubs", "ace", 11, new Image("file:src/main/resources/AC.png"));

    Card card2S = new Card("spades", "two", 2, new Image("file:src/main/resources/2S.png"));
    Card card3S = new Card("spades", "three", 3, new Image("file:src/main/resources/3S.png"));
    Card card4S = new Card("spades", "four", 4, new Image("file:src/main/resources/4S.png"));
    Card card5S = new Card("spades", "five", 5, new Image("file:src/main/resources/5S.png"));
    Card card6S = new Card("spades", "six", 6, new Image("file:src/main/resources/6S.png"));
    Card card7S = new Card("spades", "seven", 7, new Image("file:src/main/resources/7S.png"));
    Card card8S = new Card("spades", "eight", 8, new Image("file:src/main/resources/8S.png"));
    Card card9S = new Card("spades", "nine", 9, new Image("file:src/main/resources/9S.png"));
    Card card10S = new Card("spades", "ten", 10, new Image("file:src/main/resources/10S.png"));
    Card cardJS = new Card("spades", "jack", 10, new Image("file:src/main/resources/JS.png"));
    Card cardQS = new Card("spades", "queen", 10, new Image("file:src/main/resources/QS.png"));
    Card cardKS = new Card("spades", "king", 10, new Image("file:src/main/resources/KS.png"));
    Card cardAS = new Card("spades", "ace", 11, new Image("file:src/main/resources/AS.png"));

    Card card2H = new Card("hearts", "two", 2, new Image("file:src/main/resources/2H.png"));
    Card card3H = new Card("hearts", "three", 3, new Image("file:src/main/resources/3H.png"));
    Card card4H = new Card("hearts", "four", 4, new Image("file:src/main/resources/4H.png"));
    Card card5H = new Card("hearts", "five", 5, new Image("file:src/main/resources/5H.png"));
    Card card6H = new Card("hearts", "six", 6, new Image("file:src/main/resources/6H.png"));
    Card card7H = new Card("hearts", "seven", 7, new Image("file:src/main/resources/7H.png"));
    Card card8H = new Card("hearts", "eight", 8, new Image("file:src/main/resources/8H.png"));
    Card card9H = new Card("hearts", "nine", 9, new Image("file:src/main/resources/9H.png"));
    Card card10H = new Card("hearts", "ten", 10, new Image("file:src/main/resources/10H.png"));
    Card cardJH = new Card("hearts", "jack", 10, new Image("file:src/main/resources/JH.png"));
    Card cardQH = new Card("hearts", "queen", 10, new Image("file:src/main/resources/QH.png"));
    Card cardKH = new Card("hearts", "king", 10, new Image("file:src/main/resources/KH.png"));
    Card cardAH = new Card("hearts", "ace", 11, new Image("file:src/main/resources/AH.png"));

    Card card2D = new Card("diamonds", "two", 2, new Image("file:src/main/resources/2D.png"));
    Card card3D = new Card("diamonds", "three", 3, new Image("file:src/main/resources/3D.png"));
    Card card4D = new Card("diamonds", "four", 4, new Image("file:src/main/resources/4D.png"));
    Card card5D = new Card("diamonds", "five", 5, new Image("file:src/main/resources/5D.png"));
    Card card6D = new Card("diamonds", "six", 6, new Image("file:src/main/resources/6D.png"));
    Card card7D = new Card("diamonds", "seven", 7, new Image("file:src/main/resources/7D.png"));
    Card card8D = new Card("diamonds", "eight", 8, new Image("file:src/main/resources/8D.png"));
    Card card9D = new Card("diamonds", "nine", 9, new Image("file:src/main/resources/9D.png"));
    Card card10D = new Card("diamonds", "ten", 10, new Image("file:src/main/resources/10D.png"));
    Card cardJD = new Card("diamonds", "jack", 10, new Image("file:src/main/resources/JD.png"));
    Card cardQD = new Card("diamonds", "queen", 10, new Image("file:src/main/resources/QD.png"));
    Card cardKD = new Card("diamonds", "king", 10, new Image("file:src/main/resources/KD.png"));
    Card cardAD = new Card("diamonds", "ace", 11, new Image("file:src/main/resources/AD.png"));

    public List<Card> newDeck() {

        Collections.addAll(deck, card2C, card3C, card4C, card5C, card6C, card7C, card8C, card9C, card10C, cardJC, cardQC, cardKC, cardAC);
        Collections.addAll(deck, card2S, card3S, card4S, card5S, card6S, card7S, card8S, card9S, card10S, cardJS, cardQS, cardKS, cardAS);
        Collections.addAll(deck, card2H, card3H, card4H, card5H, card6H, card7H, card8H, card9H, card10H, cardJH, cardQH, cardKH, cardAH);
        Collections.addAll(deck, card2D, card3D, card4D, card5D, card6D, card7D, card8D, card9D, card10D, cardJD, cardQD, cardKD, cardAD);

        return deck;
    }

    public List<Card> shuffle() {

        Collections.shuffle(deck);

        return deck;
    }

}
