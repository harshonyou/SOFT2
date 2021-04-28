package tools;

import java.util.LinkedList;

public class LinkedStack<T> implements IStack<T> {

    LinkedList<T> data;

    public LinkedStack() {
        data = new LinkedList<T>();
    }

    @Override
    public boolean isEmpty() {
        return data.peekFirst() == null ? true : false;
    }

    @Override
    public boolean push(T value) {
        try {
            data.add(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public T peek() {
        return data.peekFirst();
    }

    @Override
    public T pop() {
        return data.removeLast();
    }

    public static void main(String[] args) {
        LinkedStack<Integer> ayy = new LinkedStack<>();
        System.out.println(ayy.isEmpty());
        System.out.println(ayy.push(123));
        System.out.println(ayy.peek());
        System.out.println(ayy.pop());
    }
}
