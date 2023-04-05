package twoPointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * className      : CommonArray
 * author         : eeesnghyun
 * date           : 2023/02/20
 * description    : Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *                  공통 원소 구하기
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/20        eeesnghyun        최초 생성
 */
public class CommonArray {

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> numberList = new ArrayList<>();
        int p1 = 0, p2 = 0;

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        while (p1 < n && p2 < m) {
            if (arr1[p1] == arr2[p2]) {
                numberList.add(arr1[p1++]);
                p2++;
            } else {
                if (arr1[p1] < arr2[p2]) {
                    p1++;
                } else {
                    p2++;
                }
            }
        }

        return numberList;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; i++) {
            arr2[i] = kb.nextInt();
        }

        for (int i : solution(n, m, arr1, arr2)) {
            System.out.print(i + " ");
        }
    }
}
