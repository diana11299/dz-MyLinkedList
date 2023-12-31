import linkedList.MyLinked;
import linkedList.MyLinkedList;
import list.MyArrayList;
import list.MyList;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyArrayList<>();
        list.add("2");
        list.add("30");
        list.add("20");
        list.add("ggr");
        System.out.println(list.get(1));
        list.delete(0);
        System.out.println(list);


        MyLinkedList<Integer> myList = new MyLinked<>();

        myList.addBeginningList(5);
        myList.addBeginningList(7);
        myList.addBeginningList(9);
        myList.addBeginningList(1);
        myList.addEndList(100);
        myList.addElementIndex(1, 555);
        myList.removeElementIndex(2);


        System.out.println("Size: " + myList.size());
        System.out.println("Element at index 1: " + myList.getElementIndex(1));

        myList.removeBeginningList();
        myList.removeEndList();

        System.out.println("Size after removals: " + myList.size());
        System.out.println(myList);
    }
}