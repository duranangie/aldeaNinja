package com.aldeaninja;

/*conectamos con la base de datos mysql desde java*/
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class Conexion {
    private static String url = "";
    private static String user = "";
    private static String password = "";
    public static Connection con = null;

    public static Connection MySQLConnection() {
        url = "jdbc:mysql://localhost:3306/db_narutoangieduran";
        user = "root";
        password = "";
        return getConnection(url, user, password);
    }

    private static Connection getConnection(String url, String user, String password) {
        try {
            // Realizar la conexion
            con = DriverManager.getConnection(url, user, password);
            if (con != null) {
                DatabaseMetaData meta = con.getMetaData();
                System.out.println("Database connected " + meta.getDriverName());
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return con;
    }

}