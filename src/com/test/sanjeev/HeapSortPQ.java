package com.test.sanjeev;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * Case	Time Complexity
Best Case	O(n logn)
Average Case	O(n log n)
Worst Case	O(n log n)
 */
public class HeapSortPQ {

	public static void main(String[] args) {
		
		int [] arr = {2,1,8,3,5,2,11,4};
		
		heapSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

	

	/*Function to implement the heap sort*/  
	static int []  heapSort(int array[])  
	{  
		PriorityQueue<Integer> pq = new PriorityQueue<>();
	
		Arrays.stream(array).forEach(element -> pq.add(element));
	
		int i=0;
		while(pq.size()>0) {
			array[i++]= pq.poll();
		}
		return array;
	}  

	

}
