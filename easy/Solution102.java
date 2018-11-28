package easy;

//给定一个二叉树，找出其最大深度。
//
//        二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
//
//        说明: 叶子节点是指没有子节点的节点。
public class Solution102 {

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int deepL = maxDepth(root.left);
        int deepR = maxDepth(root.right);
        return deepL > deepR ? deepL + 1: deepR + 1;
    }

    public static void main(String[] args) {

    }
}
