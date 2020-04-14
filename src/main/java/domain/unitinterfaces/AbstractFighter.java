package domain.unitinterfaces;

public interface AbstractFighter {
//    default public <T extends AbstractAttack<AbstractFrontLineUnit, AbstractFrontLineUnit>> void defends(T e){
//
//    }
      void defend(double rawDamage);
      double attack();

}

