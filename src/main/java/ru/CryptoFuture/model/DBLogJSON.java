package ru.CryptoFuture.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "LOG")
public class DBLogJSON implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "IDLOG")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IDLOG;
    @Column(name = "LOGSTRING")
    private String LOGSTRING;

    public DBLogJSON() {
    }

    public DBLogJSON(int IDLOG, String logString) {
        this.IDLOG = IDLOG;
        this.LOGSTRING = logString;
    }

    public int getIDLOG() {
        return IDLOG;
    }


    public void setIDLOG(int IDLOG) {
        IDLOG = IDLOG;
    }

    public String getLOGSTRING() {
        return LOGSTRING;
    }

    public void setLOGSTRING(String LOGSTRING) {
        LOGSTRING = LOGSTRING;
    }
}


