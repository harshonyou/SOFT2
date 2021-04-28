package tools;

public interface ISet<E> {

    boolean add(E value);

    void clear();

    boolean contains(E value);

    boolean isEmpty();

    boolean remove(E value);

    int size();
}
