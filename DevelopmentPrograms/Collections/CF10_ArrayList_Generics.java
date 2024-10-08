package com.evergent.CoreJava.Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class CF10_ArrayList_Generics {
	public static void main(String[] args) {
		
		ArrayList<Integer> myList = new ArrayList<>();
		myList.add(100);
		myList.add(59);
		myList.add(10);
		myList.add(300);
		
		System.out.println(myList);
		
		Iterator i = myList.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		for(Integer w:myList) {
			System.out.println(w);
		}
	}
}
