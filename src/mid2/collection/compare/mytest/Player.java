package mid2.collection.compare.mytest;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> handCards;
    private int handCardsNumberSum = 0;

    public Player(String name) {
        this.name = name;
        this.handCards = new ArrayList<>();
    }

    public void pickCard(Card card) {
        handCards.add(card);
        handCards.sort(null);
        handCardsNumberSum += card.getNumber();
    }

    public String getName() {
        return name;
    }

    public void showCards() {
        System.out.println(name + "의 카드: " + handCards + ", 합계: " + handCardsNumberSum);
    }

    public int getHandCardsNumberSum() {
        return handCardsNumberSum;
    }
}
