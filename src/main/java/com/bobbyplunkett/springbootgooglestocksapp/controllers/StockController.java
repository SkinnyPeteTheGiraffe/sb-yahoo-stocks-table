package com.bobbyplunkett.springbootgooglestocksapp.controllers;

import com.bobbyplunkett.springbootgooglestocksapp.services.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * com.bobbyplunkett.springbootgooglestocksapp.controllers
 *
 * @author Bobby Plunkett
 * @version 0.0.1
 * @since 5/5/2019
 */
@Controller
public class StockController {

    private StockService stockServiceImpl;

    @Autowired
    public StockController(StockService stockServiceImpl) {
        this.stockServiceImpl = stockServiceImpl;
    }

    @RequestMapping({"/", ""})
    public String getGoogleStockStats(Model model) {
        model.addAttribute("stocks", stockServiceImpl.getStocks());
        return "stock";
    }
}
