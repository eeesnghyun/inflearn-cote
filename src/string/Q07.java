package string;

import java.util.Scanner;

/**
 * className      : Q07
 * author         : eeesnghyun
 * date           : 2023/02/16
 * description    : 01-07 회문 문자열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        eeesnghyun        최초 생성
 */
public class Q07 {

    public static String solution(String str) {
        str = str.toUpperCase();

        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return "NO";
            }
        }

        return "YES";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
