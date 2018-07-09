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

    /**
     * Получить по id
     * @param IDLOG
     * @return
     */
    @Override
    public DBLogJSON getById(Integer IDLOG) {
        return dbLogRepository.findOne(IDLOG);
    }

    /**
     * сохранить
     * @param dbLogJSON
     */
    @Override
    public void save(DBLogJSON dbLogJSON) {
        dbLogRepository.save(dbLogJSON);

    }

    /**
     * удалить
     * @param IDLOG
     */
    @Override
    public void delete(Integer IDLOG) {
        dbLogRepository.delete(IDLOG);

    }

    /**
     * ПОлучить всех
     * @return
     */
    @Override
    public List<DBLogJSON> findAll() {
        return dbLogRepository.findAll();
    }
}

