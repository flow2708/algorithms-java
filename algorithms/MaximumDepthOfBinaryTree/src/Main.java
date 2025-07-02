public class Main {
    public static void main(String[] args) {
        TreeNode tn0 = new TreeNode();
        TreeNode tn1 = new TreeNode();
        TreeNode tn2 = new TreeNode();
        TreeNode tn3 = new TreeNode();
        TreeNode tn4 = new TreeNode();
        TreeNode tn5 = new TreeNode();
        tn0.val = 5;
        tn1.val = 2;
        tn2.val = 3;
        tn3.val = 6;
        tn4.val = 4;
        tn5.val = 7;
        tn0.right = tn1;
        tn0.left = tn2;
        tn2.right = tn3;
        tn1.left = tn4;
        tn4.right = tn5;
        System.out.println(new Main().maxDepth(tn0));
     }
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + Math.max(maxDepth(root.right), maxDepth(root.left));
    }
}