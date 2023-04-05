package twoPointers;

import java.util.*;
/**
 * className      : TwoPointer3
 * author         : eeesnghyun
 * date           : 2023/02/26
 * description    : Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *                  연속된 자연수의 합
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/26        eeesnghyun        최초 생성
 */
public class TwoPointer3 {

    public static int solution(int n) {
        int result = 0, sum = 0;
        int lPointer = 0;

        int m = n / 2 + 1;
        int[] arr = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = i + 1;
        }

        for (int rPointer = 0; rPointer < m; rPointer++) {
            sum += arr[rPointer];

            if (sum == n) result++;

            while (sum >= n) {
                sum -= arr[lPointer++];
                if (sum == n) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();

        System.out.println(solution(n));
    }

}
