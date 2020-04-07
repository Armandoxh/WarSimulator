package domain.statistics;

import domain.statisticsInterfaces.SoldierAnalyzer;
import domain.units.AbstractFrontLineUnit;

import java.util.Comparator;

public class AbstractUnitStatistics<E extends AbstractFrontLineUnit> implements
        SoldierAnalyzer, Comparator<AbstractUnitStatistics> {


    private int killCount;
    private double totalDamageDelivered;
    private double totalDamageBlocked;
    private int numberOfTimesCriticallyStriked;
    private int numberOfDoubleAttacks;


    public AbstractUnitStatistics(int killCount){
        this.killCount = killCount;
    }



    @Override
    public int compare(AbstractUnitStatistics abstractUnitStatistics, AbstractUnitStatistics t1) {
        return 0;
    }

    @Override
    public double getKillCount() {
        return killCount;
    }

    @Override
    public double getDamageBlocked() {
        return 0;
    }

    @Override
    public double getRawDamageTotal() {
        return 0;
    }

    @Override
    public double getTimesCriticallyStriked() {
        return 0;
    }

    @Override
    public double getTimesDoubleAttacked() {
        return 0;
    }
}
