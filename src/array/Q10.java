package array;

import java.util.Scanner;

/**
 * className      : Q10
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-10 봉우리
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q10 {

    public static int solution(int cnt, int[][] array) {
        int result = 0;

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                boolean isBig = true;
                int top = 0, left = 0;
                int bottom = 0, right = 0;

                if (i - 1 >= 0) top = array[i-1][j];
                if (j - 1 >= 0) left = array[i][j-1];
                if (i + 1 < cnt) bottom = array[i+1][j];
                if (j + 1 < cnt) right = array[i][j+1];

                if (array[i][j] <= top
                    || array[i][j] <= left
                    || array[i][j] <= bottom
                    || array[i][j] <= right) {
                    isBig = false;
                }

                if (isBig) result++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        int[][] array = new int[cnt][cnt];

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                array[i][j] = kb.nextInt();
            }
        }

        System.out.println(solution(cnt, array));
    }
}
