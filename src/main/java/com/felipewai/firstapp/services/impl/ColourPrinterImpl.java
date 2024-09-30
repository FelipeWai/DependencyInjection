package com.felipewai.firstapp.services.impl;

import com.felipewai.firstapp.services.BluePrinter;
import com.felipewai.firstapp.services.ColourPrinter;
import com.felipewai.firstapp.services.GreenPrinter;
import com.felipewai.firstapp.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColourPrinterImpl implements ColourPrinter {

    private RedPrinter redPrinter;
    private GreenPrinter greenPrinter;
    private BluePrinter bluePrinter;

    public ColourPrinterImpl(RedPrinter redPrinter, GreenPrinter greenPrinter, BluePrinter bluePrinter){
        this.redPrinter = redPrinter;
        this.greenPrinter = greenPrinter;
        this.bluePrinter = bluePrinter;
    }

    @Override
    public String print(){
        return redPrinter.print() + " " + bluePrinter.print() + " " + greenPrinter.print();
    }
}
