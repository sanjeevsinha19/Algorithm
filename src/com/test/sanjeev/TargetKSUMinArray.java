package com.test.sanjeev;

import java.util.ArrayList;

public class TargetKSUMinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
	
		
        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
        System.out.print(helper(arr,result,0, 5)); ;
       	}
	
    static Boolean  helper(ArrayList<Integer> arr, ArrayList<ArrayList<Integer>> result, int k,Integer sum){
            for(int i = k; i < arr.size(); i++){
                swap(arr, i, k);
                
                helper(arr,result,  k+1,sum);
                swap(arr, k, i);
            }
            if (k == arr.size() -1){
            	ArrayList<Integer> nset= new ArrayList<Integer>(arr);
            	Integer temp=0;
            	for(Integer i:nset) temp+=i;
            	if(temp==sum) return true;
                result.add(nset);
            }
			return true;
            
           
        }
        
    static void swap(ArrayList<Integer> arr, int k, int i){
        int temp= arr.get(k);
        arr.set(k,arr.get(i));
        arr.set(i,temp);
        
    }
}
