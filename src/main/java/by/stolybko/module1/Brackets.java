package by.stolybko.module1;

import java.util.Stack;

public class Brackets {

    public static String correctBrackets(String str) {
        Stack<Character> stack = new Stack<>();
        Stack<Integer> index = new Stack<>();

        int i = 1;

        for (Character ch : str.toCharArray()) {
            if (ch == "(".charAt(0) || ch == "[".charAt(0) || ch == "{".charAt(0)) {

                stack.push(ch);
                index.push(i);

            } else {

                if (ch != ")".charAt(0) && ch != "]".charAt(0) && ch != "}".charAt(0)) {
                    i++;
                    continue;
                }

                if (stack.empty()) return String.valueOf(i);

                Character top = stack.pop();
                index.pop();
                if ((top == "(".charAt(0) && ch != ")".charAt(0)) ||
                        (top == "[".charAt(0) && ch != "]".charAt(0)) ||
                        (top == "{".charAt(0) && ch != "}".charAt(0)))
                    return String.valueOf(i);

            }

            i++;

        }

        if (stack.empty())
            return "Success";
        else {

            return String.valueOf(index.peek());

        }
    }
}
