package com.satya.java.colelctions.queue;

public class Queue {
	int queue[] = new int[5];
	int size=0;
	int front=0;
	int rear=0;

	public void enQueue(int data) {
		queue[rear] = data;
		rear = rear + 1;
		size = size + 1;
	}
	public void show() {
		System.out.print("Element :");
		for(int i=0;i<size;i++) {
			System.out.print(queue[i]+" ");
		}
	}
}
