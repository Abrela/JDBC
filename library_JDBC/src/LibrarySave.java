/*
klasa startowa LibrarySave - wczytaj z niej dane o dowolnej książce od użytkownika i zapisz te informacje w bazie danych
 */

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class LibrarySave {

    public void save(Book book) {
        final String sql = "insert into books(title, author, ISBN, year) values (?,?,?,?)";
        try {

            PreparedStatement prepStmt = BookDao.connect().prepareStatement(sql);
            prepStmt.setString(1, book.getTitle());
            prepStmt.setString(2, book.getAuthor());
            prepStmt.setString(3, book.getISBN());
            prepStmt.setInt(4, book.getYear());
            int x = prepStmt.executeUpdate();
            System.out.println(x);

        } catch (SQLException e) {
            System.out.println("Could not save record");
            e.printStackTrace();
        }
    }

//    public static void main(String[] args) {
//        LibrarySave lt = new LibrarySave();
//        lt.save(new Book("Tytul", "Autor", "adconoi", 2018));
//    }
}
