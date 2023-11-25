class Nodes{
    int data;
    Nodes left,right;
    Nodes(int item){
        data=item;
        left=right=null;
    }
}
public class Traversal {
    Nodes root;
     void inOrder(Nodes root) {
        if(root == null)
            return;
         inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    void preOrder(Nodes root){
         if (root == null)
             return;
        System.out.print(root.data + " ");
         preOrder(root.left);
         preOrder(root.right);
    }

    void postOrder(Nodes root){
        if (root == null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");

    }


    public static void main(String[] args) {
        Traversal trs = new Traversal();
        trs.root = new Nodes(1);
        trs.root.left = new Nodes(2);
        trs.root.right = new Nodes(3);
        trs.root.left.left = new Nodes(4);
        trs.root.left.right = new Nodes(5);
        trs.root.right.left = new Nodes(6);
        trs.root.right.right = new Nodes(7);

        System.out.print("InOrder Traversal : ");
        trs.inOrder(trs.root);
        System.out.println();
        System.out.print("PreOrder Traversal : ");
        trs.preOrder(trs.root);
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        trs.postOrder(trs.root);
    }
}
