package Tree;

import java.util.List;
import java.util.Stack;
import java.util.TreeMap;

public class TreeDemo {
    /*
    二叉树:
        普通二叉树:每个节点最多两个孩子
        满二叉树:除了叶子节点,每个节点都有左右两个孩子
        完全二叉树:在树的根节点,从上到下,从左到右一次填满节点形成的二叉树

        前序遍历:根左右
        中序遍历:左根右
        后序遍历:左友根
     */

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    /*递归*/
    public static void preOrderRecur(TreeNode head) {
        /*前序遍历
        if (head == null) {
            return;
        }
        System.out.println(head.val);
        preOrderRecur(head.left);
        preOrderRecur(head.right);*/

        /*中序遍历
        if (head == null) {
            return;
        }
        preOrderRecur(head.left);
        System.out.println(head.val);
        preOrderRecur(head.right);
         */

        /*后序遍历
         if (head == null) {
            return;
        }
        preOrderRecur(head.left);
        preOrderRecur(head.right);
        System.out.println(head.val);
         */
    }

    /*迭代*/
    public static List<Integer> preOrderIteration(TreeNode head){
        if (head == null){
            return null;
        }
        /*前序遍历:先打印根节点,在向栈中压入右孩子和左孩子,判断栈是否为空,不为空则出栈,会以从左到右的顺序打印出来
         */Stack<TreeNode> stack = new Stack<>();
        stack.push(head);
        List<Integer> list = new Stack<>();
        while (!stack.isEmpty()){
            TreeNode node = stack.pop();
            list.add(node.val);
            if (node.right != null){
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
        return list;
        /*中序遍历:先将根节点压入栈中,在判断左子树是否为空,不为空则压入,为空则出栈,
        最后判断右子树是否为空,不为空则压入,再出栈
        TreeNode cur = head;
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.isEmpty() || cur != null){
            while (cur != null){
                stack.push(cur);
                cur = cur.left;
            }
            TreeNode node = stack.pop();
            System.out.println(node.val);
            if (node.right != null){
                cur = cur.right;
            }
        }*/

        /*后序遍历 使用两个栈,一个栈以前序遍历的方式全部压入栈中,最后出栈,则反过来*/
        /*Stack<TreeNode> stack1 = new Stack<>();
        Stack<TreeNode> stack2 = new Stack<>();
        stack1.push(head);
        while (!stack1.isEmpty()){
            TreeNode node = stack1.pop();
            stack2.push(node);
            if (node.left != null){
                stack1.push(node.left);
            }
            if (node.right != null){
                stack1.push(node.right);
            }
        }
        while ( !stack2.isEmpty()){
            System.out.println(stack2.pop().val);
        }*/

    }

}
