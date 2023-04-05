package string;

import java.util.Scanner;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-10 가장 짧은 문자거리
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q10 {

    public static String solution(String str, String t) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        String t = kb.next();

        System.out.println(solution(str, t));
    }
}
