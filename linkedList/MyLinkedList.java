package linkedList;

public interface MyLinkedList<T> {
    void addBeginningList(T data);
    void addEndList(T data);
    void addElementIndex(int index, T data);
    T getElementIndex(int index);
    void removeBeginningList();
    void removeEndList();
    void removeElementIndex(int index);
    int size();
}

