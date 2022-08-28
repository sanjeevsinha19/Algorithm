package com.test.sanjeev.sort;
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
		bubleSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}
	static void bubleSort(int[] arr) {
		for(int i=0;i<arr.length;i++)
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]> arr[j+1]) {
				int temp= arr[j];
				arr[j]= arr[j+1];
				arr[j+1] = temp;
				}
			}
		
				
	}

}
