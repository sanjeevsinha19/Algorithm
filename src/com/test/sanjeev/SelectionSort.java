package com.test.sanjeev;
/*
 * Time Complexity	 
Best	O(n2)
Worst	O(n2)
Average	O(n2)
Space Complexity	O(1)
Stability	No
 */

public class SelectionSort {

	public static void main(String[] args) {
		
		int [] arr = {2,1,8,3,5,2,11,4};
		selectionSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}
	static void selectionSort(int[] arr) {
		int minimum_idx = 0;
	//outer loop n times
		for(int i=0;i<arr.length;i++) {
			minimum_idx=i;
			//inner loop i+1 to n
			for(int j=i+1;j<arr.length;j++) {
				if( arr[minimum_idx]>=arr[j]) {
					minimum_idx = j;
					
				}
			}
		 //swap
			int temp= arr[i];
			arr[i] = arr[minimum_idx];
			arr[minimum_idx] = temp;
			
		}	
	}

}
