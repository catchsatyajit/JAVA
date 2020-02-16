package com.satya.java.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetDemo {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Tuton");
		list.add("Ankita");
		list.add("Tanushree");
		list.add("Avhi");
		list.add("Sonali");
		list.add("Sonali");
		System.out.println(list);
		list.forEach(System.out::println);
		Set<String> s=new HashSet<String>(list);
		System.out.println(s);
		/*System.out.println("************** Before Convert to SET *************************");
		Set<String> convertListToSet=new TreeSet<String>(list);
		convertListToSet.forEach(System.out::println);
		
		System.out.println("****************************************");
		Set<String> s=new HashSet<String>();
		s.add("satyajit");
		s.add("mitali");
		s.add("barnali");
		s.add("bhupati");
		s.add("rekha");
		s.add("satyajit");
		
		s.addAll(convertListToSet);
		Set<String> s2=new TreeSet<String>(s);
		s2.forEach(System.out::println);*/
		
		Iterator<String> it=s.iterator();
		while(it.hasNext())System.out.println(it.next());

	}

}
