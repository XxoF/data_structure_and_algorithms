
class BST
{
    BTNode root;
    public BST() { root = null; }
    public BST (int key){ root = new BTNode(key);}
    public BTNode insert(BTNode x, Integer key) 
    { 

    }

    public void NLR (BTNode x)
    {

    }

    public void LNR (BTNode x)
    {

    }
    
    public void RNL (BTNode x)
    {

    }



    public static void main(String[] arg)
    {
        String s = "7 36 3 1 6 4 15 40 23 25";
        String[] key = s.split(" ");
        //chuye sang so nguyen
        Integer[] k = new Integer[key.length];
        for(int i = 0; i<k.length; ++i)
            k[i] = Integer.parseInt(key[i]);
        
        BST b = new BST(k[0]);
        for(int i = 1; i<k.length; ++i)
            b.insert(b.root, k[i]);
        b.NLR(b.root);
        System.out.println();

        b.LNR(b.root);
        System.out.println();

        b.RNL(b.root);
        System.out.println();
    
    }

}