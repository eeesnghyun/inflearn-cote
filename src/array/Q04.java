package array;

import java.util.*;

/**
 * className      : Q04
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-04 피보나치 수열
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q04 {

    public static void solution(int cnt) {
        List<Integer> resultList = new ArrayList<>();
        int number = 1;

        for (int i = 0; i < cnt; i++) {
            if (i > 1) number = resultList.get(i-1) + resultList.get(i-2);

            resultList.add(number);
        }

        for (int num : resultList) System.out.printf(String.valueOf(num) + " ");
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();

        solution(cnt);
    }
}
