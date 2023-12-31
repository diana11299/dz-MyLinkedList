package list;

public interface MyList<T extends Comparable<T>> extends Iterable<T> {
    void add(T element);

    void delete(T element);

    void delete(int index);

    T get(int index);

    int size();
}
