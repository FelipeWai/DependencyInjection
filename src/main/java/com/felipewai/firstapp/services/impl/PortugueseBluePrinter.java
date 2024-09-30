package com.felipewai.firstapp.services.impl;

import com.felipewai.firstapp.services.BluePrinter;
import org.springframework.stereotype.Component;

@Component
public class PortugueseBluePrinter implements BluePrinter {

    @Override
    public String print(){
        return "Azul";
    }

}
