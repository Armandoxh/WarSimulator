package domain.units;

/**
 *
 *
 * @ TODO: 4/6/20   Auto generate random base stats for soldier types
 *
 */
public class Soldier extends AbstractFrontLineUnit {

    boolean attackIsAvoidable = true;

    public Soldier(){
        this.setHitPointStat(Math.random()*10);
        this.setAttackStat(Math.random()*10 );
    }

    public Soldier(int attackStat, int hitPoints) {
        super(attackStat, hitPoints,0,0);
    }

    @Override
    public void defend(double rawDamage) {

        setHitPointStat(getHitPointStat() - rawDamage);
    }


    public boolean isAttackIsAvoidable() {
        return attackIsAvoidable;
    }

}
