package com.bobbyplunkett.springbootgooglestocksapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.function.Function;

/**
 * com.bobbyplunkett.springbootgooglestocksapp.config
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@Configuration
public class StockConfiguration {

    @Bean
    public Function<String, Stock> getStockDataFunction() {
        return s -> {
            try {
                return YahooFinance.get(s);
            } catch (IOException e) {
                e.printStackTrace();
                return new Stock("GOOGL");
            }
        };
    }
}
