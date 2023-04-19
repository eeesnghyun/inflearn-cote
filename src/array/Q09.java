package array;

import java.util.*;

/**
 * className      : Q09
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-09 격자판 최대합
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q09 {

    public static int solution(int cnt, int[][] array) {
        int max = 0;

        for (int i = 0; i < cnt; i++) {
            int rowSum = 0;
            int colSum = 0;

            for (int j = 0; j < cnt; j++) {
                rowSum += array[i][j];
                colSum += array[j][i];
            }

            max = Math.max(max, rowSum);
            max = Math.max(max, colSum);
        }

        int sum1 = 0, sum2 = 0;

        for (int i = 0; i < cnt; i++) {
            sum1 += array[i][i];
            sum2 += array[i][cnt - i - 1];
        }

        max = Math.max(max, sum1);
        max = Math.max(max, sum2);

        return max;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        int[][] array = new int[cnt+1][cnt+1];

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                array[i][j] = kb.nextInt();
            }
        }

        System.out.println(solution(cnt, array));
    }
}
