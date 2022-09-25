package com.test.sanjeev.sort.recursion;
/*
 * Time Complexity	 
Best	O(n)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
Stability	Yes
 */
public class BubleSort {

	public static void main(String[] args) {
		
		int [] arr = {2,1,8,3,5,2,11,4};
		bubbleSort(arr, arr.length);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}
	 static void bubbleSort(int arr[], int n)
	    {
	        // Base case
	        if (n == 1)
	            return;
	      
	        // One pass of bubble sort. After
	        // this pass, the largest element
	        // is moved (or bubbled) to end.
	        for (int i=0; i<n-1; i++)
	            if (arr[i] > arr[i+1])
	            {
	               swap(arr,i,i +1);
	            }
	      
	        // Largest element is fixed,
	        // recur for remaining array
	        bubbleSort(arr, n-1);
	    }
private static void swap(int [] arr, int i, int j) {
		
		int temp = arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		
	} 
}
