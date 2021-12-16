package com.zwk.driftbottle.impl;

import com.zwk.driftbottle.interfaces.Bottle;
import com.zwk.driftbottle.interfaces.Paper;

/**
 * @author zwk
 * @date 2021/12/16
 **/
public class OneSizePaperBottle implements Bottle {

    private Paper paper;

    @Override
    public void put(final Paper paper) {
        if (this.paper == null){
            this.paper = paper;
        }
    }

    @Override
    public Paper get() {
        return this.paper;
    }

    @Override
    public boolean isEmpty() {
        return this.paper == null;
    }
}
