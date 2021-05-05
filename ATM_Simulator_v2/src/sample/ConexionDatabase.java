package sample;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexionDatabase {

    public Connection linkBaseDeDatos;

    public Connection getConnection() {

        String baseDeDatosNombre = "conexionatmsimulator";
        String baseDeDatosUsuario = "root";
        String baseDeDatosContrasena = "root";
        String url = "jdbc:mysql://localhost/" + baseDeDatosNombre;

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            linkBaseDeDatos = DriverManager.getConnection(url,baseDeDatosUsuario,baseDeDatosContrasena);
        } catch (Exception e) {
            e.printStackTrace();
            e.getCause();
        }

        return linkBaseDeDatos;
    }

}
