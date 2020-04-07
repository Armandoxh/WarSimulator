package domain.statistics;

import domain.units.AbstractFrontLineUnit;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * The responsibility of the AbstractFrontLineStatisticsContainer is to map a Front Line Unit to their respective
 * performance statistics in battle. Performance metrics for Front Line Units and their subclasses are calculated
 * by the AbstractUnitStatistics class.
 *
 * @param <K>  An AbstractFrontLineUnit, with base <i>Front Line</i> Unit fields
 * @param <V> A Statistical representation of the Units performance in battle.
 *
 * @see AbstractFrontLineUnit
 * @see AbstractUnitStatistics
 */

public class AbstractFrontLineStatisticsContainer<K extends AbstractFrontLineUnit, V extends AbstractUnitStatistics<K>>
                                                                                                    implements Map<K,V> {

    HashMap<K,V> soldierWithStatistics = new HashMap<>();

    public AbstractFrontLineStatisticsContainer(K k, V v) {
        soldierWithStatistics.put(k,v);
    }

    /**
     * Get the number of mappings of Front Line Units to Front Line Unit Statistics in the container.
     * @implSpec The implementation is defined by the size calculation is defined by the  {@link Map} interface.
     * @return The Number of AbstractFrontLineUnits->AbstractUnitStatistics mappings currently being observed in the
     * container.
     *
     * @see AbstractFrontLineUnit
     * @see AbstractUnitStatistics
     *
     */
    @Override
    public int size() {
        return soldierWithStatistics.size();
    }


    @Override
    public boolean isEmpty() {
        return soldierWithStatistics.isEmpty();
    }

    @Override
    public boolean containsKey(Object  o) {
        return soldierWithStatistics.containsKey(o);
    }

    @Override
    public boolean containsValue(Object o) {
        return soldierWithStatistics.containsValue(o);
    }

    @Override
    public V get(Object o) {
        return soldierWithStatistics.get(o);
    }

    @Override
    public V put(K soldier, V statistics) {
        return soldierWithStatistics.put(soldier ,statistics);
    }

    @Override
    public V remove(Object o) {
        return soldierWithStatistics.remove(o);

    }

    @Override
    public void putAll(Map<? extends K, ? extends V> map) {
        soldierWithStatistics.putAll(map);
    }

    @Override
    public void clear() {
        soldierWithStatistics.clear();
    }

    @Override
    public Set<K> keySet() {
        return soldierWithStatistics.keySet();
    }

    @Override
    public Collection<V> values() {
        return soldierWithStatistics.values();
    }

    @Override
    public Set<Entry<K,V>> entrySet() {
        return soldierWithStatistics.entrySet();
    }
}
