package ru.CryptoFuture.restService;


import ru.CryptoFuture.model.DBLogJSON;

import java.util.List;


public interface DBLogService {

    DBLogJSON getById(Integer IDLOG);

    void save(DBLogJSON dbLogJSON);

    void delete(Integer IDLOG);

    List<DBLogJSON> findAll();

}

