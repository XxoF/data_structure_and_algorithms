public class Sort{

    public static void selectionSort(int[] a){
        for(int i = a.length-1; i>=1;--i){
            int index = i;

            for(int j = 0; j < i;++j){
                if(a[j] > a[index])
                    index = j;
            }

            int temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }

    public static void bubbleSort(int[] a){
        for(int i = 1; i < a.length; ++i){
            for (int j = 0; j < a.length-i;++j){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static void insertSort(int[] a){
        for(int i = 1; i<a.length;++i){
            int next = a[i];
            int j;
            for(j = i-1; j>=0 && a[j] > next;--j){
                a[j+1]=a[j];
            }
            a[j+1] = next;
        }
    }

    public static void mergeSort(int[] a, int i, int j){
        if(i<j){
            int mid = (i+j)/2;
            mergeSort(a, i, mid);
            mergeSort(a, mid+1, j);
            merge(a,i,mid,j);
        }
    }

    public static void merge(int[] a, int i, int mid, int j){
        int[] temp = new int[j-i+1];
        int left = i, right = mid+1, it = 0;

        while(left<= mid && right <= j){
            if(a[left] <= a[right])
                temp[it++] = a[left++];
            else
                temp[it++] = a[right++];
        }

        while(left<=mid) temp[it++] = a[left++];
        while(right<=j) temp[it++] = a[right++];

        for(int k = 0; k < temp.length;++k)
            a[i+k] = temp[k];
    }

    public static void quickSort(int[] a, int i, int j){
        if(i<j){
            int pivotIdx = partition(a,i,j);
            quickSort(a, i, pivotIdx-1);
            quickSort(a, pivotIdx+1, j);
        }
    }

    public static void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static int partition(int[] a, int i , int j){
        int p = a[i];
        int m = i;
        for(int k = i + 1; k<=j;++k){
            if(a[k] < p){
                m++;
                swap(a,k,m);
            }
            else{

            }
        }
        swap(a, i, m);
        return m;
    }
    public static void main(String[] args) {
        int[] a = new int[] {7,1,2,5,4,9,3,8,6};
        int[] b = new int[] {7,1,2,5,4,9,3,8,6};
        int[] c = new int[] {7,1,2,5,4,9,3,8,6};
        int[] d = new int[] {7,1,2,5,4,9,3,8,6};
        int[] e = new int[] {7,1,2,5,4,9,3,8,6};


        Sort.selectionSort(a);
        for(int i = 0; i<a.length;++i){
            System.out.print(a[i] + " ");
        }
        System.out.println();
/////////////////////////////////////////////
        Sort.bubbleSort(b);
        for(int i = 0; i<b.length;++i){
            System.out.print(b[i] + " ");
        }
        System.out.println();
/////////////////////////////////////////////

        Sort.insertSort(c);
        for(int i = 0; i<c.length;++i){
            System.out.print(c[i] + " ");
        }
        System.out.println();
/////////////////////////////////////////////
        Sort.mergeSort(d, 0, d.length-1);
        for(int i = 0; i<d.length;++i){
            System.out.print(d[i] + " ");
        }
        System.out.println();

        /////////////////////////////////////////////
        Sort.quickSort(e, 0, e.length-1);
        for(int i = 0; i<e.length;++i){
            System.out.print(e[i] + " ");
        }
        System.out.println();
    }

}
