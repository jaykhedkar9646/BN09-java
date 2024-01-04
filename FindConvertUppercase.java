package com.JDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindConvertUppercase {

	public static void main(String[] args) {
		
		List<String> l=new ArrayList<String>();
		l.add("one");
		l.add("two");
		l.add("three");
		l.add("four");
		l.add("five");
		l.add("six");
		System.out.println(l);
		
		List<String> s1=l.stream().map(S->S.toUpperCase()).collect(Collectors.toList());
		System.out.println(s1);
	}
}
