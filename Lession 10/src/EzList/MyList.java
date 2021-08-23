package EzList;

import java.util.Arrays;

public class MyList<E> {
    public int size = 0;
    public int DEAFAULT_CAPACITY = 10;
    public Object element[];

    public MyList() {
        element = new Object[DEAFAULT_CAPACITY];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int i) {
        if (i == size || i < 0) {
            throw new IndexOutOfBoundsException("Index " + i + ",Size" + i);
        }
        return (E) element[i];
    }

}
