package DSA_practice.Stack;

import java.util.*;

class NextGreaterElement {

    public static int[] nextGreater(int[] arr) {
        int n = arr.length;
        int[] answer = new int[n];
        Arrays.fill(answer, -1);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && arr[i] > arr[stack.peek()]) {
                answer[stack.pop()] = arr[i];
            }
            stack.push(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 3, 6};
        int[] ans = nextGreater(arr);
        System.out.println(Arrays.toString(ans));
    }
}
