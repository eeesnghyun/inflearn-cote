package string;

import java.util.Scanner;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-03 문장 속 단어
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q03 {

    public static String solution(String str) {
        String arr[] = str.split("\\s");
        String result = arr[0];
        int max = arr[0].length();

        for (String word : arr) {
            if (max < word.length()) {
                max = word.length();
                result = word;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.nextLine();

        System.out.println(solution(str));
    }
}
