/*
klasa startowa LibraryDelete - usuń dowolną książkę z bazy danych
*/

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibraryDelete extends BookDao {

    @Override
    public Connection connect() {
        return super.connect();
    }

    @Override
    public void close() {
        super.close();
    }

    public void delete (long ID) {
        final String sql = "delete from books where id = ?";
        try {
            PreparedStatement prepStmt = connect().prepareStatement(sql);
            prepStmt.setLong(1, ID);
            prepStmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Could not delete row");
            e.printStackTrace();
        }
    }
}
