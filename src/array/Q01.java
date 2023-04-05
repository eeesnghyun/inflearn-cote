package array;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * className      : Q01
 * author         : eeesnghyun
 * date           : 2023/02/26
 * description    : 02-01 큰 수 출력하기
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/02/26        eeesnghyun        최초 생성
 */
public class Q01 {

    public static ArrayList<Integer> solution(int[] numArr) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(numArr[0]);

        for (int i = 1; i < numArr.length; i++)
            if (numArr[i] > numArr[i-1]) numberList.add(numArr[i]);

        return numberList;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int num = kb.nextInt();
        int[] numArr = new int[num];

        for (int i = 0; i < num; i++) {
            numArr[i] = kb.nextInt();
        }

        for (int i : solution(numArr)) {
            System.out.print(i + " ");
        }
    }
}
