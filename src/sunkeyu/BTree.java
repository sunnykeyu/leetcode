package sunkeyu;

import java.util.Arrays;
import java.util.LinkedList;


public class BTree {
    public static TreeNode createBTree(LinkedList<Integer> list){
        TreeNode treeNode = null;

        if(list == null || list.isEmpty()){
            return null;
        }
        Integer val = list.removeFirst();
        if(val != null ){
            treeNode = new TreeNode(val);
            treeNode.left = createBTree(list);
            treeNode.right = createBTree(list);
        }
        return treeNode;
    }

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,0,11,12,13,22,33,44,55));
        TreeNode treeNode = createBTree(list);
        System.out.println("创建完成");
    }
}
