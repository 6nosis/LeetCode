package easy;
// 这么写纯粹因为懒
public class Solution101 {
    private void preOrderTraverse(TreeNode root, StringBuilder str) {
        if (root != null) {
            str.append(root.val);
            preOrderTraverse(root.left, str);
            preOrderTraverse(root.right, str);
        } else {
            str.append('n');
        }
    }

    private void preOrderTraverse2(TreeNode root, StringBuilder str) {
        if (root != null) {
            str.append(root.val);
            preOrderTraverse2(root.right, str);
            preOrderTraverse2(root.left, str);
        } else {
            str.append('n');
        }
    }

    public boolean isSymmetric(TreeNode root) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        preOrderTraverse(root, a);
        preOrderTraverse2(root, b);
        return a.toString().equals(b.toString());
    }
}

// 正解 其实也差不多意思。。
//class Solution {
//    public boolean isSymmetric(TreeNode root) {
//        if(root == null)    return true;
//        else    return isSymmetric(root.left,root.right);
//    }
//    public boolean isSymmetric(TreeNode left,TreeNode right){
//        if(left == null && right == null)   return true;
//        else if(left != null && right != null){
//            if(left.val != right.val)   return false;
//            else return isSymmetric(left.left,right.right) && isSymmetric(left.right,right.left);
//        }
//        else    return false;
//    }
//}
