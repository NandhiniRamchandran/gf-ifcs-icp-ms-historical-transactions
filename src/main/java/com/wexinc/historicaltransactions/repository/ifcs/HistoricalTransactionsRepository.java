package com.wexinc.historicaltransactions.repository.ifcs;

import com.wexinc.historicaltransactions.model.ifcs.HistoricalTransactionsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HistoricalTransactionsRepository extends JpaRepository<HistoricalTransactionsEntity, Long> {
}
