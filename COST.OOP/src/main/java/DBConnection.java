
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DBConnection {
    public static void main(String[] args) {
        try {
            // Step 1: Connect to database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/oop_lab_08",
                "root",
                ""
            );

            System.out.println("Connected Successfully!");

            // Step 2: Create statement
            Statement st = con.createStatement();

            // Step 3: Insert test data
            st.executeUpdate("INSERT INTO students VALUES (5, 'Kasun', 90)");

            System.out.println("Data Inserted!");

            // Step 4: Close connection
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    static Connection getConnection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}


