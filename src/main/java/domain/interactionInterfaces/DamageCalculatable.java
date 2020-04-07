package domain.interactionInterfaces;

import domain.units.AbstractFrontLineUnit;

/**
 * should it take a type parameter
 *
 */
public interface DamageCalculatable<E extends AbstractFrontLineUnit> {

    default boolean isCriticalStrike() {
        return false;
    };

    default boolean isDoubleAttack(){
        return false;
    };

    default boolean isAvoided(){
        return false;
    };
}
