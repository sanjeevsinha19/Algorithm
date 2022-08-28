package com.test.sanjeev.sort;
/*
Case	Time Complexity
Best Case
O(n)
Average Case
O(n2)
Worst Case
O(n2)
Best Case Complexity - It occurs when there is no sorting required, i.e. the array is already sorted. The best-case time complexity of insertion sort is O(n).
Average Case Complexity - It occurs when the array elements are in jumbled order that is not properly ascending and not properly descending. The average case time complexity of insertion sort is O(n2).
Worst Case Complexity - It occurs when the array elements are required to be sorted in reverse order. That means suppose you have to sort the array elements in ascending order, but its elements are in descending order. The worst-case time complexity of insertion sort is O(n2).
2. Space Complexity
Space Complexity
O(1)
Stable
YES


 */
public class RadixSort {

	public static void main(String[] args) {
		
		int [] arr = {2,1,8,3,5,2,11,4};
		radixSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

	static void radixSort(int[] arr) {

		/*radixSort(arr)  
		max = largest element in the given array  
		d = number of digits in the largest element (or, max)  
		Now, create d buckets of size 0 - 9  
		for i -> 0 to d  
		sort the array elements using counting sort (or any stable sort) according to the digits at  
		the ith place  */

		for (int i = 1; i < arr.length; i++) {
			
				int k = i-1; //start from zero index
				int key = arr[i];//set current to key
				while (k >= 0 && arr[k]>=key) //k index should not be less than 0, and arr[k] shouls be greater than or equal to key
				{//keep shifting cell to right
					arr[k+1]=arr[k];
					k--;
					
				}
				//since cell shifted one extra hence putting key into  arr[k+1] 
				arr[k+1]=key;
				

			}
		}

	

}
