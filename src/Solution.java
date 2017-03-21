/**
 * Created by Pranith on 3/20/17.
 */import java.util.*;
public class Solution {

    /**Interview bits for the big4*/

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> list=new ArrayList<>();
        if(root==null) return list;

        Stack<TreeNode> stack=new Stack<>();
        stack.push(root);

        while(!stack.empty()){
            TreeNode temp=stack.peek();

            if(temp.left==null && temp.right==null){
                TreeNode item=stack.pop();
                int value=item.val;
                list.add(value);
            }

            if(temp.right!=null){
                stack.push(temp.right);
                temp.right=null;
            }

            if(temp.left!=null){
                stack.push(temp.left);
                temp.left=null;
            }
        }
        return list;
    }
}
