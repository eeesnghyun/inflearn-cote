package array;

import java.util.*;

/**
 * className      : Q05
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-05 소수(에라토스테네스 체)
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q05 {

    public static int solution(int cnt) {
        int result = 0;
        boolean arr[] = new boolean[cnt];

        //1은 소수가 아니기 때문에 제외
        for (int i = 1; i < cnt; i++) arr[i] = true;

        //2부터
        for (int i = 2; i < cnt; i++) {
            for (int j = (i * 2) - 1; j < cnt; j = j + i) {
                arr[j] = false;
            }
        }

        for (int i = 0; i < cnt; i++) {
            if (arr[i] == true) result++;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();

        System.out.println(solution(cnt));
    }
}
