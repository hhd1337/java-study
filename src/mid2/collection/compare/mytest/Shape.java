package mid2.collection.compare.mytest;

public enum Shape {
    SPADE("♠", 1),
    HEART("♥", 2),
    DIAMOND("♦", 3),
    CLUB("♣", 4);

    private final String symbol;
    private final int priority;

    Shape(String symbol, int priority) {
        this.symbol = symbol;
        this.priority = priority;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getPriority() {
        return priority;
    }
}
