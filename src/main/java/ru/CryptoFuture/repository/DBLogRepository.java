package ru.CryptoFuture.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import ru.CryptoFuture.model.DBLogJSON;


public interface DBLogRepository extends JpaRepository<DBLogJSON, Integer> {
}

