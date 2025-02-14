package javaPro._02_11;

import java.util.*;

public class MyArrayList<E> implements List<E> {
    private static final int DEFAULT_CAPACITY = 10;
    public Object[] elementData;
    private int size;
    private int maxSize;

    public MyArrayList(int maxSize) {
        this.maxSize = maxSize;
        elementData = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        return indexOf(o) >= 0;
    }

    @Override
    public Iterator<E> iterator() {


        return null;
    }

    private class Itr implements Iterator<E> {

        private int currrent = -1;

        @Override
        public boolean hasNext() {

            return currrent + 1 < size;
        }

        @Override
        public E next() {
            if (!hasNext()){
                throw  new NoSuchElementException();
            }
            currrent++;
            return (E) elementData[currrent];
        }

        @Override
        public void remove() {
            if (currrent<0){
                throw  new IllegalStateException();
            }
            MyArrayList.this.remove(currrent);// обращение к методу внешнего класса public E remove(int index)
            currrent--;
        }
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public boolean add(E o) {
        if (size == maxSize) {
            throw new IllegalArgumentException("достигнут максимальный размер");
        }
        if (size == elementData.length) {
            elementData = grow();
        }
        elementData[size] = o;
        size++;
        return true;
    }

    private Object[] grow() {
//        Object[] newArr = new MyArrayList[elementData.length * 3 / 2];
//        for (int i = 0; i < newArr.length; i++) {
//            newArr[i] = elementData[i];
//        }
//        return newArr;

        int newLength = elementData.length * 3 / 2 + 1;
        return Arrays.copyOf(elementData, newLength);
    }

    @Override
    public boolean remove(Object o) {
        if (o == null) {
            for (int i = 0; i < size; i++) {
                if (elementData[i] == null) {
                    remove(i);
                    return true;
                }
            }
        } else {
            for (int i = 0; i < size; i++) {
                if (o.equals(elementData[i])) {
                    remove(i);
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public boolean addAll(Collection c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E set(int index, Object element) {
        return null;
    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public E remove(int index) {
        Object removingObj = elementData[index];
        for (int i = index; i < size - 1; i++) {
            elementData[i] = elementData[i + 1];

        }

        elementData[size] = null;
        size--;
        return (E) removingObj;
    }

    @Override
    public int indexOf(Object o) {
        if (o == null){
        for (int i = 0; i <size ; i++) {
            if (elementData[i] == null){
                return i;
            }
        }
       } else{
            for (int i = 0; i <size ; i++) {
                if (o.equals(elementData[i])){
                    return i;
                }
            }
        }

        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator listIterator() {

        return null;
    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return List.of();
    }

    @Override
    public boolean retainAll(Collection c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection c) {
        return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] a) {
        return new Object[0];
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        for (int i = 0; i < size; i++) {
            sb.append(elementData[i]);
            if (i == size - 1) {
                break;
            }
            sb.append(" ,");
        }


        return sb.append(']').toString();
    }
}


