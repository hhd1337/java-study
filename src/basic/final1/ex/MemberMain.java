package basic.final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("hhd1337", "haedam");
        member.print();
        member.changeData("hhd2337", "wonji");
        member.print();
    }
}
