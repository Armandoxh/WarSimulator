package domain.armies;

import domain.units.AbstractFrontLineUnit;
import domain.units.Marksman;
import domain.units.Soldier;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public enum Complexity {


    COMPLEXITY1(3){
        @Override
        public <E extends AbstractFrontLineUnit> ArrayList<E> create(int size) {
            return super.create(size);
        }
    },
    COMPLEXITY2(5){
        @Override
        public <E extends AbstractFrontLineUnit> ArrayList<E> create(int size){
            return super.create(size);
        }
    },
    COMPLEXITY3(7){
        @Override
        public <E extends AbstractFrontLineUnit> ArrayList<E> create(int size){
            return super.create(size);
        }
    },
    COMPLEXITY4(8){
        @Override
        public <E extends AbstractFrontLineUnit> ArrayList<E> create(int size){
         return super.create(size);
        }
    };

    public static  List<Class<? extends AbstractFrontLineUnit>> possibleUnits =
             Arrays.asList(Marksman.class, Marksman.class,Marksman.class,Soldier.class, Soldier.class,Soldier.class,Soldier.class,
                     Soldier.class,Soldier.class);
    private int unitDifferential;


    Complexity(int unitDifferential) {
        this.unitDifferential = unitDifferential;
    }
    public <E extends AbstractFrontLineUnit> ArrayList<E> create(int size) {
        ArrayList<E> battalionOfComplexity = new ArrayList<>(size);
        Random rand = new Random();

        for (int i = 0; i < size; i++) {
            try {
                E a = (E) possibleUnits.get(rand.nextInt(unitDifferential))
                        .getDeclaredConstructor().newInstance();
                battalionOfComplexity.add(a);
            } catch (Exception t) {
                System.out.println("mistake");
                t.printStackTrace();
            }
        }
        return battalionOfComplexity;
    }


}