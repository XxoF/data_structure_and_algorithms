public class test{
    
    public static void main(String[] args) {
        Integer []arr = {5 ,1, 2, 4, 3, 7, 6, 9, 8 };

        BST tree = new BST();

        for(Integer x : arr){
            tree.insert(x,tree.root);
        }

        tree.printLNR(tree.root);
        System.out.println("------");
        /*tree.printLR(tree.root);
        System.out.println();
        tree.printRL(tree.root);
        System.out.println();
        System.out.println("Max = " + tree.findMax(tree.root).key);
        System.out.println("Min = " + tree.findMin(tree.root).key);
        */
        tree.remove(5,tree.root);
        tree.printLNR(tree.root);
        System.out.println();
        /*
        tree.printLR(tree.root);
        System.out.println();
        */
    }
}