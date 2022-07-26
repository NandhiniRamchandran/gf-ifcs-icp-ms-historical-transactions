package com.wexinc.historicaltransactions.repository.ifcs;

import com.wexinc.historicaltransactions.model.ifcs.HistoricalTransactionsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Date;

public interface HistoricalTransactionsRepository extends JpaRepository<HistoricalTransactionsEntity, Long> {

    @Query(nativeQuery = true, value="")
    Page<HistoricalTransactionsEntity> findTransactionsCriteria(@Param("transactionDate") Date transactionDate, @Param("status") Integer status);
}
