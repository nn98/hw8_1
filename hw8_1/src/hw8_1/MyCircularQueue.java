package hw8_1;

import java.util.NoSuchElementException;

public class MyCircularQueue {
	int[] array;
	int arrSize=0,instance=0,front=0,rear=0;
	public MyCircularQueue(int size) {
		this.arrSize=size;
		array=new int[arrSize];
	}
	public boolean isEmpty() {
		return instance==0;
	}
	public boolean isFull() {
		return instance==arrSize;
	}
	public void enQueue(int data) {
		if(this.isFull()) System.out.println("Å¥°¡ °¡µæÂü.");
		else {
			rear=instance%arrSize;
			array[instance++]=data;
		}
	}
	public int deQueue() {
		if(this.isEmpty()) throw new NoSuchElementException();
		else {
			int r=array[front++];
			front=front%arrSize;
			instance--;
			return r;
		}
	}
	public int peek() {
		if(this.isEmpty()) throw new NoSuchElementException();
		else return array[front];
	}
	public int size() {
		return instance;
	}
}
