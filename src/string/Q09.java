package string;

import java.util.Scanner;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-09 숫자만 추출
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q09 {

    public static int solution(String str) {
        StringBuilder result = new StringBuilder();

        for (char word : str.toCharArray()) {
            if (Character.isDigit(word)) {
                result.append(word);
            }
        }

        return Integer.parseInt(result.toString());
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
