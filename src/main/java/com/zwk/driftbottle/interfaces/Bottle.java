package com.zwk.driftbottle.interfaces;

import java.util.Optional;

/**
 * @author zwk
 * @date 2021/12/16
 **/
public interface Bottle {
    void put(Paper paper);
    Paper get();
    boolean isEmpty();
}
