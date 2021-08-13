import java.sql.*;

public class Demo {
    public static void main(String[] args) {

        Connection connection = null;
        try {
            //Step - 1
            Class.forName("com.mysql.cj.jdbc.Driver");

            //Step - 2
            String url = "jdbc:mysql://localhost:3306/players";
            String username = "root";
            String password = "Akshay@1710290";
            connection = DriverManager.getConnection(url, username, password);

            //Step - 3
            Statement statement = connection.createStatement();
            String sql = "SELECT id, name, age, gender, city, sportsName, contact from player";

            //Step - 4
            ResultSet resultSet = statement.executeQuery(sql);

            //Step - 5
            while (resultSet.next()) {
                System.out.print("id : " + resultSet.getInt("id"));
                System.out.print(" name : " + resultSet.getString("name"));
                System.out.print(" age : " + resultSet.getInt("age"));
                System.out.print(" gender : " + resultSet.getString("gender"));
                System.out.print(" city : " + resultSet.getString("city"));
                System.out.print(" sportsName : " + resultSet.getString("sportsName"));
                System.out.print(" Contact : " + resultSet.getLong("contact"));
                System.out.println();

            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}