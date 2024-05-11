package binarysearch;

public class SumOfLeftLeaves {
    public static void main(String[] args) {

    }

    public int sumOfLeftLeaves(TreeNode root) {
        int sum = 0;
        postOrderTranversal(root, sum);
        return sum;

    }

    void postOrderTranversal(TreeNode root, int sum) {
        if (root == null) {
            return;
        }

        sumOfLeftLeaves(root.left);
        sum += root.val;

    }
}


