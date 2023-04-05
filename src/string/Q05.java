package string;

import java.util.Scanner;

/**
 * className      : Q05
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 01-05 특정 문자 뒤집기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q05 {

    public static String solution(String str) {
        char[] arr = str.toCharArray();
        int lt = 0, rt = arr.length - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(arr[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(arr[rt])) {
                rt--;
            } else {
                char tmp = arr[lt];
                arr[lt] = arr[rt];
                arr[rt] = tmp;
                lt++;
                rt--;
            }
        }

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String str = kb.next();

        System.out.println(solution(str));
    }
}
