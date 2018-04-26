package ru.CryptoFuture.restController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.CryptoFuture.model.DBLogJSON;
import ru.CryptoFuture.model.DBLogsJSON;
import ru.CryptoFuture.restService.DBLogService;

import java.util.List;

@Controller
public class RestController {

    @Autowired
    private  DBLogService dbLogService;

    @RequestMapping(value = "/rest/getAllDBLogsJSON", method = RequestMethod.GET, produces = "application/json")
    public @ResponseBody
    DBLogsJSON getAllDBLogsJSON() {
        List<DBLogJSON> dbLogsJSONList = null;
        try {
            dbLogsJSONList = dbLogService.findAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(dbLogsJSONList);
        DBLogsJSON dbLogsJSON = new DBLogsJSON();
        dbLogsJSON.setLogList(dbLogsJSONList);
        return dbLogsJSON;
    }
}

