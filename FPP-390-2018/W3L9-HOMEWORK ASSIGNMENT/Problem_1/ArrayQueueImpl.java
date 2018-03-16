package Problem_1;

import java.util.Arrays;

public class ArrayQueueImpl {

	private int[] arr = new int[10];
	private int front = -1;
	private int rear = 0;
	
	
	public int peek() {
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
			}
		return arr[front];
	}
	
	public void enqueue(int obj){
		if(front == -1)
			front ++;
		if(isFull())
			resize();
		arr[rear++] = obj;
	}
	private void resize() {
		int[] temp = new int[arr.length *2];
		System.arraycopy(arr, 0, temp, 0, arr.length);
		arr = temp;
	}

	private boolean isFull() {
		return rear == arr.length;
	}

	public int dequeue(){
		if (isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
			
		int first = arr[front];
		front++;
		return first;
	}
	
	public boolean isEmpty(){	
		return (front == -1 || front >= rear);
	}
	
	public int size(){	
		if (isEmpty())
			return 0;
		return rear - front;
	}

	@Override
	public String toString() {
		return "[arr=" + Arrays.toString(arr) + ", front=" + front + ", rear=" + rear + "]";
	}
	
}
