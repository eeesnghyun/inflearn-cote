package sort;

import dynamic.ClimbingStairs;

import java.util.*;

/**
 * className      : Point
 * author         : eeesnghyun
 * date           : 2023/03/05
 * description    : 좌표 정렬
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/05        eeesnghyun        최초 생성
 */
class Point implements Comparable<Point> {

    public int x, y;

    Point(int x, int y ) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int compareTo(Point o) {
        if (this.x == o.x) return this.y - o.y;
        else return this.x - o.x;
    }
}

public class CoordinateSort {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        ArrayList<Point> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = kb.nextInt();
            int y = kb.nextInt();

            arr.add(new Point(x, y));
        }

        Collections.sort(arr);

        for (Point o : arr) {
            System.out.println(o.x + " " + o.y);
        }
    }
}
