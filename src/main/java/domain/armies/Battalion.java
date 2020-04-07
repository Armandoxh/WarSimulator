package domain.armies;

import domain.units.AbstractFrontLineUnit;

import java.util.ArrayList;

public class Battalion<K extends AbstractFrontLineUnit> extends AbstractBattalionBuffer<K> {

    private int battalionSize;
    /**
     * Complexity 1 : 3 Basic Unit Types : Marksman, Mage, Knight
     * Complexity 2: Complexity 1 + Samurai, Barbarian
     * Complexity 3: Complexity 2 + Ogre, Elf, Warlock
     * Complexity 4: Complexity 3 + Juggernaut
     */

    public Battalion(int battalionSize, Complexity complexity) {
        super(new ArrayList<K>(battalionSize));
        System.out.println(getBufferedBattalion().size()
        );    }
/**
 * TODO: 4/6/20  Make Enum for all soldier classes outside of this class
 * TODO: 4/6/20  Make Complexity correspond to random soldier factory
 * TODO: 4/6/20  Maybe add boolean check to soldier dead or alive? : IDK
 *
 */
    public enum Complexity {
        COMPLEXITY_1,
        COMPLEXITY_2,
        COMPLEXITY_3,
        COMPLEXITY_4
    }




}
