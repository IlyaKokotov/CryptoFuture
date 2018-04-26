package ru.CryptoFuture.restService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.CryptoFuture.model.DBLogJSON;
import ru.CryptoFuture.repository.DBLogRepository;

import java.util.List;


@Service
public class DBLogServiceImpl implements DBLogService {


    @Autowired
    DBLogRepository dbLogRepository;


    @Override
    public DBLogJSON getById(Integer IDLOG) {
        return dbLogRepository.findOne(IDLOG);
    }

    @Override
    public void save(DBLogJSON dbLogJSON) {
        dbLogRepository.save(dbLogJSON);

    }

    @Override
    public void delete(Integer IDLOG) {
        dbLogRepository.delete(IDLOG);

    }

    @Override
    public List<DBLogJSON> findAll() {
        return dbLogRepository.findAll();
    }
}

