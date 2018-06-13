/*
klasa startowa LibraryDelete - usuń dowolną książkę z bazy danych
*/

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibraryDelete  {


    public void delete (long ID) {
        final String sql = "delete from books where id = ?";
        try {
            PreparedStatement prepStmt = BookDao.connect().prepareStatement(sql);
            prepStmt.setLong(1, ID);
            prepStmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Could not delete row");
            e.printStackTrace();
        }
    }
}
