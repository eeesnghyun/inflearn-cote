package string;

import java.util.Scanner;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-08 유효한 팰린드롬
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q08 {

    public static String solution(String str) {
        str = str.toUpperCase().replaceAll("[^A-Z]", "");

        if (str.equals(new StringBuilder(str).reverse().toString())) return "YES";

        return "NO";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();

        System.out.println(solution(str));
    }
}
