package com.satya.java.enm;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;



public class EnumTest {
	private enum Week {
		Monday, Tuesday, Wednesday, Thuresday, Friday, Saturday, Sunday;
	}

	private enum Languages {
		JAVA(1), PHTHON(2), PERL(3), SCALA(4);
		private int rank;

		private Languages(int rank) {
			this.rank = rank;
		}

		public int getRank() {
			return rank;
		}
	}

	public static void main(String[] args) {

		System.out.println("Length of week days ::" + Week.values().length);
		System.out.println(Languages.JAVA.getRank());
		System.out.println(StatusEnum.Active.getRank());
		System.out.println(MonthEnum.April.getValue());
		
		EnumMap<Week, String> mp=new EnumMap<Week, String>(Week.class);
		mp.put(Week.Monday, "1");
		mp.put(Week.Tuesday, "2");
		mp.put(Week.Wednesday, "3");
		mp.put(Week.Thuresday, "4");
		mp.put(Week.Friday, "5");
		mp.put(Week.Saturday, "6");
		mp.put(Week.Sunday, "7");
		for(Map.Entry<Week, String> m:mp.entrySet()) {
			System.out.println(m.getKey().name());
		}
		
		List<Integer> list=new ArrayList<Integer>();
		list.add(MonthEnum.January.getValue());
		list.add(MonthEnum.February.getValue());
		list.add(MonthEnum.March.getValue());
		list.add(MonthEnum.April.getValue());
		list.add(MonthEnum.May.getValue());
		list.add(MonthEnum.June.getValue());
		list.add(MonthEnum.July.getValue());
		list.add(MonthEnum.Augest.getValue());
		list.add(MonthEnum.September.getValue());
		list.add(MonthEnum.October.getValue());
		list.add(MonthEnum.November.getValue());
		list.add(MonthEnum.December.getValue());
		
		list.forEach(i->{
			System.out.println(i);
		});
		
		Map<MonthEnum, Integer> m=new TreeMap<MonthEnum, Integer>();
		m.put(MonthEnum.January, MonthEnum.January.getValue());
		m.put(MonthEnum.February, MonthEnum.February.getValue());
		m.put(MonthEnum.March, MonthEnum.March.getValue());
		m.put(MonthEnum.April, MonthEnum.April.getValue());
		m.put(MonthEnum.May, MonthEnum.May.getValue());
		m.put(MonthEnum.June, MonthEnum.June.getValue());
		m.put(MonthEnum.July, MonthEnum.July.getValue());
		m.put(MonthEnum.Augest, MonthEnum.Augest.getValue());
		m.put(MonthEnum.September, MonthEnum.September.getValue());
		m.put(MonthEnum.October, MonthEnum.October.getValue());
		m.put(MonthEnum.November, MonthEnum.November.getValue());
		m.put(MonthEnum.December, MonthEnum.December.getValue());
		
	
		for(Map.Entry<MonthEnum, Integer> s:m.entrySet()) {
			System.out.println("Month Name & value ["+s.getKey()+","+s.getValue()+" ]");
		}
	}

}
