package com.bobbyplunkett.springbootgooglestocksapp.services.impl;

import com.bobbyplunkett.springbootgooglestocksapp.services.StockService;
import com.bobbyplunkett.springbootgooglestocksapp.stocks.StockData;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * com.bobbyplunkett.springbootgooglestocksapp.services.impl
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@Service
public class StockServiceImpl implements StockService {

    @Override
    public StockData[] getStocks() {
        return new StockData[]{
                new StockData("GOOGL"),
                new StockData("EA"),
                new StockData("AMZN"),
                new StockData("INTC"),
                new StockData("AAPL"),
                new StockData("MSFT"),
                new StockData("NVDA"),
                new StockData("AMD")
        };
    }
}
