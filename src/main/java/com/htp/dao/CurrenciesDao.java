package com.htp.dao;

import com.htp.domain.Currencies;

import java.util.List;

public interface CurrenciesDao {
    List<Currencies> findAll();
}
