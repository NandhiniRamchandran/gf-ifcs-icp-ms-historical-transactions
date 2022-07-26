package com.wexinc.historicaltransactions.service;

import com.wexinc.historicaltransactions.model.ifcs.HistoricalTransactionsEntity;
import com.wexinc.historicaltransactions.repository.ifcs.HistoricalTransactionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoricalTransactionsService {
    @Autowired
    HistoricalTransactionsRepository historicalTransactionsRepository;
    public List<HistoricalTransactionsEntity> getAllHistoricalTransactions() {
        return historicalTransactionsRepository.findAll();
    }
}
