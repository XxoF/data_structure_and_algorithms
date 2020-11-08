class AVLNode
{
    Integer key;
    AVLNode left, right;
    int height;
    public AVLNode(Integer key) 
    { 
        this.key = key;
        this.height=0;
        this.left = this.right = null; 
    }
}