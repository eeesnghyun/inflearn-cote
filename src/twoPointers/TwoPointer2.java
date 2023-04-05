package twoPointers;

import java.util.*;

/**
 * className      : TwoPointer2
 * author         : eeesnghyun
 * date           : 2023/02/26
 * description    : Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *                  연속 부분수열
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/26        eeesnghyun        최초 생성
 */
public class TwoPointer2 {

    public static int solution(int n, int m, int[] arr) {
        int result = 0, sum = 0;
        int lPointer = 0, rPointer = 0;

        while (rPointer < n) {
            sum += arr[rPointer];

            if (sum == m) {
                result++;
            }

            while (sum >= m) {
                sum -= arr[lPointer];
                lPointer++;

                if (sum == m) {
                    result++;
                }
            }

            rPointer++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int m = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, m, arr));
    }
}
