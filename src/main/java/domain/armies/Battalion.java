package domain.armies;

import domain.units.AbstractFrontLineUnit;

import java.util.ArrayList;

public class Battalion<E extends AbstractFrontLineUnit> extends AbstractBattalionBuffer<E> {


    public Complexity complexity = Complexity.COMPLEXITY1;
    private int battalionSize;


    private Battalion(ArrayList<E> bufferedBattalion) {
        super(bufferedBattalion);
    }

    public Battalion(int battalionSize, Complexity complexity) {
       this(complexity.create(battalionSize));
    }

    }
