package com.zwk.driftbottle.impl.service;

import com.zwk.driftbottle.interfaces.Bottle;
import com.zwk.driftbottle.interfaces.Ocean;
import com.zwk.driftbottle.interfaces.Paper;
import com.zwk.driftbottle.interfaces.factory.BottleFactory;
import com.zwk.driftbottle.interfaces.factory.OceanFactory;
import com.zwk.driftbottle.interfaces.factory.PaperFactory;
import com.zwk.driftbottle.interfaces.service.OceanService;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;

/**
 * @author zwk
 * @date 2021/12/16
 **/
@Service
public class DefaultOceanService implements OceanService {

    private final OceanFactory oceanFactory;

    private final BottleFactory bottleFactory;

    private final PaperFactory paperFactory;

    public DefaultOceanService(OceanFactory oceanFactory, BottleFactory bottleFactory, PaperFactory paperFactory) {
        this.oceanFactory = oceanFactory;
        this.bottleFactory = bottleFactory;
        this.paperFactory = paperFactory;
    }

    @Override
    public String get() {
        Ocean ocean = oceanFactory.create();
        Optional<Bottle> optionalBottle = ocean.get();
        AtomicReference<String> message = new AtomicReference<>();
        optionalBottle.ifPresentOrElse(
                bottle -> message.set(bottle.get().read()),
                ()-> message.set("")
        );
        return message.get();
    }

    @Override
    public void post(String message) {
        Ocean ocean = oceanFactory.create();
        Bottle bottle = bottleFactory.create();
        Paper paper = paperFactory.create();
        paper.write(message);
        bottle.put(paper);
        ocean.throwInto(bottle);
    }
}
