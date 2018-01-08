package com.my.eight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr = new ArrayList();
		arr.add(6);
		arr.add(9);
		arr.add(-1);
		arr.add(0);
		arr.add(5);
		System.out.println(arr);
		Collections.reverse(arr);
		System.out.println(arr);
		Collections.sort(arr);
		System.out.println(arr);
		
		Collection c = Collections.synchronizedCollection(new ArrayList());
		List list = Collections.synchronizedList(new ArrayList());
		Set set = Collections.synchronizedSet(new HashSet());
		Map  map = Collections.synchronizedMap(new HashMap());
		
		
		
	}

}
