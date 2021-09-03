/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return dfs(root, sum) + pathSum(root.left, sum) + pathSum(root.right, sum);
    }

    private int dfs(TreeNode root, int sum) {
        if (root == null) {
            return 0;
        }
        return (root.val == sum ? 1 : 0) + dfs(root.left, sum - root.val) + dfs(root.right, sum - root.val);
    }
}

// HashMap Solution

class Solution {
    
    int total=0;
    public int pathSum(TreeNode root, int sum) {
        if(root == null) return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        helper(root, 0, sum, map);
        return total;
    }
    
    public void helper(TreeNode root, int curSum, int target, HashMap<Integer, Integer> map){
        if(root == null) return;
        curSum += root.val;
        if(map.containsKey(curSum - target)) total += map.get(curSum-target);
        map.put(curSum, map.getOrDefault(curSum, 0)+1);
        helper(root.left, curSum, target, map);
        helper(root.right, curSum, target, map);
        map.put(curSum, map.get(curSum)-1);
    }
}

//https://www.youtube.com/watch?v=uZzvivFkgtM