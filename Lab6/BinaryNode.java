public class BinaryNode{
    
    public Integer key;
    public BinaryNode left,right;

    public BinaryNode(){
        this(null,null,null);
    }
    
    public BinaryNode(Integer key){
        this(key,null,null);
    }

    public BinaryNode(Integer key, BinaryNode left, BinaryNode right){
        this.key = key;
        this.left = left;
        this.right = right;
    }
}