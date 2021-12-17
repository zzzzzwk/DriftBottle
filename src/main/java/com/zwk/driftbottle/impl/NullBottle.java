package com.zwk.driftbottle.impl;

import com.zwk.driftbottle.interfaces.Bottle;
import com.zwk.driftbottle.interfaces.Paper;
import com.zwk.driftbottle.interfaces.nulls.NullObject;

/**
 * @author zwk
 * @date 2021/12/17
 **/
public class NullBottle implements Bottle, NullObject {
    private static final Bottle INSTANCE = new NullBottle();
    private NullBottle() {
    }
    public static Bottle getInstance(){
        return NullBottle.INSTANCE;
    }

    @Override
    public void put(Paper paper) {
        throw new RuntimeException("NullBottle");
    }

    @Override
    public Paper get() {
        throw new RuntimeException("NullBottle");
    }

    @Override
    public boolean isEmpty() {
        throw new RuntimeException("NullBottle");
    }
}
