import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left, right;
    Node(int item){data=item; left=right=null;}
}
public class Maxheight {
    Node root;

    //max height of a tree (max(depthOfLeftSubtree, depthOfRightSubtree) + 1) time&space complexity is O(N)
    int maxHeight(Node node){
        if(node == null)
            return 0;
        else {
            int ldepth = maxHeight(node.left);
            int rdepth = maxHeight(node.right);

            if (ldepth > rdepth)
                return ldepth+1;
            else
                return rdepth+1;
        }
    }

    //traversing tree using BFS time&space complexity is O(n)
    void traversal(){
         Queue<Node> queue = new LinkedList<>();
         queue.add(root);
         while (!queue.isEmpty()){
             Node tempNode = queue.poll();
             System.out.print(tempNode.data + " ");
             if(tempNode.left != null){
                 queue.add(tempNode.left);
             }
             if(tempNode.right != null){
                 queue.add(tempNode.right);
             }
         }
    }


    public static void main(String[] args) {
    //creating Binary tree
    Maxheight mxhgt= new Maxheight();
    mxhgt.root = new Node(1);
    mxhgt.root.left = new Node(2);
    mxhgt.root.right = new Node(4);
    mxhgt.root.left.left = new Node(3);
    mxhgt.root.left.right = new Node(5);
    mxhgt.root.right.left = new Node(6);
    mxhgt.root.right.left.right = new Node(7);

    mxhgt.traversal();
    System.out.println();
    System.out.println("depth of tree : " + mxhgt.maxHeight(mxhgt.root));


    }
}
