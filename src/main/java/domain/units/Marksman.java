package domain.units;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Marksman has the ability to have another Roll in their attack cycle. This is a characteristic of all marksmen.
 * @see domain.Settings#DEFAULT_MAX_NUMBER_OF_ROLLS
 */
public class Marksman extends AbstractFrontLineUnit {

    public Marksman(){
        generateStats();
    }

    public void generateStats(){
        setAttackSpeed(rand.nextInt(UnitSettings.MARKSMAN_MAX_ATTTACKSPEED) + 1);
        setAttackStat(rand.nextInt(UnitSettings.MARKSMAN_MAX_ATTACKSTAT) + 1);
        setCriticalStrikeChance(rand.nextInt(UnitSettings.MAGE_MAX_CRITICALSTRIKECHANCE) + 1);
        setHitPointStat(ThreadLocalRandom.current().nextInt(250,UnitSettings.MARKSMAN_MAX_HITPOINTS));
    }


}
