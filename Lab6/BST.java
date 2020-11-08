public class BST{

    public BinaryNode root;

    public BST(){
        this.root = null;
    }

    public BST(BinaryNode root){
        this.root = root;
    }

    public static boolean contains(Integer x, BinaryNode node){

        if (node == null)
            return false;
        
        int cmp = x.compareTo(node.key);

        if(cmp < 0)
            return contains(x, node.left);
        else if (cmp > 0)
            return contains(x, node.right);
        else
            return true;

    }

    public BinaryNode insertRoot(Integer x){
        root = new BinaryNode(x);
        return root;
    }

    public BinaryNode insert(Integer x, BinaryNode node){

        if (root == null){
            return insertRoot(x);
        }
        if (node == null)
            return new BinaryNode(x);
        
        int cmp = x.compareTo(node.key);

        if (cmp < 0)
            node.left = insert(x, node.left);
        else if (cmp > 0)
            node.right = insert(x, node.right);
        else
            node.key = x;
        
        return node;
    }

    public void printLNR(BinaryNode node){
        if (node != null){
            /*
            if(node != null)
                System.out.print("key = " + node.key + ", ");
            if(node.left != null)
                System.out.print("left = " + node.left.key + ", ");
            if(node.right != null)
                System.out.print("right = " + node.right.key);
            System.out.println();
            */
            System.out.print(node.key + " ");
            printLNR(node.left);
            printLNR(node.right);
        }
    }

    public void printLR(BinaryNode node){
        if (node != null){
            printLR(node.left);
            System.out.print(node.key + " ");
            printLR(node.right);
        }
    }

    public void printRL(BinaryNode node){
        if (node != null){
            printRL(node.right);
            System.out.print(node.key + " ");
            printRL(node.left);
        }
    }

    public BinaryNode findMin(BinaryNode node){
        if (node.left == null)
            return node;
        else
            return findMin(node.left);
    }

    public BinaryNode findMax(BinaryNode node){
        if (node.right == null)
            return node;
        else
            return findMax(node.right);
    }

    public BinaryNode remove(Integer x, BinaryNode t){
        /*
        if(t != null)
            System.out.print("key = " + t.key + ", ");
        if(t.left != null)
            System.out.print("left = " + t.left.key + ", ");
        if(t.right != null)
            System.out.print("right = " + t.right.key);
        System.out.println();
        */
        if (t == null)
            return t;
        int cmp = x.compareTo(t.key);
        if(cmp < 0)
            t.left = remove(x,t.left);
        else if (cmp > 0)
            t.right = remove(x,t.right);
        else if (t.left != null & t.right != null){
            findMin(t.right).left = t.left;
            if (root.key == x)
                root = t.right;
            return t.right;
            /*
            t.key = findMin(t.right).key;
            t.right = remove(t.key, t.right);
            */
        }
        else 
            t = (t.left != null) ? t.left : t.right;

        return t;
    }
}