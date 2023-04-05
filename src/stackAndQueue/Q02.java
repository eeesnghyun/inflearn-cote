package stackAndQueue;

import java.util.Scanner;
import java.util.Stack;

/**
 * className      : Q01
 * author         : eeesnghyun
 * date           : 2023/03/14
 * description    : 올바른 괄호
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2023/03/14        eeesnghyun        최초 생성
 */
public class Q02 {
    public static String solution(String text) {
        Stack<Character> stack = new Stack<>();

        for (char x : text.toCharArray()) {
            if (x == '(') {
                stack.push(x);
            } else {
                if (stack.isEmpty()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty() ? "YES" : "NO";
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String text = kb.next();

        System.out.println(solution(text));
    }
}
