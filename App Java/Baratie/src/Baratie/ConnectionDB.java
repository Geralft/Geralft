package Baratie;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionDB {
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    private static final String url = "jdbc:mysql://localhost:3306/formulario";
    private static final String user = "root"; 
    private static final String password = "";
    private static final String correo = "";
    private static final String User = "";


    public static Connection conectar() {
        Connection cx = null;
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url, user, password);
            System.out.println("Conexión exitosa a la base de datos");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
        return cx;
    }

    public Object openConnection() {
        throw new UnsupportedOperationException("Unimplemented method 'openConnection'");
    }
}
