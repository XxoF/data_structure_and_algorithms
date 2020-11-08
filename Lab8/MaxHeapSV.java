import java.util.*;
public class MaxHeapSV{
    int[] heap;
    int heapSize;
    int maxSize; // maximum size to initialize an heap array
    public MaxHeapSV(int capity){
        heapSize = 0;
        this.maxSize = capity + 1;
        heap = new int[maxSize+1];
        heap [0] = -1;
    }
    // Returns position of parent 
    private int parent(int pos) 
    { 
        return pos / 2; 
    } 
  
    // Below two functions return left and right children. 
    private int left(int pos) 
    { 
        
    } 
    private int right(int pos) 
    { 
         
    } 
	//Swap 2 keys
    private void swap(int fpos, int spos) 
    { 
        int tmp; 
        tmp = heap[fpos]; 
        heap[fpos] = heap[spos]; 
        heap[spos] = tmp; 
    } 
    public void insert(int key){
        if(heapSize == maxSize){
            throw new NoSuchElementException("Overflow Exception"); //Remember to import java.util.NoSuchElementException;
        }
        heapSize += 1;
        heap[heapSize] = key;
        
        shiftUp(heapSize);
    }
    private void shiftUp(int i){

    }
    public int extractMax(){

    }
    private void shiftDown(int i){

    }
    public void print() 
    { 
        for (int i = 1; i <= heapSize / 2; i++) { 
            System.out.print(" Parent : " + heap[i] + " Left Child : " + 
                      heap[2 * i] + " Right Child :" + heap[2 * i + 1]); 
            System.out.println(); 
        } 
    }
	/*
    public void displayArray(int[] a){
        for(int j=0; j<a.length; j++)
        System.out.print(a[j] + " ");
        System.out.println("");
    }
    public void displayHeapArray(){
        for(int i=1;i<=heapSize;i++){
            System.out.print("Heap ["+ i + "]=" + heap[i]+ ", ");
        }
        System.out.println();
    }
	*/
    public static void main(String[] args) {
        //int[] intArr={15, 23, 18, 63, 21, 35, 36, 21, 66, 12, 42, 35, 75, 23, 64, 78, 39};
        int[] intArr={10,20,30,40,50,25};
        MaxHeapSV maxHeap = new MaxHeapSV(intArr.length); 
        for(int i=0;i<intArr.length;i++){
            maxHeap.insert(intArr[i]);
        }
        //System.out.print("List of number : ");
        //maxHeap.displayArray(intArr);
        //System.out.print("List of maxheap array : ");
        //maxHeap.displayHeapArray();
        System.out.println("MaxHeap Tree "); 
        maxHeap.print(); 
        System.out.println("The max val is " + maxHeap.extractMax()); 
        maxHeap.print(); 
    }
}