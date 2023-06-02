import java.util.Scanner;

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

public class SquareTrees {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the elements of tree P in level order, separated by spaces:");
        TreeNode pRoot = constructTree(input);

        System.out.println("Enter the elements of tree Q in level order, separated by spaces:");
        TreeNode qRoot = constructTree(input);

        boolean areSquareTrees = isSquareTree(pRoot, qRoot);
        System.out.println("The trees are square trees: " + areSquareTrees);
    }

    public static boolean isSquareTree(TreeNode p, TreeNode q) {
       
        if (p == null && q == null) {
            return true;
        }

       
        if (p == null || q == null) {
            return false;
        }

       
        if (p.val * p.val == q.val && q.val * q.val == p.val) {
           
            return isSquareTree(p.left, q.left) && isSquareTree(p.right, q.right);
        }

       
        return false;
    }

    public static TreeNode constructTree(Scanner input) {
       
        String[] nodes = input.nextLine().split(" ");
        int index = 0;
        TreeNode root = null;
        if (!nodes[0].equals("null")) {
            root = new TreeNode(Integer.parseInt(nodes[0]));
        }
        index++;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (index < nodes.length && !queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (!nodes[index].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(node.left);
            }
            index++;
            if (index < nodes.length && !nodes[index].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(nodes[index]));
                queue.offer(node.right);
            }
            index++;
        }
        return root;
    }
}