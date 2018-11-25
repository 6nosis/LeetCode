package easy;

//给定两个二叉树，编写一个函数来检验它们是否相同。如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。

public class Solution100 {
    private void preOrderTraverse(TreeNode root, StringBuilder str) {
        if (root != null) {
            str.append(root.val);
            preOrderTraverse(root.left, str);
            preOrderTraverse(root.right, str);
        } else {
            str.append('n');
        }
    }

    public boolean isSameTree(TreeNode p, TreeNode q) {
        StringBuilder stringBuilderA = new StringBuilder();
        StringBuilder stringBuilderB = new StringBuilder();
        preOrderTraverse(p, stringBuilderA);
        preOrderTraverse(q, stringBuilderB);
        return stringBuilderA.toString().equals(stringBuilderB.toString());
    }
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x;}
}

//class Solution {
//    public boolean isSameTree(TreeNode p, TreeNode q) {
//        if(p == null && q == null){
//            return true;
//        }
//        if(p == null || q == null){
//            return false;
//        }
//        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
//    }
//}