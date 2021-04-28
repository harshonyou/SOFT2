package tools;

import java.util.LinkedList;

public class LinkedListSet<E> implements ISet<E> {

    LinkedList<E> data;

    public LinkedListSet() {
        data = new LinkedList<E>();
    }

    @Override
    public boolean add(E value) {
        try {
            data.add(value);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void clear() {
        data.clear();
    }

    @Override
    public boolean contains(E value) {
        return data.contains(value);
    }

    @Override
    public boolean isEmpty() {
        return data.peekFirst() == null ? true : false;
    }

    @Override
    public boolean remove(E value) {
        return data.remove(value);
    }

    @Override
    public int size() {
        return data.size();
    }
}
