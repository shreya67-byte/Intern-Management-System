import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InternDAO {
    public boolean insertIntern(Intern intern) {
        boolean success = false;

        try {
            // Connect to MySQL
            Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/intern_db", // Replace with your DB name
                "root", // Replace with your MySQL username
                "Aki12r@34"  // Replace with your MySQL password
            );

            // SQL Insert
            String sql = "INSERT INTO interns (internId, name, email, department, mentor, projectTitle, feedback) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            // Set values from Intern object
            stmt.setInt(1, intern.getInternId());
            stmt.setString(2, intern.getName());
            stmt.setString(3, intern.getEmail());
            stmt.setString(4, intern.getDepartment());
            stmt.setString(5, intern.getMentor());
            stmt.setString(6, intern.getProjectTitle());
            stmt.setString(7, intern.getFeedback());

            // Execute
            int rows = stmt.executeUpdate();
            if (rows > 0) {
                success = true;
            }

            conn.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return success;
    }
}
