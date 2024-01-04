package com.JDK8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindCubeAndFilter {

	public static void main(String[] args) {
		
		List<Integer> l=new ArrayList<Integer>();
		l.add(2);
		l.add(5);
		l.add(6);
		l.add(4);
		l.add(8);
		l.add(3);
		l.add(1);
		l.add(7);
		System.out.println(l);
		
		
		List<Integer>s1=l.stream().map(F->F*F*F).filter(I->I>50).collect(Collectors.toList());
		System.out.println(s1);
		
	}
}
