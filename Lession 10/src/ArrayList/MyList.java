package ArrayList;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {

    }

    public MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            throw new IllegalArgumentException("Capacity " + capacity);
        }
    }

    public void add(int index, E element) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == index + 1) {
            ensureCapacity(1);
        }
        if (elements[index] == null) {
            size++;
            elements[index] = element;
        } else {
            if (size == elements.length) {
                ensureCapacity(1);

                if (size - index >= 0) System.arraycopy(elements, index, elements, index + 1, size - index);
            }
        }
        elements[index] = element;
        size++;
    }

    public E remove(int index) {

    }

    public int size() {
        return size;
    }

    public E clone() {

    }

    public boolean contains(E o) {

    }

    public int indexOF(E o) {

    }

    public boolean add(E e) {

    }

    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    public E get(int i) {

    }

    public void clear() {

    }
}
