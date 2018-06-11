/*
klasa startowa LibrarySave - wczytaj z niej dane o dowolnej książce od użytkownika i zapisz te informacje w bazie danych
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibrarySave extends BookDao{

    @Override
    public Connection connect() {
        return super.connect();
    }

    @Override
    public void close() {
        super.close();
    }

    public void save(Book book) {
        final String sql = "insert into books(title, author, ISBN, year) values (?,?,?,?)";
        try {

            PreparedStatement prepStmt = connect().prepareStatement(sql);
            prepStmt.setString(1, book.getTitle());
            prepStmt.setString(2, book.getAuthor());
            prepStmt.setString(3, book.getISBN());
            prepStmt.setInt(4, book.getYear());
            prepStmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Could not save record");
            e.printStackTrace();
        }
    }
}
