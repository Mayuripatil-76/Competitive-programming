// https://leetcode.com/problems/leaf-similar-trees/?envType=study-plan-v2&envId=leetcode-75
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class LeafSimilarTrees {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>(); 
        List<Integer> list2 = new ArrayList<>();

        getLeafIt(root1 , list1) ;
        getLeafIt(root2 , list2 ) ; 

        return list1.equals(list2) ; 

    }

    public void getLeaf(TreeNode root , List<Integer> list ){
        if(root== null ){
            return ; 
        }
        if(root.left== null && root.right==null){
            list.add(root.val) ; 
            return ; 
        }
        else{
            getLeaf(root.left , list );
            getLeaf(root.right , list ) ; 
        }
    }

    public void getLeafIt(TreeNode root , List<Integer> list ){
        Stack<TreeNode> s = new Stack<TreeNode>() ; 

        TreeNode node = root ; 

        if(root == null ){
            return ; 
        }

        s.push(node) ;
        while(!s.isEmpty()){
            TreeNode temp = s.pop() ; 

            if(temp.left == null && temp.right == null ){
                list.add(temp.val) ; 
            }
            if(temp.right!=null ){
                s.push(temp.right) ; 
            }
            if(temp.left != null ){
                s.push(temp.left) ; 
            }

        } 
    }
}
