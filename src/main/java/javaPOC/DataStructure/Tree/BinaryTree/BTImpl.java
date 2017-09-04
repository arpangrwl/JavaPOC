package javaPOC.DataStructure.Tree.BinaryTree;

/**
 * Created by Arpan on 8/30/17.
 */
public class BTImpl {

    BinaryTree root;

    void insert(int value){
        BinaryTree temp = new BinaryTree(value);

        if(root == null)
        {
            root = temp;
            return ;
        }
        else {
            BinaryTree focus = root;

            while (true) {
                if (value > focus.data) {

                    focus = focus.right;

                    if(focus == null){
                        focus = temp;
                        return ;
                    }
                }
                else if(value < focus.data){
                    focus = focus.left;

                    if(focus == null){
                        focus = temp;
                        return ;
                    }
                }
            }
        }
    }

}
