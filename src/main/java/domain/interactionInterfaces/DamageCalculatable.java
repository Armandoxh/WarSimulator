package domain.interactionInterfaces;

/**
 * should it take a type parameter
 *
 */
public interface DamageCalculatable{

    default boolean isCriticalStrike(double critChance) {
        return Math.random() * 10 < critChance;
    }

    default boolean isDoubleAttack(double attackSpeed){
        return Math.random() * 10 < attackSpeed;
    }

    default boolean attackIsAvoided(boolean attackIsAvoidable){
        if(attackIsAvoidable){
            return (Math.random()< 0.05);
        }
        return false;
    }
}
