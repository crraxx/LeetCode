package Tree;

import com.sun.deploy.net.MessageHeader;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class ThreeOrders {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
    }


    public int[][] threeOrders(TreeNode root) {
        int[][] res = new int[3][];
        res[0] = toIntArray(preOrder(root));
        res[1] = toIntArray(postOrder(root));
        res[2] = toIntArray(inOrder(root));
        return res;
    }

    int[] toIntArray(List<Integer> list) {
        int[] res = list.stream().mapToInt(Integer::intValue).toArray();
        return res;
    }

    List<Integer> preOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while (!stack.isEmpty()) {
            TreeNode node = root;
            list.add(node.val);
            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        return list;
    }

    List<Integer> postOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
        while (!stack.isEmpty() || cur != null) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null) {
                cur = node.right;
            }
        }
        return list;
    }

    List<Integer> inOrder(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(root);
        while (!stack1.isEmpty()) {
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null) {
                stack1.push(node.left);
            }
            if (node.right != null) {
                stack1.push(node.right);
            }
        }
        while (!stack2.isEmpty()) {
            list.add(stack2.pop().val);
        }
        return list;
    }
}
