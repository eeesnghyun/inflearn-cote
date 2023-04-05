package string;

import java.util.Scanner;

/**
 * className      : Q01
 * author         : eeesnghyun
 * date           : 2023/02/16
 * description    : 01-01 문자 찾기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        eeesnghyun        최초 생성
 */
public class Q01 {

    public static int solution(String str, char t) {
        int answer = 0;

        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == t) {
                answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();
        char c = kb.next().charAt(0);

        System.out.println(solution(str, c));
    }
}
