package labb6;

import java.util.*;
import java.util.Random.*;

public class BuilderList<E> implements List<E> {

    private List<E> addList = new LinkedList<E>();
    private List<E> getList = new ArrayList<E>();
    private boolean isLinked = true;
    private Random rand = new Random();

    @Override
    public void add(int index, E element) {
        if (!isLinked) {
            addList = new LinkedList<E>(getList);
            isLinked = true;
        }
        addList.add(index, element);
    }

    @Override
    public E get(int index) {
        if (isLinked) {
            getList = new ArrayList<E>(addList);
            isLinked = false;
        }
        E element = getList.get(index);
        return element;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean contains(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<E> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Object[] toArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public <T> T[] toArray(T[] a) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean add(E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int indexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int lastIndexOf(Object o) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator<E> listIterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ListIterator<E> listIterator(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public List<E> subList(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public long test(int n, List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            //list.add(rand.nextInt(i + 1), "Some text");
            list.add(0, "Some text");
        }
        for (int i = 0; i < n; i++) {
            list.get(rand.nextInt(n - i));
        }
        long endTime = System.currentTimeMillis();
        return endTime - startTime;
    }

    public static void main(String[] args) {
        BuilderList<String> myBuilderList = new BuilderList<String>();
        LinkedList<String> myLinkedList = new LinkedList<String>();
        ArrayList<String> myArrayList = new ArrayList<String>();
        System.out.println(myBuilderList.test(500000, myBuilderList));
        System.out.println(myBuilderList.test(500000, myLinkedList));
        System.out.println(myBuilderList.test(500000, myArrayList));
    }
}
