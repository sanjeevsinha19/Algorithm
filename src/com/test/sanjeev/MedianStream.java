package com.test.sanjeev;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianStream {

	public static void main(String[] args) {
		ArrayList<Integer> stream = new ArrayList<Integer>();
	
		stream.add(1);
		stream.add(2);
		stream.add(3);
		stream.add(4);
		stream.add(5);
		System.out.println(online_median(stream));

	}

	static ArrayList<Integer> online_median(ArrayList<Integer> stream) {
		// Write your code here.
		ArrayList<Integer> result = new ArrayList<Integer>();
		ArrayList<Integer> temp = new ArrayList<Integer>();
		if (stream.size() <= 1)
			return stream;
		

		for (Integer s : stream) {

			
			//temp = insertionSort(temp,s);
			 Integer insert =binarySearch(temp,0,temp.size(),s);
			 
			temp.add(insert,s);
			Boolean odd = temp.size() % 2 == 1 ? true : false;
			Integer mid = temp.size() / 2;

			if (odd)
				result.add(temp.get(mid));
			else {
				result.add((temp.get(mid) + temp.get(mid - 1)) / 2);
			}

		}
		return result;
	}
	
	static  ArrayList<Integer> insertionSort(ArrayList<Integer> array, Integer s) {
	    int i, j;
	    	array.add(s);
	        Integer tmp = array.get(array.size()-1);
	        j=array.size()-1;
	        while ((j >0) && (array.get(j - 1) > tmp)) {
	            array.set(j, array.get(j - 1));
	            j--;
	        }
	        array.set(j, tmp);
	   
	    return array;
	}
	
	static Integer binarySearch(ArrayList<Integer> arr, int l, int r, int x)
    {
        if (r>0 && r >= l) {
            int mid = l + (r - l) / 2;
  
            // If the element is present at the
            // middle itself
            if(mid==0 && arr.get(mid)> x) 
            	return mid;
            else 
            	if(mid==0 && arr.get(mid)<=x )
            		return mid+1;
            if(mid >= arr.size()) return mid;
            
            if (arr.get(mid)> x-1 && arr.get(mid-1)<x )
                return mid;
  
            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr.get(mid) > x)
                return binarySearch(arr, l, mid - 1, x);
  
            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
  
        // We reach here when element is not present
        // in array
        return 0;
    }

}
