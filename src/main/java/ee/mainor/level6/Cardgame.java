package ee.mainor.level6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cardgame {

    public static List<Card> buildDeck() {
        List<Card> cards = new ArrayList<>();
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(rank, suit));
            }
        }
        return cards;
    }

    public static List<Card> shuffle(List<Card> cards) {
        Collections.shuffle(cards);
        return cards;
    }

    public static String showHand(List<Card> hand) {
        String handString = "";
        for (Card card : hand) {
            handString += (hand.indexOf(card) + 1) + ": " + card.toString() + "\n";
        }
        return handString;
    }

    public static void main(String[] args) {
        //todo 1 fix tests (ok)
        //todo 2 simulate playing poker (buildDeck, shuffle and get 5 cards) (ok)
        List<Card> cards = buildDeck();
        cards = shuffle(cards);
        List<Card> hand = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            hand.add(cards.remove(0));
        }
        System.out.println(showHand(hand));
    }
}
