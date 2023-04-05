package dynamic;

import java.util.*;

/**
 * className      : ClimbingStairs
 * author         : eeesnghyun
 * date           : 2023/03/05
 * description    :
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/05        eeesnghyun        최초 생성
 */
public class ClimbingStairs {

    static int[] dy;

    public int solution(int n) {
        dy[1] = 1;
        dy[2] = 2;

        for (int i = 3; i <= n; i++) {
            dy[i] = dy[i-2] + dy[i-1];
        }

        return dy[n];
    }

    public static void main(String[] args) {
        ClimbingStairs T = new ClimbingStairs();

        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();

        dy = new int[n+1];

        System.out.println(T.solution(n));
    }
}
