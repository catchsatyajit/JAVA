package com.satya.java.colelctions.queue;


import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue<Student> priorityQ = new PriorityQueue<Student>();

		priorityQ.add(new Student(1, "satyajit"));
		priorityQ.add(new Student(5, "anirban"));
		priorityQ.add(new Student(4, "mitali"));
		priorityQ.add(new Student(2, "souvik"));
		priorityQ.add(new Student(6, "deelip"));
		priorityQ.add(new Student(3, "kajol"));

		System.out.println("size of queue ::" + priorityQ.size());
		System.out.println("elements in the queue ::" + priorityQ);

		Iterator<Student> it = priorityQ.iterator();
		while (it.hasNext()) {
			System.out.println("The item of the queue ::" + priorityQ.poll().toString());
		}
		System.out.println("size of queue ::" + priorityQ.size());
	}

}

class Student implements Comparable<Student> {
	private int rank;
	private String name;

	public Student(int rank, String name) {
		this.rank = rank;
		this.name = name;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int compareTo(Student o) {
		if (this.getRank() < o.getRank())
			return -1;
		else if (this.getRank() > o.getRank())
			return 1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return name + "-" + rank;
	}
}