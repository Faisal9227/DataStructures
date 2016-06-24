import java.util.Stack;

class Queue {

	Stack<Integer> stk1 = new Stack<Integer>();
	Stack<Integer> stk2 = new Stack<Integer>();

	public void enqueue(int data) {

		while (!stk1.isEmpty())
			stk2.push(stk1.pop());
	
		stk1.push(data);
		
		while (!stk2.isEmpty())
			stk1.push(stk2.pop());
		
	}

	public int dequeue() {

		return stk1.pop();

	}
	
	public boolean isEmpty() {

		if (stk1.isEmpty()) {

			return true;

		}

		return false;

	}

}

public class QueueUsingStack {

	public static void main(String args[]) {

		Queue queue = new Queue();

		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.enqueue(5);
		queue.enqueue(6);
		queue.enqueue(7);
		queue.enqueue(8);

		while (!queue.isEmpty()) {

			System.out.println(queue.dequeue());

		}

	}

}
