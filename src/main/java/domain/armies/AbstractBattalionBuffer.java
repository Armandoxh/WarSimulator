package domain.armies;

import domain.units.AbstractFrontLineUnit;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public class AbstractBattalionBuffer<E extends AbstractFrontLineUnit> implements Set<E> {
    private final ArrayList<E> bufferedBattalion;

    protected AbstractBattalionBuffer(ArrayList<E> bufferedBattalion) {
        this.bufferedBattalion = bufferedBattalion;
    }

    public ArrayList<E> getBufferedBattalion() {
        return bufferedBattalion;
    }

    @Override
    public int size() {
        return bufferedBattalion.size();
    }

    @Override
    public boolean isEmpty() {
        return bufferedBattalion.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return bufferedBattalion.contains(o);
    }

    @Override
    public Iterator<E> iterator() {
        return bufferedBattalion.iterator();
    }

    @Override
    public Object[] toArray() {
        return bufferedBattalion.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return bufferedBattalion.toArray(ts);
    }

    @Override
    public boolean add(E e) {
        return bufferedBattalion.add(e);
    }

    @Override
    public boolean remove(Object o) {
        return bufferedBattalion.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return bufferedBattalion.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        return bufferedBattalion.addAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return bufferedBattalion.retainAll(collection);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return bufferedBattalion.removeAll(collection);
    }

    @Override
    public void clear() {
        bufferedBattalion.clear();
    }

}
