import java.util.LinkedList;
import java.util.EmptyStackException;

public class MyLinkedListStack<T> {
    private LinkedList<T> list;

    public MyLinkedListStack() {
        list = new LinkedList<>();
    }
    public void push(T item) {
        list.addFirst(item);
    }
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.removeFirst();
    }
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return list.getFirst();
    }
}