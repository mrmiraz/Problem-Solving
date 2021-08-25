/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Codec {

   
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        getString(root, sb);
        return sb.toString();
       
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data == "n")return null;
        Queue<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(" ")));
        return getTree(q);
    }
    public TreeNode getTree(Queue<String> q){
        String number = q.poll();
        if(number.equals("n"))return null;
        TreeNode root = new TreeNode(Integer.parseInt(number));
        root.left = getTree(q);
        root.right = getTree(q);
        return root;
    }
    public void getString(TreeNode root, StringBuilder sb){
        if(root == null){
            sb.append("n ");
            return;
        }
        sb.append(root.val+" ");
        getString(root.left, sb);
        getString(root.right, sb);
    }
}

//https://www.youtube.com/watch?v=u4JAi2JJhI8
// Your Codec object will be instantiated and called as such:
// Codec ser = new Codec();
// Codec deser = new Codec();
// TreeNode ans = deser.deserialize(ser.serialize(root));