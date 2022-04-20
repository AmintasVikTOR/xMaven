package com.htp.domain;

import java.sql.Timestamp;
import java.util.Objects;

public class Currencies {

    private Integer id;
    private String codeCurrencies;
    private String nameCurrenciesEng;
    private String nameCurrenciesRu;
    private Timestamp dateBegin;
    private Timestamp dateEnd;
    private boolean upload;


    public Currencies() {
    }


    @Override
    public String toString() {
        return "Currencies{" +
                "id=" + id +
                ", codeCurrencies='" + codeCurrencies + '\'' +
                ", nameCurrenciesEng='" + nameCurrenciesEng + '\'' +
                ", nameCurrenciesRu='" + nameCurrenciesRu + '\'' +
                ", dateBegin=" + dateBegin +
                ", dateEnd=" + dateEnd +
                ", upload=" + upload +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Currencies that = (Currencies) o;
        return upload == that.upload &&
                Objects.equals(id, that.id) &&
                Objects.equals(codeCurrencies, that.codeCurrencies) &&
                Objects.equals(nameCurrenciesEng, that.nameCurrenciesEng) &&
                Objects.equals(nameCurrenciesRu, that.nameCurrenciesRu) &&
                Objects.equals(dateBegin, that.dateBegin) &&
                Objects.equals(dateEnd, that.dateEnd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, codeCurrencies, nameCurrenciesEng, nameCurrenciesRu, dateBegin, dateEnd, upload);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodeCurrencies() {
        return codeCurrencies;
    }

    public void setCodeCurrencies(String codeCurrencies) {
        this.codeCurrencies = codeCurrencies;
    }

    public String getNameCurrenciesEng() {
        return nameCurrenciesEng;
    }

    public void setNameCurrenciesEng(String nameCurrenciesEng) {
        this.nameCurrenciesEng = nameCurrenciesEng;
    }

    public String getNameCurrenciesRu() {
        return nameCurrenciesRu;
    }

    public void setNameCurrenciesRu(String nameCurrenciesRu) {
        this.nameCurrenciesRu = nameCurrenciesRu;
    }

    public Timestamp getDateBegin() {
        return dateBegin;
    }

    public void setDateBegin(Timestamp dateBegin) {
        this.dateBegin = dateBegin;
    }

    public Timestamp getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Timestamp dateEnd) {
        this.dateEnd = dateEnd;
    }

    public boolean isUpload() {
        return upload;
    }

    public void setUpload(boolean upload) {
        this.upload = upload;
    }
}
