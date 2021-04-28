package tools;

public class AVLSet<E> implements ISet<E>, Comparable<E> {

    class Node {
        E data;
        Node next;

        Node(E data) {
            this.data = data;
            this.next = null;
        }

        Node(E data, Node tail) {
            this.data = data;
            this.next = tail;
        }
    }

    Node top; // index of the top of the stack, 0 if empty

    public AVLSet() {
        top = null;
    }

    @Override
    public boolean add(E value) {
        top = new Node(value, top);
        return true;
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub

    }

    @Override
    public boolean contains(E value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public boolean remove(E value) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int compareTo(E o) {
        // TODO Auto-generated method stub
        return 0;
    }

}
