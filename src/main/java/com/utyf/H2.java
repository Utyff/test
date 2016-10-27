package com.utyf;

import java.sql.*;

/**
 * Created by adm on 09.10.2016.
 *
 */

public class H2 {

    static void run() {
        Statement stmt;

        try {
            Class.forName("org.h2.Driver");
            Connection conn = DriverManager.getConnection("jdbc:h2:c:/d/Projects/test");

            stmt = conn.createStatement();

/*            stmt.execute("CREATE TABLE PERSON(id int primary key, name varchar(255))");
            stmt.execute("INSERT INTO PERSON(id, name) VALUES(1, 'Anju')");
            stmt.execute("INSERT INTO PERSON(id, name) VALUES(2, 'Sonia')");
            stmt.execute("INSERT INTO PERSON(id, name) VALUES(3, 'Asha')");  //*/

            ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
            while (rs.next()) {
                int id = rs.getInt("ID");
                String name = rs.getString("NAME"); // Assuming there is a column called name.
                System.out.println(id +"\t "+name);
            }

            conn.close();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
