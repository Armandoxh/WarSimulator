import domain.armies.Battalion;
import domain.interactions.AbstractAttack;
import domain.statistics.AbstractFrontLineStatisticsContainer;
import domain.statistics.AbstractUnitStatistics;
import domain.statistics.SoldierStatistics;
import domain.units.AbstractFrontLineUnit;
import domain.units.Soldier;

public class testi {
    public static void main(String[] args) {


        Soldier s = new Soldier(7,10);
        Soldier y = new Soldier(10,10);
        AbstractFrontLineUnit h = new Soldier();

        AbstractAttack<Soldier> e = new AbstractAttack<Soldier>(s);
        System.out.println(e.getRawDamage());
        Battalion<Soldier> test = new Battalion<>(1, Battalion.Complexity.COMPLEXITY_1);
        test.add(new Soldier(1,1));
        System.out.println(test.size());
        AbstractUnitStatistics<AbstractFrontLineUnit> l = new AbstractUnitStatistics<>(2);
        SoldierStatistics b = new SoldierStatistics(3);
        AbstractFrontLineStatisticsContainer<Soldier,SoldierStatistics> mm =
                new AbstractFrontLineStatisticsContainer<Soldier,SoldierStatistics>(s,b);
        System.out.println(mm.get(s).getKillCount());

    }
}
