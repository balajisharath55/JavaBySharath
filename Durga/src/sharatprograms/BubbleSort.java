package sharatprograms;

public class BubbleSort
{
    void bubbleSort(int a[])
    {
        int n = a.length;
        int temp;
        for(int j=0;j<n;j++) {
     	   for(int k=j+1;k<n;k++) {
     		   if(a[j]>a[k]) {
     			   temp=a[j];
     			   a[j]=a[k];
     			   a[k]=temp;
     		   }
     	   }}
        }
 
    /* Prints the array */
    void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
 
    // Driver method to test above
    public static void main(String args[])
    {
        BubbleSort ob = new BubbleSort();
        int a[] = {64, 34, 2, 12, 22, 14, 0};
        ob.bubbleSort(a);
        System.out.println("Sorted array");
        ob.printArray(a);
    }
}

