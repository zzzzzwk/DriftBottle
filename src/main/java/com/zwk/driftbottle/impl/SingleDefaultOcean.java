package com.zwk.driftbottle.impl;

import com.zwk.driftbottle.interfaces.Bottle;
import com.zwk.driftbottle.interfaces.Ocean;
import org.springframework.lang.NonNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author zwk
 * @date 2021/12/16
 **/
public final class SingleDefaultOcean implements Ocean {

    private final List<Bottle> list = new ArrayList<>();

    private final static SingleDefaultOcean DEFAULT_OCEAN = new SingleDefaultOcean();

    private SingleDefaultOcean() {
    }

    public static SingleDefaultOcean getInstance(){
        return SingleDefaultOcean.DEFAULT_OCEAN;
    }

    @Override
    public void throwInto(@NonNull final Bottle bottle) {
        this.list.add(bottle);
    }

    @Override
    public Bottle get() {
        Bottle bottle = NullBottle.getInstance();
        if (!this.list.isEmpty()){
            bottle = this.list.remove(new Random().nextInt(this.list.size()));
        }
        return bottle;
    }
}
