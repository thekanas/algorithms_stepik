package by.stolybko.module1;


import java.util.*;

public class HeightTree {

    public static int treeHeight(Integer[] integers) {
        Map<Integer, List<Integer>> tree = new HashMap<>();
        int top = 0;

        int n  = integers.length;
        for (int i = 0; i < n; i++) {
            int parent = integers[i];
            if (parent == -1) {
                top = i;
                continue;
            }
            if (tree.containsKey(parent)) {
                tree.get(parent).add(i);
            } else {
                List<Integer> child = new ArrayList<>();
                child.add(i);
                tree.put(parent, child);
            }
        }
        return treeHeightMap(tree, top);
    }



    public static int treeHeightMap(Map<Integer, List<Integer>> tree, int top) {

        Stack<Integer> stack = new Stack<>();
        int height = 1;
        stack.push(top);

        while (stack.size() != 0) {
            int index = stack.peek();
            if(tree.containsKey(index)) {
                stack.push(tree.get(index).get(0));
                if (height < stack.size()) {
                    height = stack.size();
                }
            }
            else {
                stack.pop();
                tree.get(stack.peek()).remove(0);
                if (tree.get(stack.peek()).size() == 0) {
                    tree.remove(stack.peek());
                    stack.pop();
                }


            }


        }


        return height;
    }


}
