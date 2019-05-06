package com.bobbyplunkett.springbootgooglestocksapp.services.impl;

import com.bobbyplunkett.springbootgooglestocksapp.services.StockService;
import com.bobbyplunkett.springbootgooglestocksapp.stocks.StockData;
import org.springframework.stereotype.Service;
import yahoofinance.Stock;
import yahoofinance.YahooFinance;

import java.io.IOException;
import java.util.function.Function;

/**
 * com.bobbyplunkett.springbootgooglestocksapp.services.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@Service
public class StockServiceImpl implements StockService {

    private final Function<String, Stock> getStockDataFunction;

    public StockServiceImpl(Function<String, Stock> getStockDataFunction) {
        this.getStockDataFunction = getStockDataFunction;
    }

    @Override
    public StockData[] getStocks() {
        return new StockData[]{
                new StockData(getStockDataFunction.apply("GOOGL")),
                new StockData(getStockDataFunction.apply("AMZN")),
                new StockData(getStockDataFunction.apply("AAPL")),
                new StockData(getStockDataFunction.apply("MSFT")),
                new StockData(getStockDataFunction.apply("ORCL")),
                new StockData(getStockDataFunction.apply("MDB"))
        };
    }
}
