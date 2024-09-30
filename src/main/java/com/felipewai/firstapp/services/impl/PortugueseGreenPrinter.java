package com.felipewai.firstapp.services.impl;

import com.felipewai.firstapp.services.GreenPrinter;
import org.springframework.stereotype.Component;

@Component
public class PortugueseGreenPrinter implements GreenPrinter {

    @Override
    public String print(){
        return "Verde";
    }
}
