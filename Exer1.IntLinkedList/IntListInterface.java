import java.util.*;

public interface IntListInterface{

	public boolean isEmpty();
	public int     size();
	public int       getFirst() throws NoSuchElementException; 
	public boolean contains(int item);
	public void    addFirst(int item);
	public boolean addLast(int item);
	public int       removeFirst() throws NoSuchElementException; 
	//public boolean removeAt(int position) throws NoSuchElementException; 
	//public int countOdd();
	//public int searchKey(int key);
	//public boolean checkSorted();
	public void    print();

}
