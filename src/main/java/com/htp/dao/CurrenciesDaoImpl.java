package com.htp.dao;

import com.htp.domain.Currencies;
import com.htp.util.DatabaseConfiguration;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.htp.util.DatabaseConfiguration.*;

public class CurrenciesDaoImpl implements CurrenciesDao {

    public static DatabaseConfiguration config = DatabaseConfiguration.getInstance();
    public static final String CURRENCIES_ID = "id";
    public static final String CURRENCIES_CODE = "code_currencies";
    public static final String CURRENCIES_NAME_ENG = "name_currencies_eng";
    public static final String CURRENCIES_NAME_RU = "name_currencies_ru";

    public static final String CURRENCIES_DATE_BEGIN = "date_begin";
    public static final String CURRENCIES_DATE_END = "date_end";
    public static final String CURRENCIES_UPLOAD = "upload";


    @Override
    public List<Currencies> findAll() {
        String driverName = config.getProperty(DATABASE_DRIVER_NAME);
        String url = config.getProperty(DATABASE_URL);
        String login = config.getProperty(DATABASE_LOGIN);
        String databasePassword = config.getProperty(DATABASE_PASSWORD);

        String findAllQuery = "SELECT * FROM \"NSI\".currencies";
        List<Currencies> currenciesResultList = new ArrayList<>();
        /*===1 Loading driver===*/
        try {
            Class.forName(driverName);
        } catch (ClassNotFoundException e) {
            //e.printStackTrace();
            System.out.println("Don't worry!!!");
        }

        /*===2 Driver manager. Get connection====*/


        try (Connection connection = DriverManager.getConnection(url, login, databasePassword);
                /*===3 Get statement from connection===*/
             PreparedStatement preparedStatement = connection.prepareStatement(findAllQuery);
             //
        ) {
            /*=== 4 Execute Query*/
            ResultSet resultSet = preparedStatement.executeQuery();

            /*parsing..*/
            while (resultSet.next()) {
                /*==6 Adding parsed info into collection*/
                currenciesResultList.add(parseResultSet(resultSet));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return currenciesResultList;
    }

    private Currencies parseResultSet(ResultSet resultSet) throws SQLException {
        /*===5 Column mapping*/
        Currencies currencies = new Currencies();

        currencies.setId(resultSet.getInt(CURRENCIES_ID));
        currencies.setCodeCurrencies(resultSet.getString(CURRENCIES_CODE));
        currencies.setNameCurrenciesEng(resultSet.getString(CURRENCIES_NAME_ENG));
        currencies.setNameCurrenciesRu(resultSet.getString(CURRENCIES_NAME_RU));
        currencies.setDateBegin(resultSet.getTimestamp(CURRENCIES_DATE_BEGIN));
        currencies.setDateEnd(resultSet.getTimestamp(CURRENCIES_DATE_END));
        return currencies;
    }

    /*===2  ===*/
}
