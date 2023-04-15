package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * className      : Q07
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-07 점수계산
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q07 {

    public static int solution(ArrayList<Integer> oxList) {
        int result = 0;
        int cnt = 1;

        for (int ox : oxList) {
            if (ox == 0) {
                cnt = 1;
            } else {
                result += ox * cnt;
                cnt++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            arrayList.add(kb.nextInt());
        }

        System.out.println(solution(arrayList));
    }
}
