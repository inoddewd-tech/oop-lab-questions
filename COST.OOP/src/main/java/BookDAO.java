import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookDAO {

    public void addBook(Book book) {
        String sql = "INSERT INTO books (book_id, title, price) VALUES (?, ?, ?)";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            statement.setInt(1, book.getBookId());
            statement.setString(2, book.getTitle());
            statement.setDouble(3, book.getPrice());

            statement.executeUpdate();
            System.out.println("Book added successfully.");

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }

    public void displayAllBooks() {
        String sql = "SELECT book_id, title, price FROM books";

        try (Connection connection = DBConnection.getConnection();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                System.out.println(
                        resultSet.getInt("book_id") + " "
                        + resultSet.getString("title") + " "
                        + resultSet.getDouble("price")
                );
            }

        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }
    }
}