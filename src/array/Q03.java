package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * className      : Q03
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-03 가위 바위 보
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q03 {

    public static void solution(int cnt , int[] a, int[] b) {
        for (int i = 0; i < cnt ; i++) {
            if (a[i] == b[i]) {
                System.out.println("D");
            } else {
                if (a[i] - b[i] == 1 || a[i] - b[i] == -2) {
                    System.out.println("A");
                } else {
                    System.out.println("B");
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        int[] a = new int[cnt];
        int[] b = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            a[i] = kb.nextInt();
        }
        for (int i = 0; i < cnt; i++) {
            b[i] = kb.nextInt();
        }

        solution(cnt, a, b);
    }
}
