package mid1.enumeration.ref3;

public enum Grade {
    BASIC(10), GOLD(20), DIAMOND(30), VIP(40);

    private final int discountPercent;

    Grade(int discountPercent) { // 어차피 private이다. 외부에서 enum 객체 생성할 수 없게 만들어버리는 것이다.
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }

    // 추가
    public int discount(int price) {
        return price * discountPercent / 100;
    }
}
