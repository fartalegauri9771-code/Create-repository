import java.util.*;

class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

class Solution7 {

    private int postIndex;
    private Map<Integer, Integer> inorderMap;

    public TreeNode buildTree(int[] inorder, int[] postorder) {

        postIndex = postorder.length - 1;

        inorderMap = new HashMap<>();

        for (int i = 0; i < inorder.length; i++) {
            inorderMap.put(inorder[i], i);
        }

        return build(postorder, 0, inorder.length - 1);
    }

    private TreeNode build(int[] postorder, int left, int right) {

        if (left > right) {
            return null;
        }

        int rootValue = postorder[postIndex--];

        TreeNode root = new TreeNode(rootValue);

        int mid = inorderMap.get(rootValue);

    
        root.right = build(postorder, mid + 1, right);

    
        root.left = build(postorder, left, mid - 1);

        return root;
    }

   
    public void printInorder(TreeNode root) {

        if (root == null) {
            return;
        }

        printInorder(root.left);

        System.out.print(root.val + " ");

        printInorder(root.right);
    }

    public static void main(String[] args) {

        Solution7 obj = new Solution7();

        int[] inorder = {9, 3, 15, 20, 7};

        int[] postorder = {9, 15, 7, 20, 3};

        TreeNode root = obj.buildTree(inorder, postorder);

        System.out.println("Inorder traversal of constructed tree:");

        obj.printInorder(root);
    }
}