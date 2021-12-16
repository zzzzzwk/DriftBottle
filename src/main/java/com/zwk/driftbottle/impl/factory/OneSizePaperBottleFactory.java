package com.zwk.driftbottle.impl.factory;

import com.zwk.driftbottle.impl.OneSizePaperBottle;
import com.zwk.driftbottle.interfaces.Bottle;
import com.zwk.driftbottle.interfaces.factory.BottleFactory;
import org.springframework.stereotype.Service;

/**
 * @author zwk
 * @date 2021/12/16
 **/
@Service
public class OneSizePaperBottleFactory implements BottleFactory {
    @Override
    public Bottle create() {
        return new OneSizePaperBottle();
    }
}
