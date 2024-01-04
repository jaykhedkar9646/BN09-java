package com.JDK8;

import java.util.*;
import java.util.stream.Collectors;

public class FindEven {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(10);
		l.add(15);
		l.add(8);
		l.add(49);
		l.add(25);
		l.add(98);
		l.add(32);
		l.add(2);
		l.add(30);
		
		System.out.println(l);
		
		List<Integer> s1=l.stream().filter(I->I%2==0).collect(Collectors.toList());
		
		System.out.println(s1);
	}
}
