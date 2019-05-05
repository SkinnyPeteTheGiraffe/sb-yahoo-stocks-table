package com.bobbyplunkett.springbootgooglestocksapp.services;

import com.bobbyplunkett.springbootgooglestocksapp.stocks.StockData;

/**
 * com.bobbyplunkett.springbootgooglestocksapp.services
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public interface StockService {

    StockData[] getStocks();
}
