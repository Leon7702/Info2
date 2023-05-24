package Lab07;

public interface Stack<T> {
    void push(T x) throws OverflowException;
    void pop() throws UnderflowException;
    T top() throws UnderflowException;
    boolean isEmpty();
    void makeEmpty();
}