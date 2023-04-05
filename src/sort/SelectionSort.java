package sort;

import java.util.Scanner;

/**
 * className      : SelectionSort
 * author         : eeesnghyun
 * date           : 2023/02/16
 * description    : Sorting and Searching(정렬, 이분검색과 결정알고리즘)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/16        eeesnghyun        최초 생성
 */
public class SelectionSort {

    public int[] solution(int n, int[] arr) {
        for (int i = 0; i < n-1; i++) {
            int idx = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[idx]) idx = j;
            }

            int tmp  = arr[i];
            arr[i]   = arr[idx];
            arr[idx] = tmp;
        }

        return arr;
    }

    public static void main(String[] args) {
        SelectionSort T = new SelectionSort();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
        for (int x : T.solution(n, arr)) System.out.print(x + " ");
    }
}
