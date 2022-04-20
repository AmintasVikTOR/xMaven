package com.htp.dao;

import com.htp.domain.User;
import com.htp.util.DatabaseConfiguration;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import static com.htp.util.DatabaseConfiguration.*;

public class UserDaoImpl implements UserDao {

    public static DatabaseConfiguration config = DatabaseConfiguration.getInstance();
    public static final String USER_ID = "id";
    public static final String USER_USERNAME = "username";
    public static final String USER_SURNAME = "surname";
    public static final String USER_BIRTH_DATE = "birth_date";
    public static final String USER_LOGIN = "login";
    public static final String USER_PASSWORD = "password";
    public static final String USER_CREATED = "created";
    public static final String USER_CHANGED = "changed";
    public static final String USER_IS_BLOCKED = "is_blocked";
    public static final String USER_WEIGHT = "weight";
    public static final String USER_GENDER = "gender";
    public static final String USER_ID_ROLE = "id_role";
    public static final String USER_E_MAIL = "e_mail";


    @Override
    public List<User> findAll() {
        String driverName = config.getProperty(DATABASE_DRIVER_NAME);
        String url = config.getProperty(DATABASE_URL);
        String login = config.getProperty(DATABASE_LOGIN);
        String databasePassword = config.getProperty(DATABASE_PASSWORD);

        String findAllQuery = "SELECT * FROM \"NSI\".m_users";
        List<User> userResultList = new ArrayList<>();
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
                userResultList.add(parseResultSet(resultSet));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        return userResultList;
    }

    private User parseResultSet(ResultSet resultSet) throws SQLException {
        /*===5 Column mapping*/
        User user = new User();

        user.setId(resultSet.getLong(USER_ID));
        user.setUsername(resultSet.getString(USER_USERNAME));
        user.setSurname(resultSet.getString(USER_SURNAME));
        user.setBirthDate(resultSet.getDate(USER_BIRTH_DATE));
        user.setLogin(resultSet.getString(USER_LOGIN));
        user.setPassword(resultSet.getString(USER_PASSWORD));
        user.setCreated(resultSet.getTimestamp(USER_CREATED));
        user.setChanged(resultSet.getTimestamp(USER_CHANGED));
        user.setBlocked(resultSet.getBoolean(USER_IS_BLOCKED));
        user.setWeight(resultSet.getFloat(USER_WEIGHT));
        user.setGender(resultSet.getString(USER_GENDER));
        user.setIdRole(resultSet.getLong(USER_ID_ROLE));
        user.seteMail(resultSet.getString(USER_E_MAIL));

        return user;
    }

    /*===2  ===*/
}
