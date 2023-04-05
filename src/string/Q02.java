package string;

import java.util.*;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-02 대소문자 변환
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q02 {

    public static String solution(String str) {
        StringBuilder result = new StringBuilder();

        for (char x : str.toCharArray()) {
            //대문자인지 구별
            if (Character.isUpperCase(x)) result.append(String.valueOf(x).toLowerCase());

            //소문자인지 구별
            if (Character.isLowerCase(x)) result.append(String.valueOf(x).toUpperCase());
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
