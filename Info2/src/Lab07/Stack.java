package Lab07;

public interface Stack {
	void push(Object x) throws OverflowException;
	    void pop() throws Underflow;
	    Object top() throws Underflow;
	    boolean isEmpty();
	    void makeEmpty();
}

