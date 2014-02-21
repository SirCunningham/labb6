 package labb6.builder;

import java.util.*;
import java.util.Random.*;

public class BuilderList<E> implements List<E> {

    private List<E> addList = new LinkedList<E>();
    private List<E> getList = new ArrayList<E>();
    private boolean needsUpdate = true;

    @Override
    public void add(int index, E element) {
        addList.add(index, element);
        needsUpdate = true;
    }

    @Override
    public E get(int index) {
        if (needsUpdate) {
            getList = new ArrayList<E>(addList);
            needsUpdate = false;
        }
        return getList.get(index);
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

    public static void main(String[] args) {
        test(125000, new BuilderList<String>());
        test(125000, new LinkedList<String>());
        test(125000, new ArrayList<String>());
    }

    public static void test(int n, List list) {
        Random rand = new Random();
        long startDate = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            //list.add(rand.nextInt(i + 1), "Some text");
            list.add(0, "Some text");
        }
        long addTime = System.currentTimeMillis() - startDate;
        startDate = System.currentTimeMillis();
        for (int i = 0; i < n; i++) {
            list.get(rand.nextInt(n));
        }
        long getTime = System.currentTimeMillis() - startDate;
        System.out.printf("%s: %d + %d = %d\n", list.getClass().getSimpleName(),
                addTime, getTime, addTime + getTime);
    }
}