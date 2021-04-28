package tools;

import java.util.Arrays;

public class ArraySet<E> implements ISet<E> {

    E[] data;
    int top;
    int cap;

    @SuppressWarnings("unchecked")
    public ArraySet(int size) {
        data = (E[]) new Object[size];
        top = 0;
        cap = size - 1;
    }

    @Override
    public boolean add(E value) {
        if (top != cap && !Arrays.asList(data).contains(value)) {
            data[top++] = value;
            return true;
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    @Override
    public void clear() {
        data = (E[]) new Object[cap + 1];
    }

    @Override
    public boolean contains(E value) {
        return Arrays.asList(data).contains(value);
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public boolean remove(E value) {
        if (top <= 0)
            return false;
        top--;
        return true;
    }

    @Override
    public int size() {
        return cap + 1;
    }

    public static void main(String[] args) {
        ArraySet<Integer> ayy = new ArraySet<>(10);
        System.out.println(ayy.add(1001));
        System.out.println(ayy.contains(1001));
        ayy.clear();
        System.out.println(ayy.size());
        ayy.add(101);
        System.out.println(ayy.remove(101));
    }
}
