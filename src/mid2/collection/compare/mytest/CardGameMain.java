package mid2.collection.compare.mytest;

public class CardGameMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player p1 = new Player("hhd1337");
        Player p2 = new Player("wonji");

        deck.shuffle();
        for (int i = 0; i < 5; i++) {
            p1.pickCard(deck.pickOne());
            p2.pickCard(deck.pickOne());
        }

        p1.showCards();
        p2.showCards();

        judgeAndPrintWinner(p1, p2);
    }

    private static void judgeAndPrintWinner(Player p1, Player p2) {
        int p1sum = p1.getHandCardsNumberSum();
        int p2sum = p2.getHandCardsNumberSum();

        if (p1sum > p2sum) {
            System.out.println(p1.getName() + " 승리");
        } else if (p1sum < p2sum) {
            System.out.println(p2.getName() + " 승리");
        } else {
            System.out.println("무승부");
        }
    }

}
