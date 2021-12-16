package com.zwk.driftbottle.impl.factory;

import com.zwk.driftbottle.impl.SingleDefaultOcean;
import com.zwk.driftbottle.interfaces.Ocean;
import com.zwk.driftbottle.interfaces.factory.OceanFactory;
import org.springframework.stereotype.Service;

/**
 * @author zwk
 * @date 2021/12/16
 **/
@Service
public class SingleDefaultOceanFactory implements OceanFactory {
    @Override
    public Ocean create() {
        return SingleDefaultOcean.getInstance();
    }
}
