package mid1.enumeration.test.ex1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AuthGradeMain2 {
    public static void main(String[] args) throws IOException {
        OutputView.printGradeInputHeader();
        AuthGrade authGrade = AuthGrade.valueOf(InputView.readGrade());

        OutputView.printGrade(authGrade.name());

        System.out.println("==메뉴 목록==");
        if (authGrade.getLevel() > 0) {
            System.out.println("- 메인 화면");
        }
        if (authGrade.getLevel() > 1) {
            System.out.println("- 이메일 관리 화면");
        }
        if (authGrade.getLevel() > 2) {
            System.out.println("- 관리자 화면");
        }
    }

    private static class InputView {
        private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        private static String readGrade() throws IOException {
            return br.readLine().trim();
        }
    }

    private static class OutputView {
        private static void printGradeInputHeader() {
            System.out.println("당신의 등급을 입력하세요[GUEST, LOGIN, ADMIN]:");
        }

        private static void printGrade(String grade) {
            System.out.println("당신의 등급은 " + grade + "입니다.");
        }
    }
}
