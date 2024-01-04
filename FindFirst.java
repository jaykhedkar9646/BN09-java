package com.JDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FindFirst {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(15);
		l.add(20);
		l.add(8);
		l.add(19);
		l.add(25);
		l.add(98);
		l.add(32);
		l.add(2);
		l.add(130);
		
		List<Integer> i=l.stream().map(I->I.SIZE).collect(Collectors.toList());
		System.out.println(i);
		List<String> s1=l.stream().map(E->E.toString()).filter(I->I.startsWith("1")).collect(Collectors.toList());
		System.out.println(s1);
	}
}
