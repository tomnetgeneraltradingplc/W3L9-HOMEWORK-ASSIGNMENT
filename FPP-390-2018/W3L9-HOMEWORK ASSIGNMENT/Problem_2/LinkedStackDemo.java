package Problem_2;

interface Stack1 {
	public void push(int item);

	public Object pop();

	public int peek();

	public boolean isEmpty();

	public int size();
}
//Singly Linked List Implementation of Stack
class Node1 {
	int data; // data item
	Node1 next; // next node in linked-stack

	Node1(int d) // constructor
	{
		data = d;
	} 
}
class LinkedStack   implements Stack1 {
	int count;
	Node1 top; // top refers to top-node
	Node1 p; // p refers to current node
	
	public void push(int item) // add item onto stack
	{
		p = new Node1(item); // create new node
		p.next = top; // new node refers to old top
		top = p; // top refers to new node
		count++;
		
		System.out.println(top.data);
	}

	public Node1 pop() // remove a node from the stack
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return null;
		}
		Node1 tmp = top; // tmp saves reference to top node
		top = tmp.next; // now, top refers to next node of old top
		System.out.println(top.data);
		count--;
		return tmp; // return the popped item
	}

	public int peek() // get top node from the stack, without deleting
	{
		if (isEmpty()) {
			System.out.println("Stack is empty");
			return 0;
		}
		return top.data;
	}

	public void displayStack() {
		p = top; // p refers to top
		System.out.print("\nContents of Stack: [ ");
		while (p != null) // start printing from top of stack to bottom of stack
		{
			System.out.print(p.data + " "); // print data
			p = p.next; // move to next node
		}
		System.out.println("]");
	}

	public boolean isEmpty() // true if stack is empty
	{
		return (top == null);
	}
	public int size(){
		return count;
	}
}

public class LinkedStackDemo {

	public static void main(String[] args) {
		LinkedStack stk = new LinkedStack(); // create stack object
		Node1 item; // item stores popped node
		stk.push(10); // add three value
		stk.push(20);
		stk.push(30);
		stk.displayStack(); // print element of stack
		item = stk.pop(); // remove node and print 
		if (item != null) {
			System.out.println("Popped item: " + item.data);
			stk.displayStack();
		}
		stk.push(50); // insert three value
		stk.push(65);
		stk.push(80);
		stk.displayStack(); // display contents of stack
		System.out.println("Size of the Stack :" + stk.size());
		item = stk.pop(); // remove node and print
		if (item != null) {
			System.out.println("Popped item: " + item.data);
			stk.displayStack();
		}
		System.out.println("peek(): " + stk.peek());// get top item
		stk.push(100); // insert 100
		stk.displayStack();
		System.out.println("Size of the Stack :" + stk.size());
		System.out.println("Is the Stack Empty :" + stk.isEmpty());
	}

}
/*Output
10
20
30

Contents of Stack: [ 30 20 10 ]
20
Popped item: 30

Contents of Stack: [ 20 10 ]
50
65
80

Contents of Stack: [ 80 65 50 20 10 ]
Size of the Stack :5
65
Popped item: 80

Contents of Stack: [ 65 50 20 10 ]
peek(): 65
100

Contents of Stack: [ 100 65 50 20 10 ]
Size of the Stack :5
Is the Stack Empty :false
*/