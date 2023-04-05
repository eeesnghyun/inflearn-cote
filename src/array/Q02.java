package array;

import java.util.*;

/**
 * className      : Q02
 * author         : eeesnghyun
 * date           : 2023/02/27
 * description    : 02-02 보이는 학생
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/27        eeesnghyun        최초 생성
 */
public class Q02 {

    public static int solution(int[] arr) {
        int cnt = 1;
        int max = arr[0];

        for (int num : arr) {
            if (num > max) {
                cnt++;
                max = num;
            }
        }

        return cnt;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(arr));
    }
}
