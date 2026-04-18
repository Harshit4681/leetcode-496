import java.util.*;

public class NextGreaterElementDFS {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        Stack<Integer> stack = new Stack<>();
        
        // Build next greater map using DFS-like approach with stack
        for (int num : nums2) {
            while (!stack.isEmpty() && stack.peek() < num) {
                nextGreater.put(stack.pop(), num);
            }
            stack.push(num);
        }
        
        // Build result array
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
    
    // Alternative DFS approach with recursive traversal
    public int[] nextGreaterElementRecursive(int[] nums1, int[] nums2) {
        Map<Integer, Integer> nextGreater = new HashMap<>();
        dfs(nums2, 0, new Stack<>(), nextGreater);
        
        int[] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = nextGreater.getOrDefault(nums1[i], -1);
        }
        
        return result;
    }
    
    private void dfs(int[] nums2, int index, Stack<Integer> stack, Map<Integer, Integer> nextGreater) {
        if (index == nums2.length) {
            return;
        }
        
        int current = nums2[index];
        
        // Pop all smaller elements and map them
        while (!stack.isEmpty() && stack.peek() < current) {
            nextGreater.put(stack.pop(), current);
        }
        
        stack.push(current);
        dfs(nums2, index + 1, stack, nextGreater);
    }
    
    public static void main(String[] args) {
        NextGreaterElementDFS solution = new NextGreaterElementDFS();
        
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        
        System.out.println("Stack-based approach: " + Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
        System.out.println("Recursive DFS approach: " + Arrays.toString(solution.nextGreaterElementRecursive(nums1, nums2)));
    }
}