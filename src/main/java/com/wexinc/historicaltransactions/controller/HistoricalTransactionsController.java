package com.wexinc.historicaltransactions.controller;

import com.wexinc.historicaltransactions.model.ifcs.HistoricalTransactionsEntity;
import com.wexinc.historicaltransactions.repository.ifcs.HistoricalTransactionsRepository;
import com.wexinc.historicaltransactions.service.HistoricalTransactionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HistoricalTransactionsController {
    @Autowired
    HistoricalTransactionsService historicalTransactionsService;
    @GetMapping("/alltransactions")
    public List<HistoricalTransactionsEntity> getAllHistoricalTransactions() {
        return historicalTransactionsService.getAllHistoricalTransactions();
    }
}
