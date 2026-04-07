package mid2.collection.compare.mytest;

public class Card implements Comparable<Card> {
    private Shape shape;
    private int number;

    public Card(Shape shape, int number) {
        this.shape = shape;
        this.number = number;
    }

    @Override
    public int compareTo(Card other) { // 작은 숫자가 먼저, 같은 숫자면 shape.priority 순서
        if (this.number == other.number) {
            Integer otherShapePriority = other.shape.getPriority();
            Integer myShapePriority = this.shape.getPriority();

            return myShapePriority.compareTo(otherShapePriority);
        } else if (this.number > other.number) {
            return 1; //내가 크면 양수
        } else {
            return -1;
        }
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return number + "(" + shape.getSymbol() + ")";
    }
}
