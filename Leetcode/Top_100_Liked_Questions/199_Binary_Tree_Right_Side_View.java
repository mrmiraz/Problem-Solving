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
// solution with Bfs
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        if(root == null)return result;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            TreeNode curNode = q.peek();
            int size = q.size();
            for(int i = 0; i < size; i++){
                curNode = q.poll();
                if(curNode.left != null)q.add(curNode.left);
                if(curNode.right != null)q.add(curNode.right);
            }
            result.add(curNode.val);
        }
        return result;
    }
}

// solution with dfs
class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new LinkedList<>();
        dfs(root, 1, result);
        return result;
    }
    
    public void dfs(TreeNode root, int depth, List<Integer> list){
        if(root == null)return;
        if(depth > list.size()){
            list.add(root.val);
        }
        dfs(root.right, depth+1, list);
        dfs(root.left, depth+1, list);
    }
}

//https://www.youtube.com/watch?v=d4zLyf32e3I