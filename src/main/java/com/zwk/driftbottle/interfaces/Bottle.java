package com.zwk.driftbottle.interfaces;

/**
 * @author zwk
 * @date 2021/12/16
 **/
public interface Bottle {
    void put(Paper paper);
    Paper get();
    boolean isEmpty();
}
