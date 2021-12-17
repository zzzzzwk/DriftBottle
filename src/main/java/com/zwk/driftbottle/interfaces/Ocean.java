package com.zwk.driftbottle.interfaces;


/**
 * @author zwk
 * @date 2021/12/16
 **/
public interface Ocean {
    /**
     * throwInto
     * @author zwk
     * @date 20:23 2021/12/16
     * @param bottle:
     * @return void
     **/
    void throwInto(Bottle bottle);
    /**
     * get
     * @author zwk
     * @date 20:22 2021/12/16
     * @return Bottle
     **/
    Bottle get();
}
