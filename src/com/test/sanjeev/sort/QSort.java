package com.test.sanjeev.sort;

import java.util.Random;

public class QSort {

	public static void main(String[] args) {
		
		int [] arr = {2,1,8,3,5,2,11,4};
		
		quickSort(arr);
		for(int i=0;i<arr.length;i++)
			System.out.println(arr[i]);

	}

	

	/*Function to implement the heap sort*/  
	static int []  quickSort(int array[])  
	{  
	
				
		helper(array, 0, array.length-1);
		return array;
	}



	private static void helper(int[] array,  int low, int high) {
		if(low<high) {
			
			int part = partition(array,low,high);
			helper(array, low,part-1);
			helper(array,part+1, high);
			
		}
		
	} 
	static void  random(int arr[],int low,int high) 
    { 
      
        Random rand= new Random(); 
        int pivot = rand.nextInt(high-low)+low; 
          
        int temp1=arr[pivot];  
        arr[pivot]=arr[high]; 
        arr[high]=temp1; 
        
    } 
	static int partitionRandom(int arr[], int low, int high) 
    { 
        // pivot is chosen randomly 
        random(arr,low,high);
        int pivot = arr[high]; 
      
  
        int i = (low-1); // index of smaller element 
        for (int j = low; j < high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
	
	static int partition(int arr[], int low, int high) 
    { 
        // pivot is chosen randomly 
       // random(arr,low,high);
        int pivot = arr[high]; 
      
  
        int i = (low-1); // index of smaller element 
        for (int j = low; j < high; j++) 
        { 
            // If current element is smaller than or 
            // equal to pivot 
            if (arr[j] < pivot) 
            { 
                i++; 
  
                // swap arr[i] and arr[j] 
                int temp = arr[i]; 
                arr[i] = arr[j]; 
                arr[j] = temp; 
            } 
        } 
  
        // swap arr[i+1] and arr[high] (or pivot) 
        int temp = arr[i+1]; 
        arr[i+1] = arr[high]; 
        arr[high] = temp; 
  
        return i+1; 
    } 
	

}
