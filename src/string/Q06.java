package string;

import java.util.Scanner;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-06 중복문자제거
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q06 {

    public static String solution(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) result += str.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
