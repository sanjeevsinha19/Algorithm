package com.test.sanjeev;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class TopKElementsStream {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
		
		FileReader reader = new FileReader("input007.txt");

        JSONParser parser = new JSONParser();
       JSONObject jsonObject = (JSONObject) parser.parse(reader);
       
       JSONArray input = (JSONArray) jsonObject.get("initial_stream");
       JSONArray append = (JSONArray) jsonObject.get("append_stream");
       
       ArrayList<Integer> iList = new ArrayList<Integer>();
       ArrayList<Integer> aList = new ArrayList<Integer>();
       
       for(int i=0; i<input.size();i++) {
    	   Integer temp= Integer.parseInt(input.get(i).toString());
       		iList.add( temp);
       }
       	
       	for(int i=0; i<append.size();i++){
     	   Integer temp= Integer.parseInt(append.get(i).toString());
      		aList.add( temp);
      }
       
       
       String  k =   jsonObject.get("k").toString();
       Integer s= Integer.parseInt(k);

		
		System.out.print(kth_largest( s,iList,aList));
		
	}

	 static ArrayList<Integer> kth_largest(Integer k, ArrayList<Integer> initial_stream, ArrayList<Integer> append_stream) {
	        // Write your code here.
			ArrayList<Integer> result = new ArrayList<Integer>();

			PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> a - b);

			// initial stream
			for (Integer i : initial_stream) {
				
				if (pq.size() < k + 1)
					pq.add(i);
				else {
					if (i > pq.peek()) {
						pq.remove();
						pq.add(i);
						 Object[] tempArray = pq.toArray();
						 Integer o= Integer.parseInt(tempArray[0].toString());

					}
					//Integer temp = pq.poll();
					//result.add(pq.peek());
					//pq.add(temp);
				}
			}

			for (Integer j : append_stream) {
				if (pq.size() < k + 1) {
					pq.add(j);

				} else {
					if (j > pq.peek()) {
						pq.remove();
						pq.add(j);

					}

				}
				if(pq.size()> k) {
				Integer temp = pq.poll();
				result.add(pq.peek());
				pq.add(temp);
				}
				else if(pq.size()==k)
					result.add(pq.peek());
				

			}
			return result;
		}
	}


