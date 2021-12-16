package com.zwk.driftbottle.impl;

import com.zwk.driftbottle.interfaces.Paper;
import org.springframework.lang.NonNull;

/**
 * @author zwk
 * @date 2021/12/16
 **/
public class StringPaper implements Paper {

    private final StringBuilder message = new StringBuilder("");

    @Override
    public String read() {
        return this.message.toString();
    }

    @Override
    public void write(@NonNull String message) {
        this.message.append(message);
    }
}
