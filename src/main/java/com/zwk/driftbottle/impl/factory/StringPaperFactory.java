package com.zwk.driftbottle.impl.factory;

import com.zwk.driftbottle.impl.StringPaper;
import com.zwk.driftbottle.interfaces.Paper;
import com.zwk.driftbottle.interfaces.factory.PaperFactory;
import org.springframework.stereotype.Service;

/**
 * @author zwk
 * @date 2021/12/16
 **/
@Service
public class StringPaperFactory implements PaperFactory {
    @Override
    public Paper create() {
        return new StringPaper();
    }
}
