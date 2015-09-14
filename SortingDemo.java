package com.psl.collection;

import java.util.ArrayList;
import java.util.Collections;

public class SortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("Nik");
		arr.add("ANik");
		arr.add("Pik");
		arr.add("aNik");
		
		System.out.println("Before Sorting!");
		System.out.println(arr);
		
		Collections.sort(arr);
		
		System.out.println("After Before Sorting!");
		System.out.println(arr);
		
	}

}
