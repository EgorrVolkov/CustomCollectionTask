package ua.training;

import java.util.ArrayList;
import java.util.Collection;

public class ArrayListCustom<E> extends ArrayList<E> {

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation not permitted");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Operation not permitted");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Operation not permitted");
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Operation not permitted");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Operation not permitted");
    }
}
