import domain.armies.Battalion;
import domain.armies.Complexity;
import domain.units.AbstractFrontLineUnit;
import domain.units.Marksman;
import domain.units.Soldier;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class testi {
    public static void main(String[] args) {
//        String inum = "12";
//        String month = new DateFormatSymbols().getMonths()[(Integer.parseUnsignedInt(inum)-1)];

//
        Battalion<AbstractFrontLineUnit> t = new Battalion<>(500, Complexity.COMPLEXITY3);
        Stream<AbstractFrontLineUnit> stream =  t.stream();
        stream.forEach(s-> System.out.println(s.toString()));
        System.out.println(t.size());
        List<Class<? extends AbstractFrontLineUnit>> list = Arrays.asList(Soldier.class, Marksman.class,Marksman.class,Marksman.class);
//
    }

}
