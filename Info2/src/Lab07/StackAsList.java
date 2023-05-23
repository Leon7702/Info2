package Lab07;

public class StackAsList implements Stack{

	class Node {
		Object value;
		Node next;
	}
	
	private Node head;
	
	public StackAsList(Object obj) {
		head = new Node();
		head.value = obj;
		head.next = null;
	}
	
	@Override
	public void push(Object x) throws OverflowException {
		Node newNode = new Node();
		newNode.value = x;		
		Node tmp = new Node();
		tmp.value = head.value;
		head = newNode;
		newNode = tmp;
		head.next = newNode;
	}

	@Override
	public void pop() throws UnderflowException {
		if(head == null) {
			throw new UnderflowException("There is nothing to pop.");
		} else {
			head = head.next;
		}
	}

	@Override
	public Object top() throws UnderflowException {

		return head.value;
	}

	@Override
	public boolean isEmpty() {

		if(head == null) {
			return true;
		} else {
			return false;

		}
	}

	@Override
	public void makeEmpty() {
		head = null;
	}
	
	@Override
	public String toString() {
		
		
		
		return null;
	}

}
