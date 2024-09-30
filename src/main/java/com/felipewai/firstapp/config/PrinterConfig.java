package com.felipewai.firstapp.config;

import com.felipewai.firstapp.services.BluePrinter;
import com.felipewai.firstapp.services.ColourPrinter;
import com.felipewai.firstapp.services.GreenPrinter;
import com.felipewai.firstapp.services.RedPrinter;
import com.felipewai.firstapp.services.impl.ColourPrinterImpl;
import com.felipewai.firstapp.services.impl.EnglishBluePrinter;
import com.felipewai.firstapp.services.impl.EnglishGreenPrinter;
import com.felipewai.firstapp.services.impl.EnglishRedPrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrinterConfig {

    @Bean
    public RedPrinter redPrinter(){
        return new EnglishRedPrinter();
    }

    @Bean
    public GreenPrinter greenPrinter(){
        return new EnglishGreenPrinter();
    }

    @Bean
    public BluePrinter bluePrinter(){
        return new EnglishBluePrinter();
    }

    @Bean
    public ColourPrinter colourPrinter(){
        return new ColourPrinterImpl(redPrinter(), greenPrinter(), bluePrinter());
    }
}
