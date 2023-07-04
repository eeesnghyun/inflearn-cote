package array;

import java.util.Scanner;

/**
 * className      : Q11
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-11 임시반장 정하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q11 {

    public static int solution(int cnt, int[][] arr) {
        int result = 0, sum = 0;

        /**
         * 2 3 1 7 3
         * 4 1 9 6 8
         * 5 5 2 4 4
         * 6 5 2 6 7
         * 8 4 2 2 2
         */
        //Loop - 학생 수
        for (int i = 0; i < cnt; i++) {
            //Loop - 1~5학년까지
            for (int j = 0; j < cnt; j++) {
                for (int k = 0; k < 5; k++) {
                    if (arr[i][k] == arr[j][k]) {
                        sum++;
                        break;
                    }
                }
            }

            
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        int[][] arr = new int[cnt][5];

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(solution(cnt, arr));
    }
}
