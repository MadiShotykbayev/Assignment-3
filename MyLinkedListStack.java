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
}