package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * className      : Q06
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-06 뒤집은 소수
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q06 {

    private static boolean isPrime(int num) {
        boolean[] arr = new boolean[num];

        //1은 소수가 아니기 때문에 제외
        for (int i = 1; i < num; i++) arr[i] = true;

        //2부터
        for (int i = 2; i < num; i++) {
            for (int j = (i * 2) - 1; j < num; j = j + i) {
                arr[j] = false;
            }
        }

        return arr[num - 1];
    }

    public static ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> resultList = new ArrayList<>();

        for (int number : arr) {
            int tmp = number;
            int res = 0;

            while (tmp > 0) {
                int t = tmp % 10;
                res = res * 10 + t;
                tmp = tmp / 10;
            }

            if (isPrime(res)) resultList.add(res);
        }

        return resultList;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        int[] arr = new int[cnt];

        for (int i = 0; i < cnt; i++) {
            arr[i] = kb.nextInt();
        }

        for (int number : solution(arr)) {
            System.out.printf(number + " ");
        }
    }
}
