package hashMap;

import java.util.*;
import java.io.*;

/**
 * className      : Q01
 * author         : eeesnghyun
 * date           : 2023/07/09
 * description    : 04-02 아나그램(HashMap)
 *
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/07/09        eeesnghyun        최초 생성
 */
public class Q01 {

    public static void solution(String word1, String word2) {
        String result = "YES";
        Map<Character, Integer> map = new HashMap<>();

        for (char c : word1.toCharArray()) {
            map.put(c, map.get(c) == null ? 1 : map.get(c) + 1);
        }

        for (char c : word2.toCharArray()) {
            map.put(c, map.get(c) == null ? -1 : map.get(c) - 1);
        }

        for (Character c : map.keySet()) {
            if (map.get(c) != 0) {
                result = "NO";
                break;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        solution(st1.nextToken(), st2.nextToken());
    }
}
