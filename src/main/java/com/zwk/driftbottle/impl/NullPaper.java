package com.zwk.driftbottle.impl;

import com.zwk.driftbottle.interfaces.Paper;
import com.zwk.driftbottle.interfaces.nulls.NullObject;

/**
 * @author zwk
 * @date 2021/12/17
 * @description TODO
 **/
public class NullPaper implements Paper, NullObject {

    private static final Paper INSTANCE = new NullPaper();

    private NullPaper() {
    }

    public static Paper getInstance(){
        return NullPaper.INSTANCE;
    }

    @Override
    public String read() {
        throw new RuntimeException("NullBottle");
    }

    @Override
    public void write(String message) {
        throw new RuntimeException("NullBottle");
    }
}
