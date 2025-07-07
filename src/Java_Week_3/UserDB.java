package Java_Week_3;

//import java.sql.Connection;
import java.sql.*;

public class jav {

    public class UsersDB {


        public static void main(String[] args) {

// Read all the current records and print
            // SQL query with placeholder (optional)
            String sql = "SELECT id, username, firstname, lastname, emailaddress, phonenumber, userstatus " +
                    "FROM banking_sch.users"; //" WHERE userstatus = ?";

            try (
                    Connection conn = Connect2DB.getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(sql)
            ) {
                // Set value for the placeholder `?`
                // pstmt.setString(1, "Active");  // You can dynamically change this to any status

                try (ResultSet rs = pstmt.executeQuery()) {
                    while (rs.next()) {
                        System.out.println("ID: " + rs.getObject("id"));
                        System.out.println("Username: " + rs.getString("username"));
                        System.out.println("First Name: " + rs.getString("firstname"));
                        System.out.println("Last Name: " + rs.getString("lastname"));
                        System.out.println("Email: " + rs.getString("emailaddress"));
                        System.out.println("Phone: " + rs.getString("phonenumber"));
                        System.out.println("Status: " + rs.getString("userstatus"));
                        System.out.println("----------");
                    }
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
// Insert a new record into the table using INSERT statement directly
            String insertSQL = "INSERT INTO banking_sch.users " +
                    "(id, username, firstname, lastname, emailaddress, phonenumber, userstatus) " +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";

            try (
                    Connection conn = Connect2DB.getConnection();
                    PreparedStatement pstmt = conn.prepareStatement(insertSQL);
            ) {
                UUID uuid = UUID.randomUUID();

                pstmt.setObject(1, uuid);
                pstmt.setString(2, "dduck");
                pstmt.setString(3, "Donald");
                pstmt.setString(4, "Duck");
                pstmt.setString(5, "ddcuck@example.com");
                pstmt.setString(6, "1234567890");
                pstmt.setString(7, "Active");

                int rowsInserted = pstmt.executeUpdate();
                System.out.println("Inserted rows: " + rowsInserted);
                System.out.println("Generated UUID: " + uuid);

            } catch (
                    SQLException e) {
                e.printStackTrace();
            }
// Insert a record using stored procedure

            String procedureCall = "CALL banking_sch.create_new_user(?, ?, ?, ?, ?, ?) ";
            try (
                    Connection conn = Connect2DB.getConnection();  // Reusing your Connect2DB class
                    PreparedStatement stmt = conn.prepareStatement(procedureCall)
            ) {
                // Set stored procedure input parameters
                stmt.setString(1, "brucelee");
                stmt.setString(2, "Bruce");
                stmt.setString(3, "Lee");
                stmt.setString(4, "blee@example.com");
                stmt.setString(5, "1234567890");
                stmt.setString(6, "Active");

                // Execute the stored procedure
                stmt.execute();
                System.out.println("User inserted successfully via stored procedure.");

            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }



}
