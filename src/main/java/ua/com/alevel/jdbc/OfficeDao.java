package ua.com.alevel.jdbc;

import java.sql.SQLException;
import java.util.List;

public interface OfficeDao {
    List<OfficeEntity> getAllOffices() throws SQLException;
}
