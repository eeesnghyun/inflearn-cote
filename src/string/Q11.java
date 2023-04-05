package string;

import java.util.Scanner;

/**
 * className      : Q11
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-11 문자열 압축
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q11 {

    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        int cnt = 1;

        for (int i = 0; i < str.length(); i++) {
            if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                cnt++;
            } else {
                result.append(str.charAt(i));
                result.append(cnt);

                cnt = 1;
            }
        }

        return result.toString().replace("1", "");
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
