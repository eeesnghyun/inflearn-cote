package twoPointers;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * className      : AddTwoArray
 * author         : eeesnghyun
 * date           : 2023/02/20
 * description    : Two pointers, Sliding window[효율성 : O(n^2)-->O(n)]
 *                  오름차순으로 정렬된 두 배열 합치기
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/20        eeesnghyun        최초 생성
 */
public class AddTwoArray {

    public static ArrayList<Integer> solution(int n, int m, int[] arr1, int[] arr2) {
        ArrayList<Integer> numberList = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (arr1[p1] < arr2[p2]) {
                numberList.add(arr1[p1++]);
            } else {
                numberList.add(arr2[p2++]);
            }
        }

        while (p1 < n) {
            numberList.add(arr1[p1++]);
        }
        while (p2 < m) {
            numberList.add(arr2[p2++]);
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
