// Improved Bubble Sort algorithm - written by P.T.K.Trung
public class BubbleSortImproved {
	public static void bubbleSort(int[] a) {
		for (int i = 0; i < a.length-1; i++) {
			boolean isSorted = true;
			for (int j = a.length-1; j>i; j--) {
				if (a[j] < a[j-1]) {
					int temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) return;
			printArray(a);
		}
	}
	public static void bubbleSortLR(int[] a) {
		for (int i = 1; i < a.length; i++) {
			boolean isSorted = true;
			for (int j = 0; j < a.length - i; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					isSorted = false;
				}
			}
			if (isSorted) return;
			printArray(a);
		}
	}
	public static void bubbleSortRL(int[] a) {
		for (int i = a.length-1; i>0;i--) {
			//boolean isSorted = true;
			for (int j = 0; j <i ; j++) {
				if (a[j] > a[j+1]) {
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					//isSorted = false;
				}
			}
			//if (isSorted) return;
			printArray(a);
		}
	}
	public static void printArray(int[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 5,3,4,2,6,1 };

		//printArray(arr);
		bubbleSort(arr);
		//bubbleSortLR(arr);
		//bubbleSortRL(arr);
		//printArray(arr);
	}
}

