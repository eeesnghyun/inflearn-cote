package twoPointers;

import java.util.Scanner;

/**
 * className      : MaxSales
 * author         : eeesnghyun
 * date           : 2023/02/20
 * description    : Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *                  연속된 3일의 최대 매출 구하기
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/20        eeesnghyun        최초 생성
 */
public class MaxSales {

    public static int solution(int n, int k, int[] arr) {
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum = sum + arr[i];
        }

        int result = sum;
        for (int i = k; i < n; i++) {
            sum = sum + arr[i] - arr[i - k];
            if (sum > result) result = sum;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }

        System.out.println(solution(n, k, arr));
    }
}
