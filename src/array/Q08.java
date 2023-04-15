package array;

import java.util.*;

/**
 * className      : Q08
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 02-08 등수구하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/04/05        eeesnghyun        최초 생성
 */
public class Q08 {

    public static void solution(ArrayList<Integer> arrayList) {
        int cnt = 1;

        for (int tmp : arrayList) {
            for (int score : arrayList) {
                if (tmp < score) {
                    cnt++;
                }
            }

            System.out.print(cnt + " ");
            cnt = 1;
        }
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int cnt = kb.nextInt();
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            arrayList.add(kb.nextInt());
        }

        solution(arrayList);
    }
}
