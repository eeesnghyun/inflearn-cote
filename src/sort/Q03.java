package sort;

import java.io.*;
import java.util.*;

/**
 * className      : Q03
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 03-03 삽입 정렬
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q03 {

    public static void solution(int num, int[] arr) {
        for (int i = 1; i < num; i++) {
            int tmp = arr[i];
            int j = 0;

            for (j = i - 1; j >= 0; j--) {
                if (arr[j] > tmp)
                    arr[j+1] = arr[j];
                else
                    break;
            }

            arr[j+1] = tmp;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }

    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str1 = new StringTokenizer(br.readLine());
        StringTokenizer str2 = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(str1.nextToken());
        int arr[] = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = Integer.parseInt(str2.nextToken());
        }

        solution(num, arr);
    }

}
