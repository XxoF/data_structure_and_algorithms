class AVL
{
    AVLNode root;
    public AVL(){ 

    }
    public AVL (int key){ 
        
    }
    private int height(AVLNode node){

    }
    // A utility function to get maximum of two integers 
	private int max(int a, int b) { 
		return (a > b) ? a : b; 
	} 
    // Get Balance factor of node N 
    public int checkBalance(AVLNode x){

    }

    private AVLNode rotateLeft(AVLNode x){
        //Based on Lecture
        //AVLNode y = x.right; 
		//AVLNode T2 = y.left; 
		// Perform rotation 
		//y.left = x; 
        //x.right = T2; 
        //Based on Lab guides
        AVLNode y = x.right; 
        x.right=y.left;
        y.left=x;
        x.height=1+max(height(x.left),height(x.right));
        y.height=1+max(height(y.left),height(y.right));
        return y;
    }
    private AVLNode rotateRight(AVLNode y){
        //Should be same with rotateLeft
    }
    //Create a BST 
    public AVLNode insertBST(AVLNode node, Integer key){ 
        /* 1. Perform the normal BST insertion */
        if (node == null)
            return new AVLNode(key);
        int cmp = key.compareTo(node.key); 
        if (cmp < 0)
            node.left = insertBST(node.left, key); 
        else if (cmp > 0)
            node.right = insertBST(node.right , key);
        else //Duplicated key not allowed
            node.key=key;
        return node; 
    } 
    //Create a AVL Tree
    public AVLNode insertAVL(AVLNode node, Integer key){ 
        /* 1. Perform the normal BST insertion */
 
        /* 2. Update height of this ancestor node */

		/* 3. Get the balance factor of this ancestor node to check whether this node became unbalanced */
         

        
        return node;
    }

    public void NLR (AVLNode x)
    {
        if (x != null)
        {
            System.out.print (x.key + "  ");
            NLR(x.left);
            NLR(x.right);
        }
    }
    public static void main(String[] arg)
    {
         int[] k= {10, 20, 30, 40, 50, 25};
        AVL b=new AVL(k[0]);
        for(int i = 1; i<k.length; ++i)
            b.insertBST(b.root, k[i]);
        b.NLR(b.root);
        System.out.println();
        System.out.println("BST");
        b.NLR(b.root);
        System.out.println();
        
        //Create a AVL Tree
        AVL avlTree=new AVL(k[0]);
        for (int i = 1; i<k.length; ++i){
            avlTree.root=avlTree.insertAVL(avlTree.root,k[i]);
        }
        System.out.println("AVL Tree");
        avlTree.NLR(avlTree.root);
 
        /* Other way to create each node of AVL
        AVL tree=new AVL();
        tree.root = tree.insert(tree.root, 10); 
		tree.root = tree.insert(tree.root, 20); 
		tree.root = tree.insert(tree.root, 30); 
		tree.root = tree.insert(tree.root, 40); 
		tree.root = tree.insert(tree.root, 50); 
		tree.root = tree.insert(tree.root, 25); 
        tree.NLR(tree.root);
        */
    }

}