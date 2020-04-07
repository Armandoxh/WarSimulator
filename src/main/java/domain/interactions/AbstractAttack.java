package domain.interactions;

/**
 * AbstractAttack is the abstract base class representing how AbstractFrontLineUnit(@see AbstractFrontLineUnit)
 * damage is calculated. Raw Damage is a number calculated by factoring the attackStat, criticalStrikeChance,
 * and attack speed of the AbstractFrontLineUnit.
 * Raw Damage is then defended (@see AbstractFrontLineUnit#defend(AbstractAttack) by the AbstractFrontLineUnit, and
 * then the Raw Damage calculated is effectively turned into damage taken by that unit.
 *
 * <p>All attacks have the ability to be avoided, except those made by 'Special Units'. The avoidable condition
 * is a property of the Unit itself, as different types of units have different specifications on how their attacks
 * perform in battle.</p>

 * <p>The default algorithm for calculating raw damage here may be replaced by any algorithm and does not depend on the
 * implementation of AbstractFrontLineUnit. </p>
 *
 */

import domain.interactionInterfaces.DamageCalculatable;
import domain.units.AbstractFrontLineUnit;


/**
 * The type Abstract attack.
 *
 *
 * @param <E> the type E must be an AbstractFrontLineUnit.
 * @see AbstractFrontLineUnit
 */
public class AbstractAttack<E extends AbstractFrontLineUnit> implements DamageCalculatable<AbstractFrontLineUnit> {
    private E attacker;

    /**
     * Instantiates a new Abstract attack .
     *
     * @param attacker The attacker defines the basis for the fields used in calculation of  the raw damage.
     *
    */

    public AbstractAttack(E attacker) {
        this.attacker = attacker;
    }

    /**
     * The Default algoritm for determining the amount that will be passed for a defending soldier to attack.
     * The algorithm currently checks the stats of {@link E attacker} and makes use of the
     * DamageCalculatable interface.
     *
     *
     * There are three fields required for basic raw damage calculation:
     * <ul>
     *     <li> The Attackers Critical Strike Chance : Can define if the attackStat is doubled
     *     <li>The Attackers Attack Speed : Can define if the attacker can attack again (Max number of rolls = 2)
     *     <li>The Attackers Attack Stat : Can define the base damage output of the attacker
     * </ul>
     *
     *
     * @see DamageCalculatable
     * @return the raw damage
     */
    @SuppressWarnings("UnusedAssignment")
    public double getRawDamage() {
        int rolls = 0;
        double damageOutput = 0;
        if (attacker != null) {
            damageOutput = attacker.getAttackStat();
            if (isAvoided()) return 0;
            while (rolls < 2) {
                if (isCriticalStrike()) {
                    damageOutput *= 2;
                    rolls++;
                    if (!isDoubleAttack()) {
                        rolls++;
                    }
                }
            rolls++;
            }
        }
        return damageOutput;
    }
}