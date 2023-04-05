package string;

import java.util.Scanner;

/**
 * className      : Q12
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-12 암호
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q12 {

    public static String solution(String str) {
        StringBuilder answer = new StringBuilder();

        int pos = 0, sum = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') sum += Math.pow(2, (6 - pos));

            if ((i+1) % 7 == 0) {
                answer.append((char) sum);
                sum = 0;
                pos = 0;
            } else {
                pos++;
            }
        }

        return answer.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        String str = kb.next();

        System.out.println(solution(str));
    }
}
