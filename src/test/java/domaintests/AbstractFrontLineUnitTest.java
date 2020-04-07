package domaintests;

import domain.units.Soldier;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AbstractFrontLineUnitTest {

    Soldier d = new Soldier(100,500);
    @Test
    void notNullRandomStats(){
        assertAll("Parameters not generated null or negative" ,
                () -> {
                    double atkStat = d.getAttackStat();
                    double hpStat = d.getHitPointStat();
                    double crt = d.getCriticalStrikeChance();
                    double atkSpd = d.getAttackSpeed();

                    assertTrue(atkStat>0 && atkStat<=50,"Attack was set <=0");
                    assertTrue(hpStat>0 && hpStat<=1000,"Hitpoints was set <=0");
                    assertTrue(crt>=0 && crt<=10,"Critical Strike Chance was set <=0");
                    assertTrue(atkSpd>=0 && atkSpd<=10,"Attack Spd was set <=0");

        });
    }


    @Test
    public void setAttackSpeed() {

    }
}