package com.JDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindSort {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(20);
		l.add(15);
		l.add(8);
		l.add(49);
		l.add(25);
		l.add(98);
		l.add(15);
		l.add(12);
		l.add(2);
		l.add(98);
		l.add(20);
		System.out.println(l);
		List<Integer>s1=l.stream().sorted().collect(Collectors.toList());
		System.out.println(s1);
	}
}
