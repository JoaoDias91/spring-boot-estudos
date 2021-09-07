package com.joao.spring.quickstartspring.controller;

import com.joao.spring.quickstartspring.QuickstartspringApplication;
import com.joao.spring.quickstartspring.model.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

public class QuoteController {
    //TODO ver como rodar essa classe fora da main
    private final static Logger log = LoggerFactory.getLogger(QuickstartspringApplication.class);

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder){
        return builder.build();
    }

    @Bean
    public CommandLineRunner runner(RestTemplate restTemplate)throws Exception{
        return args -> {
            Quote quote = restTemplate.getForObject("https://quoters.apps.pcfone.io/api/random",
                    Quote.class);
            log.info(quote.toString());
        };
    }

}
