package Tree;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode{
    int val;
    TreeNode left, right;
    public TreeNode(){

    }

    public TreeNode(int val){
        this.val = val;
    }
}

public class constructBinaryTree {
    public static TreeNode treeFromInorderPreorder(List<Integer> preOrder, List<Integer> inOrder){
        Map<Integer,Integer> m = new HashMap<>();

        for (int i = 0; i < inOrder.size(); i++) {
            m.put(inOrder.get(i), i);
        }

        // TreeNode root = treeFromInorderPreorder(preOrder, 0, preOrder.size() - 1, inOrder, 0, inOrder.size()-1, m);
        
        return null;
        
    }

    public static TreeNode treeFromInorderPreorder(List<Integer> preOrder, int preStart, int preEnd, List<Integer> inOrder, int inStart, int inEnd, Map<Integer, Integer> m){
        if(preStart > preEnd || inStart > inEnd)
            return null;

        TreeNode root = new TreeNode(preOrder.get(preStart));

        int inRoot = m.get(root.val);
        int numLeft = inRoot - inStart;

        root.left = treeFromInorderPreorder(preOrder, preStart + 1, preStart + numLeft, inOrder, inStart, inRoot - 1, m);
        root.right = treeFromInorderPreorder(preOrder, preStart + numLeft + 1, preEnd, inOrder, inRoot + 1, inEnd, m);
        return root;
    } 
}
