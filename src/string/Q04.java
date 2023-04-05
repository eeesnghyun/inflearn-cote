package string;

import java.util.Scanner;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-04 단어 뒤집기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q04 {

    public static String solution(String[] arr) {
        StringBuilder result = new StringBuilder();
        StringBuffer sb = new StringBuffer();

        for (String word : arr) {
            sb = new StringBuffer(word);
            result.append(sb.reverse() + "\n");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        String[] arr = new String[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.next();
        }

        System.out.println(solution(arr));
    }
}
