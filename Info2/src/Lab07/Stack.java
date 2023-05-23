package Lab07;

public interface Stack {
	void push(Object x) throws OverflowException;
	void pop() throws UnderflowException;
	Object top() throws UnderflowException;
	boolean isEmpty();
	void makeEmpty();
}

