// Selection Sort algorithm - written by P.T.K.Trung
public class SelectionSorts2Sides {

	public static void selectionSortRL(int[] a) {
		for (int i = a.length - 1; i >= 1; i--) {
			int index = i; // i is the last item position and
			               // index is the largest element position
			// loop to get the largest element
			for (int j = 0; j < i; j++) {
				if (a[j] > a[index]) 
					index = j; // j is the current largest item
			}
			// Swap the largest item a[index] with the last item a[i]
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			printArray(a);
		}
	}
	public static void selectionSortLR(int[] a) {
		for (int i = 0;i<a.length-1;i++) {
			int index = i; // i is the first item position and
			               // index is the smallest element position
			// loop to get the smallest element
			for (int j = i+1; j < a.length; j++) {
				if (a[j] < a[index]) 
					index = j; // j is the current smallest item
			}
			// Swap the smallest item a[index] with the first item a[i]
			int temp = a[index];
			a[index] = a[i];
			a[i] = temp;
			printArray(a);
		}
	}
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3,1,4,6,2,5};
		//selectionSortLR(arr);
		selectionSortRL(arr);
		//printArray(arr);
	}
}

