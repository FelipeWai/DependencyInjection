package com.felipewai.firstapp;

import ch.qos.logback.core.CoreConstants;
import com.felipewai.firstapp.services.ColourPrinter;
import com.felipewai.firstapp.services.impl.ColourPrinterImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ColoursApplication implements CommandLineRunner {

    private ColourPrinter colourPrinter;

    public ColoursApplication(ColourPrinter colourPrinter){
        this.colourPrinter = colourPrinter;
    }

    public static void main(String[] args) {
        SpringApplication.run(ColoursApplication.class, args);
    }

    @Override
    public void run(final String... args){
        System.out.println(colourPrinter.print());
    }
}
