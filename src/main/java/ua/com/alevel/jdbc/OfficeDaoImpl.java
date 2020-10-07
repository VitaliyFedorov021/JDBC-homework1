package ua.com.alevel.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OfficeDaoImpl implements OfficeDao {
    SQLConnection connector = new SQLConnection();
    List<OfficeEntity> offices;

    {
        try {
            offices = connector.readFromDB();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }



    @Override
    public List<OfficeEntity> getAllOffices() throws SQLException {

        return offices;
    }
}
