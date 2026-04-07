package mid2.collection.compare.mytest;

import static mid2.collection.compare.mytest.CardConstant.CARD_NUMBER_MAX;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private List<Card> deck = new ArrayList<>();

    public Deck() {
        for (int num = 1; num <= CARD_NUMBER_MAX; num++) {
            deck.add(new Card(Shape.SPADE, num));
            deck.add(new Card(Shape.HEART, num));
            deck.add(new Card(Shape.DIAMOND, num));
            deck.add(new Card(Shape.CLUB, num));
        }
    }

    public void shuffle() {
        Collections.shuffle(deck);
    }

    public Card pickOne() {
        return deck.removeFirst();
    }
}
