package basic.pack;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        basic.pack.a.User user = new basic.pack.a.User(); // 다른 패키지에 있으면 원래는 풀 네임으로 적어주면 된다.(src 하위 폴더부터)

    }
}
