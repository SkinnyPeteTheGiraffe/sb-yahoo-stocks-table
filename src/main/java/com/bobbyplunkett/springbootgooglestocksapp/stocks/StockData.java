package com.bobbyplunkett.springbootgooglestocksapp.stocks;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.stock.StockQuote;

import java.io.IOException;
import java.math.BigDecimal;

/**
 * com.bobbyplunkett.springbootgooglestocksapp.pojos
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
public class StockData {

    private String symbol;
    private String currency;
    private BigDecimal price;
    private BigDecimal change;
    private BigDecimal changeAverage200;

    public StockData(String symbol) {
        try {
            Stock stock = YahooFinance.get(symbol);
            this.symbol = symbol;
            this.currency = stock.getCurrency();
            StockQuote quote = stock.getQuote();
            this.price = quote.getPrice();
            this.change = quote.getChange();
            this.changeAverage200 = quote.getChangeFromAvg200();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getSymbol() {
        return symbol;
    }

    public String getCurrency() {
        return currency;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public BigDecimal getChange() {
        return change;
    }

    public BigDecimal getChangeAverage200() {
        return changeAverage200;
    }
}
