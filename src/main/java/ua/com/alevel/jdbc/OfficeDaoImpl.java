package ua.com.alevel.jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OfficeDaoImpl implements OfficeDao {
    private static final String URL = "jdbc:mysql://SG-alevel-3162-master.servers.mongodirector.com:3306/classicmodels";
    private static final String LOGIN = "alevel";
    private static final String PASSWORD = "Qwerty123!";
    private Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(URL, LOGIN, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }


    @Override
    public List<OfficeEntity> getAllOffices() throws SQLException {
        Connection conn = getConnection();
        Statement statement = null;
        ResultSet set = null;
        List<OfficeEntity> offices = null;
        try {
            conn.setAutoCommit(false);
            statement = conn.createStatement();
            set = statement.executeQuery("SELECT * FROM offices WHERE territory = 'EMEA';");
            offices = new ArrayList<>();
            while (set.next()) {
                OfficeEntity office = new OfficeEntity();
                office.setOfficeCode(set.getInt("officeCode"));
                office.setAddsetsLine1(set.getString("addressLine1"));
                office.setAddsetsLine2(set.getString("addressLine2"));
                office.setCity(set.getString("city"));
                office.setCountry(set.getString("country"));
                office.setPhone(set.getString("phone"));
                office.setPostalCode(set.getString("postalCode"));
                office.setTerritory(set.getString("territory"));
                offices.add(office);
            }
            conn.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            conn.close();
            statement.close();
            set.close();
        }
        return offices;
    }
}
