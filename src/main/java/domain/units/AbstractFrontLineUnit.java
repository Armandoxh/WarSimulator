package domain.units;

import domain.armies.Battalion;
import domain.statistics.AbstractUnitStatistics;
import domain.unitinterfaces.AbstractFighter;


/**
 * @author Armando Xhimanki
 * @version 1.0.1
 * @implNote
 *
 *
 * Abstract class defining the basic traits of a <i>Front Line </i> unit. Abstract units are strictly the types
 * of units populating battalions, and Abstract Attacks as well as Abstract Unit statistics can be derived from these
 * types of Units.
 *
 * <p>By default, {{@link #attackIsAvoidable}} attackIsAvoidable is true, and basic unit types can have their attacks avoided
 * by the {{@link #defend(double)}} method.</p>
 *
 * @see AbstractUnitStatistics
 * @see Unit
 * @see Battalion
 */
public abstract class AbstractFrontLineUnit extends Unit implements AbstractFighter {

    private double attackStat;
    private double hitPointStat;
    private double criticalStrikeChance;
    private double attackSpeed;
    private boolean attackIsAvoidable = true;

    protected AbstractFrontLineUnit() {
    }

    protected AbstractFrontLineUnit(double attackStat, double hitPointStat, double criticalStrikeChance, double attackSpeed) {
        this.attackStat = attackStat;
        this.hitPointStat = hitPointStat;
        this.criticalStrikeChance = criticalStrikeChance;
        this.attackSpeed = attackSpeed;
    }

    @Override
    public void defend(double rawDamage) {
        if(rawDamage>=0) this.hitPointStat -= rawDamage;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AbstractFrontLineUnit)) return false;
        if (!super.equals(o)) return false;

        AbstractFrontLineUnit that = (AbstractFrontLineUnit) o;

        if (Double.compare(that.getAttackStat(), getAttackStat()) != 0) return false;
        if (Double.compare(that.getHitPointStat(), getHitPointStat()) != 0) return false;
        if (Double.compare(that.getCriticalStrikeChance(), getCriticalStrikeChance()) != 0) return false;
        if (Double.compare(that.getAttackSpeed(), getAttackSpeed()) != 0) return false;
        return attackIsAvoidable == that.attackIsAvoidable;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(getAttackStat());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getHitPointStat());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getCriticalStrikeChance());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(getAttackSpeed());
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (attackIsAvoidable ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AbstractFrontLineUnit{" +
                "attackStat=" + attackStat +
                ", hitPointStat=" + hitPointStat +
                ", criticalStrikeChance=" + criticalStrikeChance +
                ", attackSpeed=" + attackSpeed +
                ", attackIsAvoidable=" + attackIsAvoidable +
                '}';
    }

    public double getAttackStat() {
        return attackStat;
    }

    public void setAttackStat(double attackStat) {
        this.attackStat = attackStat;
    }

    public double getHitPointStat() {
        return hitPointStat;
    }

    public void setHitPointStat(double hitPointStat) {
        this.hitPointStat = hitPointStat;
    }

    public double getCriticalStrikeChance() {
        return criticalStrikeChance;
    }

    public void setCriticalStrikeChance(double criticalStrikeChance) {
        this.criticalStrikeChance = criticalStrikeChance;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }
    //

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }


}
