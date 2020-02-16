package com.satya.java.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class MargingTwoArray {

	public static void main(String[] args) {
		
		Set<Integer> s=new HashSet<Integer>();
		int[] first= {1,2,3,4,5};
		int[] second= {1,7,4,9,5};
		int fln=first.length;
		int sln=second.length;
		int[] result=new int[fln+sln];
		System.out.println(result.length);
		
		System.arraycopy(first, 0, result, 0, fln);
		System.arraycopy(second, 0, result, fln, sln);
		
		System.out.println(Arrays.toString(result));
		for(int i=0;i<result.length;i++) {
			s.add(result[i]);
		}
		System.out.println(s);
		
	}

}
