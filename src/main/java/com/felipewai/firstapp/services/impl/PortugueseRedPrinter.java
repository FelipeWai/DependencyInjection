package com.felipewai.firstapp.services.impl;

import com.felipewai.firstapp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class PortugueseRedPrinter implements RedPrinter {

    @Override
    public String print(){
        return "Vermelho";
    }
}

